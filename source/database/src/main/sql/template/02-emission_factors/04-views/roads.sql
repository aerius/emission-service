/*
 * road_categories_view
 * --------------------
 * View returning the road categories. This includes the emission factors and stagnation factors per substance.
 */
CREATE OR REPLACE VIEW road_categories_view AS
SELECT
	road_category_id,
	road_area_categories.code AS road_area_code,
	road_area_categories.name AS road_area_name,
	road_type_categories.code AS road_type_code,
	road_type_categories.name AS road_type_name,
	road_vehicle_categories.code AS road_vehicle_code,
	road_vehicle_categories.name AS road_vehicle_name,
	speed_limit_enforcement,
	maximum_speed,
	gradient,
	year,
	substance_id,
	emission_factor,
	stagnated_emission_factor

	FROM road_categories
		INNER JOIN road_category_emission_factors USING (road_category_id)
		INNER JOIN road_area_categories USING (road_area_category_id)
		INNER JOIN road_type_categories USING (road_type_category_id)
		INNER JOIN road_vehicle_categories USING (road_vehicle_category_id)
		INNER JOIN road_speed_profiles USING (road_speed_profile_id)

	ORDER BY road_category_id
;


/*
 * mobile_source_on_road_categories_view
 * -------------------------------------
 * View returning the on road mobile source categories.
 */
CREATE OR REPLACE VIEW mobile_source_on_road_categories_view AS
SELECT
	mobile_source_on_road_category_id,
	mobile_source_on_road_categories.code AS code,
	mobile_source_on_road_categories.name AS name,
	road_type_categories.code AS road_type_code,
	road_type_categories.name AS road_type_name,
	year,
	substance_id,
	emission_factor

	FROM mobile_source_on_road_categories
		INNER JOIN mobile_source_on_road_category_emission_factors USING (mobile_source_on_road_category_id)
		INNER JOIN road_type_categories USING (road_type_category_id)

	ORDER BY mobile_source_on_road_category_id
;
