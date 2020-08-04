/*
 * This file is generated by jOOQ.
 */
package nl.overheid.aerius.emissionservice.jooq.template.tables.records;


import nl.overheid.aerius.emissionservice.jooq.template.tables.MobileSourceOffRoadCategoryIdleProperties;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record4;
import org.jooq.Row4;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * Eigenschappen per stageklasse die nodig zijn om de stationaire emissie 
 * te berekenen (onafhankelijk van de stof).
 * 
 * Niet voor alle stageklasses zijn stationaire emissieberekeningen mogelijk, 
 * in dat geval ontbreekt het record.
 * 
 * @column power_min Vmin, minimaal vermogen binnen de opgegeven stage-klasse 
 * (KW)
 * @column power_max Vmax, maximaal vermogen binnen de opgegeven stage-klasse 
 * (KW)
 * @column fuel_consumption_idle GBS_plci, liter brandstof verbruik stationair 
 * per uur per liter cilinder-inhoud (l/l/uur)
 * 
 * @file source/database/src/main/sql/template/02_emission_factors/02-tables/mobile_sources.sql
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class MobileSourceOffRoadCategoryIdlePropertiesRecord extends UpdatableRecordImpl<MobileSourceOffRoadCategoryIdlePropertiesRecord> implements Record4<Short, Float, Float, Float> {

    private static final long serialVersionUID = -1489504653;

    /**
     * Setter for <code>template.mobile_source_off_road_category_idle_properties.mobile_source_off_road_category_id</code>.
     */
    public void setMobileSourceOffRoadCategoryId(Short value) {
        set(0, value);
    }

    /**
     * Getter for <code>template.mobile_source_off_road_category_idle_properties.mobile_source_off_road_category_id</code>.
     */
    public Short getMobileSourceOffRoadCategoryId() {
        return (Short) get(0);
    }

    /**
     * Setter for <code>template.mobile_source_off_road_category_idle_properties.power_min</code>.
     */
    public void setPowerMin(Float value) {
        set(1, value);
    }

    /**
     * Getter for <code>template.mobile_source_off_road_category_idle_properties.power_min</code>.
     */
    public Float getPowerMin() {
        return (Float) get(1);
    }

    /**
     * Setter for <code>template.mobile_source_off_road_category_idle_properties.power_max</code>.
     */
    public void setPowerMax(Float value) {
        set(2, value);
    }

    /**
     * Getter for <code>template.mobile_source_off_road_category_idle_properties.power_max</code>.
     */
    public Float getPowerMax() {
        return (Float) get(2);
    }

    /**
     * Setter for <code>template.mobile_source_off_road_category_idle_properties.fuel_consumption_idle</code>.
     */
    public void setFuelConsumptionIdle(Float value) {
        set(3, value);
    }

    /**
     * Getter for <code>template.mobile_source_off_road_category_idle_properties.fuel_consumption_idle</code>.
     */
    public Float getFuelConsumptionIdle() {
        return (Float) get(3);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<Short> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record4 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row4<Short, Float, Float, Float> fieldsRow() {
        return (Row4) super.fieldsRow();
    }

    @Override
    public Row4<Short, Float, Float, Float> valuesRow() {
        return (Row4) super.valuesRow();
    }

    @Override
    public Field<Short> field1() {
        return MobileSourceOffRoadCategoryIdleProperties.MOBILE_SOURCE_OFF_ROAD_CATEGORY_IDLE_PROPERTIES.MOBILE_SOURCE_OFF_ROAD_CATEGORY_ID;
    }

    @Override
    public Field<Float> field2() {
        return MobileSourceOffRoadCategoryIdleProperties.MOBILE_SOURCE_OFF_ROAD_CATEGORY_IDLE_PROPERTIES.POWER_MIN;
    }

    @Override
    public Field<Float> field3() {
        return MobileSourceOffRoadCategoryIdleProperties.MOBILE_SOURCE_OFF_ROAD_CATEGORY_IDLE_PROPERTIES.POWER_MAX;
    }

    @Override
    public Field<Float> field4() {
        return MobileSourceOffRoadCategoryIdleProperties.MOBILE_SOURCE_OFF_ROAD_CATEGORY_IDLE_PROPERTIES.FUEL_CONSUMPTION_IDLE;
    }

    @Override
    public Short component1() {
        return getMobileSourceOffRoadCategoryId();
    }

    @Override
    public Float component2() {
        return getPowerMin();
    }

    @Override
    public Float component3() {
        return getPowerMax();
    }

    @Override
    public Float component4() {
        return getFuelConsumptionIdle();
    }

    @Override
    public Short value1() {
        return getMobileSourceOffRoadCategoryId();
    }

    @Override
    public Float value2() {
        return getPowerMin();
    }

    @Override
    public Float value3() {
        return getPowerMax();
    }

    @Override
    public Float value4() {
        return getFuelConsumptionIdle();
    }

    @Override
    public MobileSourceOffRoadCategoryIdlePropertiesRecord value1(Short value) {
        setMobileSourceOffRoadCategoryId(value);
        return this;
    }

    @Override
    public MobileSourceOffRoadCategoryIdlePropertiesRecord value2(Float value) {
        setPowerMin(value);
        return this;
    }

    @Override
    public MobileSourceOffRoadCategoryIdlePropertiesRecord value3(Float value) {
        setPowerMax(value);
        return this;
    }

    @Override
    public MobileSourceOffRoadCategoryIdlePropertiesRecord value4(Float value) {
        setFuelConsumptionIdle(value);
        return this;
    }

    @Override
    public MobileSourceOffRoadCategoryIdlePropertiesRecord values(Short value1, Float value2, Float value3, Float value4) {
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
     * Create a detached MobileSourceOffRoadCategoryIdlePropertiesRecord
     */
    public MobileSourceOffRoadCategoryIdlePropertiesRecord() {
        super(MobileSourceOffRoadCategoryIdleProperties.MOBILE_SOURCE_OFF_ROAD_CATEGORY_IDLE_PROPERTIES);
    }

    /**
     * Create a detached, initialised MobileSourceOffRoadCategoryIdlePropertiesRecord
     */
    public MobileSourceOffRoadCategoryIdlePropertiesRecord(Short mobileSourceOffRoadCategoryId, Float powerMin, Float powerMax, Float fuelConsumptionIdle) {
        super(MobileSourceOffRoadCategoryIdleProperties.MOBILE_SOURCE_OFF_ROAD_CATEGORY_IDLE_PROPERTIES);

        set(0, mobileSourceOffRoadCategoryId);
        set(1, powerMin);
        set(2, powerMax);
        set(3, fuelConsumptionIdle);
    }
}
