/*
 * This file is generated by jOOQ.
 */
package nl.overheid.aerius.emissionservice.jooq.template.tables.records;


import nl.overheid.aerius.emissionservice.jooq.template.tables.FarmLodgingSystemDefinitions;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record4;
import org.jooq.Row4;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * Stalbeschrijvingen (BWL-nummers) zoals gebruikt voor de stalsystemen in 
 * de RAV.
 * Zie http://www.infomil.nl/onderwerpen/landbouw-tuinbouw/ammoniak/rav/stalbeschrijvingen
 * 
 * 
 * @file source/database/src/main/sql/template/02_emission_factors/02-tables/farms.sql
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class FarmLodgingSystemDefinitionsRecord extends UpdatableRecordImpl<FarmLodgingSystemDefinitionsRecord> implements Record4<Integer, String, String, String> {

    private static final long serialVersionUID = -1060698526;

    /**
     * Setter for <code>template.farm_lodging_system_definitions.farm_lodging_system_definition_id</code>.
     */
    public void setFarmLodgingSystemDefinitionId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>template.farm_lodging_system_definitions.farm_lodging_system_definition_id</code>.
     */
    public Integer getFarmLodgingSystemDefinitionId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>template.farm_lodging_system_definitions.code</code>.
     */
    public void setCode(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>template.farm_lodging_system_definitions.code</code>.
     */
    public String getCode() {
        return (String) get(1);
    }

    /**
     * Setter for <code>template.farm_lodging_system_definitions.name</code>.
     */
    public void setName(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>template.farm_lodging_system_definitions.name</code>.
     */
    public String getName() {
        return (String) get(2);
    }

    /**
     * Setter for <code>template.farm_lodging_system_definitions.description</code>.
     */
    public void setDescription(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>template.farm_lodging_system_definitions.description</code>.
     */
    public String getDescription() {
        return (String) get(3);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<Integer> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record4 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row4<Integer, String, String, String> fieldsRow() {
        return (Row4) super.fieldsRow();
    }

    @Override
    public Row4<Integer, String, String, String> valuesRow() {
        return (Row4) super.valuesRow();
    }

    @Override
    public Field<Integer> field1() {
        return FarmLodgingSystemDefinitions.FARM_LODGING_SYSTEM_DEFINITIONS.FARM_LODGING_SYSTEM_DEFINITION_ID;
    }

    @Override
    public Field<String> field2() {
        return FarmLodgingSystemDefinitions.FARM_LODGING_SYSTEM_DEFINITIONS.CODE;
    }

    @Override
    public Field<String> field3() {
        return FarmLodgingSystemDefinitions.FARM_LODGING_SYSTEM_DEFINITIONS.NAME;
    }

    @Override
    public Field<String> field4() {
        return FarmLodgingSystemDefinitions.FARM_LODGING_SYSTEM_DEFINITIONS.DESCRIPTION;
    }

    @Override
    public Integer component1() {
        return getFarmLodgingSystemDefinitionId();
    }

    @Override
    public String component2() {
        return getCode();
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
        return getFarmLodgingSystemDefinitionId();
    }

    @Override
    public String value2() {
        return getCode();
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
    public FarmLodgingSystemDefinitionsRecord value1(Integer value) {
        setFarmLodgingSystemDefinitionId(value);
        return this;
    }

    @Override
    public FarmLodgingSystemDefinitionsRecord value2(String value) {
        setCode(value);
        return this;
    }

    @Override
    public FarmLodgingSystemDefinitionsRecord value3(String value) {
        setName(value);
        return this;
    }

    @Override
    public FarmLodgingSystemDefinitionsRecord value4(String value) {
        setDescription(value);
        return this;
    }

    @Override
    public FarmLodgingSystemDefinitionsRecord values(Integer value1, String value2, String value3, String value4) {
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
     * Create a detached FarmLodgingSystemDefinitionsRecord
     */
    public FarmLodgingSystemDefinitionsRecord() {
        super(FarmLodgingSystemDefinitions.FARM_LODGING_SYSTEM_DEFINITIONS);
    }

    /**
     * Create a detached, initialised FarmLodgingSystemDefinitionsRecord
     */
    public FarmLodgingSystemDefinitionsRecord(Integer farmLodgingSystemDefinitionId, String code, String name, String description) {
        super(FarmLodgingSystemDefinitions.FARM_LODGING_SYSTEM_DEFINITIONS);

        set(0, farmLodgingSystemDefinitionId);
        set(1, code);
        set(2, name);
        set(3, description);
    }
}
