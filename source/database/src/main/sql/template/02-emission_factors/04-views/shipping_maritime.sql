/*
 * shipping_maritime_source_characteristics_view
 * ---------------------------------------------
 * View returning the emission characteristics for maritime shipping.
 */
CREATE OR REPLACE VIEW shipping_maritime_source_characteristics_view AS
SELECT
	shipping_maritime_category_id,
	shipping_maritime_category_source_characteristics.year,
	movement_type,
	gcn_sector_id,
	shipping_maritime_category_source_characteristics.heat_content,
	shipping_maritime_category_source_characteristics.height,
	shipping_maritime_category_source_characteristics.spread,
	emission_diurnal_variations.emission_diurnal_variation_id,
	emission_diurnal_variations.code AS emission_diurnal_variation_code

	FROM shipping_maritime_category_source_characteristics
		INNER JOIN default_gcn_sector_source_characteristics_view USING (gcn_sector_id)
		INNER JOIN emission_diurnal_variations USING (emission_diurnal_variation_id)
;
