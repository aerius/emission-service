/*
 * This file is generated by jOOQ.
 */
package nl.overheid.aerius.emissionservice.jooq.template.tables.records;


import nl.overheid.aerius.emissionservice.jooq.i18n.enums.LanguageCodeType;
import nl.overheid.aerius.emissionservice.jooq.template.tables.I18nFarmReductiveLodgingSystems;

import org.jooq.Field;
import org.jooq.Record2;
import org.jooq.Record3;
import org.jooq.Row3;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * Vertaaltabel voor emissiereducerende staltechnieken.
 * 
 * @file source/database/src/main/sql/emission_factors/i18n/farms.sql
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class I18nFarmReductiveLodgingSystemsRecord extends UpdatableRecordImpl<I18nFarmReductiveLodgingSystemsRecord> implements Record3<Integer, LanguageCodeType, String> {

    private static final long serialVersionUID = 888510900;

    /**
     * Setter for <code>template.i18n_farm_reductive_lodging_systems.farm_reductive_lodging_system_id</code>.
     */
    public void setFarmReductiveLodgingSystemId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>template.i18n_farm_reductive_lodging_systems.farm_reductive_lodging_system_id</code>.
     */
    public Integer getFarmReductiveLodgingSystemId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>template.i18n_farm_reductive_lodging_systems.language_code</code>.
     */
    public void setLanguageCode(LanguageCodeType value) {
        set(1, value);
    }

    /**
     * Getter for <code>template.i18n_farm_reductive_lodging_systems.language_code</code>.
     */
    public LanguageCodeType getLanguageCode() {
        return (LanguageCodeType) get(1);
    }

    /**
     * Setter for <code>template.i18n_farm_reductive_lodging_systems.description</code>.
     */
    public void setDescription(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>template.i18n_farm_reductive_lodging_systems.description</code>.
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
        return I18nFarmReductiveLodgingSystems.I18N_FARM_REDUCTIVE_LODGING_SYSTEMS.FARM_REDUCTIVE_LODGING_SYSTEM_ID;
    }

    @Override
    public Field<LanguageCodeType> field2() {
        return I18nFarmReductiveLodgingSystems.I18N_FARM_REDUCTIVE_LODGING_SYSTEMS.LANGUAGE_CODE;
    }

    @Override
    public Field<String> field3() {
        return I18nFarmReductiveLodgingSystems.I18N_FARM_REDUCTIVE_LODGING_SYSTEMS.DESCRIPTION;
    }

    @Override
    public Integer component1() {
        return getFarmReductiveLodgingSystemId();
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
        return getFarmReductiveLodgingSystemId();
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
    public I18nFarmReductiveLodgingSystemsRecord value1(Integer value) {
        setFarmReductiveLodgingSystemId(value);
        return this;
    }

    @Override
    public I18nFarmReductiveLodgingSystemsRecord value2(LanguageCodeType value) {
        setLanguageCode(value);
        return this;
    }

    @Override
    public I18nFarmReductiveLodgingSystemsRecord value3(String value) {
        setDescription(value);
        return this;
    }

    @Override
    public I18nFarmReductiveLodgingSystemsRecord values(Integer value1, LanguageCodeType value2, String value3) {
        value1(value1);
        value2(value2);
        value3(value3);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached I18nFarmReductiveLodgingSystemsRecord
     */
    public I18nFarmReductiveLodgingSystemsRecord() {
        super(I18nFarmReductiveLodgingSystems.I18N_FARM_REDUCTIVE_LODGING_SYSTEMS);
    }

    /**
     * Create a detached, initialised I18nFarmReductiveLodgingSystemsRecord
     */
    public I18nFarmReductiveLodgingSystemsRecord(Integer farmReductiveLodgingSystemId, LanguageCodeType languageCode, String description) {
        super(I18nFarmReductiveLodgingSystems.I18N_FARM_REDUCTIVE_LODGING_SYSTEMS);

        set(0, farmReductiveLodgingSystemId);
        set(1, languageCode);
        set(2, description);
    }
}
