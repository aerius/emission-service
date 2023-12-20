/* Road data */
-- TODO: replace with current data
BEGIN; SELECT setup.ae_load_table('dev.road_area_categories', '{data_folder}/public/road_area_categories_20220203.txt', TRUE); COMMIT;
BEGIN; SELECT setup.ae_load_table('dev.road_type_categories', '{data_folder}/public/road_type_categories_20220203.txt', TRUE); COMMIT;
BEGIN; SELECT setup.ae_load_table('dev.road_vehicle_categories', '{data_folder}/public/road_vehicle_categories_20220203.txt', TRUE); COMMIT;
BEGIN; SELECT setup.ae_load_table('dev.road_speed_profiles', '{data_folder}/public/road_speed_profiles_20220223.txt', TRUE); COMMIT;
BEGIN; SELECT setup.ae_load_table('dev.road_areas_to_road_types', '{data_folder}/public/road_areas_to_road_types_20220203.txt', TRUE); COMMIT;
BEGIN; SELECT setup.ae_load_table('dev.road_types_to_speed_profiles', '{data_folder}/public/road_types_to_speed_profiles_20220203.txt', TRUE); COMMIT;
BEGIN; SELECT setup.ae_load_table('dev.road_categories', '{data_folder}/public/road_categories_20220203.txt', TRUE); COMMIT;
BEGIN; SELECT setup.ae_load_table('dev.road_category_emission_factors', '{data_folder}/public/road_category_emission_factors_20230321.txt', TRUE); COMMIT;
BEGIN; SELECT setup.ae_load_table('dev.mobile_source_on_road_categories', '{data_folder}/public/mobile_source_on_road_categories_20210618.txt'); COMMIT;
BEGIN; SELECT setup.ae_load_table('dev.mobile_source_on_road_category_emission_factors', '{data_folder}/public/mobile_source_on_road_category_emission_factors_20230623.txt', TRUE); COMMIT;

/* Farm animal category and -lodging data */
BEGIN; SELECT setup.ae_load_table('dev.farm_animal_categories', '{data_folder}/public/farm_animal_categories_20230524.txt', TRUE); COMMIT;
BEGIN; SELECT setup.ae_load_table('dev.farm_lodging_system_definitions', '{data_folder}/public/farm_lodging_system_definitions_20230524.txt', TRUE); COMMIT;

BEGIN; SELECT setup.ae_load_table('dev.farm_lodging_types', '{data_folder}/public/farm_lodging_types_20230524.txt', TRUE); COMMIT;
BEGIN; SELECT setup.ae_load_table('dev.farm_lodging_type_emission_factors', '{data_folder}/public/farm_lodging_type_emission_factors_20230524.txt', TRUE); COMMIT;
BEGIN; SELECT setup.ae_load_table('dev.farm_lodging_types_other_lodging_type', '{data_folder}/public/farm_lodging_types_other_lodging_type_20230524.txt', TRUE); COMMIT;
BEGIN; SELECT setup.ae_load_table('dev.farm_lodging_types_to_lodging_system_definitions', '{data_folder}/public/farm_lodging_types_to_lodging_system_definitions_20230524.txt',TRUE); COMMIT;

BEGIN; SELECT setup.ae_load_table('dev.farm_additional_lodging_systems', '{data_folder}/public/farm_additional_lodging_systems_20230524.txt', TRUE); COMMIT;
BEGIN; SELECT setup.ae_load_table('dev.farm_additional_lodging_system_emission_factors', '{data_folder}/public/farm_additional_lodging_system_emission_factors_20230524.txt', TRUE); COMMIT;
BEGIN; SELECT setup.ae_load_table('dev.farm_additional_lodging_systems_to_lodging_system_definitions', '{data_folder}/public/farm_additional_lodging_systems_to_lodging_system_definitions_20230524.txt', TRUE); COMMIT;
BEGIN; SELECT setup.ae_load_table('dev.farm_lodging_types_to_additional_lodging_systems', '{data_folder}/public/farm_lodging_types_to_additional_lodging_systems_20230524.txt', TRUE); COMMIT;

BEGIN; SELECT setup.ae_load_table('dev.farm_reductive_lodging_systems', '{data_folder}/public/farm_reductive_lodging_systems_20230524.txt', TRUE); COMMIT;
BEGIN; SELECT setup.ae_load_table('dev.farm_reductive_lodging_system_reduction_factors', '{data_folder}/public/farm_reductive_lodging_system_reduction_factors_20230524.txt', TRUE); COMMIT;
BEGIN; SELECT setup.ae_load_table('dev.farm_reductive_lodging_systems_to_lodging_system_definitions', '{data_folder}/public/farm_reductive_lodging_systems_to_lodging_system_definitions_20230524.txt', TRUE); COMMIT;
BEGIN; SELECT setup.ae_load_table('dev.farm_lodging_types_to_reductive_lodging_systems', '{data_folder}/public/farm_lodging_types_to_reductive_lodging_systems_20230524.txt', TRUE); COMMIT;

BEGIN; SELECT setup.ae_load_table('dev.farm_lodging_fodder_measures', '{data_folder}/public/farm_lodging_fodder_measures_20230524.txt', TRUE); COMMIT;
BEGIN; SELECT setup.ae_load_table('dev.farm_lodging_fodder_measure_reduction_factors', '{data_folder}/public/farm_lodging_fodder_measure_reduction_factors_20230524.txt', TRUE); COMMIT;
BEGIN; SELECT setup.ae_load_table('dev.farm_lodging_fodder_measures_animal_category', '{data_folder}/public/farm_lodging_fodder_measures_animal_category_20230524.txt', TRUE); COMMIT;

/* Farmland categories */
BEGIN; SELECT setup.ae_load_table('dev.farmland_categories', '{data_folder}/temp/temp_farmland_categories_20200527.txt'); COMMIT;

/* Off road mobile source data */
BEGIN; SELECT setup.ae_load_table('dev.mobile_source_off_road_categories', '{data_folder}/public/mobile_source_off_road_categories_20210923.txt', TRUE); COMMIT;
BEGIN; SELECT setup.ae_load_table('dev.mobile_source_off_road_category_emission_factors', '{data_folder}/public/mobile_source_off_road_category_emission_factors_20210922.txt', TRUE); COMMIT;
BEGIN; SELECT setup.ae_load_table('dev.mobile_source_off_road_category_adblue_properties', '{data_folder}/public/mobile_source_off_road_category_adblue_properties_20210929.txt', TRUE); COMMIT;

/* Shipping data */
BEGIN; SELECT setup.ae_load_table('dev.shipping_maritime_categories', '{data_folder}/public/shipping_maritime_categories_20140331.txt'); COMMIT;
BEGIN; SELECT setup.ae_load_table('dev.shipping_maritime_category_maneuver_properties', '{data_folder}/temp/temp_shipping_maritime_category_maneuver_properties_20140402.txt'); COMMIT;
BEGIN; SELECT setup.ae_load_table('dev.shipping_maritime_category_emission_factors', '{data_folder}/public/shipping_maritime_category_emission_factors_20230704.txt', TRUE); COMMIT;
BEGIN; SELECT setup.ae_load_table('dev.shipping_maritime_category_source_characteristics', '{data_folder}/public/shipping_maritime_category_source_characteristics_20230704.txt', TRUE); COMMIT;
BEGIN; SELECT setup.ae_load_table('dev.shipping_maritime_mooring_maneuver_factors', '{data_folder}/public/shipping_maritime_mooring_maneuver_factors_20210604.txt'); COMMIT;

/* Inland shipping data */
BEGIN; SELECT setup.ae_load_table('dev.shipping_inland_categories', '{data_folder}/public/shipping_inland_categories_20230717.txt', TRUE); COMMIT;
BEGIN; SELECT setup.ae_load_table('dev.shipping_inland_waterway_categories', '{data_folder}/temp/temp_shipping_inland_waterway_categories_20160301.txt'); COMMIT;
BEGIN; SELECT setup.ae_load_table('dev.shipping_inland_category_source_characteristics', '{data_folder}/public/shipping_inland_category_source_characteristics_20230707.txt', TRUE); COMMIT;
BEGIN; SELECT setup.ae_load_table('dev.shipping_inland_category_source_characteristics_docked', '{data_folder}/public/shipping_inland_category_source_characteristics_docked_20230707.txt', TRUE); COMMIT;
BEGIN; SELECT setup.ae_load_table('dev.shipping_inland_category_emission_factors', '{data_folder}/public/shipping_inland_category_emission_factors_20230707.txt', TRUE); COMMIT;
BEGIN; SELECT setup.ae_load_table('dev.shipping_inland_category_emission_factors_docked', '{data_folder}/public/shipping_inland_category_emission_factors_docked_20230707.txt', TRUE); COMMIT;
