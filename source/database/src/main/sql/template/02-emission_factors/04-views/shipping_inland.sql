/*
 * shipping_inland_source_characteristics_view
 * -------------------------------------------
 * View returning the emission characteristics for inland shipping routes.
 */
CREATE OR REPLACE VIEW shipping_inland_source_characteristics_view AS
SELECT
	shipping_inland_category_id,
	shipping_inland_waterway_category_id,
	ship_direction,
	laden_state,
	gcn_sector_id,
	shipping_inland_category_source_characteristics.heat_content,
	shipping_inland_category_source_characteristics.height,
	shipping_inland_category_source_characteristics.spread,
	emission_diurnal_variations.emission_diurnal_variation_id,
	emission_diurnal_variations.code AS emission_diurnal_variation_code

	FROM shipping_inland_category_source_characteristics
		INNER JOIN default_gcn_sector_source_characteristics_view USING (gcn_sector_id)
		INNER JOIN emission_diurnal_variations USING (emission_diurnal_variation_id)
;

/*
 * shipping_inland_source_characteristics_docked_view
 * --------------------------------------------------
 * View returning the emission characteristics for inland shipping docks.
 */
CREATE OR REPLACE VIEW shipping_inland_source_characteristics_docked_view AS
SELECT
	shipping_inland_category_id,
	laden_state,
	gcn_sector_id,
	shipping_inland_category_source_characteristics_docked.heat_content,
	shipping_inland_category_source_characteristics_docked.height,
	shipping_inland_category_source_characteristics_docked.spread,
	emission_diurnal_variations.emission_diurnal_variation_id,
	emission_diurnal_variations.code AS emission_diurnal_variation_code

	FROM shipping_inland_category_source_characteristics_docked
		INNER JOIN default_gcn_sector_source_characteristics_view USING (gcn_sector_id)
		INNER JOIN emission_diurnal_variations USING (emission_diurnal_variation_id)
;


/*
 * shipping_inland_waterway_categories_view
 * ----------------------------------------
 * View returning the waterway categories.
 */
CREATE OR REPLACE VIEW shipping_inland_waterway_categories_view AS
SELECT DISTINCT
	shipping_inland_waterway_category_id,
	code,
	name,
	ship_direction

	FROM shipping_inland_category_emission_factors
		INNER JOIN shipping_inland_waterway_categories USING (shipping_inland_waterway_category_id)
	ORDER BY shipping_inland_waterway_category_id;
;
