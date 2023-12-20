/*
 * i18n_road_area_categories
 * -------------------------
 * Translation table for road area categories.
 */
CREATE TABLE i18n_road_area_categories
(
	road_area_category_id integer NOT NULL,
	language_code i18n.language_code_type NOT NULL,
	name text NOT NULL,
	description text,

	CONSTRAINT i18n_road_area_categories_pkey PRIMARY KEY (road_area_category_id, language_code),
	CONSTRAINT i18n_road_area_categories_fkey FOREIGN KEY (road_area_category_id) REFERENCES road_area_categories
);


/*
 * i18n_road_type_categories
 * -------------------------
 * Translation table for road type categories.
 */
CREATE TABLE i18n_road_type_categories
(
	road_type_category_id integer NOT NULL,
	language_code i18n.language_code_type NOT NULL,
	name text NOT NULL,
	description text,

	CONSTRAINT i18n_road_type_categories_pkey PRIMARY KEY (road_type_category_id, language_code),
	CONSTRAINT i18n_road_area_categories_fkey FOREIGN KEY (road_type_category_id) REFERENCES road_type_categories
);


/*
 * i18n_road_vehicle_categories
 * ----------------------------
 * Translation table for road vehicle categories.
 */
CREATE TABLE i18n_road_vehicle_categories
(
	road_vehicle_category_id integer NOT NULL,
	language_code i18n.language_code_type NOT NULL,
	name text NOT NULL,
	description text,

	CONSTRAINT i18n_road_vehicle_categories_pkey PRIMARY KEY (road_vehicle_category_id, language_code),
	CONSTRAINT i18n_road_vehicle_categories_fkey FOREIGN KEY (road_vehicle_category_id) REFERENCES road_vehicle_categories
);


/*
 * i18n_mobile_source_on_road_categories
 * -------------------------------------
 * Translation table for on road mobile source categories.
 */
CREATE TABLE i18n_mobile_source_on_road_categories (
	mobile_source_on_road_category_id smallint NOT NULL,
	language_code i18n.language_code_type NOT NULL,
	name text NOT NULL,
	description text,

	CONSTRAINT i18n_mobile_source_on_road_categories_pkey PRIMARY KEY (mobile_source_on_road_category_id, language_code),
	CONSTRAINT i18n_mobile_source_on_road_categories_fkey FOREIGN KEY (mobile_source_on_road_category_id) REFERENCES mobile_source_on_road_categories
);
