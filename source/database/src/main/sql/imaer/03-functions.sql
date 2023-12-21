/*
 * ae_export_imaer_data
 * --------------------
 * Function to export IMAER related data.
 * Copies the 'code' and 'description' columns of the supplied table (which should be an IMAER domain table) to a .csv file in the supplied folder.
 * Files are tab-separated and contains a header.
 * The supplied folder should exist prior to using this function.
 */
CREATE OR REPLACE FUNCTION setup.ae_export_imaer_data(folder text, table_to_export text)
	RETURNS void AS
$BODY$
BEGIN
	PERFORM setup.ae_store_query(table_to_export,
		'SELECT code, name, description FROM ' || table_to_export || ' ORDER BY code',
		folder || 'IMAER_{queryname}_{datesuffix}.csv', TRUE);
END;
$BODY$
LANGUAGE plpgsql VOLATILE;


/*
 * ae_export_imaer_data_i18n
 * -------------------------
 * Function to export IMAER related data while using the i18n tables.
 * Copies the 'code' and 'description' columns of the supplied table (which should be an IMAER domain table) to a .csv file in the supplied folder.
 * The related i18n table is used for name and description, based on the dutch term.
 * Files are tab-separated and contains a header.
 * The supplied folder should exist prior to using this function.
 */
CREATE OR REPLACE FUNCTION setup.ae_export_imaer_data_i18n(folder text, table_to_export text, join_column text)
	RETURNS void AS
$BODY$
BEGIN
	PERFORM setup.ae_store_query(table_to_export,
		'WITH i18n AS (
			SELECT * FROM i18n.' || table_to_export || ' WHERE language_code = ''nl''
		)
		SELECT code, COALESCE(i18n.name, categories.name) AS name, description
			FROM ' || table_to_export || ' AS categories
				LEFT JOIN i18n USING (' || join_column || ')
			ORDER BY code',
		folder || 'IMAER_{queryname}_{datesuffix}.csv', TRUE);
END;
$BODY$
LANGUAGE plpgsql VOLATILE;


/*
 * ae_export_all_imaer_data
 * ------------------------
 * Function to export all IMAER related domain tables to .csv files in the supplied folder.
 * The sector_id and description columns of the sector table are also exported.
 * The supplied folder should exist prior to using this function.
 */
CREATE OR REPLACE FUNCTION setup.ae_export_all_imaer_data(folder text)
	RETURNS void AS
$BODY$
BEGIN
	PERFORM setup.ae_store_query('sectors',
		'SELECT sector_id AS code, sector_id AS name, description FROM sectors ORDER BY code',
		folder || 'IMAER_{queryname}_{datesuffix}.csv', TRUE);

	PERFORM setup.ae_export_imaer_data(folder, 'farm_lodging_types');
	PERFORM setup.ae_export_imaer_data(folder, 'farm_lodging_system_definitions');
	PERFORM setup.ae_export_imaer_data(folder, 'farm_additional_lodging_systems');
	PERFORM setup.ae_export_imaer_data(folder, 'farm_reductive_lodging_systems');
	PERFORM setup.ae_export_imaer_data(folder, 'farm_lodging_fodder_measures');

	PERFORM setup.ae_export_imaer_data(folder, 'emission_diurnal_variations');

	PERFORM setup.ae_export_imaer_data(folder, 'mobile_source_off_road_categories');

	PERFORM setup.ae_export_imaer_data(folder, 'mobile_source_on_road_categories');

	PERFORM setup.ae_export_imaer_data_i18n(folder, 'road_area_categories', 'road_area_category_id');
	PERFORM setup.ae_export_imaer_data_i18n(folder, 'road_type_categories', 'road_type_category_id');
	PERFORM setup.ae_export_imaer_data_i18n(folder, 'road_vehicle_categories', 'road_vehicle_category_id');

	PERFORM setup.ae_export_imaer_data(folder, 'shipping_inland_categories');
	PERFORM setup.ae_export_imaer_data(folder, 'shipping_maritime_categories');

	PERFORM setup.ae_store_query('shipping_inland_waterway_categories',
		'SELECT DISTINCT code, name, name AS description FROM shipping_inland_waterway_categories_view ORDER BY code',
		folder || 'IMAER_{queryname}_{datesuffix}.csv', TRUE);
END;
$BODY$
LANGUAGE plpgsql VOLATILE;
