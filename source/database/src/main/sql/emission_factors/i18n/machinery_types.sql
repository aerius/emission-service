/*
 * i18n_machinery_types
 * --------------------
 * Vertaaltabel voor categorieën van verschillende soorten werktuigen.
 */
CREATE TABLE i18n_machinery_types (
	machinery_type_id int,
	language_code i18n.language_code_type,
	name text NOT NULL,

	CONSTRAINT i18n_machinery_types_pkey PRIMARY KEY (machinery_type_id, language_code),
	CONSTRAINT i18n_machinery_types_fkey FOREIGN KEY (machinery_type_id) REFERENCES machinery_types
);

/*
 * i18n_machinery_fuel_types
 * -------------------------
 * Vertaaltabel voor categorieën van verschillende soorten brandstof.
 */
CREATE TABLE i18n_machinery_fuel_types (
	machinery_fuel_type_id int,
	language_code i18n.language_code_type,
	name text NOT NULL,

	CONSTRAINT i18n_machinery_fuel_types_pkey PRIMARY KEY (machinery_fuel_type_id, language_code),
	CONSTRAINT i18n_machinery_fuel_types_fkey FOREIGN KEY (machinery_fuel_type_id) REFERENCES machinery_fuel_types
);
