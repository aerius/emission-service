/*
 * i18n_sectors
 * ------------
 * Vertaaltabel voor sectoren.
 */
CREATE TABLE i18n_sectors (
	sector_id integer NOT NULL,
	language_code i18n.language_code_type NOT NULL,
	description text NOT NULL,

	CONSTRAINT i18n_sectors_pkey PRIMARY KEY (sector_id, language_code),
	CONSTRAINT i18n_sectors_fkey FOREIGN KEY (sector_id) REFERENCES sectors
);


/*
 * i18n_emission_diurnal_variations
 * --------------------------------
 * Vertaaltabel voor de verschillende type temporele variaties.
 */
CREATE TABLE i18n_emission_diurnal_variations (
	emission_diurnal_variation_id integer NOT NULL,
	language_code i18n.language_code_type NOT NULL,
	name text NOT NULL,
	description text,

	CONSTRAINT i18n_emission_diurnal_variations_pkey PRIMARY KEY (emission_diurnal_variation_id, language_code),
	CONSTRAINT i18n_emission_diurnal_variations_fkey FOREIGN KEY (emission_diurnal_variation_id) REFERENCES emission_diurnal_variations,
	CONSTRAINT i18n_emission_diurnal_variations_unique_name UNIQUE (language_code, name)
);
