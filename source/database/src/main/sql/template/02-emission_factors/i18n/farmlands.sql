/*
 * i18n_farmland_categories
 * ------------------------
 * Translation table for farmland activity categories.
 */
CREATE TABLE i18n_farmland_categories (
	farmland_category_id smallint NOT NULL,
	language_code i18n.language_code_type NOT NULL,
	name text NOT NULL,
	description text,

	CONSTRAINT i18n_farmland_categories_pkey PRIMARY KEY (farmland_category_id, language_code),
	CONSTRAINT i18n_farmland_categories_fkey FOREIGN KEY (farmland_category_id) REFERENCES farmland_categories
);
