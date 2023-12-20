/*
 * road_area_categories
 * --------------------
 * Table containing the different area categories for road traffic.
 */
CREATE TABLE road_area_categories
(
	road_area_category_id integer NOT NULL,
	code text NOT NULL UNIQUE,
	name text NOT NULL UNIQUE,

	CONSTRAINT road_area_categories_pkey PRIMARY KEY (road_area_category_id)
);


/*
 * road_type_categories
 * --------------------
 * Table containing the different road type categories.
 */
CREATE TABLE road_type_categories
(
	road_type_category_id integer NOT NULL,
	code text NOT NULL UNIQUE,
	name text NOT NULL UNIQUE,

	CONSTRAINT road_type_categories_pkey PRIMARY KEY (road_type_category_id)
);


/*
 * road_vehicle_categories
 * -----------------------
 * Table containing the different traffic or vehicle categories.
 *
 * These are the standard categories for road traffic (for example passenger cars).
 */
CREATE TABLE road_vehicle_categories
(
	road_vehicle_category_id integer NOT NULL,
	code text NOT NULL UNIQUE,
	name text NOT NULL UNIQUE,

	CONSTRAINT road_vehicle_categories_pkey PRIMARY KEY (road_vehicle_category_id)
);


/*
 * road_speed_profiles
 * -------------------
 * Table containing the different speed profiles.
 */
CREATE TABLE road_speed_profiles
(
	road_speed_profile_id integer NOT NULL,
	speed_limit_enforcement speed_limit_enforcement_type NOT NULL,
	maximum_speed integer,
	gradient integer,

	CONSTRAINT road_speed_profiles_pkey PRIMARY KEY (road_speed_profile_id)
);


/*
 * road_areas_to_road_types
 * ------------------------
 * Table linking road areas and road types.
 */
CREATE TABLE road_areas_to_road_types
(
	road_area_category_id integer NOT NULL,
	road_type_category_id integer NOT NULL,

	CONSTRAINT road_areas_to_road_types_pkey PRIMARY KEY (road_area_category_id, road_type_category_id),
	CONSTRAINT road_areas_to_road_types_fkey_road_area_categories FOREIGN KEY (road_area_category_id) REFERENCES road_area_categories,
	CONSTRAINT road_areas_to_road_types_fkey_road_type_categories FOREIGN KEY (road_type_category_id) REFERENCES road_type_categories
);


/*
 * road_types_to_speed_profiles
 * ----------------------------
 * Table linking types of roads and speed profiles.
 */
CREATE TABLE road_types_to_speed_profiles
(
	road_type_category_id integer NOT NULL,
	road_speed_profile_id integer NOT NULL,

	CONSTRAINT road_types_to_speed_profiles_pkey PRIMARY KEY (road_type_category_id, road_speed_profile_id),
	CONSTRAINT road_types_to_speed_profiles_fkey_road_type_categories FOREIGN KEY (road_type_category_id) REFERENCES road_type_categories,
	CONSTRAINT road_types_to_speed_profiles_fkey_road_speed_profiles FOREIGN KEY (road_speed_profile_id) REFERENCES road_speed_profiles
);


/*
 * road_categories
 * ---------------
 * Table containing road categories, which are combinations of road areas, road types, vehicle types, etc.
 */
CREATE TABLE road_categories
(
	road_category_id integer NOT NULL,
	road_area_category_id integer NOT NULL,
	road_type_category_id integer NOT NULL,
	road_vehicle_category_id integer NOT NULL,
	road_speed_profile_id integer NOT NULL,

	CONSTRAINT road_categories_pkey PRIMARY KEY (road_category_id),
	CONSTRAINT road_categories_fkey_road_areas_to_road_types FOREIGN KEY (road_area_category_id, road_type_category_id) REFERENCES road_areas_to_road_types,
	CONSTRAINT road_categories_fkey_road_vehicle_categories FOREIGN KEY (road_type_category_id) REFERENCES road_type_categories,
	CONSTRAINT road_categories_fkey_road_types_to_speed_profiles FOREIGN KEY (road_type_category_id, road_speed_profile_id) REFERENCES road_types_to_speed_profiles,
	CONSTRAINT road_categories_unique UNIQUE (road_area_category_id, road_type_category_id, road_vehicle_category_id, road_speed_profile_id)
);


/*
 * road_category_emission_factors
 * ------------------------------
 * Table containing the emission factors for road categories for different substances.
 * For NL: the emission factors are in g/vehicle/km
 * For UK: the emission factors are in g/km/s for vehicles per 24 hours.
 *
 * NOTE: The years present in this table are not by definition the same as the AERIUS policy/calculation years.
 */
CREATE TABLE road_category_emission_factors
(
	road_category_id integer NOT NULL,
	year year_type NOT NULL,
	substance_id smallint NOT NULL,
	emission_factor double precision NOT NULL,
	stagnated_emission_factor double precision NOT NULL,

	CONSTRAINT road_category_emission_factors_pkey PRIMARY KEY (road_category_id, year, substance_id),
	CONSTRAINT road_category_emission_factors_fkey_road_categories FOREIGN KEY (road_category_id) REFERENCES road_categories,
	CONSTRAINT road_category_emission_factors_fkey_substances FOREIGN KEY (substance_id) REFERENCES substances
);


/*
 * mobile_source_on_road_categories
 * --------------------------------
 * Table containing the on road mobile source categories.
 */
CREATE TABLE mobile_source_on_road_categories
(
	mobile_source_on_road_category_id smallint NOT NULL,
	code text NOT NULL UNIQUE,
	name text NOT NULL UNIQUE,
	description text,

	CONSTRAINT mobile_source_on_road_categories_pkey PRIMARY KEY (mobile_source_on_road_category_id)
);


/*
 * mobile_source_on_road_category_emission_factors
 * -----------------------------------------------
 * Table containing the emission factors for on road mobile source categories.
 * These emission factors are in kg/km/vehicle.
 */
CREATE TABLE mobile_source_on_road_category_emission_factors
(
	mobile_source_on_road_category_id smallint NOT NULL,
	road_type_category_id integer NOT NULL,
	year year_type NOT NULL,
	substance_id smallint NOT NULL,
	emission_factor posreal NOT NULL,

	CONSTRAINT mobile_source_on_road_efac_pkey PRIMARY KEY (mobile_source_on_road_category_id, road_type_category_id, year, substance_id),
	CONSTRAINT mobile_source_on_road_efac_fkey_road_types FOREIGN KEY (road_type_category_id) REFERENCES road_type_categories,
	CONSTRAINT mobile_source_on_road_efac_fkey_substances FOREIGN KEY (substance_id) REFERENCES substances,
	CONSTRAINT mobile_source_on_road_efac_fkey_mobile_on_road_cat FOREIGN KEY (mobile_source_on_road_category_id) REFERENCES mobile_source_on_road_categories
);
