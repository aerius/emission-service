/*
 * farmland_categories
 * -------------------
 * De categorieën van verschillende soorten landbouwgrond activiteiten
 *
 * De naam is hierbij de identificatie van de categorie voor de gebruiker.
 */
CREATE TABLE farmland_categories
(
	farmland_category_id smallint NOT NULL,
	gcn_sector_id integer NOT NULL,
	code text NOT NULL UNIQUE,
	name text NOT NULL UNIQUE,
	description text,

	CONSTRAINT farmland_categories_pkey PRIMARY KEY (farmland_category_id),
	CONSTRAINT farmland_categories_fkey_gcn_sectors FOREIGN KEY (gcn_sector_id) REFERENCES gcn_sectors
);
