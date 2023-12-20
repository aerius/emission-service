/*
 * i18n_farm_animal_categories
 * ---------------------------
 * Translation table for farm animal categories.
 */
CREATE TABLE i18n_farm_animal_categories (
	farm_animal_category_id integer NOT NULL,
	language_code i18n.language_code_type NOT NULL,
	description text,

	CONSTRAINT i18n_farm_animal_categories_pkey PRIMARY KEY (farm_animal_category_id, language_code),
	CONSTRAINT i18n_farm_animal_categories_fkey FOREIGN KEY (farm_animal_category_id) REFERENCES farm_animal_categories
);


/*
 * i18n_farm_lodging_types
 * -----------------------
 * Translation table for lodging systems for farms.
 */
CREATE TABLE i18n_farm_lodging_types (
	farm_lodging_type_id integer NOT NULL,
	language_code i18n.language_code_type NOT NULL,
	description text,

	CONSTRAINT i18n_farm_lodging_types_pkey PRIMARY KEY (farm_lodging_type_id, language_code),
	CONSTRAINT i18n_farm_lodging_types_fkey FOREIGN KEY (farm_lodging_type_id) REFERENCES farm_lodging_types
);


/*
 * i18n_farm_additional_lodging_systems
 * ------------------------------------
 * Translation table for additional lodging techniques for farms.
 */
CREATE TABLE i18n_farm_additional_lodging_systems (
	farm_additional_lodging_system_id integer NOT NULL,
	language_code i18n.language_code_type NOT NULL,
	description text,

	CONSTRAINT i18n_farm_additional_lodging_systems_pkey PRIMARY KEY (farm_additional_lodging_system_id, language_code),
	CONSTRAINT i18n_farm_additional_lodging_systems_fkey FOREIGN KEY (farm_additional_lodging_system_id) REFERENCES farm_additional_lodging_systems
);


/*
 * i18n_farm_reductive_lodging_systems
 * -----------------------------------
 * Translation table for emission reducing lodging techniques for farms.
 */
CREATE TABLE i18n_farm_reductive_lodging_systems (
	farm_reductive_lodging_system_id integer NOT NULL,
	language_code i18n.language_code_type NOT NULL,
	description text,

	CONSTRAINT i18n_farm_reductive_lodging_systems_pkey PRIMARY KEY (farm_reductive_lodging_system_id, language_code),
	CONSTRAINT i18n_farm_reductive_lodging_systems_fkey FOREIGN KEY (farm_reductive_lodging_system_id) REFERENCES farm_reductive_lodging_systems
);


/*
 * i18n_farm_lodging_fodder_measures
 * ---------------------------------
 * Translation table for fodder and management measures for farms.
 */
CREATE TABLE i18n_farm_lodging_fodder_measures (
	farm_lodging_fodder_measure_id integer NOT NULL,
	language_code i18n.language_code_type NOT NULL,
	description text,

	CONSTRAINT i18n_farm_lodging_fodder_measures_pkey PRIMARY KEY (farm_lodging_fodder_measure_id, language_code),
	CONSTRAINT i18n_farm_lodging_fodder_measures_fkey FOREIGN KEY (farm_lodging_fodder_measure_id) REFERENCES farm_lodging_fodder_measures
);


/*
 * i18n_farm_lodging_system_definitions
 * ------------------------------------
 * Translation table for lodging system definitions for farms.
 */
CREATE TABLE i18n_farm_lodging_system_definitions (
	farm_lodging_system_definition_id integer NOT NULL,
	language_code i18n.language_code_type NOT NULL,
	description text,

	CONSTRAINT i18n_farm_lodging_system_definitions_pkey PRIMARY KEY (farm_lodging_system_definition_id, language_code),
	CONSTRAINT i18n_farm_lodging_system_definitions_fkey FOREIGN KEY (farm_lodging_system_definition_id) REFERENCES farm_lodging_system_definitions
);


/*
 * i18n_farm_source_categories
 * ---------------------------
 * Translation table for farm source categories.
 */
CREATE TABLE i18n_farm_source_categories (
	farm_source_category_id integer NOT NULL,
	language_code i18n.language_code_type NOT NULL,
	description text,

	CONSTRAINT i18n_farm_source_categories_pkey PRIMARY KEY (farm_source_category_id, language_code),
	CONSTRAINT i18n_farm_source_categories_fkey FOREIGN KEY (farm_source_category_id) REFERENCES farm_source_categories
);
