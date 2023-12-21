/*
 * This file is generated by jOOQ.
 */
package nl.aerius.emissionservice.db.generated.template.tables.records;


import nl.aerius.emissionservice.db.generated.i18n.enums.LanguageCodeType;
import nl.aerius.emissionservice.db.generated.template.tables.I18nFarmSourceCategories;

import org.jooq.Field;
import org.jooq.Record2;
import org.jooq.Record3;
import org.jooq.Row3;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * Translation table for farm source categories.
 * 
 * @file
 * source/database/src/main/sql/template/02-emission_factors/i18n/farms.sql
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class I18nFarmSourceCategoriesRecord extends UpdatableRecordImpl<I18nFarmSourceCategoriesRecord> implements Record3<Integer, LanguageCodeType, String> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for
     * <code>template.i18n_farm_source_categories.farm_source_category_id</code>.
     */
    public void setFarmSourceCategoryId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for
     * <code>template.i18n_farm_source_categories.farm_source_category_id</code>.
     */
    public Integer getFarmSourceCategoryId() {
        return (Integer) get(0);
    }

    /**
     * Setter for
     * <code>template.i18n_farm_source_categories.language_code</code>.
     */
    public void setLanguageCode(LanguageCodeType value) {
        set(1, value);
    }

    /**
     * Getter for
     * <code>template.i18n_farm_source_categories.language_code</code>.
     */
    public LanguageCodeType getLanguageCode() {
        return (LanguageCodeType) get(1);
    }

    /**
     * Setter for <code>template.i18n_farm_source_categories.description</code>.
     */
    public void setDescription(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>template.i18n_farm_source_categories.description</code>.
     */
    public String getDescription() {
        return (String) get(2);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record2<Integer, LanguageCodeType> key() {
        return (Record2) super.key();
    }

    // -------------------------------------------------------------------------
    // Record3 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row3<Integer, LanguageCodeType, String> fieldsRow() {
        return (Row3) super.fieldsRow();
    }

    @Override
    public Row3<Integer, LanguageCodeType, String> valuesRow() {
        return (Row3) super.valuesRow();
    }

    @Override
    public Field<Integer> field1() {
        return I18nFarmSourceCategories.I18N_FARM_SOURCE_CATEGORIES.FARM_SOURCE_CATEGORY_ID;
    }

    @Override
    public Field<LanguageCodeType> field2() {
        return I18nFarmSourceCategories.I18N_FARM_SOURCE_CATEGORIES.LANGUAGE_CODE;
    }

    @Override
    public Field<String> field3() {
        return I18nFarmSourceCategories.I18N_FARM_SOURCE_CATEGORIES.DESCRIPTION;
    }

    @Override
    public Integer component1() {
        return getFarmSourceCategoryId();
    }

    @Override
    public LanguageCodeType component2() {
        return getLanguageCode();
    }

    @Override
    public String component3() {
        return getDescription();
    }

    @Override
    public Integer value1() {
        return getFarmSourceCategoryId();
    }

    @Override
    public LanguageCodeType value2() {
        return getLanguageCode();
    }

    @Override
    public String value3() {
        return getDescription();
    }

    @Override
    public I18nFarmSourceCategoriesRecord value1(Integer value) {
        setFarmSourceCategoryId(value);
        return this;
    }

    @Override
    public I18nFarmSourceCategoriesRecord value2(LanguageCodeType value) {
        setLanguageCode(value);
        return this;
    }

    @Override
    public I18nFarmSourceCategoriesRecord value3(String value) {
        setDescription(value);
        return this;
    }

    @Override
    public I18nFarmSourceCategoriesRecord values(Integer value1, LanguageCodeType value2, String value3) {
        value1(value1);
        value2(value2);
        value3(value3);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached I18nFarmSourceCategoriesRecord
     */
    public I18nFarmSourceCategoriesRecord() {
        super(I18nFarmSourceCategories.I18N_FARM_SOURCE_CATEGORIES);
    }

    /**
     * Create a detached, initialised I18nFarmSourceCategoriesRecord
     */
    public I18nFarmSourceCategoriesRecord(Integer farmSourceCategoryId, LanguageCodeType languageCode, String description) {
        super(I18nFarmSourceCategories.I18N_FARM_SOURCE_CATEGORIES);

        setFarmSourceCategoryId(farmSourceCategoryId);
        setLanguageCode(languageCode);
        setDescription(description);
    }
}