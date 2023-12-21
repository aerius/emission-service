BEGIN;
	INSERT INTO nature2022.i18n_farm_lodging_types
	SELECT farm_lodging_type_id, unnest(ARRAY['nl', 'en']::i18n.language_code_type[]), description FROM nature2022.farm_lodging_types;
COMMIT;

BEGIN;
	INSERT INTO nature2022.i18n_farm_additional_lodging_systems
	SELECT farm_additional_lodging_system_id, unnest(ARRAY['nl', 'en']::i18n.language_code_type[]), description FROM nature2022.farm_additional_lodging_systems;
COMMIT;

BEGIN;
	INSERT INTO nature2022.i18n_farm_reductive_lodging_systems
	SELECT farm_reductive_lodging_system_id, unnest(ARRAY['nl', 'en']::i18n.language_code_type[]), description FROM nature2022.farm_reductive_lodging_systems;
COMMIT;

BEGIN;
	INSERT INTO nature2022.i18n_farm_lodging_system_definitions
	SELECT farm_lodging_system_definition_id, unnest(ARRAY['nl', 'en']::i18n.language_code_type[]), description FROM nature2022.farm_lodging_system_definitions;
COMMIT;

BEGIN;
	INSERT INTO nature2022.i18n_farm_animal_categories
	SELECT farm_animal_category_id, unnest(ARRAY['nl', 'en']::i18n.language_code_type[]), description FROM nature2022.farm_animal_categories;
COMMIT;

BEGIN;
	INSERT INTO nature2022.i18n_farm_lodging_fodder_measures
	SELECT farm_lodging_fodder_measure_id, unnest(ARRAY['nl', 'en']::i18n.language_code_type[]), description FROM nature2022.farm_lodging_fodder_measures;
COMMIT;

BEGIN; SELECT setup.ae_load_table('nature2022.i18n_farmland_categories', '{data_folder}/i18n/i18n.farmland_categories_20200527_nl.txt'); COMMIT;
BEGIN; SELECT setup.ae_load_table('nature2022.i18n_farmland_categories', '{data_folder}/i18n/i18n.farmland_categories_20200527_en.txt'); COMMIT;

BEGIN; SELECT setup.ae_load_table('nature2022.i18n_mobile_source_off_road_categories', '{data_folder}/i18n/i18n.mobile_source_off_road_categories_20210923.txt', TRUE); COMMIT;

BEGIN; SELECT setup.ae_load_table('nature2022.i18n_road_area_categories', '{data_folder}/i18n/i18n.road_area_categories_20220203.txt', TRUE); COMMIT;

BEGIN; SELECT setup.ae_load_table('nature2022.i18n_road_type_categories', '{data_folder}/i18n/i18n.road_type_categories_20220616.txt', TRUE); COMMIT;

BEGIN; SELECT setup.ae_load_table('nature2022.i18n_road_vehicle_categories', '{data_folder}/i18n/i18n.road_vehicle_categories_20220203.txt', TRUE); COMMIT;

BEGIN;
	INSERT INTO nature2022.i18n_mobile_source_on_road_categories (mobile_source_on_road_category_id, language_code, name, description)
	SELECT mobile_source_on_road_category_id, unnest(ARRAY['nl', 'en']::i18n.language_code_type[]), name, description FROM nature2022.mobile_source_on_road_categories;
COMMIT;

BEGIN; SELECT setup.ae_load_table('nature2022.i18n_shipping_maritime_categories', '{data_folder}/i18n/i18n.shipping_maritime_categories_20140904_nl.txt'); COMMIT;
BEGIN; SELECT setup.ae_load_table('nature2022.i18n_shipping_maritime_categories', '{data_folder}/i18n/i18n.shipping_maritime_categories_20140904_en.txt'); COMMIT;

BEGIN; SELECT setup.ae_load_table('nature2022.i18n_shipping_inland_categories', '{data_folder}/i18n/i18n.shipping_inland_categories_20140904_nl.txt'); COMMIT;
BEGIN; SELECT setup.ae_load_table('nature2022.i18n_shipping_inland_categories', '{data_folder}/i18n/i18n.shipping_inland_categories_20140904_en.txt'); COMMIT;

BEGIN;
	INSERT INTO nature2022.i18n_shipping_inland_waterway_categories
	SELECT shipping_inland_waterway_category_id, unnest(ARRAY['nl', 'en']::i18n.language_code_type[]), name, description FROM nature2022.shipping_inland_waterway_categories;
COMMIT;
