/*
 * shipping_inland_categories
 * --------------------------
 * Table containing the inland shipping categories.
 */
CREATE TABLE shipping_inland_categories
(
	shipping_inland_category_id smallint NOT NULL,
	code text NOT NULL UNIQUE,
	name text NOT NULL UNIQUE,
	description text,

	CONSTRAINT shipping_inland_categories_pkey PRIMARY KEY (shipping_inland_category_id)
);


/*
 * shipping_inland_waterway_categories
 * -----------------------------------
 * Table containing all waterway categories in the inland shipping network.
 * @column flowing For some types the current or flow of the waterway is of importance, this is indicated by the flowing boolean.
 */
CREATE TABLE shipping_inland_waterway_categories
(
	shipping_inland_waterway_category_id integer NOT NULL,
	code text NOT NULL UNIQUE,
	name text NOT NULL UNIQUE,
	description text,
	flowing boolean NOT NULL,

	CONSTRAINT shipping_inland_waterway_categories_pkey PRIMARY KEY (shipping_inland_waterway_category_id)
);


/*
 * shipping_inland_category_emission_factors
 * -----------------------------------------
 * Table containing the emission factors for inland shipping categories for moving ships.
 * These emission factors are defined per ship type, waterway type, travel direction, laden state and substance.
 *
 * The emission factors are specified by year (year-dependant), and represent the emission factor during movement,
 * in g/(kilometer * number of ships) at an average speed.
 */
CREATE TABLE shipping_inland_category_emission_factors
(
	shipping_inland_category_id smallint NOT NULL,
	shipping_inland_waterway_category_id integer NOT NULL,
	ship_direction shipping_inland_ship_direction_type NOT NULL,
	laden_state shipping_inland_laden_state NOT NULL,
	year year_type NOT NULL,
	substance_id smallint NOT NULL,
	emission_factor posreal NOT NULL,

	CONSTRAINT shipping_inland_category_emission_factors_pkey PRIMARY KEY (shipping_inland_category_id, shipping_inland_waterway_category_id, ship_direction, laden_state, substance_id, year),
	CONSTRAINT shipping_inland_category_emission_factors_fkey_categories FOREIGN KEY (shipping_inland_category_id) REFERENCES shipping_inland_categories,
	CONSTRAINT shipping_inland_category_emission_factors_fkey_waterway_categories FOREIGN KEY (shipping_inland_waterway_category_id) REFERENCES shipping_inland_waterway_categories,
	CONSTRAINT shipping_inland_category_emission_factors_fkey_substances FOREIGN KEY (substance_id) REFERENCES substances
);


/*
 * shipping_inland_category_emission_factors_docked
 * ------------------------------------------------
 * Table containing the emission factors for inland shipping categories for docked ships.
 * These emission factors are defined per ship type, laden state and substance.
 *
 * The emission factors are specified by year (year-dependant), and represent the emission factor when not moving (for example when docked),
 * in g/(hour * number of ships).
 */
CREATE TABLE shipping_inland_category_emission_factors_docked
(
	shipping_inland_category_id smallint NOT NULL,
	laden_state shipping_inland_laden_state NOT NULL,
	year year_type NOT NULL,
	substance_id smallint NOT NULL,
	emission_factor posreal NOT NULL,

	CONSTRAINT shipping_inland_category_emission_factors_docked_pkey PRIMARY KEY (shipping_inland_category_id, laden_state, substance_id, year),
	CONSTRAINT shipping_inland_category_emission_factors_docked_fkey_categories FOREIGN KEY (shipping_inland_category_id) REFERENCES shipping_inland_categories,
	CONSTRAINT shipping_inland_category_emission_factors_docked_fkey_substances FOREIGN KEY (substance_id) REFERENCES substances
);


/*
 * shipping_inland_category_source_characteristics
 * -----------------------------------------------
 * Table containing the OPS characteristics for the inland shipping categories for moving ships.
 * These characteristics are defined per ship type, waterway type, travel direction and laden state.
 */
CREATE TABLE shipping_inland_category_source_characteristics
(
	shipping_inland_category_id smallint NOT NULL,
	shipping_inland_waterway_category_id integer NOT NULL,
	ship_direction shipping_inland_ship_direction_type NOT NULL,
	laden_state shipping_inland_laden_state NOT NULL,
	gcn_sector_id integer NOT NULL,
	heat_content posreal NOT NULL,
	height posreal NOT NULL,
	spread posreal NOT NULL,

	CONSTRAINT shipping_inland_category_source_characteristics_pkey PRIMARY KEY (shipping_inland_category_id, shipping_inland_waterway_category_id, ship_direction, laden_state),
	CONSTRAINT shipping_inland_category_source_characteristics_fkey_categories FOREIGN KEY (shipping_inland_category_id) REFERENCES shipping_inland_categories,
	CONSTRAINT shipping_inland_category_source_characteristics_fkey_waterway_categories FOREIGN KEY (shipping_inland_waterway_category_id) REFERENCES shipping_inland_waterway_categories,
	CONSTRAINT shipping_inland_category_source_characteristics_fkey_gcn_sectors FOREIGN KEY (gcn_sector_id) REFERENCES gcn_sectors
);


/*
 * shipping_inland_category_source_characteristics_docked
 * ------------------------------------------------------
 * Table containing the OPS characteristics for inland shipping categories for docked ships.
 * These characteristics are defined per ship type and laden state.
 */
CREATE TABLE shipping_inland_category_source_characteristics_docked
(
	shipping_inland_category_id smallint NOT NULL,
	laden_state shipping_inland_laden_state NOT NULL,
	gcn_sector_id integer NOT NULL,
	heat_content posreal NOT NULL,
	height posreal NOT NULL,
	spread posreal NOT NULL,

	CONSTRAINT shipping_inland_category_source_char_docked_pkey PRIMARY KEY (shipping_inland_category_id, laden_state),
	CONSTRAINT shipping_inland_category_source_char_docked_fkey_categories FOREIGN KEY (shipping_inland_category_id) REFERENCES shipping_inland_categories,
	CONSTRAINT shipping_inland_category_source_char_docked_fkey_gcn_sectors FOREIGN KEY (gcn_sector_id) REFERENCES gcn_sectors
);
