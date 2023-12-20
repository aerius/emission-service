/*
 * farm_emission_factor_type
 * -------------------------
 * Enum for farm related emission factor types.
 */
CREATE TYPE farm_emission_factor_type AS ENUM
	('per_year',
		'per_animal_per_year', 'per_animal_per_day',
		'per_meters_cubed_per_application', 'per_tonnes_per_application',
		'per_tonnes_per_year',
		'per_meters_squared_per_day', 'per_meters_squared_per_year');
