/*
 * shipping_movement_type
 * ----------------------
 * Enum indicating the type of movement a maritime ship can make.
 * This depends on the location of the ship.
 * Dock for instance is when the ship is moored at a dock and not moving.
 */
CREATE TYPE shipping_movement_type AS ENUM
	('dock', 'inland', 'maritime');
