/*
 * shipping_maritime_categories
 * ----------------------------
 * Table containing the maritime shipping categories.
 * The name of the category should indicate a tonnage-range.
 */
CREATE TABLE shipping_maritime_categories
(
	shipping_maritime_category_id smallint NOT NULL,
	code text NOT NULL UNIQUE,
	name text NOT NULL UNIQUE,
	description text,

	CONSTRAINT shipping_maritime_categories_pkey PRIMARY KEY (shipping_maritime_category_id)
);


/*
 * shipping_maritime_category_maneuver_properties
 * ----------------------------------------------
 * Table containing maneuver properties for maritime shipping categories.
 *
 * @column maneuver_factor The factor to increase emissions at the starting section of a route due to maneuvring the ship near the dock.
 * @column maneuver_length The length of the route for which the factor should be applied.
 */
CREATE TABLE shipping_maritime_category_maneuver_properties
(
	shipping_maritime_category_id smallint NOT NULL,
	maneuver_factor posreal NOT NULL,
	maneuver_length posreal NOT NULL,

	CONSTRAINT shipping_maritime_category_maneuver_properties_pkey PRIMARY KEY (shipping_maritime_category_id),
	CONSTRAINT shipping_maritime_category_maneuver_properties_fkey_categories FOREIGN KEY (shipping_maritime_category_id) REFERENCES shipping_maritime_categories
);


/*
 * shipping_maritime_category_emission_factors
 * -------------------------------------------
 * Table containing the emission factors for maritime shipping categories.
 * These factors are defined per shipping category, per substance, per year and per movement type.
 *
 * The unit of the emission factor depends on the movement type.
 * When moving at a certain speed, the emission factor is in kg/(kilometer * number of ships).
 * When not moving/docked, the emission factor is in kg/(hours docked * number of ships).
 */
CREATE TABLE shipping_maritime_category_emission_factors
(
	shipping_maritime_category_id smallint NOT NULL,
	year year_type NOT NULL,
	substance_id smallint NOT NULL,
	movement_type shipping_movement_type NOT NULL,
	emission_factor posreal NOT NULL,

	CONSTRAINT shipping_maritime_category_emission_factors_pkey PRIMARY KEY (shipping_maritime_category_id, substance_id, movement_type, year),
	CONSTRAINT shipping_maritime_category_emission_factors_fkey_categories FOREIGN KEY (shipping_maritime_category_id) REFERENCES shipping_maritime_categories,
	CONSTRAINT shipping_maritime_category_emission_factors_fkey_substances FOREIGN KEY (substance_id) REFERENCES substances
);


/*
 * shipping_maritime_category_source_characteristics
 * -------------------------------------------------
 * Table containing the OPS characteristics per maritime shipping category.
 *
 * These characteristics all depend on the type of the ship and the type of movement.
 */
CREATE TABLE shipping_maritime_category_source_characteristics
(
	shipping_maritime_category_id smallint NOT NULL,
	year year_type NOT NULL,
	movement_type shipping_movement_type NOT NULL,
	gcn_sector_id integer NOT NULL,
	heat_content posreal NOT NULL,
	height posreal NOT NULL,
	spread posreal NOT NULL,

	CONSTRAINT shipping_maritime_category_source_char_pkey PRIMARY KEY (shipping_maritime_category_id, movement_type, year),
	CONSTRAINT shipping_maritime_category_source_char_fkey_categories FOREIGN KEY (shipping_maritime_category_id) REFERENCES shipping_maritime_categories,
	CONSTRAINT shipping_maritime_category_source_char_fkey_gcn_sectors FOREIGN KEY (gcn_sector_id) REFERENCES gcn_sectors
);


/*
 * shipping_maritime_mooring_maneuver_factors
 * ------------------------------------------
 * Table containing the maneuver factors and maneuver lengths for bruto tonnage ranges.
 *
 * @column tonnage_lower_threshold The lower threshold/boundary of the bruto tonnage range. The upper threshold/boundary is the lower threshold of the next range.
 * @column maneuver_factor The factor that should be applied to the emission for the section of the route where maneuvering near a dock is expected.
 * @column maneuver_length The length of the route from a dock for which maneuvering is expected, and for which the maneuver factor should be applied.
 */
CREATE TABLE shipping_maritime_mooring_maneuver_factors
(
	tonnage_category_id smallint NOT NULL,
	tonnage_lower_threshold integer NOT NULL,
	maneuver_factor posreal NOT NULL,
	maneuver_length posreal NOT NULL,

	CONSTRAINT shipping_maritime_mooring_maneuver_factors_pkey PRIMARY KEY (tonnage_category_id)
);
