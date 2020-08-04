/*
 * This file is generated by jOOQ.
 */
package nl.overheid.aerius.emissionservice.jooq.template.tables.records;


import nl.overheid.aerius.emissionservice.jooq.template.tables.FarmLodgingFodderMeasureReductionFactorsView;

import org.jooq.Field;
import org.jooq.Record11;
import org.jooq.Row11;
import org.jooq.impl.TableRecordImpl;


/**
 * Geeft de eigenschappen van een voer- en managementmaatregel, inclusief 
 * code, beschrijving, de diercategorieën waarop deze mag worden toegepast 
 * en de bijbehorende aandeel- en reductiefactoren voor die diercategorie.
 * 
 * 
 * @file source/database/src/main/sql/template/02_emission_factors/04-views/farms.sql
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class FarmLodgingFodderMeasureReductionFactorsViewRecord extends TableRecordImpl<FarmLodgingFodderMeasureReductionFactorsViewRecord> implements Record11<Integer, String, String, String, Integer, Short, Float, Float, Float, Float, Float> {

    private static final long serialVersionUID = -1809569966;

    /**
     * Setter for <code>template.farm_lodging_fodder_measure_reduction_factors_view.farm_lodging_fodder_measure_id</code>.
     */
    public void setFarmLodgingFodderMeasureId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>template.farm_lodging_fodder_measure_reduction_factors_view.farm_lodging_fodder_measure_id</code>.
     */
    public Integer getFarmLodgingFodderMeasureId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>template.farm_lodging_fodder_measure_reduction_factors_view.code</code>.
     */
    public void setCode(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>template.farm_lodging_fodder_measure_reduction_factors_view.code</code>.
     */
    public String getCode() {
        return (String) get(1);
    }

    /**
     * Setter for <code>template.farm_lodging_fodder_measure_reduction_factors_view.name</code>.
     */
    public void setName(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>template.farm_lodging_fodder_measure_reduction_factors_view.name</code>.
     */
    public String getName() {
        return (String) get(2);
    }

    /**
     * Setter for <code>template.farm_lodging_fodder_measure_reduction_factors_view.description</code>.
     */
    public void setDescription(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>template.farm_lodging_fodder_measure_reduction_factors_view.description</code>.
     */
    public String getDescription() {
        return (String) get(3);
    }

    /**
     * Setter for <code>template.farm_lodging_fodder_measure_reduction_factors_view.farm_animal_category_id</code>.
     */
    public void setFarmAnimalCategoryId(Integer value) {
        set(4, value);
    }

    /**
     * Getter for <code>template.farm_lodging_fodder_measure_reduction_factors_view.farm_animal_category_id</code>.
     */
    public Integer getFarmAnimalCategoryId() {
        return (Integer) get(4);
    }

    /**
     * Setter for <code>template.farm_lodging_fodder_measure_reduction_factors_view.substance_id</code>.
     */
    public void setSubstanceId(Short value) {
        set(5, value);
    }

    /**
     * Getter for <code>template.farm_lodging_fodder_measure_reduction_factors_view.substance_id</code>.
     */
    public Short getSubstanceId() {
        return (Short) get(5);
    }

    /**
     * Setter for <code>template.farm_lodging_fodder_measure_reduction_factors_view.reduction_factor_floor</code>.
     */
    public void setReductionFactorFloor(Float value) {
        set(6, value);
    }

    /**
     * Getter for <code>template.farm_lodging_fodder_measure_reduction_factors_view.reduction_factor_floor</code>.
     */
    public Float getReductionFactorFloor() {
        return (Float) get(6);
    }

    /**
     * Setter for <code>template.farm_lodging_fodder_measure_reduction_factors_view.reduction_factor_cellar</code>.
     */
    public void setReductionFactorCellar(Float value) {
        set(7, value);
    }

    /**
     * Getter for <code>template.farm_lodging_fodder_measure_reduction_factors_view.reduction_factor_cellar</code>.
     */
    public Float getReductionFactorCellar() {
        return (Float) get(7);
    }

    /**
     * Setter for <code>template.farm_lodging_fodder_measure_reduction_factors_view.reduction_factor_total</code>.
     */
    public void setReductionFactorTotal(Float value) {
        set(8, value);
    }

    /**
     * Getter for <code>template.farm_lodging_fodder_measure_reduction_factors_view.reduction_factor_total</code>.
     */
    public Float getReductionFactorTotal() {
        return (Float) get(8);
    }

    /**
     * Setter for <code>template.farm_lodging_fodder_measure_reduction_factors_view.proportion_floor</code>.
     */
    public void setProportionFloor(Float value) {
        set(9, value);
    }

    /**
     * Getter for <code>template.farm_lodging_fodder_measure_reduction_factors_view.proportion_floor</code>.
     */
    public Float getProportionFloor() {
        return (Float) get(9);
    }

    /**
     * Setter for <code>template.farm_lodging_fodder_measure_reduction_factors_view.proportion_cellar</code>.
     */
    public void setProportionCellar(Float value) {
        set(10, value);
    }

    /**
     * Getter for <code>template.farm_lodging_fodder_measure_reduction_factors_view.proportion_cellar</code>.
     */
    public Float getProportionCellar() {
        return (Float) get(10);
    }

    // -------------------------------------------------------------------------
    // Record11 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row11<Integer, String, String, String, Integer, Short, Float, Float, Float, Float, Float> fieldsRow() {
        return (Row11) super.fieldsRow();
    }

    @Override
    public Row11<Integer, String, String, String, Integer, Short, Float, Float, Float, Float, Float> valuesRow() {
        return (Row11) super.valuesRow();
    }

    @Override
    public Field<Integer> field1() {
        return FarmLodgingFodderMeasureReductionFactorsView.FARM_LODGING_FODDER_MEASURE_REDUCTION_FACTORS_VIEW.FARM_LODGING_FODDER_MEASURE_ID;
    }

    @Override
    public Field<String> field2() {
        return FarmLodgingFodderMeasureReductionFactorsView.FARM_LODGING_FODDER_MEASURE_REDUCTION_FACTORS_VIEW.CODE;
    }

    @Override
    public Field<String> field3() {
        return FarmLodgingFodderMeasureReductionFactorsView.FARM_LODGING_FODDER_MEASURE_REDUCTION_FACTORS_VIEW.NAME;
    }

    @Override
    public Field<String> field4() {
        return FarmLodgingFodderMeasureReductionFactorsView.FARM_LODGING_FODDER_MEASURE_REDUCTION_FACTORS_VIEW.DESCRIPTION;
    }

    @Override
    public Field<Integer> field5() {
        return FarmLodgingFodderMeasureReductionFactorsView.FARM_LODGING_FODDER_MEASURE_REDUCTION_FACTORS_VIEW.FARM_ANIMAL_CATEGORY_ID;
    }

    @Override
    public Field<Short> field6() {
        return FarmLodgingFodderMeasureReductionFactorsView.FARM_LODGING_FODDER_MEASURE_REDUCTION_FACTORS_VIEW.SUBSTANCE_ID;
    }

    @Override
    public Field<Float> field7() {
        return FarmLodgingFodderMeasureReductionFactorsView.FARM_LODGING_FODDER_MEASURE_REDUCTION_FACTORS_VIEW.REDUCTION_FACTOR_FLOOR;
    }

    @Override
    public Field<Float> field8() {
        return FarmLodgingFodderMeasureReductionFactorsView.FARM_LODGING_FODDER_MEASURE_REDUCTION_FACTORS_VIEW.REDUCTION_FACTOR_CELLAR;
    }

    @Override
    public Field<Float> field9() {
        return FarmLodgingFodderMeasureReductionFactorsView.FARM_LODGING_FODDER_MEASURE_REDUCTION_FACTORS_VIEW.REDUCTION_FACTOR_TOTAL;
    }

    @Override
    public Field<Float> field10() {
        return FarmLodgingFodderMeasureReductionFactorsView.FARM_LODGING_FODDER_MEASURE_REDUCTION_FACTORS_VIEW.PROPORTION_FLOOR;
    }

    @Override
    public Field<Float> field11() {
        return FarmLodgingFodderMeasureReductionFactorsView.FARM_LODGING_FODDER_MEASURE_REDUCTION_FACTORS_VIEW.PROPORTION_CELLAR;
    }

    @Override
    public Integer component1() {
        return getFarmLodgingFodderMeasureId();
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
    public Integer component5() {
        return getFarmAnimalCategoryId();
    }

    @Override
    public Short component6() {
        return getSubstanceId();
    }

    @Override
    public Float component7() {
        return getReductionFactorFloor();
    }

    @Override
    public Float component8() {
        return getReductionFactorCellar();
    }

    @Override
    public Float component9() {
        return getReductionFactorTotal();
    }

    @Override
    public Float component10() {
        return getProportionFloor();
    }

    @Override
    public Float component11() {
        return getProportionCellar();
    }

    @Override
    public Integer value1() {
        return getFarmLodgingFodderMeasureId();
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
    public Integer value5() {
        return getFarmAnimalCategoryId();
    }

    @Override
    public Short value6() {
        return getSubstanceId();
    }

    @Override
    public Float value7() {
        return getReductionFactorFloor();
    }

    @Override
    public Float value8() {
        return getReductionFactorCellar();
    }

    @Override
    public Float value9() {
        return getReductionFactorTotal();
    }

    @Override
    public Float value10() {
        return getProportionFloor();
    }

    @Override
    public Float value11() {
        return getProportionCellar();
    }

    @Override
    public FarmLodgingFodderMeasureReductionFactorsViewRecord value1(Integer value) {
        setFarmLodgingFodderMeasureId(value);
        return this;
    }

    @Override
    public FarmLodgingFodderMeasureReductionFactorsViewRecord value2(String value) {
        setCode(value);
        return this;
    }

    @Override
    public FarmLodgingFodderMeasureReductionFactorsViewRecord value3(String value) {
        setName(value);
        return this;
    }

    @Override
    public FarmLodgingFodderMeasureReductionFactorsViewRecord value4(String value) {
        setDescription(value);
        return this;
    }

    @Override
    public FarmLodgingFodderMeasureReductionFactorsViewRecord value5(Integer value) {
        setFarmAnimalCategoryId(value);
        return this;
    }

    @Override
    public FarmLodgingFodderMeasureReductionFactorsViewRecord value6(Short value) {
        setSubstanceId(value);
        return this;
    }

    @Override
    public FarmLodgingFodderMeasureReductionFactorsViewRecord value7(Float value) {
        setReductionFactorFloor(value);
        return this;
    }

    @Override
    public FarmLodgingFodderMeasureReductionFactorsViewRecord value8(Float value) {
        setReductionFactorCellar(value);
        return this;
    }

    @Override
    public FarmLodgingFodderMeasureReductionFactorsViewRecord value9(Float value) {
        setReductionFactorTotal(value);
        return this;
    }

    @Override
    public FarmLodgingFodderMeasureReductionFactorsViewRecord value10(Float value) {
        setProportionFloor(value);
        return this;
    }

    @Override
    public FarmLodgingFodderMeasureReductionFactorsViewRecord value11(Float value) {
        setProportionCellar(value);
        return this;
    }

    @Override
    public FarmLodgingFodderMeasureReductionFactorsViewRecord values(Integer value1, String value2, String value3, String value4, Integer value5, Short value6, Float value7, Float value8, Float value9, Float value10, Float value11) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        value9(value9);
        value10(value10);
        value11(value11);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached FarmLodgingFodderMeasureReductionFactorsViewRecord
     */
    public FarmLodgingFodderMeasureReductionFactorsViewRecord() {
        super(FarmLodgingFodderMeasureReductionFactorsView.FARM_LODGING_FODDER_MEASURE_REDUCTION_FACTORS_VIEW);
    }

    /**
     * Create a detached, initialised FarmLodgingFodderMeasureReductionFactorsViewRecord
     */
    public FarmLodgingFodderMeasureReductionFactorsViewRecord(Integer farmLodgingFodderMeasureId, String code, String name, String description, Integer farmAnimalCategoryId, Short substanceId, Float reductionFactorFloor, Float reductionFactorCellar, Float reductionFactorTotal, Float proportionFloor, Float proportionCellar) {
        super(FarmLodgingFodderMeasureReductionFactorsView.FARM_LODGING_FODDER_MEASURE_REDUCTION_FACTORS_VIEW);

        set(0, farmLodgingFodderMeasureId);
        set(1, code);
        set(2, name);
        set(3, description);
        set(4, farmAnimalCategoryId);
        set(5, substanceId);
        set(6, reductionFactorFloor);
        set(7, reductionFactorCellar);
        set(8, reductionFactorTotal);
        set(9, proportionFloor);
        set(10, proportionCellar);
    }
}
