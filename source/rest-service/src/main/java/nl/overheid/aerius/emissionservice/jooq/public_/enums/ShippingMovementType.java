/*
 * This file is generated by jOOQ.
 */
package nl.overheid.aerius.emissionservice.jooq.public_.enums;


import nl.overheid.aerius.emissionservice.jooq.public_.Public;

import org.jooq.Catalog;
import org.jooq.EnumType;
import org.jooq.Schema;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public enum ShippingMovementType implements EnumType {

    dock("dock"),

    inland("inland"),

    maritime("maritime");

    private final String literal;

    private ShippingMovementType(String literal) {
        this.literal = literal;
    }

    @Override
    public Catalog getCatalog() {
        return getSchema() == null ? null : getSchema().getCatalog();
    }

    @Override
    public Schema getSchema() {
        return Public.PUBLIC;
    }

    @Override
    public String getName() {
        return "shipping_movement_type";
    }

    @Override
    public String getLiteral() {
        return literal;
    }
}
