/*
 * unit_type
 * ---------
 * Type van eenheid (gebruikt voor emissiefactoren bij plannen).
 */
CREATE TYPE unit_type AS ENUM
	('hectare', 'giga_joule', 'mega_watt_hours', 'count', 'no_unit', 'square_meters', 'tonnes');
