-- i18n voor de module sectors
BEGIN; SELECT setup.ae_load_table('nature2022.i18n_sectors', '{data_folder}/i18n/i18n.sectors_20220412.txt', TRUE); COMMIT;

BEGIN; SELECT setup.ae_load_table('nature2022.i18n_emission_diurnal_variations', '{data_folder}/i18n/i18n.emission_diurnal_variations_20170119_nl.txt'); COMMIT;
BEGIN; SELECT setup.ae_load_table('nature2022.i18n_emission_diurnal_variations', '{data_folder}/i18n/i18n.emission_diurnal_variations_20170119_en.txt'); COMMIT;
