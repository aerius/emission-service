BEGIN; SELECT setup.ae_load_table('nature2022.sectors', '{data_folder}/public/sectors_20220223.txt', TRUE); COMMIT;
BEGIN; SELECT setup.ae_load_table('nature2022.gcn_sectors', '{data_folder}/public/gcn_sectors_20220223.txt', TRUE); COMMIT;
BEGIN; SELECT setup.ae_load_table('nature2022.sectors_main_gcn_sector', '{data_folder}/public/sectors_main_gcn_sector_20220223.txt', TRUE); COMMIT;

BEGIN; SELECT setup.ae_load_table('nature2022.emission_diurnal_variations', '{data_folder}/public/emission_diurnal_variations_20170119.txt'); COMMIT;

BEGIN; SELECT setup.ae_load_table('nature2022.sector_default_source_characteristics', '{data_folder}/temp/temp_sector_default_source_characteristics_20200612.txt'); COMMIT;
BEGIN; SELECT setup.ae_load_table('nature2022.gcn_sector_source_characteristics', '{data_folder}/public/gcn_sector_source_characteristics_20190222.txt'); COMMIT;
