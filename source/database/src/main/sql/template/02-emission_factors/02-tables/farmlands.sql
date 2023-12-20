/*
 * farmland_categories
 * -------------------
 * Table containing categories for the different farmland activities.
 */
CREATE TABLE farmland_categories
(
	farmland_category_id smallint NOT NULL,
	sector_id integer NOT NULL,
	code text NOT NULL UNIQUE,
	name text NOT NULL UNIQUE,
	description text,

	CONSTRAINT farmland_categories_pkey PRIMARY KEY (farmland_category_id),
	CONSTRAINT farmland_categories_fkey_sectors FOREIGN KEY (sector_id) REFERENCES sectors
);
