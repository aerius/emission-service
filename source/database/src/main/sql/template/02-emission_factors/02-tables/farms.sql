/*
 * farm_animal_categories
 * ----------------------
 * Table containing the farm animal categories.
 * For NL: these are the categories as present in the RAV-code list (RAV = Regeling ammoniak en veehouderij).
 */
CREATE TABLE farm_animal_categories (
	farm_animal_category_id integer NOT NULL,
	code text NOT NULL UNIQUE,
	name text NOT NULL UNIQUE,
	description text,

	CONSTRAINT farm_animal_categories_pkey PRIMARY KEY (farm_animal_category_id)
);


/*
 * farm_lodging_types
 * ------------------
 * Table containing farm lodging or farm housing systems (huisvestingssystemen).
 * A lodging system always belongs to a farm animal category.
 * This table also indicates if the system is a scrubber (luchtwasser).
 * For NL: this is in essence the RAV-code list, see https://wetten.overheid.nl/jci1.3:c:BWBR0013629&bijlage=1&z=2023-04-01&g=2023-04-01
 */
CREATE TABLE farm_lodging_types (
	farm_lodging_type_id integer NOT NULL,
	farm_animal_category_id integer NOT NULL,
	code text NOT NULL UNIQUE,
	name text NOT NULL UNIQUE,
	description text,
	scrubber boolean NOT NULL,
	farm_emission_factor_type farm_emission_factor_type NOT NULL,

	CONSTRAINT farm_lodging_types_pkey PRIMARY KEY (farm_lodging_type_id),
	CONSTRAINT farm_lodging_types_fkey_farm_animal_categories FOREIGN KEY (farm_animal_category_id) REFERENCES farm_animal_categories
);


/*
 * farm_lodging_type_emission_factors
 * ----------------------------------
 * Table containing the emission factors (kg/year) for farm lodging systems.
 */
CREATE TABLE farm_lodging_type_emission_factors (
	farm_lodging_type_id integer NOT NULL,
	substance_id smallint NOT NULL,
	emission_factor posreal NOT NULL,

	CONSTRAINT farm_lodging_type_emission_factors_pkey PRIMARY KEY (farm_lodging_type_id, substance_id),
	CONSTRAINT farm_lodging_type_emission_factors_fkey_farm_lodging_types FOREIGN KEY (farm_lodging_type_id) REFERENCES farm_lodging_types,
	CONSTRAINT farm_lodging_type_emission_factors_fkey_substances FOREIGN KEY (substance_id) REFERENCES substances
);


/*
 * farm_lodging_types_other_lodging_type
 * -------------------------------------
 * Table linking low-emission farm lodging system to their corresponding 'overige' lodging system.
 * This link (N:1) is only used when the lodging system is classified as low-emission ('emissiearm').
 * In certain cases this will limit the emission factor in the emission calculation, based on the other lodging system.
 */
CREATE TABLE farm_lodging_types_other_lodging_type (
	farm_lodging_type_id integer NOT NULL,
	farm_other_lodging_type_id integer NOT NULL,

	CONSTRAINT farm_lodging_type_other_types_pkey PRIMARY KEY (farm_lodging_type_id),
	CONSTRAINT farm_lodging_type_other_types_fkey_farm_lodging_types FOREIGN KEY (farm_lodging_type_id) REFERENCES farm_lodging_types,
	CONSTRAINT farm_lodging_type_other_types_fkey_farm_other_lodging_types FOREIGN KEY (farm_other_lodging_type_id) REFERENCES farm_lodging_types(farm_lodging_type_id),

	CONSTRAINT farm_lodging_type_other_types_chk_selfref CHECK (farm_lodging_type_id <> farm_other_lodging_type_id)
);


/*
 * farm_additional_lodging_systems
 * -------------------------------
 * Table containing additional lodging techniques/systems for farms.
 * These are lodging techniques that can cause extra emissions, and which can be used in combination with a lodging system (farm_lodging-type).
 * For NL: these additional lodging techniques are extracted from the RAV-code list.
 */
CREATE TABLE farm_additional_lodging_systems (
	farm_additional_lodging_system_id integer NOT NULL,
	farm_animal_category_id integer NOT NULL,
	code text NOT NULL UNIQUE,
	name text NOT NULL UNIQUE,
	description text,
	scrubber boolean NOT NULL,

	CONSTRAINT farm_additional_lodging_systems_pkey PRIMARY KEY (farm_additional_lodging_system_id),
	CONSTRAINT farm_additional_lodging_systems_fkey_farm_animal_categories FOREIGN KEY (farm_animal_category_id) REFERENCES farm_animal_categories
);


/*
 * farm_additional_lodging_system_emission_factors
 * -----------------------------------------------
 * Table containing the emission factors (kg/year) of the additional lodging techniques/systems for farms.
 * These emission factors are additionally applied for a user-defined number of animals that use the lodging system.
 */
CREATE TABLE farm_additional_lodging_system_emission_factors (
	farm_additional_lodging_system_id integer NOT NULL,
	substance_id smallint NOT NULL,
	emission_factor posreal NOT NULL,

	CONSTRAINT farm_additional_lodging_system_emission_factors_pkey PRIMARY KEY (farm_additional_lodging_system_id, substance_id),
	CONSTRAINT farm_additional_lodging_system_emission_factors_fkey_types FOREIGN KEY (farm_additional_lodging_system_id) REFERENCES farm_additional_lodging_systems,
	CONSTRAINT farm_additional_lodging_system_emission_factors_fkey_substances FOREIGN KEY (substance_id) REFERENCES substances
);


/*
 * farm_lodging_types_to_additional_lodging_systems
 * ------------------------------------------------
 * Table linking (N:N) which additional lodging techniques can be stacked on which lodging system.
 * This table contains the allowed combinations within the RAV way of working, however within calculator every combination is possible.
 */
CREATE TABLE farm_lodging_types_to_additional_lodging_systems (
	farm_lodging_type_id integer NOT NULL,
	farm_additional_lodging_system_id integer NOT NULL,

	CONSTRAINT farm_lodging_types_to_additional_lodging_systems_pkey PRIMARY KEY (farm_lodging_type_id, farm_additional_lodging_system_id),
	CONSTRAINT farm_lodging_types_to_additional_lodging_systems_fkey_types FOREIGN KEY (farm_lodging_type_id) REFERENCES farm_lodging_types,
	CONSTRAINT farm_lodging_types_to_additional_lodging_systems_fkey_systems FOREIGN KEY (farm_additional_lodging_system_id) REFERENCES farm_additional_lodging_systems
);


/*
 * farm_reductive_lodging_systems
 * ------------------------------
 * Table containing the emission reducing lodging techniques/systems for farms.
 * These are lodging techniques that result in lower emissions, and they can be stacked on top of a lodging system (farm_lodging_type).
 * These emission reducing techniques are extracted from the RAV-code list.
 * Whether or not the system is considered a scrubber (luchtwasser) is also indicated.
 */
CREATE TABLE farm_reductive_lodging_systems (
	farm_reductive_lodging_system_id integer NOT NULL,
	farm_animal_category_id integer NOT NULL,
	code text NOT NULL UNIQUE,
	name text NOT NULL UNIQUE,
	description text,
	scrubber boolean NOT NULL,

	CONSTRAINT farm_reductive_lodging_systems_pkey PRIMARY KEY (farm_reductive_lodging_system_id),
	CONSTRAINT farm_reductive_lodging_systems_fkey_farm_animal_categories FOREIGN KEY (farm_animal_category_id) REFERENCES farm_animal_categories
);


/*
 * farm_reductive_lodging_system_reduction_factors
 * -----------------------------------------------
 * Table containing the reduction factors (factor 0..1) for the emission reducing lodging techniques.
 * These reduction factors are applied on the total emission of the lodging system on which it is stacked, including any additional lodging techniques that have been stacked.
 */
CREATE TABLE farm_reductive_lodging_system_reduction_factors (
	farm_reductive_lodging_system_id integer NOT NULL,
	substance_id smallint NOT NULL,
	reduction_factor fraction NOT NULL,

	CONSTRAINT farm_reductive_lodging_system_reduction_factors_pkey PRIMARY KEY (farm_reductive_lodging_system_id, substance_id),
	CONSTRAINT farm_reductive_lodging_system_reduction_factors_fkey_types FOREIGN KEY (farm_reductive_lodging_system_id) REFERENCES farm_reductive_lodging_systems,
	CONSTRAINT farm_reductive_lodging_system_reduction_factors_fkey_substances FOREIGN KEY (substance_id) REFERENCES substances
);


/*
 * farm_lodging_types_to_reductive_lodging_systems
 * -----------------------------------------------
 * Table linking (N:N) which emission reducing lodging techniques can be stacked on which lodging system.
 * This table contains the allowed combinations within the RAV way of working, however within calculator every combination is possible.
 */
CREATE TABLE farm_lodging_types_to_reductive_lodging_systems (
	farm_lodging_type_id integer NOT NULL,
	farm_reductive_lodging_system_id integer NOT NULL,

	CONSTRAINT farm_lodging_types_to_reductive_lodging_systems_pkey PRIMARY KEY (farm_lodging_type_id, farm_reductive_lodging_system_id),
	CONSTRAINT farm_lodging_types_to_reductive_lodging_systems_fkey_types FOREIGN KEY (farm_lodging_type_id) REFERENCES farm_lodging_types,
	CONSTRAINT farm_lodging_types_to_reductive_lodging_systems_fkey_reductive FOREIGN KEY (farm_reductive_lodging_system_id) REFERENCES farm_reductive_lodging_systems
);


/*
 * farm_lodging_system_definitions
 * -------------------------------
 * Table containing lodging system definitions, definitions of what lodging systems are for farms.
 * For NL: These contain 'BWL-nummers' as used in the RAV.
 * See https://www.infomil.nl/onderwerpen/landbouw/emissiearme-stalsystemen/stalbeschrijvingen/
 */
CREATE TABLE farm_lodging_system_definitions (
	farm_lodging_system_definition_id integer NOT NULL,
	code text NOT NULL UNIQUE,
	name text NOT NULL UNIQUE,
	description text,

	CONSTRAINT farm_lodging_system_definitions_pkey PRIMARY KEY (farm_lodging_system_definition_id)
);


/*
 * farm_lodging_types_to_lodging_system_definitions
 * ------------------------------------------------
 * Table linking lodging systems and lodging system definitions (N:N).
 */
CREATE TABLE farm_lodging_types_to_lodging_system_definitions (
	farm_lodging_type_id integer NOT NULL,
	farm_lodging_system_definition_id integer NOT NULL,

	CONSTRAINT farm_lodging_types_to_lodging_system_definitions_pkey PRIMARY KEY (farm_lodging_type_id, farm_lodging_system_definition_id),
	CONSTRAINT farm_lodging_types_to_lodging_system_definitions_fkey_types FOREIGN KEY (farm_lodging_type_id) REFERENCES farm_lodging_types,
	CONSTRAINT farm_lodging_types_to_lodging_system_definitions_fkey_defs FOREIGN KEY (farm_lodging_system_definition_id) REFERENCES farm_lodging_system_definitions
);


/*
 * farm_additional_lodging_systems_to_lodging_system_definitions
 * -------------------------------------------------------------
 * Table linking additional lodging techniques and lodging system definitions (N:N)
 */
CREATE TABLE farm_additional_lodging_systems_to_lodging_system_definitions (
	farm_additional_lodging_system_id integer NOT NULL,
	farm_lodging_system_definition_id integer NOT NULL,

	CONSTRAINT farm_additional_lodging_systems_to_definitions_pkey PRIMARY KEY (farm_additional_lodging_system_id, farm_lodging_system_definition_id),
	CONSTRAINT farm_additional_lodging_systems_to_definitions_fkey_additional FOREIGN KEY (farm_additional_lodging_system_id) REFERENCES farm_additional_lodging_systems,
	CONSTRAINT farm_additional_lodging_systems_to_definitions_fkey_defs FOREIGN KEY (farm_lodging_system_definition_id) REFERENCES farm_lodging_system_definitions
);


/*
 * farm_reductive_lodging_systems_to_lodging_system_definitions
 * ------------------------------------------------------------
 * Table linking emission reducing lodging techniques and lodging system definitions (N:N)
 */
CREATE TABLE farm_reductive_lodging_systems_to_lodging_system_definitions (
	farm_reductive_lodging_system_id integer NOT NULL,
	farm_lodging_system_definition_id integer NOT NULL,

	CONSTRAINT farm_reductive_lodging_systems_to_definitions_pkey PRIMARY KEY (farm_reductive_lodging_system_id, farm_lodging_system_definition_id),
	CONSTRAINT farm_reductive_lodging_systems_to_definitions_fkey_reductive FOREIGN KEY (farm_reductive_lodging_system_id) REFERENCES farm_reductive_lodging_systems,
	CONSTRAINT farm_reductive_lodging_systems_to_definitions_fkey_defs FOREIGN KEY (farm_lodging_system_definition_id) REFERENCES farm_lodging_system_definitions
);


/*
 * farm_lodging_fodder_measures
 * ----------------------------
 * Table containing fodder and managment measures.
 * These are measures that result in lower emissions, and can be applied on a lodging system (farm_lodging_type).
 * For NL: see https://wetten.overheid.nl/jci1.3:c:BWBR0013629&bijlage=2&z=2023-04-01&g=2023-04-01
 */
CREATE TABLE farm_lodging_fodder_measures (
	farm_lodging_fodder_measure_id integer NOT NULL,
	code text NOT NULL UNIQUE,
	name text NOT NULL UNIQUE,
	description text,

	CONSTRAINT farm_lodging_fodder_measures_pkey PRIMARY KEY (farm_lodging_fodder_measure_id)
);


/*
 * farm_lodging_fodder_measure_reduction_factors
 * ---------------------------------------------
 * Table containing the reduction factors (factor 0..1) for fodder and managment measures.
 * When measures are applied to a lodging system, a single reduction factor for the combination of measures is first determined.
 * This reduction factor is then applied on the total emission of the lodging system, including additional or emission reducing lodging systems that are stacked.
 *
 * @column reduction_factor_floor The reduction factor for emission from the floor.
 * @column reduction_factor_cellar The reduction factor for emission from the manure cellar.
 * @column reduction_factor_total The combined reduction factor for emission from both floor and manure cellar.
 */
CREATE TABLE farm_lodging_fodder_measure_reduction_factors (
	farm_lodging_fodder_measure_id integer NOT NULL,
	substance_id smallint NOT NULL,
	reduction_factor_floor fraction NOT NULL,
	reduction_factor_cellar fraction NOT NULL,
	reduction_factor_total fraction NOT NULL,

	CONSTRAINT farm_lodging_fodder_measure_reduction_factors_pkey PRIMARY KEY (farm_lodging_fodder_measure_id, substance_id),
	CONSTRAINT farm_lodging_fodder_measure_reduction_factors_fkey_measures FOREIGN KEY (farm_lodging_fodder_measure_id) REFERENCES farm_lodging_fodder_measures,
	CONSTRAINT farm_lodging_fodder_measure_reduction_factors_fkey_substances FOREIGN KEY (substance_id) REFERENCES substances,

	CONSTRAINT farm_lodging_fodder_measure_reduction_factors_chk_factotal CHECK (CASE WHEN reduction_factor_floor = reduction_factor_cellar THEN reduction_factor_total = reduction_factor_floor ELSE reduction_factor_total <= reduction_factor_floor + reduction_factor_cellar END)
);


/*
 * farm_lodging_fodder_measures_animal_category
 * --------------------------------------------
 * Table containing the animal categories for which a measure can be applied, and the corresponding ratio of ammonia emission originating from the floor and the manure cellar.
 * The ammonia ratio for all measures should always be equal, which implies that all chosen measures should apply to the same animal category: the one that is used in the lodging system.
 * In other words, a measure only reduces emissions of a lodging system if it can be applied on the animal category of the lodging system.
 *
 * @column proportion_floor The portion of the total ammonia emission originating from the floor for this combination of measure and animal category.
 * @column proportion_cellar The portion of the total ammonia emission originating from the manure cellar for this combination of measure and animal category.
 */
CREATE TABLE farm_lodging_fodder_measures_animal_category (
	farm_lodging_fodder_measure_id integer NOT NULL,
	farm_animal_category_id integer NOT NULL,
	proportion_floor fraction NOT NULL,
	proportion_cellar fraction NOT NULL,

	CONSTRAINT farm_lodging_fodder_measures_animal_category_pkey PRIMARY KEY (farm_lodging_fodder_measure_id, farm_animal_category_id),
	CONSTRAINT farm_lodging_fodder_measures_animal_category_fkey_measures FOREIGN KEY (farm_lodging_fodder_measure_id) REFERENCES farm_lodging_fodder_measures,
	CONSTRAINT farm_lodging_fodder_measures_animal_category_fkey_animalcat FOREIGN KEY (farm_animal_category_id) REFERENCES farm_animal_categories,

	CONSTRAINT farm_lodging_fodder_measures_animal_category_chk_proportions CHECK (proportion_floor + proportion_cellar = 1.0)
);


/*
 * farm_source_categories
 * ----------------------
 * Table containing the farm source categories.
 * A farm source category is a combination of a sector, animal type and emission factor type.
 * The goal is to differentiate in the unit of emissions of different types of farm emission sources.
 */
CREATE TABLE farm_source_categories (
	farm_source_category_id integer NOT NULL,
	sector_id integer NOT NULL,
	code text NOT NULL UNIQUE,
	farm_animal_category_id integer NOT NULL,
	name text NOT NULL,
	description text,
	farm_emission_factor_type farm_emission_factor_type NOT NULL,

	CONSTRAINT farm_source_categories_pkey PRIMARY KEY (farm_source_category_id),
	CONSTRAINT farm_source_categories_fkey_sectors FOREIGN KEY (sector_id) REFERENCES sectors,
	CONSTRAINT farm_source_categories_fkey_farm_animal_categories FOREIGN KEY (farm_animal_category_id) REFERENCES farm_animal_categories
);

/*
 * farm_source_emission_factors
 * ----------------------------
 * Table containing the emission factors for farm source categories.
 */
CREATE TABLE farm_source_emission_factors (
	farm_source_category_id integer NOT NULL,
	substance_id integer NOT NULL,
	emission_factor real NOT NULL,

	CONSTRAINT farm_source_emission_factors_pkey PRIMARY KEY (farm_source_category_id, substance_id),
	CONSTRAINT farm_source_emission_factors_fkey_farm_source_categories FOREIGN KEY (farm_source_category_id) REFERENCES farm_source_categories,
	CONSTRAINT farm_source_emission_factors_fkey_substances FOREIGN KEY (substance_id) REFERENCES substances
);
