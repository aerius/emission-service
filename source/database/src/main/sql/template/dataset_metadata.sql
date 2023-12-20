/*
 * dataset_metadata
 * ----------------
 * Table containing metadata for this dataset.
 */
CREATE TABLE dataset_metadata (
	key text NOT NULL,
	value text NOT NULL,

	CONSTRAINT dataset_metadata_pkey PRIMARY KEY (key)
);
