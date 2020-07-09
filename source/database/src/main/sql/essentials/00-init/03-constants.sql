/*
 * constant_type
 * -------------
 * Geeft het type van een constante aan.
 */
CREATE TYPE constant_type AS ENUM
	('string', 'integer', 'float', 'boolean', 'wkt');


/*
 * constants
 * ---------
 * Tabel voor de database constanten.
 */
CREATE TABLE constants (
	key text NOT NULL,
	value text NOT NULL,
	description text,
	type constant_type,

	CONSTRAINT constants_pkey PRIMARY KEY (key)
);


/*
 * ae_constant
 * -----------
 * Retourneert waarde van een database constante.
 * Indien constante niet bestaat in de constants tabel wordt een exceptie geraised.
 */
CREATE OR REPLACE FUNCTION ae_constant(constant_key text)
	RETURNS text AS
$BODY$
DECLARE
	constant_value text;
BEGIN
	SELECT value INTO constant_value FROM constants WHERE key = constant_key;
	IF constant_value IS NULL THEN
		RAISE EXCEPTION 'Could not find a public constant value for ''%''!', constant_key;
	END IF;
	RETURN constant_value;
END;
$BODY$
LANGUAGE plpgsql IMMUTABLE;


/*
 * ae_get_srid
 * -----------
 * Retourneert de default SRID waarde.
 */
CREATE OR REPLACE FUNCTION ae_get_srid()
	RETURNS integer AS
$BODY$
	SELECT ae_constant('SRID')::integer;
$BODY$
LANGUAGE sql IMMUTABLE;
