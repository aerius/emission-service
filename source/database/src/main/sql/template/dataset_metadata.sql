/*
 * dataset_metadata
 * ----------------
 * Metadata voor deze dataset
 */
CREATE TABLE dataset_metadata (
	key text NOT NULL,
	value text NOT NULL,

	CONSTRAINT dataset_metadata_pkey PRIMARY KEY (key)
);
