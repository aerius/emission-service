/*
 * i18n_shipping_inland_categories
 * -------------------------------
 * Translation table for inland shipping categories.
 */
CREATE TABLE i18n_shipping_inland_categories (
	shipping_inland_category_id smallint NOT NULL,
	language_code i18n.language_code_type NOT NULL,
	name text NOT NULL,
	description text,

	CONSTRAINT i18n_shipping_inland_categories_pkey PRIMARY KEY (shipping_inland_category_id, language_code),
	CONSTRAINT i18n_shipping_inland_categor_fkey FOREIGN KEY (shipping_inland_category_id) REFERENCES shipping_inland_categories
);

/*
 * i18n_shipping_inland_waterway_categories
 * ----------------------------------------
 * Translation table for inland shipping waterway categories.
 */
CREATE TABLE i18n_shipping_inland_waterway_categories (
	shipping_inland_waterway_category_id smallint NOT NULL,
	language_code i18n.language_code_type NOT NULL,
	name text NOT NULL,
	description text,

	CONSTRAINT i18n_shipping_inland_waterway_categories_pkey PRIMARY KEY (shipping_inland_waterway_category_id, language_code),
	CONSTRAINT i18n_shipping_inland_waterway_categories_fkey FOREIGN KEY (shipping_inland_waterway_category_id) REFERENCES shipping_inland_waterway_categories
);
