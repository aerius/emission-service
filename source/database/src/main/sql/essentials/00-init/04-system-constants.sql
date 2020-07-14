/*
 * constants
 * ---------
 * Systeem tabel voor de webapplicatie properties.
 */
CREATE TABLE system.constants (
	key text NOT NULL,
	value text NOT NULL,
	description text,
	type constant_type,

	CONSTRAINT constants_pkey PRIMARY KEY (key)
);


/*
 * constants_view
 * --------------
 * Union van de webapplicatie (system) constantes en de database (public) constantes.
 */
CREATE OR REPLACE VIEW system.constants_view AS
SELECT key, value, description, type FROM constants
UNION ALL
SELECT key, value, description, type FROM system.constants
;


/*
 * ae_constant
 * -----------
 * Retourneert waarde van een database of webapplicatie constante.
 * Indien constante niet bestaat in de system.constants_view wordt een exceptie geraised.
 */
CREATE OR REPLACE FUNCTION system.ae_constant(constant_key text)
	RETURNS text AS
$BODY$
DECLARE
	constant_value text;
BEGIN
	SELECT value INTO constant_value FROM system.constants_view WHERE key = constant_key;
	IF constant_value IS NULL THEN
		RAISE EXCEPTION 'Could not find a public or system constant value for ''%''!', constant_key;
	END IF;
	RETURN constant_value;
END;
$BODY$
LANGUAGE plpgsql STABLE;


/*
 * ae_set_constant
 * ---------------
 * Veranderd de waarde van een database of webapplicatie constante.
 * Indien constante niet reeds bestaat in de system.constants wordt een exceptie geraised.
 */
CREATE OR REPLACE FUNCTION system.ae_set_constant(constant_key text, constant_value text)
	RETURNS void AS
$BODY$
BEGIN
	IF NOT EXISTS(SELECT value FROM system.constants WHERE key = constant_key) THEN
		RAISE EXCEPTION 'Could not find a system constant value for ''%''!', constant_key;
	END IF;

	UPDATE system.constants SET value = constant_value WHERE key = constant_key;
END;
$BODY$
LANGUAGE plpgsql VOLATILE;


/*
 * ae_get_git_revision
 * -------------------
 * Retourneert de revision waarde welke als database constants in de database opgeslagen is.
 */
CREATE OR REPLACE FUNCTION system.ae_get_git_revision()
	RETURNS text AS
$BODY$
	SELECT CASE
	WHEN EXISTS (SELECT 1 FROM system.constants WHERE key = 'CURRENT_GIT_REVISION') THEN
		system.ae_constant('CURRENT_GIT_REVISION')
	WHEN EXISTS (SELECT 1 FROM system.constants WHERE key = 'CURRENT_DATABASE_VERSION') THEN
		reverse(split_part(reverse(system.ae_constant('CURRENT_DATABASE_VERSION')), '_', 1))
	ELSE
		reverse(split_part(reverse(system.ae_constant('CURRENT_DATABASE_NAME')), '_', 1))
	END;
$BODY$
LANGUAGE SQL STABLE;
