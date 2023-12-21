/*
 * shipping_inland_ship_direction_type
 * -----------------------------------
 * Enum defining the direction of travel of a ship. Upstream is from sea and downstream is towards sea.
 * Irrelevant kan be used to specify that there is no distinction between up- and downstream, for example when there is hardly any current.
 */
CREATE TYPE shipping_inland_ship_direction_type AS ENUM
	('upstream', 'downstream', 'irrelevant');


/*
 * shipping_inland_laden_state
 * ---------------------------
 * Enum indicating if an inland shipping ship is laden or not.
 */
CREATE TYPE shipping_inland_laden_state AS ENUM
	('laden', 'unladen');
