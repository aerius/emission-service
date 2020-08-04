/*
 * This file is generated by jOOQ.
 */
package nl.overheid.aerius.emissionservice.jooq.template.tables.records;


import nl.overheid.aerius.emissionservice.jooq.i18n.enums.LanguageCodeType;
import nl.overheid.aerius.emissionservice.jooq.template.tables.I18nMobileSourceOnRoadCategories;

import org.jooq.Field;
import org.jooq.Record2;
import org.jooq.Record4;
import org.jooq.Row4;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * Vertaaltabel voor categorieën van verschillende soorten onroad mobiele 
 * bronnen.
 * 
 * @file source/database/src/main/sql/template/02_emission_factors/i18n/mobile_sources.sql
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class I18nMobileSourceOnRoadCategoriesRecord extends UpdatableRecordImpl<I18nMobileSourceOnRoadCategoriesRecord> implements Record4<Short, LanguageCodeType, String, String> {

    private static final long serialVersionUID = 2009368963;

    /**
     * Setter for <code>template.i18n_mobile_source_on_road_categories.mobile_source_on_road_category_id</code>.
     */
    public void setMobileSourceOnRoadCategoryId(Short value) {
        set(0, value);
    }

    /**
     * Getter for <code>template.i18n_mobile_source_on_road_categories.mobile_source_on_road_category_id</code>.
     */
    public Short getMobileSourceOnRoadCategoryId() {
        return (Short) get(0);
    }

    /**
     * Setter for <code>template.i18n_mobile_source_on_road_categories.language_code</code>.
     */
    public void setLanguageCode(LanguageCodeType value) {
        set(1, value);
    }

    /**
     * Getter for <code>template.i18n_mobile_source_on_road_categories.language_code</code>.
     */
    public LanguageCodeType getLanguageCode() {
        return (LanguageCodeType) get(1);
    }

    /**
     * Setter for <code>template.i18n_mobile_source_on_road_categories.name</code>.
     */
    public void setName(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>template.i18n_mobile_source_on_road_categories.name</code>.
     */
    public String getName() {
        return (String) get(2);
    }

    /**
     * Setter for <code>template.i18n_mobile_source_on_road_categories.description</code>.
     */
    public void setDescription(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>template.i18n_mobile_source_on_road_categories.description</code>.
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
        return I18nMobileSourceOnRoadCategories.I18N_MOBILE_SOURCE_ON_ROAD_CATEGORIES.MOBILE_SOURCE_ON_ROAD_CATEGORY_ID;
    }

    @Override
    public Field<LanguageCodeType> field2() {
        return I18nMobileSourceOnRoadCategories.I18N_MOBILE_SOURCE_ON_ROAD_CATEGORIES.LANGUAGE_CODE;
    }

    @Override
    public Field<String> field3() {
        return I18nMobileSourceOnRoadCategories.I18N_MOBILE_SOURCE_ON_ROAD_CATEGORIES.NAME;
    }

    @Override
    public Field<String> field4() {
        return I18nMobileSourceOnRoadCategories.I18N_MOBILE_SOURCE_ON_ROAD_CATEGORIES.DESCRIPTION;
    }

    @Override
    public Short component1() {
        return getMobileSourceOnRoadCategoryId();
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
        return getMobileSourceOnRoadCategoryId();
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
    public I18nMobileSourceOnRoadCategoriesRecord value1(Short value) {
        setMobileSourceOnRoadCategoryId(value);
        return this;
    }

    @Override
    public I18nMobileSourceOnRoadCategoriesRecord value2(LanguageCodeType value) {
        setLanguageCode(value);
        return this;
    }

    @Override
    public I18nMobileSourceOnRoadCategoriesRecord value3(String value) {
        setName(value);
        return this;
    }

    @Override
    public I18nMobileSourceOnRoadCategoriesRecord value4(String value) {
        setDescription(value);
        return this;
    }

    @Override
    public I18nMobileSourceOnRoadCategoriesRecord values(Short value1, LanguageCodeType value2, String value3, String value4) {
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
     * Create a detached I18nMobileSourceOnRoadCategoriesRecord
     */
    public I18nMobileSourceOnRoadCategoriesRecord() {
        super(I18nMobileSourceOnRoadCategories.I18N_MOBILE_SOURCE_ON_ROAD_CATEGORIES);
    }

    /**
     * Create a detached, initialised I18nMobileSourceOnRoadCategoriesRecord
     */
    public I18nMobileSourceOnRoadCategoriesRecord(Short mobileSourceOnRoadCategoryId, LanguageCodeType languageCode, String name, String description) {
        super(I18nMobileSourceOnRoadCategories.I18N_MOBILE_SOURCE_ON_ROAD_CATEGORIES);

        set(0, mobileSourceOnRoadCategoryId);
        set(1, languageCode);
        set(2, name);
        set(3, description);
    }
}
