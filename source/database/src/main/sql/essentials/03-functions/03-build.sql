/*
 * ae_synchronize_all_serials
 * --------------------------
 * Alle functies met naamgeving tabelnaam_kolomnaam_seq worden ingesteld op de MAX value van hun tabel.
 * Serials/sequences kunnen snel out of sync raken na bulk_loads, COPY FROMs en INSERTS zonder defaults.
 * Deze functie zet alle sequences daarom weer goed.
 */
CREATE OR REPLACE FUNCTION setup.ae_synchronize_all_serials()
	RETURNS void AS
$BODY$
DECLARE
	sequences record;
	sql text;
BEGIN
	FOR sequences IN
		SELECT
			seqs.sequence_schema || '.' || seqs.sequence_name AS sequence_name,
			cols.table_schema || '.' || cols.table_name::text AS table_name,
			cols.column_name::text

			FROM information_schema.columns AS cols
				INNER JOIN information_schema.sequences AS seqs
					ON ( (cols.table_schema || '.' || cols.table_name || '_' || cols.column_name || '_seq') = (seqs.sequence_schema || '.' || seqs.sequence_name) )
	LOOP
		sql := 'SELECT SETVAL(''' || sequences.sequence_name || ''', (SELECT COALESCE(MAX(' || sequences.column_name || '), 0) FROM ' || sequences.table_name || ') + 1, false)';
		RAISE NOTICE '%', sql;
		EXECUTE sql;
	END LOOP;
END;
$BODY$
LANGUAGE plpgsql VOLATILE;


/*
 * ae_cluster_all_tables
 * ---------------------
 * Clustert alle tabellen in de database o.b.v. de primary key.
 * Als het constraint (in dit geval de primary key) eenmaal gezet is, kan in het vervolg geclusterd worden met: CLUSTER databasenaam
 */
CREATE OR REPLACE FUNCTION setup.ae_cluster_all_tables()
	RETURNS void AS
$BODY$
DECLARE
	pkey_constraints record;
	sql text;
BEGIN
	FOR pkey_constraints IN
		SELECT
			(nspname || '.' || relname)::regclass::text AS tablename,
			conname::text AS pkey_name

			FROM pg_constraint
				INNER JOIN pg_class ON (pg_class.oid = pg_constraint.conrelid)
				INNER JOIN pg_namespace ON (pg_namespace.oid = pg_class.relnamespace)

			WHERE pg_class.relkind = 'r' AND pg_constraint.contype = 'p'

			ORDER BY tablename
	LOOP
		sql := 'CLUSTER ' || pkey_constraints.tablename || ' USING ' || pkey_constraints.pkey_name;
		RAISE NOTICE '%', sql;
		EXECUTE sql;
	END LOOP;
END;
$BODY$
LANGUAGE plpgsql VOLATILE;


/*
 * ae_validate_all
 * ---------------
 * Lege (default) ae_validate_all functie.
 */
CREATE OR REPLACE FUNCTION setup.ae_validate_all()
	RETURNS TABLE (validaton_result_id integer, validation_run_id integer, name regproc, result setup.validation_result_type) AS
$BODY$
BEGIN
	RAISE NOTICE '** Empty validating function...';

	PERFORM setup.ae_current_validation_run_id();

	RETURN;
END;
$BODY$
LANGUAGE plpgsql VOLATILE;


/*
 * ae_list_unittest_functions
 * --------------------------
 * Retourneert een lijst van alle functies die beginnen met de opgegeven prefix.
 * Functies die onderdeel uitmaken van een extensie of de PostgreSQL catalogus, worden niet teruggegeven.
 * Naast de functienaam (inclusief schemanaam), worden ook de argumenten en returnwaarde van die functie teruggegeven.
 */
CREATE OR REPLACE FUNCTION setup.ae_list_unittest_functions(v_prefix text)
	RETURNS TABLE(name regproc, args text, returns text) AS
$BODY$
DECLARE
	data_table regclass;
	noncatalog_objects oid[];
	extension_objects oid[];
BEGIN
	noncatalog_objects := (SELECT array_agg(objid) || array_agg(DISTINCT pg_namespace.oid) FROM pg_depend INNER JOIN pg_namespace ON (refobjid = pg_namespace.oid) WHERE pg_namespace.oid <> pg_my_temp_schema() AND NOT pg_is_other_temp_schema(pg_namespace.oid) AND NOT nspname IN ('information_schema', 'pg_catalog', 'pg_toast'));
	extension_objects := (SELECT array_agg(objid) || array_agg(DISTINCT pg_extension.oid) FROM pg_depend INNER JOIN pg_extension ON (refobjid = pg_extension.oid));

	RETURN QUERY SELECT
		pg_proc.oid::regproc AS name,
		pg_get_function_arguments(pg_proc.oid),
		pg_get_function_result(pg_proc.oid)

		FROM pg_proc

		WHERE
			proname ILIKE (replace(v_prefix, '_', '\_') || '%')
			AND pg_proc.oid NOT IN (SELECT aggfnoid FROM pg_aggregate)
			AND pg_proc.oid = ANY(noncatalog_objects)
			AND NOT pg_proc.oid = ANY(extension_objects)
	;
	RETURN;
END;
$BODY$
LANGUAGE plpgsql STABLE;


/*
 * ae_execute_unittest
 * -------------------
 * Voert de gegeven (unit test) functie uit.
 * Indien een exceptie optreedt (wat normaliter het geval is wanneer een assertie in de unit test faalt), dan wordt deze afgevangen, geparsed, en
 * de exceptietekst, regelnummer, en eerste context regelnummer worden allen teruggegeven als een record.
 * Een unit test stopt bij de eerste exceptie, dus deze functie zal nooit meer dan één record teruggeven.
 * Als er geen records worden teruggegeven, dan is de unit test geslaagd.
 */
CREATE OR REPLACE FUNCTION setup.ae_execute_unittest(v_function regproc)
	RETURNS TABLE(errcode text, message text, linenr integer, context text) AS
$BODY$
DECLARE
	v_context text;
	v_line integer;
BEGIN
	EXECUTE 'SELECT ' || v_function || '()';
	RETURN;
EXCEPTION WHEN OTHERS THEN
	GET STACKED DIAGNOSTICS v_context = PG_EXCEPTION_CONTEXT;
	v_line = substring(v_context from 'line (\d+) at')::integer;
	RETURN QUERY SELECT SQLSTATE, SQLERRM, v_line, (string_to_array(v_context, E'\n'))[1];
END;
$BODY$
LANGUAGE plpgsql VOLATILE;


/*
 * ae_checksum_all
 * ---------------
 * Deze functie genereert checksums voor alle belangrijke database objecten.
 * In het geval van tabellen worden er aparte checksums gemaakt voor de structuur en de data. Voor deze data checksums kunnen bepaalde tabellen worden
 * overgeslagen, bijvoorbeeld bij bepaalde live data is het niet zinvol deze te checken/vergelijken.
 *
 * De uitkomst van de functie kan (gesorteerd) worden opgeslagen in een bestand om deze te vergelijken met een andere database. Bijvoorbeeld na het patchen
 * van de productiedatabase, om te controleren of deze daarna overeenkomt met de bedoelde laatste build.
 *
 * Catalog objecten en objecten van extensies zoals PostGIS worden automatisch weggefilterd.
 *
 * @param v_excluded_data_tables Lijstje van tabellen waarvoor geen checksums van de data gegenereerd moet worden.
 * @return Per object type een naam of beschrijving van het object en de checksum van de definitie van dat object.
 */
CREATE OR REPLACE FUNCTION setup.ae_checksum_all(v_excluded_data_tables regclass[] = NULL)
	RETURNS TABLE(objecttype text, description text, checksum bigint) AS
$BODY$
DECLARE
	data_table regclass;
	noncatalog_objects oid[];
	extension_objects oid[];
BEGIN
	noncatalog_objects := (SELECT array_agg(objid) || array_agg(DISTINCT pg_namespace.oid) FROM pg_depend INNER JOIN pg_namespace ON (refobjid = pg_namespace.oid) WHERE pg_namespace.oid <> pg_my_temp_schema() AND NOT pg_is_other_temp_schema(pg_namespace.oid) AND NOT nspname IN ('information_schema', 'pg_catalog', 'pg_toast'));
	extension_objects := (SELECT array_agg(objid) || array_agg(DISTINCT pg_extension.oid) FROM pg_depend INNER JOIN pg_extension ON (refobjid = pg_extension.oid));

	-- Loop all non-catalog non-temporary tables in the database, except for the tables in the given array parameter.
	-- For each table, stringify the contents, hash it and return it.
	FOR data_table IN
		SELECT pg_class.oid::regclass
			FROM pg_class
			WHERE
				relkind = 'r'
				AND NOT pg_class.oid::regclass = ANY(COALESCE(v_excluded_data_tables, ARRAY[]::regclass[]))
				AND pg_class.oid = ANY(noncatalog_objects)
				AND NOT pg_class.oid = ANY(extension_objects)
	LOOP
		RETURN QUERY EXECUTE $$ SELECT 'table data'::text, $1::text, COALESCE(SUM(hashtext((tbl.*)::text)), 0) AS checksum FROM $$ || data_table || $$ AS tbl $$ USING data_table;
	END LOOP;

	-- Generate checksums for the entire database structure. The query hashes the definitions of tables, views, functions, aggregate functions,
	-- triggers, constraints and indexes. This type is returned as well as a description, which may sometimes be the same as the definition that
	-- was hashed.
	-- Again applies only to non-catalog non-temporary objects. Also the PostGIS functions prefixed with ST_ are filtered out.
	RETURN QUERY SELECT
		objtype::text AS objecttype,
		COALESCE(objdescription, objdefinition)::text AS objdescription,
		hashtext(objdefinition)::bigint AS checksum

		FROM (
			SELECT
				objtype,
				regexp_replace(objdescription, '[\n\r]+', ' ', 'g' ) AS objdescription,
				regexp_replace(objdefinition, '[\n\r]+', ' ', 'g' ) AS objdefinition

				FROM
					(SELECT
						'table structure' AS objtype,
						NULL AS objdescription,
						format('%s.%s (%s,%s,%s,%s,%s,%s)', pg_class.oid::regclass, attname, typname, attlen, attnum, attnotnull, atthasdef, pg_get_expr(adbin, pg_class.oid)) AS objdefinition

						FROM pg_attribute
							INNER JOIN pg_type ON (atttypid = pg_type.oid)
							INNER JOIN pg_class ON (attrelid = pg_class.oid)
							LEFT JOIN pg_attrdef ON (adrelid = attrelid AND adnum = attnum)

						WHERE
							relkind = 'r'
							AND relpersistence <> 't'
							AND attnum > 0
							AND pg_class.oid = ANY(noncatalog_objects)
							AND NOT pg_class.oid = ANY(extension_objects)
					UNION ALL
					SELECT
						'view' AS objtype,
						pg_class.oid::regclass::text AS objdescription,
						pg_get_viewdef(pg_class.oid) AS objdefinition

						FROM pg_class

						WHERE
							relkind = 'v'
							AND pg_class.oid = ANY(noncatalog_objects)
							AND NOT pg_class.oid = ANY(extension_objects)
					UNION ALL
					SELECT
						'function' AS objtype,
						format('%s(%s) RETURNS %s', pg_proc.oid::regproc, pg_get_function_arguments(pg_proc.oid), pg_get_function_result(pg_proc.oid)) AS objdescription,
						pg_get_functiondef(pg_proc.oid) AS objdefinition

						FROM pg_proc

						WHERE
							pg_proc.oid NOT IN (SELECT aggfnoid FROM pg_aggregate)
							AND pg_proc.oid = ANY(noncatalog_objects)
							AND NOT pg_proc.oid = ANY(extension_objects)
					UNION ALL
					SELECT
						'aggregate function' AS objtype,
						NULL AS objdescription,
						format('%s (%s, %s)', pg_proc.oid::regproc, aggtransfn, aggfinalfn) AS objdefinition

						FROM pg_aggregate
							INNER JOIN pg_proc ON (aggfnoid = pg_proc.oid)

						WHERE
							pg_proc.oid = ANY(noncatalog_objects)
							AND NOT pg_proc.oid = ANY(extension_objects)
					UNION ALL
					SELECT
						'trigger' AS objtype,
						NULL AS objdescription,
						pg_get_triggerdef(pg_trigger.oid) AS objdefinition

						FROM pg_trigger
							INNER JOIN pg_class ON (tgrelid = pg_class.oid)

						WHERE
							NOT tgisinternal
							AND pg_class.oid = ANY(noncatalog_objects)
							AND NOT pg_class.oid = ANY(extension_objects)
					UNION ALL
					SELECT
						'constraint' AS objtype,
						NULL AS objdescription,
						format('%s.%s = %s', pg_class.oid::regclass, conname, pg_get_constraintdef(pg_constraint.oid)) AS objdefinition

						FROM pg_constraint
							INNER JOIN pg_class ON (conrelid = pg_class.oid)

						WHERE
							pg_class.oid = ANY(noncatalog_objects)
							AND NOT pg_class.oid = ANY(extension_objects)
					UNION ALL
					SELECT
						'index' AS objtype,
						NULL AS objdescription,
						pg_get_indexdef(pg_class_index.oid) AS objdefinition

						FROM pg_index
							INNER JOIN pg_class AS pg_class_index ON (indexrelid = pg_class_index.oid)
							INNER JOIN pg_class AS pg_class_table ON (indrelid = pg_class_table.oid)

						WHERE
							pg_class_table.relkind IN ('r', 'm')
							AND pg_class_index.relkind = 'i'
							AND pg_class_table.oid = ANY(noncatalog_objects)
							AND NOT pg_class_table.oid = ANY(extension_objects)
					UNION ALL
		 			SELECT
						'type' AS objtype,
						NULL AS objdescription,
						format('%s (%s,%s,%s,%s,%s,%s,%s,%s)', pg_type.oid::regtype, typlen, typtype, typcategory, typnotnull, pg_class.relname, format_type(typarray, NULL), format_type(typbasetype, NULL), typndims) AS objdefinition

						FROM pg_type
							LEFT JOIN pg_class ON (typrelid = pg_class.oid)

						WHERE
							typisdefined
							AND typelem = 0
							AND (relkind IS NULL OR relkind = 'c')
							AND pg_type.oid = ANY(noncatalog_objects)
							AND NOT pg_type.oid = ANY(extension_objects)
					UNION ALL
					SELECT
						'enum values' AS objtype,
						NULL AS objdescription,
						format('%s (%s)', pg_type.oid::regtype, array_to_string(array_agg(enumlabel::text), ',')) AS objdefinition

						FROM (SELECT * FROM pg_enum ORDER BY enumtypid, enumsortorder) AS pg_enum
							INNER JOIN pg_type ON (enumtypid = pg_type.oid)

						WHERE
							pg_type.oid = ANY(noncatalog_objects)
							AND NOT pg_type.oid = ANY(extension_objects)

						GROUP BY pg_type.oid
					UNION ALL
					SELECT
						'cast' AS objtype,
						NULL AS objdescription,
						format('%s AS %s (%s,%s,%s)', format_type(castsource, NULL), format_type(casttarget, NULL), castfunc::regproc, castcontext, castmethod) AS objdefinition

						FROM pg_cast
							INNER JOIN pg_type AS pg_type_src ON (castsource = pg_type_src.oid)

						WHERE
							pg_type_src.oid = ANY(noncatalog_objects)
							AND NOT pg_type_src.oid = ANY(extension_objects)
					UNION ALL
					SELECT
						'cast' AS objtype,
						NULL AS objdescription,
						format('%s AS %s (%s,%s,%s)', format_type(castsource, NULL), format_type(casttarget, NULL), castfunc::regproc, castcontext, castmethod) AS objdefinition

						FROM pg_cast
							INNER JOIN pg_type AS pg_type_src ON (castsource = pg_type_src.oid)
							INNER JOIN pg_type AS pg_type_tgt ON (casttarget = pg_type_tgt.oid)

						WHERE
							pg_type_tgt.oid = ANY(noncatalog_objects)
							AND NOT pg_type_tgt.oid = ANY(extension_objects)
							AND NOT (pg_type_src.oid = ANY(noncatalog_objects) AND NOT pg_type_src.oid = ANY(extension_objects))
					UNION ALL
					SELECT
						'comment' AS objtype,
						pg_describe_object(classoid, objoid, objsubid) AS objdescription,
						pg_description.description AS objdefinition

						FROM pg_description

						WHERE
							objsubid = 0
							AND objoid = ANY(noncatalog_objects)
							AND NOT objoid = ANY(extension_objects)
				) AS raw_definitions

		) AS definitions
	;

	RETURN;
END;
$BODY$
LANGUAGE plpgsql STABLE;
