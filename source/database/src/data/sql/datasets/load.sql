-- Dataset for development

INSERT INTO datasets (code, name, schema_name, current, description)
	VALUES ('dev', 'current development', 'dev', false, 'Dataset to be used for current development');

INSERT INTO i18n_datasets (code, language_code, name, description)
	VALUES ('dev', 'nl', 'Huidige ontwikkeling', 'Dataset die gebruikt wordt bij huidige ontwikkelingen');
INSERT INTO i18n_datasets (code, language_code, name, description)
	VALUES ('dev', 'en', 'Current development', 'Dataset to be used for current development');

{import_common 'dev/dataset_metadata.sql'}
{import_common 'dev/sectors'}
{import_common 'dev/emission_factors'}


-- Dataset(s) for AERIUS 2020

INSERT INTO datasets (code, name, schema_name, current, description)
	VALUES ('nature2020', 'AERIUS 2020 nature', 'nature2020', true, 'Dataset used in AERIUS 2020, nature profile, released on 15 october 2020');

INSERT INTO i18n_datasets (code, language_code, name, description)
	VALUES ('nature2020', 'nl', 'AERIUS 2020 natuur', 'Dataset zoals gebruikt in AERIUS 2020, natuur profiel, publiek beschikbaar vanaf 15 oktober 2020');
INSERT INTO i18n_datasets (code, language_code, name, description)
	VALUES ('nature2020', 'en', 'AERIUS 2020 nature', 'Dataset used in AERIUS 2020, nature profile, released on 15 october 2020');

{import_common 'nature2020/dataset_metadata.sql'}
{import_common 'nature2020/sectors'}
{import_common 'nature2020/emission_factors'}


-- Dataset(s) for AERIUS 2021

INSERT INTO datasets (code, name, schema_name, current, description)
	VALUES ('nature2021', 'AERIUS 2021 nature', 'nature2021', true, 'Dataset used in AERIUS 2021, nature profile, released on 13 januari 2022');

INSERT INTO i18n_datasets (code, language_code, name, description)
	VALUES ('nature2021', 'nl', 'AERIUS 2021 natuur', 'Dataset zoals gebruikt in AERIUS 2021, natuur profiel, publiek beschikbaar vanaf 13 januari 2022');
INSERT INTO i18n_datasets (code, language_code, name, description)
	VALUES ('nature2021', 'en', 'AERIUS 2021 nature', 'Dataset used in AERIUS 2021, nature profile, released on 13 januari 2022');

{import_common 'nature2021/dataset_metadata.sql'}
{import_common 'nature2021/sectors'}
{import_common 'nature2021/emission_factors'}


-- Dataset(s) for Calculator 2023

INSERT INTO datasets (code, name, schema_name, current, description)
	VALUES ('calculator2023', 'AERIUS Calculator 2023', 'calculator2023', true, 'Dataset used in AERIUS Calculator 2023, released on 5 october 2023');

INSERT INTO i18n_datasets (code, language_code, name, description)
	VALUES ('calculator2023', 'nl', 'AERIUS Calculator 2023', 'Dataset zoals gebruikt in AERIUS Calculator 2023, publiek beschikbaar vanaf 5 oktober 2023');
INSERT INTO i18n_datasets (code, language_code, name, description)
	VALUES ('calculator2023', 'en', 'AERIUS Calculator 2023', 'Dataset used in AERIUS Calculator 2023, released on 5 october 2023');

{import_common 'calculator2023/dataset_metadata.sql'}
{import_common 'calculator2023/sectors'}
{import_common 'calculator2023/emission_factors'}
