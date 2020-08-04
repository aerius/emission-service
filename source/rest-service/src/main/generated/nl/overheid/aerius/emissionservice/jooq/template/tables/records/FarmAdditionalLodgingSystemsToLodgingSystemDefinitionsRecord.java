/*
 * This file is generated by jOOQ.
 */
package nl.overheid.aerius.emissionservice.jooq.template.tables.records;


import nl.overheid.aerius.emissionservice.jooq.template.tables.FarmAdditionalLodgingSystemsToLodgingSystemDefinitions;

import org.jooq.Field;
import org.jooq.Record2;
import org.jooq.Row2;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * Koppeling tussen additionele staltechnieken en stalbeschrijvingen (N:N).
 * 
 * 
 * @file source/database/src/main/sql/template/02_emission_factors/02-tables/farms.sql
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class FarmAdditionalLodgingSystemsToLodgingSystemDefinitionsRecord extends UpdatableRecordImpl<FarmAdditionalLodgingSystemsToLodgingSystemDefinitionsRecord> implements Record2<Integer, Integer> {

    private static final long serialVersionUID = -218060639;

    /**
     * Setter for <code>template.farm_additional_lodging_systems_to_lodging_system_definitions.farm_additional_lodging_system_id</code>.
     */
    public void setFarmAdditionalLodgingSystemId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>template.farm_additional_lodging_systems_to_lodging_system_definitions.farm_additional_lodging_system_id</code>.
     */
    public Integer getFarmAdditionalLodgingSystemId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>template.farm_additional_lodging_systems_to_lodging_system_definitions.farm_lodging_system_definition_id</code>.
     */
    public void setFarmLodgingSystemDefinitionId(Integer value) {
        set(1, value);
    }

    /**
     * Getter for <code>template.farm_additional_lodging_systems_to_lodging_system_definitions.farm_lodging_system_definition_id</code>.
     */
    public Integer getFarmLodgingSystemDefinitionId() {
        return (Integer) get(1);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record2<Integer, Integer> key() {
        return (Record2) super.key();
    }

    // -------------------------------------------------------------------------
    // Record2 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row2<Integer, Integer> fieldsRow() {
        return (Row2) super.fieldsRow();
    }

    @Override
    public Row2<Integer, Integer> valuesRow() {
        return (Row2) super.valuesRow();
    }

    @Override
    public Field<Integer> field1() {
        return FarmAdditionalLodgingSystemsToLodgingSystemDefinitions.FARM_ADDITIONAL_LODGING_SYSTEMS_TO_LODGING_SYSTEM_DEFINITIONS.FARM_ADDITIONAL_LODGING_SYSTEM_ID;
    }

    @Override
    public Field<Integer> field2() {
        return FarmAdditionalLodgingSystemsToLodgingSystemDefinitions.FARM_ADDITIONAL_LODGING_SYSTEMS_TO_LODGING_SYSTEM_DEFINITIONS.FARM_LODGING_SYSTEM_DEFINITION_ID;
    }

    @Override
    public Integer component1() {
        return getFarmAdditionalLodgingSystemId();
    }

    @Override
    public Integer component2() {
        return getFarmLodgingSystemDefinitionId();
    }

    @Override
    public Integer value1() {
        return getFarmAdditionalLodgingSystemId();
    }

    @Override
    public Integer value2() {
        return getFarmLodgingSystemDefinitionId();
    }

    @Override
    public FarmAdditionalLodgingSystemsToLodgingSystemDefinitionsRecord value1(Integer value) {
        setFarmAdditionalLodgingSystemId(value);
        return this;
    }

    @Override
    public FarmAdditionalLodgingSystemsToLodgingSystemDefinitionsRecord value2(Integer value) {
        setFarmLodgingSystemDefinitionId(value);
        return this;
    }

    @Override
    public FarmAdditionalLodgingSystemsToLodgingSystemDefinitionsRecord values(Integer value1, Integer value2) {
        value1(value1);
        value2(value2);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached FarmAdditionalLodgingSystemsToLodgingSystemDefinitionsRecord
     */
    public FarmAdditionalLodgingSystemsToLodgingSystemDefinitionsRecord() {
        super(FarmAdditionalLodgingSystemsToLodgingSystemDefinitions.FARM_ADDITIONAL_LODGING_SYSTEMS_TO_LODGING_SYSTEM_DEFINITIONS);
    }

    /**
     * Create a detached, initialised FarmAdditionalLodgingSystemsToLodgingSystemDefinitionsRecord
     */
    public FarmAdditionalLodgingSystemsToLodgingSystemDefinitionsRecord(Integer farmAdditionalLodgingSystemId, Integer farmLodgingSystemDefinitionId) {
        super(FarmAdditionalLodgingSystemsToLodgingSystemDefinitions.FARM_ADDITIONAL_LODGING_SYSTEMS_TO_LODGING_SYSTEM_DEFINITIONS);

        set(0, farmAdditionalLodgingSystemId);
        set(1, farmLodgingSystemDefinitionId);
    }
}
