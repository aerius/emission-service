/*
 * This file is generated by jOOQ.
 */
package nl.aerius.emissionservice.db.generated.public_.enums;


import nl.aerius.emissionservice.db.generated.public_.Public;

import org.jooq.Catalog;
import org.jooq.EnumType;
import org.jooq.Schema;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public enum VehicleType implements EnumType {

    light_traffic("light_traffic"),

    normal_freight("normal_freight"),

    heavy_freight("heavy_freight"),

    auto_bus("auto_bus");

    private final String literal;

    private VehicleType(String literal) {
        this.literal = literal;
    }

    @Override
    public Catalog getCatalog() {
        return getSchema().getCatalog();
    }

    @Override
    public Schema getSchema() {
        return Public.PUBLIC;
    }

    @Override
    public String getName() {
        return "vehicle_type";
    }

    @Override
    public String getLiteral() {
        return literal;
    }

    /**
     * Lookup a value of this EnumType by its literal
     */
    public static VehicleType lookupLiteral(String literal) {
        return EnumType.lookupLiteral(VehicleType.class, literal);
    }
}