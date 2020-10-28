-- Dataset voor development

INSERT INTO datasets (code, name, schema_name, current, description)
	VALUES ('dev', 'current development', 'dev', false, 'Dataset to be used for current development');

INSERT INTO i18n_datasets (code, language_code, name, description)
	VALUES ('dev', 'nl', 'Huidige ontwikkeling', 'Dataset die gebruikt wordt bij huidige ontwikkelingen');
INSERT INTO i18n_datasets (code, language_code, name, description)
	VALUES ('dev', 'en', 'Current development', 'Dataset to be used for current development');

{import_common 'dev/dataset_metadata.sql'}
{import_common 'dev/sectors'}
{import_common 'dev/emission_factors'}


-- Dataset(s) voor AERIUS 2020

INSERT INTO datasets (code, name, schema_name, current, description)
	VALUES ('nature2020', 'AERIUS 2020 nature', 'nature2020', true, 'Dataset used in AERIUS 2020, nature profile, released on 15 october 2020');

INSERT INTO i18n_datasets (code, language_code, name, description)
	VALUES ('nature2020', 'nl', 'AERIUS 2020 natuur', 'Dataset zoals gebruikt in AERIUS 2020, natuur profiel, publiek beschikbaar vanaf 15 oktober 2020');
INSERT INTO i18n_datasets (code, language_code, name, description)
	VALUES ('nature2020', 'en', 'AERIUS 2020 nature', 'Dataset used in AERIUS 2020, nature profile, released on 15 october 2020');

{import_common 'nature2020/dataset_metadata.sql'}
{import_common 'nature2020/sectors'}
{import_common 'nature2020/emission_factors'}
