/*
 * default_gcn_sector_source_characteristics_view
 * ----------------------------------------------
 * View returning the default GCN source characteristics.
 * As the GCN can have different default characteristics per substance, and AERIUS only needs 1 set, this view returns the characteristics for the most relevant substance.
 */
CREATE OR REPLACE VIEW default_gcn_sector_source_characteristics_view AS
SELECT
	gcn_sector_id,
	heat_content,
	height,
	spread,
	emission_diurnal_variation_id,
	particle_size_distribution

	FROM gcn_sector_source_characteristics

	WHERE
		(substance_id = 11 AND (gcn_sector_id < 4710 OR gcn_sector_id >= 4780)) -- default source_characteristics
		OR (substance_id = 17 AND gcn_sector_id >= 4710 AND gcn_sector_id < 4780) -- nh3 farm source_characteristics
		OR (substance_id = 17 AND gcn_sector_id = 4401)
;


/*
 * emission_diurnal_variations_view
 * --------------------------------
 * View returning the different types of diurnal variation.
 */
CREATE OR REPLACE VIEW emission_diurnal_variations_view AS
SELECT
	emission_diurnal_variation_id,
	code AS emission_diurnal_variation_code,
	name AS emission_diurnal_variation_name,
	description AS_diurnal_variation_description

	FROM emission_diurnal_variations
;


/*
 * default_source_characteristics_view
 * -----------------------------------
 * View returning the emission characteristics per AERIUS sector.
 * Falls back to the default GCN source characteristics (as returned by default_gcn_sector_source_characteristics_view) whenever no AERIUS default set is present.
 */
CREATE OR REPLACE VIEW default_source_characteristics_view AS
SELECT
	sector_id,
	gcn_sector_id,
	heat_content,
	height,
	spread,
	emission_diurnal_variation_id,
	emission_diurnal_variation_code,
	particle_size_distribution

	FROM
		(SELECT
			sector_id,
			gcn_sector_id,
			COALESCE(aerius_char.heat_content, gcn_char.heat_content) AS heat_content,
			COALESCE(aerius_char.height, gcn_char.height) AS height,
			COALESCE(aerius_char.spread, gcn_char.spread) AS spread,
			COALESCE(aerius_char.emission_diurnal_variation_id, gcn_char.emission_diurnal_variation_id) AS emission_diurnal_variation_id,
			COALESCE(aerius_char.particle_size_distribution, gcn_char.particle_size_distribution) AS particle_size_distribution

			FROM sectors
				LEFT JOIN sector_default_source_characteristics AS aerius_char USING (sector_id)
				LEFT JOIN sectors_main_gcn_sector USING (sector_id)
				LEFT JOIN default_gcn_sector_source_characteristics_view AS gcn_char USING (gcn_sector_id)

		) AS source_characteristics

		INNER JOIN emission_diurnal_variations_view USING (emission_diurnal_variation_id)
;
