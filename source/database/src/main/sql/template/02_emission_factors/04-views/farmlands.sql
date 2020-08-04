/*
 * farmland_categories_view
 * ------------------------
 * View retourneert de landbouwgrond categoriëen.
 */
CREATE OR REPLACE VIEW farmland_categories_view AS
SELECT
	farmland_categories.farmland_category_id,
	farmland_categories.code,
	farmland_categories.name,
	farmland_categories.gcn_sector_id

	FROM farmland_categories
;