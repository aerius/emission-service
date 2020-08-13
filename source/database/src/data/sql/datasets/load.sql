INSERT INTO datasets (dataset_code, schema_name, latest, description)
	VALUES ('dev', 'dev', true, 'Dataset to be used for current development');
{import_common 'dev/sectors'}
{import_common 'dev/emission_factors'}
