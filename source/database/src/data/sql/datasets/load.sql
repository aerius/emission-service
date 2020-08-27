INSERT INTO datasets (code, name, schema_name, current, description)
	VALUES ('dev', 'current development', 'dev', true, 'Dataset to be used for current development');

INSERT INTO i18n_datasets (code, language_code, name, description)
	VALUES ('dev', 'nl', 'Huidige ontwikkeling', 'Dataset die gebruikt wordt bij huidige ontwikkelingen');
INSERT INTO i18n_datasets (code, language_code, name, description)
	VALUES ('dev', 'en', 'Current development', 'Dataset to be used for current development');

{import_common 'dev/dataset_metadata.sql'}
{import_common 'dev/sectors'}
{import_common 'dev/emission_factors'}
