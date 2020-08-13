/*
 * datasets
 * --------
 * De verschillende datasets die beschikbaar zijn.
 * De data voor elke dataset bevindt zich in een eigen database schema.
 */
CREATE TABLE datasets (
	dataset_code text NOT NULL,
	schema_name text NOT NULL,
	latest boolean NOT NULL,
	description text,

	CONSTRAINT datasets_pkey PRIMARY KEY (dataset_code)
);
