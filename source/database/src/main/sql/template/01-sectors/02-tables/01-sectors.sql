/*
 * sectors
 * -------
 * Table containing AERIUS sectors.
 */
CREATE TABLE sectors (
	sector_id integer NOT NULL,
	description text NOT NULL,

	CONSTRAINT sectors_pkey PRIMARY KEY (sector_id)
);


/*
 * gcn_sectors
 * -----------
 * Table containing GCN (RIVM) sectors.
 * Every GCN sector is linked to an AERIUS sector. This allows us to link deposition to AERIUS sources if GCN/RIVM sources are used (Monitor).
 */
CREATE TABLE gcn_sectors (
	gcn_sector_id integer NOT NULL,
	sector_id integer NOT NULL,
	description text NOT NULL,

	CONSTRAINT gcn_sectors_pkey PRIMARY KEY (gcn_sector_id),
	CONSTRAINT gcn_sectors_fkey_sectors FOREIGN KEY (sector_id) REFERENCES sectors
);


/*
 * sectors_main_gcn_sector
 * -----------------------
 * Table linking sectors to main GCN sectors.
 * This can be used to link sources to a GCN sector if required.
 * It is also used for the ParticleSizeDistribution value in OPS characteristics (for calculations involving substances like PM10).
 */
CREATE TABLE sectors_main_gcn_sector (
	sector_id integer NOT NULL,
	gcn_sector_id integer NOT NULL,

	CONSTRAINT sectors_main_gcn_sector_pkey PRIMARY KEY (sector_id),
	CONSTRAINT sectors_main_gcn_sector_fkey_sectors FOREIGN KEY (sector_id) REFERENCES sectors,
	CONSTRAINT sectors_main_gcn_sector_fkey_gcn_sectors FOREIGN KEY (gcn_sector_id) REFERENCES gcn_sectors
);
