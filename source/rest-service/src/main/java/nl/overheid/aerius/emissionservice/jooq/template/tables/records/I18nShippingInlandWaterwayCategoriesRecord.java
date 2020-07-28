/*
 * This file is generated by jOOQ.
 */
package nl.overheid.aerius.emissionservice.jooq.template.tables.records;


import nl.overheid.aerius.emissionservice.jooq.i18n.enums.LanguageCodeType;
import nl.overheid.aerius.emissionservice.jooq.template.tables.I18nShippingInlandWaterwayCategories;

import org.jooq.Field;
import org.jooq.Record2;
import org.jooq.Record4;
import org.jooq.Row4;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * Vertaaltabel voor categorieën van verschillende soorten binnenvaart vaarwegen.
 * 
 * 
 * @file source/database/src/main/sql/emission_factors/i18n/shipping_inland.sql
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class I18nShippingInlandWaterwayCategoriesRecord extends UpdatableRecordImpl<I18nShippingInlandWaterwayCategoriesRecord> implements Record4<Short, LanguageCodeType, String, String> {

    private static final long serialVersionUID = 1664927306;

    /**
     * Setter for <code>template.i18n_shipping_inland_waterway_categories.shipping_inland_waterway_category_id</code>.
     */
    public void setShippingInlandWaterwayCategoryId(Short value) {
        set(0, value);
    }

    /**
     * Getter for <code>template.i18n_shipping_inland_waterway_categories.shipping_inland_waterway_category_id</code>.
     */
    public Short getShippingInlandWaterwayCategoryId() {
        return (Short) get(0);
    }

    /**
     * Setter for <code>template.i18n_shipping_inland_waterway_categories.language_code</code>.
     */
    public void setLanguageCode(LanguageCodeType value) {
        set(1, value);
    }

    /**
     * Getter for <code>template.i18n_shipping_inland_waterway_categories.language_code</code>.
     */
    public LanguageCodeType getLanguageCode() {
        return (LanguageCodeType) get(1);
    }

    /**
     * Setter for <code>template.i18n_shipping_inland_waterway_categories.name</code>.
     */
    public void setName(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>template.i18n_shipping_inland_waterway_categories.name</code>.
     */
    public String getName() {
        return (String) get(2);
    }

    /**
     * Setter for <code>template.i18n_shipping_inland_waterway_categories.description</code>.
     */
    public void setDescription(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>template.i18n_shipping_inland_waterway_categories.description</code>.
     */
    public String getDescription() {
        return (String) get(3);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record2<Short, LanguageCodeType> key() {
        return (Record2) super.key();
    }

    // -------------------------------------------------------------------------
    // Record4 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row4<Short, LanguageCodeType, String, String> fieldsRow() {
        return (Row4) super.fieldsRow();
    }

    @Override
    public Row4<Short, LanguageCodeType, String, String> valuesRow() {
        return (Row4) super.valuesRow();
    }

    @Override
    public Field<Short> field1() {
        return I18nShippingInlandWaterwayCategories.I18N_SHIPPING_INLAND_WATERWAY_CATEGORIES.SHIPPING_INLAND_WATERWAY_CATEGORY_ID;
    }

    @Override
    public Field<LanguageCodeType> field2() {
        return I18nShippingInlandWaterwayCategories.I18N_SHIPPING_INLAND_WATERWAY_CATEGORIES.LANGUAGE_CODE;
    }

    @Override
    public Field<String> field3() {
        return I18nShippingInlandWaterwayCategories.I18N_SHIPPING_INLAND_WATERWAY_CATEGORIES.NAME;
    }

    @Override
    public Field<String> field4() {
        return I18nShippingInlandWaterwayCategories.I18N_SHIPPING_INLAND_WATERWAY_CATEGORIES.DESCRIPTION;
    }

    @Override
    public Short component1() {
        return getShippingInlandWaterwayCategoryId();
    }

    @Override
    public LanguageCodeType component2() {
        return getLanguageCode();
    }

    @Override
    public String component3() {
        return getName();
    }

    @Override
    public String component4() {
        return getDescription();
    }

    @Override
    public Short value1() {
        return getShippingInlandWaterwayCategoryId();
    }

    @Override
    public LanguageCodeType value2() {
        return getLanguageCode();
    }

    @Override
    public String value3() {
        return getName();
    }

    @Override
    public String value4() {
        return getDescription();
    }

    @Override
    public I18nShippingInlandWaterwayCategoriesRecord value1(Short value) {
        setShippingInlandWaterwayCategoryId(value);
        return this;
    }

    @Override
    public I18nShippingInlandWaterwayCategoriesRecord value2(LanguageCodeType value) {
        setLanguageCode(value);
        return this;
    }

    @Override
    public I18nShippingInlandWaterwayCategoriesRecord value3(String value) {
        setName(value);
        return this;
    }

    @Override
    public I18nShippingInlandWaterwayCategoriesRecord value4(String value) {
        setDescription(value);
        return this;
    }

    @Override
    public I18nShippingInlandWaterwayCategoriesRecord values(Short value1, LanguageCodeType value2, String value3, String value4) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached I18nShippingInlandWaterwayCategoriesRecord
     */
    public I18nShippingInlandWaterwayCategoriesRecord() {
        super(I18nShippingInlandWaterwayCategories.I18N_SHIPPING_INLAND_WATERWAY_CATEGORIES);
    }

    /**
     * Create a detached, initialised I18nShippingInlandWaterwayCategoriesRecord
     */
    public I18nShippingInlandWaterwayCategoriesRecord(Short shippingInlandWaterwayCategoryId, LanguageCodeType languageCode, String name, String description) {
        super(I18nShippingInlandWaterwayCategories.I18N_SHIPPING_INLAND_WATERWAY_CATEGORIES);

        set(0, shippingInlandWaterwayCategoryId);
        set(1, languageCode);
        set(2, name);
        set(3, description);
    }
}
