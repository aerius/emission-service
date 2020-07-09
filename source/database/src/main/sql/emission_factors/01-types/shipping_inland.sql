/*
 * shipping_inland_ship_direction_type
 * -----------------------------------
 * Geeft de vaarrichting van het schip weer. Upstream is van zee en downstream is naar zee.
 * Met irrelevant kun je aangeven dat er geen onderscheidt is tussen up- en downstream (bijvoorbeeld als er geen stroming is).
 */
CREATE TYPE shipping_inland_ship_direction_type AS ENUM
	('upstream', 'downstream', 'irrelevant');


/*
 * shipping_inland_laden_state
 * ---------------------------
 * Geeft aan of het binnenvaartschip beladen is of niet.
 */
CREATE TYPE shipping_inland_laden_state AS ENUM
	('laden', 'unladen');
