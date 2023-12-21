/*
 * mobile_source_off_road_categories
 * ---------------------------------
 * Table containing the off road mobile source categories (stageklassen).
 */
CREATE TABLE mobile_source_off_road_categories
(
	mobile_source_off_road_category_id smallint NOT NULL,
	code text NOT NULL UNIQUE,
	name text NOT NULL UNIQUE,
	description text,
	sort_order integer NOT NULL UNIQUE,

	CONSTRAINT mobile_source_off_road_categories_pkey PRIMARY KEY (mobile_source_off_road_category_id)
);


/*
 * mobile_source_off_road_category_adblue_properties
 * -------------------------------------------------
 * Table containing properties per off road mobile source category that are required to do adblu validations, independent of substances.
 *
 * Not every off road mobile source category can use adblue, in which case there is no record in this table.
 * @column max_adblue_fuel_ratio Maximum ratio between liters adblue and fuel that should be used.
 */
CREATE TABLE mobile_source_off_road_category_adblue_properties
(
	mobile_source_off_road_category_id smallint NOT NULL,
	max_adblue_fuel_ratio fraction NOT NULL,

	CONSTRAINT mobile_source_off_road_category_adblue_prop_pkey PRIMARY KEY (mobile_source_off_road_category_id),
	CONSTRAINT mobile_source_off_road_category_adblue_prop_fkey_cat_id FOREIGN KEY (mobile_source_off_road_category_id) REFERENCES mobile_source_off_road_categories
);


/*
 * mobile_source_off_road_category_emission_factors
 * ------------------------------------------------
 * Table containing the emission factors for off road mobile sources.
 *
 * There are emission factors available for fuel use and for operating hours.
 * Based on the category, 1 of these is present (or not 0), or both are present.
 * Besides these factors, an adblue emissionfactor can be present, which can reduce the total emissions (these are expected to be negative values).
 *
 * @column emission_factor_per_liter_fuel f1 Emission factor per liter brandstof (kg/l)
 * @column emission_factor_per_operating_hour f2 Emission factor per operating hour (stationary + working) (kg/hour)
 * @column emission_factor_per_liter_adblue f3 Emission factor per liter adblue (kg/l).
 */
CREATE TABLE mobile_source_off_road_category_emission_factors
(
	mobile_source_off_road_category_id smallint NOT NULL,
	substance_id smallint NOT NULL,
	emission_factor_per_liter_fuel posreal,
	emission_factor_per_operating_hour posreal,
	emission_factor_per_liter_adblue real,

	CONSTRAINT mobile_source_off_road_category_efac_pkey PRIMARY KEY (mobile_source_off_road_category_id, substance_id),
	CONSTRAINT mobile_source_off_road_category_efac_fkey_substances FOREIGN KEY (substance_id) REFERENCES substances,
	CONSTRAINT mobile_source_off_road_category_efac_fkey_mobile_off_road_cat FOREIGN KEY (mobile_source_off_road_category_id) REFERENCES mobile_source_off_road_categories
);
