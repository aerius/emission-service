/*
 * This file is generated by jOOQ.
 */
package nl.overheid.aerius.emissionservice.jooq.template.tables.records;


import nl.overheid.aerius.emissionservice.jooq.template.tables.FarmLodgingFodderMeasureReductionFactors;

import org.jooq.Field;
import org.jooq.Record2;
import org.jooq.Record5;
import org.jooq.Row5;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * Bevat de reductie factoren (factor 0..1) van de voer- en managementmaatregelen.
 * 
 * Als er maatregelen op een stalsysteem worden toegepast, wordt van de combinatie 
 * van maatregelen eerst een enkele reductiefactor bepaalt. Deze reductiefactor 
 * wordt vervolgens toegepast op de totale emissie van het stalsysteem waarop 
 * gestapeld wordt, inclusief eventuele additionele en emissiereducerende 
 * staltechnieken die hierop gestapeld zijn.
 * 
 * @column reduction_factor_floor De reductiefactor voor de emissie vanaf 
 * de vloer
 * @column reduction_factor_cellar De reductiefactor voor de emissie uit de 
 * mestkelder
 * @column reduction_factor_total De gecombineerde reductiefactor voor de 
 * emissie vanaf de vloer en uit de mestkelder
 * 
 * @file source/database/src/main/sql/template/02_emission_factors/02-tables/farms.sql
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class FarmLodgingFodderMeasureReductionFactorsRecord extends UpdatableRecordImpl<FarmLodgingFodderMeasureReductionFactorsRecord> implements Record5<Integer, Short, Float, Float, Float> {

    private static final long serialVersionUID = 1600934884;

    /**
     * Setter for <code>template.farm_lodging_fodder_measure_reduction_factors.farm_lodging_fodder_measure_id</code>.
     */
    public void setFarmLodgingFodderMeasureId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>template.farm_lodging_fodder_measure_reduction_factors.farm_lodging_fodder_measure_id</code>.
     */
    public Integer getFarmLodgingFodderMeasureId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>template.farm_lodging_fodder_measure_reduction_factors.substance_id</code>.
     */
    public void setSubstanceId(Short value) {
        set(1, value);
    }

    /**
     * Getter for <code>template.farm_lodging_fodder_measure_reduction_factors.substance_id</code>.
     */
    public Short getSubstanceId() {
        return (Short) get(1);
    }

    /**
     * Setter for <code>template.farm_lodging_fodder_measure_reduction_factors.reduction_factor_floor</code>.
     */
    public void setReductionFactorFloor(Float value) {
        set(2, value);
    }

    /**
     * Getter for <code>template.farm_lodging_fodder_measure_reduction_factors.reduction_factor_floor</code>.
     */
    public Float getReductionFactorFloor() {
        return (Float) get(2);
    }

    /**
     * Setter for <code>template.farm_lodging_fodder_measure_reduction_factors.reduction_factor_cellar</code>.
     */
    public void setReductionFactorCellar(Float value) {
        set(3, value);
    }

    /**
     * Getter for <code>template.farm_lodging_fodder_measure_reduction_factors.reduction_factor_cellar</code>.
     */
    public Float getReductionFactorCellar() {
        return (Float) get(3);
    }

    /**
     * Setter for <code>template.farm_lodging_fodder_measure_reduction_factors.reduction_factor_total</code>.
     */
    public void setReductionFactorTotal(Float value) {
        set(4, value);
    }

    /**
     * Getter for <code>template.farm_lodging_fodder_measure_reduction_factors.reduction_factor_total</code>.
     */
    public Float getReductionFactorTotal() {
        return (Float) get(4);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record2<Integer, Short> key() {
        return (Record2) super.key();
    }

    // -------------------------------------------------------------------------
    // Record5 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row5<Integer, Short, Float, Float, Float> fieldsRow() {
        return (Row5) super.fieldsRow();
    }

    @Override
    public Row5<Integer, Short, Float, Float, Float> valuesRow() {
        return (Row5) super.valuesRow();
    }

    @Override
    public Field<Integer> field1() {
        return FarmLodgingFodderMeasureReductionFactors.FARM_LODGING_FODDER_MEASURE_REDUCTION_FACTORS.FARM_LODGING_FODDER_MEASURE_ID;
    }

    @Override
    public Field<Short> field2() {
        return FarmLodgingFodderMeasureReductionFactors.FARM_LODGING_FODDER_MEASURE_REDUCTION_FACTORS.SUBSTANCE_ID;
    }

    @Override
    public Field<Float> field3() {
        return FarmLodgingFodderMeasureReductionFactors.FARM_LODGING_FODDER_MEASURE_REDUCTION_FACTORS.REDUCTION_FACTOR_FLOOR;
    }

    @Override
    public Field<Float> field4() {
        return FarmLodgingFodderMeasureReductionFactors.FARM_LODGING_FODDER_MEASURE_REDUCTION_FACTORS.REDUCTION_FACTOR_CELLAR;
    }

    @Override
    public Field<Float> field5() {
        return FarmLodgingFodderMeasureReductionFactors.FARM_LODGING_FODDER_MEASURE_REDUCTION_FACTORS.REDUCTION_FACTOR_TOTAL;
    }

    @Override
    public Integer component1() {
        return getFarmLodgingFodderMeasureId();
    }

    @Override
    public Short component2() {
        return getSubstanceId();
    }

    @Override
    public Float component3() {
        return getReductionFactorFloor();
    }

    @Override
    public Float component4() {
        return getReductionFactorCellar();
    }

    @Override
    public Float component5() {
        return getReductionFactorTotal();
    }

    @Override
    public Integer value1() {
        return getFarmLodgingFodderMeasureId();
    }

    @Override
    public Short value2() {
        return getSubstanceId();
    }

    @Override
    public Float value3() {
        return getReductionFactorFloor();
    }

    @Override
    public Float value4() {
        return getReductionFactorCellar();
    }

    @Override
    public Float value5() {
        return getReductionFactorTotal();
    }

    @Override
    public FarmLodgingFodderMeasureReductionFactorsRecord value1(Integer value) {
        setFarmLodgingFodderMeasureId(value);
        return this;
    }

    @Override
    public FarmLodgingFodderMeasureReductionFactorsRecord value2(Short value) {
        setSubstanceId(value);
        return this;
    }

    @Override
    public FarmLodgingFodderMeasureReductionFactorsRecord value3(Float value) {
        setReductionFactorFloor(value);
        return this;
    }

    @Override
    public FarmLodgingFodderMeasureReductionFactorsRecord value4(Float value) {
        setReductionFactorCellar(value);
        return this;
    }

    @Override
    public FarmLodgingFodderMeasureReductionFactorsRecord value5(Float value) {
        setReductionFactorTotal(value);
        return this;
    }

    @Override
    public FarmLodgingFodderMeasureReductionFactorsRecord values(Integer value1, Short value2, Float value3, Float value4, Float value5) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached FarmLodgingFodderMeasureReductionFactorsRecord
     */
    public FarmLodgingFodderMeasureReductionFactorsRecord() {
        super(FarmLodgingFodderMeasureReductionFactors.FARM_LODGING_FODDER_MEASURE_REDUCTION_FACTORS);
    }

    /**
     * Create a detached, initialised FarmLodgingFodderMeasureReductionFactorsRecord
     */
    public FarmLodgingFodderMeasureReductionFactorsRecord(Integer farmLodgingFodderMeasureId, Short substanceId, Float reductionFactorFloor, Float reductionFactorCellar, Float reductionFactorTotal) {
        super(FarmLodgingFodderMeasureReductionFactors.FARM_LODGING_FODDER_MEASURE_REDUCTION_FACTORS);

        set(0, farmLodgingFodderMeasureId);
        set(1, substanceId);
        set(2, reductionFactorFloor);
        set(3, reductionFactorCellar);
        set(4, reductionFactorTotal);
    }
}
