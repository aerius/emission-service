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
public enum ConstantType implements EnumType {

    string("string"),

    integer("integer"),

    float_("float"),

    boolean_("boolean"),

    wkt("wkt");

    private final String literal;

    private ConstantType(String literal) {
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
        return "constant_type";
    }

    @Override
    public String getLiteral() {
        return literal;
    }

    /**
     * Lookup a value of this EnumType by its literal
     */
    public static ConstantType lookupLiteral(String literal) {
        return EnumType.lookupLiteral(ConstantType.class, literal);
    }
}