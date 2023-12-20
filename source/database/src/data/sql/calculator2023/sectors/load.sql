BEGIN; SELECT setup.ae_load_table('calculator2023.sectors', '{data_folder}/public/sectors_20220223.txt', TRUE); COMMIT;
BEGIN; SELECT setup.ae_load_table('calculator2023.gcn_sectors', '{data_folder}/public/gcn_sectors_20230707.txt', TRUE); COMMIT;
BEGIN; SELECT setup.ae_load_table('calculator2023.sectors_main_gcn_sector', '{data_folder}/public/sectors_main_gcn_sector_20230707.txt', TRUE); COMMIT;

BEGIN; SELECT setup.ae_load_table('calculator2023.emission_diurnal_variations', '{data_folder}/public/emission_diurnal_variations_20170119.txt'); COMMIT;

BEGIN; SELECT setup.ae_load_table('calculator2023.sector_default_source_characteristics', '{data_folder}/public/sector_default_source_characteristics_20231102.txt', TRUE); COMMIT;
BEGIN; SELECT setup.ae_load_table('calculator2023.gcn_sector_source_characteristics', '{data_folder}/public/gcn_sector_source_characteristics_20231102.txt', TRUE); COMMIT;
