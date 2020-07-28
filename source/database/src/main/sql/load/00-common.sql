{import_common 'essentials/'}

{import_common 'i18n/'}
{import_common 'substances/'}
{import_common 'imaer/'}
{import_common 'emission_factor_types/'}

CREATE SCHEMA template;

{import_common_into_schema 'sectors/', 'template'}
{import_common_into_schema 'emission_factors/', 'template'}

SELECT setup.ae_clone_schema('template', 'current_dev');
