/*
 * farmland_categories
 * -------------------
 * Vertaaltabel voor categorieën van verschillende soorten landbouw grond activiteiten.
 */
CREATE TABLE i18n.farmland_categories (
	farmland_category_id smallint NOT NULL,
	language_code i18n.language_code_type NOT NULL,
	name text NOT NULL,
	description text,

	CONSTRAINT farmland_categories_pkey PRIMARY KEY (farmland_category_id, language_code),
	CONSTRAINT farmland_categories_fkey FOREIGN KEY (farmland_category_id) REFERENCES farmland_categories
);
