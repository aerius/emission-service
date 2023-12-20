/*
 * i18n_mobile_source_off_road_categories
 * --------------------------------------
 * Translation table for off road mobile source categories.
 */
CREATE TABLE i18n_mobile_source_off_road_categories (
	mobile_source_off_road_category_id smallint NOT NULL,
	language_code i18n.language_code_type NOT NULL,
	name text NOT NULL,
	description text,

	CONSTRAINT i18n_mobile_source_off_road_categories_pkey PRIMARY KEY (mobile_source_off_road_category_id, language_code),
	CONSTRAINT i18n_mobile_source_off_road_categories_fkey FOREIGN KEY (mobile_source_off_road_category_id) REFERENCES mobile_source_off_road_categories
);
