/*
 * substances
 * ----------
 * Stoffen
 */
CREATE TABLE substances (
	substance_id smallint NOT NULL,
	name text NOT NULL,
	description text,

	CONSTRAINT substances_pkey PRIMARY KEY (substance_id)
);
