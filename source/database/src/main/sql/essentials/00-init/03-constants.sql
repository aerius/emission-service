/*
 * constant_type
 * -------------
 * Specifies the type of a constant.
 */
CREATE TYPE constant_type AS ENUM
	('string', 'integer', 'float', 'boolean', 'wkt');


/*
 * constants
 * ---------
 * Table for database constants.
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
 * Function returning the value of a database constant.
 * When the constant does not exist in the constants table, an exception is raised.
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
 * Function returning the default SRID value.
 */
CREATE OR REPLACE FUNCTION ae_get_srid()
	RETURNS integer AS
$BODY$
	SELECT ae_constant('SRID')::integer;
$BODY$
LANGUAGE sql IMMUTABLE;
