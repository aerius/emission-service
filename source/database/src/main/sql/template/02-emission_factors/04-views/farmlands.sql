/*
 * farmland_categories_view
 * ------------------------
 * View returning the farmland categories.
 */
CREATE OR REPLACE VIEW farmland_categories_view AS
SELECT
	farmland_categories.farmland_category_id,
	farmland_categories.code,
	farmland_categories.name,
	farmland_categories.sector_id

	FROM farmland_categories
;
