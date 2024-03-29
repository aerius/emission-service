/*
 * This file is generated by jOOQ.
 */
package nl.aerius.emissionservice.db.generated.i18n.enums;


import nl.aerius.emissionservice.db.generated.i18n.I18n;

import org.jooq.Catalog;
import org.jooq.EnumType;
import org.jooq.Schema;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public enum LanguageCodeType implements EnumType {

    nl_("nl"),

    en("en");

    private final String literal;

    private LanguageCodeType(String literal) {
        this.literal = literal;
    }

    @Override
    public Catalog getCatalog() {
        return getSchema().getCatalog();
    }

    @Override
    public Schema getSchema() {
        return I18n.I18N;
    }

    @Override
    public String getName() {
        return "language_code_type";
    }

    @Override
    public String getLiteral() {
        return literal;
    }

    /**
     * Lookup a value of this EnumType by its literal
     */
    public static LanguageCodeType lookupLiteral(String literal) {
        return EnumType.lookupLiteral(LanguageCodeType.class, literal);
    }
}
