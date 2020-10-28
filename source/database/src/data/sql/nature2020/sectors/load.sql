BEGIN; SELECT setup.ae_load_table('nature2020.sectors', '{data_folder}/temp/temp_sectors_20200527.txt'); COMMIT;
BEGIN; SELECT setup.ae_load_table('nature2020.gcn_sectors', '{data_folder}/temp/temp_gcn_sectors_20200514.txt'); COMMIT;
BEGIN; SELECT setup.ae_load_table('nature2020.sectors_main_gcn_sector', '{data_folder}/temp/temp_sectors_main_gcn_sector_20200527.txt'); COMMIT;

BEGIN; SELECT setup.ae_load_table('nature2020.emission_diurnal_variations', '{data_folder}/public/emission_diurnal_variations_20170119.txt'); COMMIT;

BEGIN; SELECT setup.ae_load_table('nature2020.sector_default_source_characteristics', '{data_folder}/temp/temp_sector_default_source_characteristics_20200612.txt'); COMMIT;
BEGIN; SELECT setup.ae_load_table('nature2020.gcn_sector_source_characteristics', '{data_folder}/public/gcn_sector_source_characteristics_20190222.txt'); COMMIT;
