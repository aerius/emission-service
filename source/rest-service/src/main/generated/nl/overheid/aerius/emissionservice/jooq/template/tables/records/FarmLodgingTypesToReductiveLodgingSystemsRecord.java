/*
 * This file is generated by jOOQ.
 */
package nl.overheid.aerius.emissionservice.jooq.template.tables.records;


import nl.overheid.aerius.emissionservice.jooq.template.tables.FarmLodgingTypesToReductiveLodgingSystems;

import org.jooq.Field;
import org.jooq.Record2;
import org.jooq.Row2;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * Koppeling (N:N) welke aangeeft op welke stalsystemen de emissiereducerende 
 * staltechnieken gestapeld kunnen worden.
 * In deze tabel staan de toegestane combinaties van stapelingen binnen de 
 * RAV systematiek, echter binnen de Nb-wet is iedere combinatie mogelijk.
 * 
 * 
 * @file source/database/src/main/sql/template/02_emission_factors/02-tables/farms.sql
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class FarmLodgingTypesToReductiveLodgingSystemsRecord extends UpdatableRecordImpl<FarmLodgingTypesToReductiveLodgingSystemsRecord> implements Record2<Integer, Integer> {

    private static final long serialVersionUID = 1683801418;

    /**
     * Setter for <code>template.farm_lodging_types_to_reductive_lodging_systems.farm_lodging_type_id</code>.
     */
    public void setFarmLodgingTypeId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>template.farm_lodging_types_to_reductive_lodging_systems.farm_lodging_type_id</code>.
     */
    public Integer getFarmLodgingTypeId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>template.farm_lodging_types_to_reductive_lodging_systems.farm_reductive_lodging_system_id</code>.
     */
    public void setFarmReductiveLodgingSystemId(Integer value) {
        set(1, value);
    }

    /**
     * Getter for <code>template.farm_lodging_types_to_reductive_lodging_systems.farm_reductive_lodging_system_id</code>.
     */
    public Integer getFarmReductiveLodgingSystemId() {
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
        return FarmLodgingTypesToReductiveLodgingSystems.FARM_LODGING_TYPES_TO_REDUCTIVE_LODGING_SYSTEMS.FARM_LODGING_TYPE_ID;
    }

    @Override
    public Field<Integer> field2() {
        return FarmLodgingTypesToReductiveLodgingSystems.FARM_LODGING_TYPES_TO_REDUCTIVE_LODGING_SYSTEMS.FARM_REDUCTIVE_LODGING_SYSTEM_ID;
    }

    @Override
    public Integer component1() {
        return getFarmLodgingTypeId();
    }

    @Override
    public Integer component2() {
        return getFarmReductiveLodgingSystemId();
    }

    @Override
    public Integer value1() {
        return getFarmLodgingTypeId();
    }

    @Override
    public Integer value2() {
        return getFarmReductiveLodgingSystemId();
    }

    @Override
    public FarmLodgingTypesToReductiveLodgingSystemsRecord value1(Integer value) {
        setFarmLodgingTypeId(value);
        return this;
    }

    @Override
    public FarmLodgingTypesToReductiveLodgingSystemsRecord value2(Integer value) {
        setFarmReductiveLodgingSystemId(value);
        return this;
    }

    @Override
    public FarmLodgingTypesToReductiveLodgingSystemsRecord values(Integer value1, Integer value2) {
        value1(value1);
        value2(value2);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached FarmLodgingTypesToReductiveLodgingSystemsRecord
     */
    public FarmLodgingTypesToReductiveLodgingSystemsRecord() {
        super(FarmLodgingTypesToReductiveLodgingSystems.FARM_LODGING_TYPES_TO_REDUCTIVE_LODGING_SYSTEMS);
    }

    /**
     * Create a detached, initialised FarmLodgingTypesToReductiveLodgingSystemsRecord
     */
    public FarmLodgingTypesToReductiveLodgingSystemsRecord(Integer farmLodgingTypeId, Integer farmReductiveLodgingSystemId) {
        super(FarmLodgingTypesToReductiveLodgingSystems.FARM_LODGING_TYPES_TO_REDUCTIVE_LODGING_SYSTEMS);

        set(0, farmLodgingTypeId);
        set(1, farmReductiveLodgingSystemId);
    }
}
