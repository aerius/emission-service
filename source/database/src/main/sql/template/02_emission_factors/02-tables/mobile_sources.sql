/*
 * mobile_source_off_road_categories
 * ---------------------------------
 * De categorieën van verschillende soorten offroad mobiele bronnen (stageklassen).
 * De naam is hierbij de identificatie van de categorie voor de gebruiker.
 */
CREATE TABLE mobile_source_off_road_categories
(
	mobile_source_off_road_category_id smallint NOT NULL,
	code text NOT NULL UNIQUE,
	name text NOT NULL UNIQUE,
	description text,

	CONSTRAINT mobile_source_off_road_categories_pkey PRIMARY KEY (mobile_source_off_road_category_id)
);


/*
 * mobile_source_off_road_category_idle_properties
 * -----------------------------------------------
 * Eigenschappen per stageklasse die nodig zijn om de stationaire emissie te berekenen (onafhankelijk van de stof).
 *
 * Niet voor alle stageklasses zijn stationaire emissieberekeningen mogelijk, in dat geval ontbreekt het record.
 *
 * @column power_min Vmin, minimaal vermogen binnen de opgegeven stage-klasse (KW)
 * @column power_max Vmax, maximaal vermogen binnen de opgegeven stage-klasse (KW)
 * @column fuel_consumption_idle GBS_plci, liter brandstof verbruik stationair per uur per liter cilinder-inhoud (l/l/uur)
 */
CREATE TABLE mobile_source_off_road_category_idle_properties
(
	mobile_source_off_road_category_id smallint NOT NULL,
	power_min posreal NOT NULL,
	power_max posreal NOT NULL,
	fuel_consumption_idle posreal NOT NULL,

	CONSTRAINT mobile_source_off_road_category_idle_prop_pkey PRIMARY KEY (mobile_source_off_road_category_id),
	CONSTRAINT mobile_source_off_road_category_idle_prop_fkey_cat_id FOREIGN KEY (mobile_source_off_road_category_id) REFERENCES mobile_source_off_road_categories
);


/*
 * mobile_source_off_road_category_emission_factors
 * ------------------------------------------------
 * De emissie factoren (werkend en stationair) voor stageklassen.
 *
 * Het veld emission_factor_idle is leeg indien er geen stationaire emissieberekening mogelijk is voor een stageklasse. Er bevindt zich dan ook geen bijbehorend
 * record in {@see mobile_source_off_road_category_idle_properties}.
 *
 * @column emission_factor_working EFW_plb, emissie factor werkend per liter brandstof (g/l)
 * @column emission_factor_idle EFS_plci, emissie factor stationair per uur per liter cilinder-inhoud (g/l/uur)
 */
CREATE TABLE mobile_source_off_road_category_emission_factors
(
	mobile_source_off_road_category_id smallint NOT NULL,
	substance_id smallint NOT NULL,
	emission_factor_working posreal NOT NULL,
	emission_factor_idle posreal,

	CONSTRAINT mobile_source_off_road_category_efac_pkey PRIMARY KEY (mobile_source_off_road_category_id, substance_id),
	CONSTRAINT mobile_source_off_road_category_efac_fkey_substances FOREIGN KEY (substance_id) REFERENCES substances,
	CONSTRAINT mobile_source_off_road_category_efac_fkey_mobile_off_road_cat FOREIGN KEY (mobile_source_off_road_category_id) REFERENCES mobile_source_off_road_categories
);


/*
 * mobile_source_on_road_categories
 * --------------------------------
 * De categorieën van verschillende soorten onroad mobiele bronnen.
 * Dit is qua structuur dezelfde tabel als mobile_source_off_road_categories.
 * Hierdoor zou overerving wel kunnen, echter is het nadeel hierbij dat voor de ID's
 * vervolgens rekening gehouden moet worden met de andere tabel. Hierom is gekozen NIET gebruik te maken van overerving.
 * Er is een kans dat de lijsten afzonderlijk van elkaar zullen gaan wijzigen.
 *
 * De naam is hierbij de identificatie van de categorie voor de gebruiker.
 */
CREATE TABLE mobile_source_on_road_categories
(
	mobile_source_on_road_category_id smallint NOT NULL,
	code text NOT NULL UNIQUE,
	name text NOT NULL UNIQUE,
	description text,

	CONSTRAINT mobile_source_on_road_categories_pkey PRIMARY KEY (mobile_source_on_road_category_id)
);


/*
 * mobile_source_on_road_category_emission_factors
 * -----------------------------------------------
 * De emissie factoren voor verschillende soorten onroad mobiele bronnen.
 * De emissie factoren zijn hier in kg/km/voertuig.
 */
CREATE TABLE mobile_source_on_road_category_emission_factors
(
	mobile_source_on_road_category_id smallint NOT NULL,
	road_type road_type NOT NULL,
	substance_id smallint NOT NULL,
	emission_factor posreal NOT NULL,

	CONSTRAINT mobile_source_on_road_efac_pkey PRIMARY KEY (mobile_source_on_road_category_id, road_type, substance_id),
	CONSTRAINT mobile_source_on_road_efac_fkey_substances FOREIGN KEY (substance_id) REFERENCES substances,
	CONSTRAINT mobile_source_on_road_efac_fkey_mobile_on_road_cat FOREIGN KEY (mobile_source_on_road_category_id) REFERENCES mobile_source_on_road_categories
);
