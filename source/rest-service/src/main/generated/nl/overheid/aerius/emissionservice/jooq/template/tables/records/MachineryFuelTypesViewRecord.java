/*
 * This file is generated by jOOQ.
 */
package nl.overheid.aerius.emissionservice.jooq.template.tables.records;


import nl.overheid.aerius.emissionservice.jooq.template.tables.MachineryFuelTypesView;

import org.jooq.Field;
import org.jooq.Record5;
import org.jooq.Row5;
import org.jooq.impl.TableRecordImpl;


/**
 * Geeft de brandstoffen terug voor de sectoren waar werktuigen voor beschikbaar 
 * zijn.
 * Hiermee kan werktuigtype "Anders" gegeneerd worden in de UI.
 * 
 * @file source/database/src/main/sql/template/02_emission_factors/04-views/machinery_types.sql
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class MachineryFuelTypesViewRecord extends TableRecordImpl<MachineryFuelTypesViewRecord> implements Record5<Integer, Integer, String, String, Float> {

    private static final long serialVersionUID = 1306326970;

    /**
     * Setter for <code>template.machinery_fuel_types_view.sector_id</code>.
     */
    public void setSectorId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>template.machinery_fuel_types_view.sector_id</code>.
     */
    public Integer getSectorId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>template.machinery_fuel_types_view.machinery_fuel_type_id</code>.
     */
    public void setMachineryFuelTypeId(Integer value) {
        set(1, value);
    }

    /**
     * Getter for <code>template.machinery_fuel_types_view.machinery_fuel_type_id</code>.
     */
    public Integer getMachineryFuelTypeId() {
        return (Integer) get(1);
    }

    /**
     * Setter for <code>template.machinery_fuel_types_view.fuel_code</code>.
     */
    public void setFuelCode(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>template.machinery_fuel_types_view.fuel_code</code>.
     */
    public String getFuelCode() {
        return (String) get(2);
    }

    /**
     * Setter for <code>template.machinery_fuel_types_view.fuel_name</code>.
     */
    public void setFuelName(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>template.machinery_fuel_types_view.fuel_name</code>.
     */
    public String getFuelName() {
        return (String) get(3);
    }

    /**
     * Setter for <code>template.machinery_fuel_types_view.fuel_density</code>.
     */
    public void setFuelDensity(Float value) {
        set(4, value);
    }

    /**
     * Getter for <code>template.machinery_fuel_types_view.fuel_density</code>.
     */
    public Float getFuelDensity() {
        return (Float) get(4);
    }

    // -------------------------------------------------------------------------
    // Record5 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row5<Integer, Integer, String, String, Float> fieldsRow() {
        return (Row5) super.fieldsRow();
    }

    @Override
    public Row5<Integer, Integer, String, String, Float> valuesRow() {
        return (Row5) super.valuesRow();
    }

    @Override
    public Field<Integer> field1() {
        return MachineryFuelTypesView.MACHINERY_FUEL_TYPES_VIEW.SECTOR_ID;
    }

    @Override
    public Field<Integer> field2() {
        return MachineryFuelTypesView.MACHINERY_FUEL_TYPES_VIEW.MACHINERY_FUEL_TYPE_ID;
    }

    @Override
    public Field<String> field3() {
        return MachineryFuelTypesView.MACHINERY_FUEL_TYPES_VIEW.FUEL_CODE;
    }

    @Override
    public Field<String> field4() {
        return MachineryFuelTypesView.MACHINERY_FUEL_TYPES_VIEW.FUEL_NAME;
    }

    @Override
    public Field<Float> field5() {
        return MachineryFuelTypesView.MACHINERY_FUEL_TYPES_VIEW.FUEL_DENSITY;
    }

    @Override
    public Integer component1() {
        return getSectorId();
    }

    @Override
    public Integer component2() {
        return getMachineryFuelTypeId();
    }

    @Override
    public String component3() {
        return getFuelCode();
    }

    @Override
    public String component4() {
        return getFuelName();
    }

    @Override
    public Float component5() {
        return getFuelDensity();
    }

    @Override
    public Integer value1() {
        return getSectorId();
    }

    @Override
    public Integer value2() {
        return getMachineryFuelTypeId();
    }

    @Override
    public String value3() {
        return getFuelCode();
    }

    @Override
    public String value4() {
        return getFuelName();
    }

    @Override
    public Float value5() {
        return getFuelDensity();
    }

    @Override
    public MachineryFuelTypesViewRecord value1(Integer value) {
        setSectorId(value);
        return this;
    }

    @Override
    public MachineryFuelTypesViewRecord value2(Integer value) {
        setMachineryFuelTypeId(value);
        return this;
    }

    @Override
    public MachineryFuelTypesViewRecord value3(String value) {
        setFuelCode(value);
        return this;
    }

    @Override
    public MachineryFuelTypesViewRecord value4(String value) {
        setFuelName(value);
        return this;
    }

    @Override
    public MachineryFuelTypesViewRecord value5(Float value) {
        setFuelDensity(value);
        return this;
    }

    @Override
    public MachineryFuelTypesViewRecord values(Integer value1, Integer value2, String value3, String value4, Float value5) {
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
     * Create a detached MachineryFuelTypesViewRecord
     */
    public MachineryFuelTypesViewRecord() {
        super(MachineryFuelTypesView.MACHINERY_FUEL_TYPES_VIEW);
    }

    /**
     * Create a detached, initialised MachineryFuelTypesViewRecord
     */
    public MachineryFuelTypesViewRecord(Integer sectorId, Integer machineryFuelTypeId, String fuelCode, String fuelName, Float fuelDensity) {
        super(MachineryFuelTypesView.MACHINERY_FUEL_TYPES_VIEW);

        set(0, sectorId);
        set(1, machineryFuelTypeId);
        set(2, fuelCode);
        set(3, fuelName);
        set(4, fuelDensity);
    }
}
