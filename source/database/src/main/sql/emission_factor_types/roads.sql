/*
 * speed_limit_enforcement_type
 * ----------------------------
 * Enum for speed limit enforcement types.
 */
CREATE TYPE speed_limit_enforcement_type AS ENUM
	('strict', 'not_strict', 'irrelevant');
