BEGIN; INSERT INTO years SELECT unnest(ARRAY[2018, 2020, 2030]), unnest(ARRAY['base', 'future', 'future']::year_category_type[]); COMMIT;

BEGIN; SELECT setup.ae_load_table('substances', '{data_folder}/public/substances_20190716.txt'); COMMIT;
