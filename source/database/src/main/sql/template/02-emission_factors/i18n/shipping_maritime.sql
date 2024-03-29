/*
 * i18n_shipping_maritime_categories
 * ---------------------------------
 * Translation table for maritime shipping categories.
 */
CREATE TABLE i18n_shipping_maritime_categories (
	shipping_maritime_category_id smallint NOT NULL,
	language_code i18n.language_code_type NOT NULL,
	name text NOT NULL,
	description text,

	CONSTRAINT i18n_shipping_maritime_categories_pkey PRIMARY KEY (shipping_maritime_category_id, language_code),
	CONSTRAINT i18n_shipping_maritime_categories_fkey FOREIGN KEY (shipping_maritime_category_id) REFERENCES shipping_maritime_categories
);
