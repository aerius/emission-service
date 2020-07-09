{import_common 'essentials/'}

-- TODO: decide if we want the shipping module (and this specific constant which is so far only used for shipping)
/**
 * Default SRID.
 */
INSERT INTO constants (key, value) VALUES ('SRID', 28992);

{import_common 'i18n/'}
{import_common 'substances/'}
{import_common 'sectors/'}
{import_common 'shipping/'}
{import_common 'emission_factors/'}
{import_common 'imaer/'}
