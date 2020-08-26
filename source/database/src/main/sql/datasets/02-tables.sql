/*
 * datasets
 * --------
 * De verschillende datasets die beschikbaar zijn.
 * De data voor elke dataset bevindt zich in een eigen database schema.
 */
CREATE TABLE datasets (
	code text NOT NULL,
	name text NOT NULL UNIQUE,
	schema_name text NOT NULL,
	current boolean NOT NULL,
	description text,

	CONSTRAINT datasets_pkey PRIMARY KEY (code)
);

/*
 * i18n_datasets
 * -------------
 * Vertaaltabel voor de verschillende datasets die beschikbaar zijn.
 */
CREATE TABLE i18n_datasets (
	code text NOT NULL,
	language_code i18n.language_code_type NOT NULL,
	name text NOT NULL,
	description text,

	CONSTRAINT i18n_datasets_pkey PRIMARY KEY (code, language_code),
	CONSTRAINT i18n_datasets FOREIGN KEY (code) REFERENCES datasets
);
