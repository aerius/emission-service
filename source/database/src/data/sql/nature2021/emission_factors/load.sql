/* Road data */
BEGIN; SELECT setup.ae_load_table('nature2021.road_area_categories', '{data_folder}/public/road_area_categories_20220203.txt', true); COMMIT;
BEGIN; SELECT setup.ae_load_table('nature2021.road_type_categories', '{data_folder}/public/road_type_categories_20220203.txt', true); COMMIT;
BEGIN; SELECT setup.ae_load_table('nature2021.road_vehicle_categories', '{data_folder}/public/road_vehicle_categories_20220203.txt', true); COMMIT;
BEGIN; SELECT setup.ae_load_table('nature2021.road_speed_profiles', '{data_folder}/public/road_speed_profiles_20220223.txt', true); COMMIT;
BEGIN; SELECT setup.ae_load_table('nature2021.road_areas_to_road_types', '{data_folder}/public/road_areas_to_road_types_20220203.txt', true); COMMIT;
BEGIN; SELECT setup.ae_load_table('nature2021.road_types_to_speed_profiles', '{data_folder}/public/road_types_to_speed_profiles_20220203.txt', true); COMMIT;
BEGIN; SELECT setup.ae_load_table('nature2021.road_categories', '{data_folder}/public/road_categories_20220203.txt', true); COMMIT;
BEGIN; SELECT setup.ae_load_table('nature2021.road_category_emission_factors', '{data_folder}/public/road_category_emission_factors_20220203.txt', true); COMMIT;
BEGIN; SELECT setup.ae_load_table('nature2021.mobile_source_on_road_categories', '{data_folder}/public/mobile_source_on_road_categories_20210618.txt'); COMMIT;
BEGIN; SELECT setup.ae_load_table('nature2021.mobile_source_on_road_category_emission_factors', '{data_folder}/public/mobile_source_on_road_category_emission_factors_20220203.txt', TRUE); COMMIT;

/* Farm animal category and -lodging data */
BEGIN; SELECT setup.ae_load_table('nature2021.farm_animal_categories', '{data_folder}/public/farm_animal_categories_20210607.txt'); COMMIT;
BEGIN; SELECT setup.ae_load_table('nature2021.farm_lodging_system_definitions', '{data_folder}/public/farm_lodging_system_definitions_20211026.txt'); COMMIT;

-- Farm lodging structure changed significantly. If needed, something specific has to be applied for this dataset.
--BEGIN; SELECT setup.ae_load_table('nature2021.farm_lodging_types', '{data_folder}/public/farm_lodging_types_20211026.txt'); COMMIT;
--BEGIN; SELECT setup.ae_load_table('nature2021.farm_lodging_type_emission_factors', '{data_folder}/public/farm_lodging_type_emission_factors_20220808.txt', true); COMMIT;
--BEGIN; SELECT setup.ae_load_table('nature2021.farm_lodging_types_other_lodging_type', '{data_folder}/public/farm_lodging_types_other_lodging_type_20211026.txt'); COMMIT;
--BEGIN; SELECT setup.ae_load_table('nature2021.farm_lodging_types_to_lodging_system_definitions', '{data_folder}/public/farm_lodging_types_to_lodging_system_definitions_20211026.txt'); COMMIT;

--BEGIN; SELECT setup.ae_load_table('nature2021.farm_additional_lodging_systems', '{data_folder}/public/farm_additional_lodging_systems_20210607.txt'); COMMIT;
--BEGIN; SELECT setup.ae_load_table('nature2021.farm_additional_lodging_system_emission_factors', '{data_folder}/public/farm_additional_lodging_system_emission_factors_20210607.txt'); COMMIT;
--BEGIN; SELECT setup.ae_load_table('nature2021.farm_additional_lodging_systems_to_lodging_system_definitions', '{data_folder}/public/farm_additional_lodging_systems_to_lodging_system_definitions_20210607.txt'); COMMIT;
--BEGIN; SELECT setup.ae_load_table('nature2021.farm_lodging_types_to_additional_lodging_systems', '{data_folder}/public/farm_lodging_types_to_additional_lodging_systems_20200914.txt'); COMMIT;

--BEGIN; SELECT setup.ae_load_table('nature2021.farm_reductive_lodging_systems', '{data_folder}/public/farm_reductive_lodging_systems_20211026.txt'); COMMIT;
--BEGIN; SELECT setup.ae_load_table('nature2021.farm_reductive_lodging_system_reduction_factors', '{data_folder}/public/farm_reductive_lodging_system_reduction_factors_20211026.txt'); COMMIT;
--BEGIN; SELECT setup.ae_load_table('nature2021.farm_reductive_lodging_systems_to_lodging_system_definitions', '{data_folder}/public/farm_reductive_lodging_systems_to_lodging_system_definitions_20211026.txt'); COMMIT;
--BEGIN; SELECT setup.ae_load_table('nature2021.farm_lodging_types_to_reductive_lodging_systems', '{data_folder}/public/farm_lodging_types_to_reductive_lodging_systems_20210607.txt'); COMMIT;

--BEGIN; SELECT setup.ae_load_table('nature2021.farm_lodging_fodder_measures', '{data_folder}/public/farm_lodging_fodder_measures_20210607.txt'); COMMIT;
--BEGIN; SELECT setup.ae_load_table('nature2021.farm_lodging_fodder_measure_reduction_factors', '{data_folder}/public/farm_lodging_fodder_measure_reduction_factors_20210607.txt'); COMMIT;
--BEGIN; SELECT setup.ae_load_table('nature2021.farm_lodging_fodder_measures_animal_category', '{data_folder}/public/farm_lodging_fodder_measures_animal_category_20210628.txt'); COMMIT;

/* Farmland categories */
BEGIN; SELECT setup.ae_load_table('nature2021.farmland_categories', '{data_folder}/temp/temp_farmland_categories_20200527.txt'); COMMIT;

/* Mobile source off road data */
BEGIN; SELECT setup.ae_load_table('nature2021.mobile_source_off_road_categories', '{data_folder}/public/mobile_source_off_road_categories_20210923.txt', TRUE); COMMIT;
BEGIN; SELECT setup.ae_load_table('nature2021.mobile_source_off_road_category_emission_factors', '{data_folder}/public/mobile_source_off_road_category_emission_factors_20210922.txt', TRUE); COMMIT;
BEGIN; SELECT setup.ae_load_table('nature2021.mobile_source_off_road_category_adblue_properties', '{data_folder}/public/mobile_source_off_road_category_adblue_properties_20210929.txt', TRUE); COMMIT;

/* Shipping data */
BEGIN; SELECT setup.ae_load_table('nature2021.shipping_maritime_categories', '{data_folder}/public/shipping_maritime_categories_20140331.txt'); COMMIT;
BEGIN; SELECT setup.ae_load_table('nature2021.shipping_maritime_category_maneuver_properties', '{data_folder}/temp/temp_shipping_maritime_category_maneuver_properties_20140402.txt'); COMMIT;
BEGIN; SELECT setup.ae_load_table('nature2021.shipping_maritime_category_emission_factors', '{data_folder}/public/shipping_maritime_category_emission_factors_TEMP2035_20210616.txt'); COMMIT;
BEGIN; SELECT setup.ae_load_table('nature2021.shipping_maritime_category_source_characteristics', '{data_folder}/public/shipping_maritime_category_source_characteristics_TEMP2035_20210616.txt'); COMMIT;
BEGIN; SELECT setup.ae_load_table('nature2021.shipping_maritime_mooring_maneuver_factors', '{data_folder}/public/shipping_maritime_mooring_maneuver_factors_20210604.txt'); COMMIT;

/* Inland shipping data */
BEGIN; SELECT setup.ae_load_table('nature2021.shipping_inland_categories', '{data_folder}/public/shipping_inland_categories_20140327.txt'); COMMIT;
BEGIN; SELECT setup.ae_load_table('nature2021.shipping_inland_waterway_categories', '{data_folder}/temp/temp_shipping_inland_waterway_categories_20160301.txt'); COMMIT;
BEGIN; SELECT setup.ae_load_table('nature2021.shipping_inland_category_source_characteristics', '{data_folder}/public/shipping_inland_category_source_characteristics_20210412.txt'); COMMIT;
BEGIN; SELECT setup.ae_load_table('nature2021.shipping_inland_category_source_characteristics_docked', '{data_folder}/public/shipping_inland_category_source_characteristics_docked_20140326.txt'); COMMIT;
BEGIN; SELECT setup.ae_load_table('nature2021.shipping_inland_category_emission_factors', '{data_folder}/public/shipping_inland_category_emission_factors_TEMP2035_20210616.txt'); COMMIT;
BEGIN; SELECT setup.ae_load_table('nature2021.shipping_inland_category_emission_factors_docked', '{data_folder}/public/shipping_inland_category_emission_factors_docked_TEMP2035_20210616.txt'); COMMIT;
