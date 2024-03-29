/*
 * This file is generated by jOOQ.
 */
package nl.aerius.emissionservice.db.generated.template.tables.records;


import nl.aerius.emissionservice.db.generated.i18n.enums.LanguageCodeType;
import nl.aerius.emissionservice.db.generated.template.tables.I18nEmissionDiurnalVariations;

import org.jooq.Field;
import org.jooq.Record2;
import org.jooq.Record4;
import org.jooq.Row4;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * Table containing i18n localization for different types of diurnal variation.
 * 
 * @file source/database/src/main/sql/template/01-sectors/i18n/base_keys.sql
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class I18nEmissionDiurnalVariationsRecord extends UpdatableRecordImpl<I18nEmissionDiurnalVariationsRecord> implements Record4<Integer, LanguageCodeType, String, String> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for
     * <code>template.i18n_emission_diurnal_variations.emission_diurnal_variation_id</code>.
     */
    public void setEmissionDiurnalVariationId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for
     * <code>template.i18n_emission_diurnal_variations.emission_diurnal_variation_id</code>.
     */
    public Integer getEmissionDiurnalVariationId() {
        return (Integer) get(0);
    }

    /**
     * Setter for
     * <code>template.i18n_emission_diurnal_variations.language_code</code>.
     */
    public void setLanguageCode(LanguageCodeType value) {
        set(1, value);
    }

    /**
     * Getter for
     * <code>template.i18n_emission_diurnal_variations.language_code</code>.
     */
    public LanguageCodeType getLanguageCode() {
        return (LanguageCodeType) get(1);
    }

    /**
     * Setter for <code>template.i18n_emission_diurnal_variations.name</code>.
     */
    public void setName(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>template.i18n_emission_diurnal_variations.name</code>.
     */
    public String getName() {
        return (String) get(2);
    }

    /**
     * Setter for
     * <code>template.i18n_emission_diurnal_variations.description</code>.
     */
    public void setDescription(String value) {
        set(3, value);
    }

    /**
     * Getter for
     * <code>template.i18n_emission_diurnal_variations.description</code>.
     */
    public String getDescription() {
        return (String) get(3);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record2<Integer, LanguageCodeType> key() {
        return (Record2) super.key();
    }

    // -------------------------------------------------------------------------
    // Record4 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row4<Integer, LanguageCodeType, String, String> fieldsRow() {
        return (Row4) super.fieldsRow();
    }

    @Override
    public Row4<Integer, LanguageCodeType, String, String> valuesRow() {
        return (Row4) super.valuesRow();
    }

    @Override
    public Field<Integer> field1() {
        return I18nEmissionDiurnalVariations.I18N_EMISSION_DIURNAL_VARIATIONS.EMISSION_DIURNAL_VARIATION_ID;
    }

    @Override
    public Field<LanguageCodeType> field2() {
        return I18nEmissionDiurnalVariations.I18N_EMISSION_DIURNAL_VARIATIONS.LANGUAGE_CODE;
    }

    @Override
    public Field<String> field3() {
        return I18nEmissionDiurnalVariations.I18N_EMISSION_DIURNAL_VARIATIONS.NAME;
    }

    @Override
    public Field<String> field4() {
        return I18nEmissionDiurnalVariations.I18N_EMISSION_DIURNAL_VARIATIONS.DESCRIPTION;
    }

    @Override
    public Integer component1() {
        return getEmissionDiurnalVariationId();
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
    public Integer value1() {
        return getEmissionDiurnalVariationId();
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
    public I18nEmissionDiurnalVariationsRecord value1(Integer value) {
        setEmissionDiurnalVariationId(value);
        return this;
    }

    @Override
    public I18nEmissionDiurnalVariationsRecord value2(LanguageCodeType value) {
        setLanguageCode(value);
        return this;
    }

    @Override
    public I18nEmissionDiurnalVariationsRecord value3(String value) {
        setName(value);
        return this;
    }

    @Override
    public I18nEmissionDiurnalVariationsRecord value4(String value) {
        setDescription(value);
        return this;
    }

    @Override
    public I18nEmissionDiurnalVariationsRecord values(Integer value1, LanguageCodeType value2, String value3, String value4) {
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
     * Create a detached I18nEmissionDiurnalVariationsRecord
     */
    public I18nEmissionDiurnalVariationsRecord() {
        super(I18nEmissionDiurnalVariations.I18N_EMISSION_DIURNAL_VARIATIONS);
    }

    /**
     * Create a detached, initialised I18nEmissionDiurnalVariationsRecord
     */
    public I18nEmissionDiurnalVariationsRecord(Integer emissionDiurnalVariationId, LanguageCodeType languageCode, String name, String description) {
        super(I18nEmissionDiurnalVariations.I18N_EMISSION_DIURNAL_VARIATIONS);

        setEmissionDiurnalVariationId(emissionDiurnalVariationId);
        setLanguageCode(languageCode);
        setName(name);
        setDescription(description);
    }
}
