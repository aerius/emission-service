/*
 * This file is generated by jOOQ.
 */
package nl.overheid.aerius.emissionservice.jooq.template.tables.records;


import nl.overheid.aerius.emissionservice.jooq.public_.enums.RoadType;
import nl.overheid.aerius.emissionservice.jooq.template.tables.MobileSourceOnRoadCategoryEmissionFactors;

import org.jooq.Field;
import org.jooq.Record3;
import org.jooq.Record4;
import org.jooq.Row4;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * De emissie factoren voor verschillende soorten onroad mobiele bronnen.
 * 
 * De emissie factoren zijn hier in kg/km/voertuig.
 * 
 * @file source/database/src/main/sql/template/02_emission_factors/02-tables/mobile_sources.sql
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class MobileSourceOnRoadCategoryEmissionFactorsRecord extends UpdatableRecordImpl<MobileSourceOnRoadCategoryEmissionFactorsRecord> implements Record4<Short, RoadType, Short, Float> {

    private static final long serialVersionUID = -1619194646;

    /**
     * Setter for <code>template.mobile_source_on_road_category_emission_factors.mobile_source_on_road_category_id</code>.
     */
    public void setMobileSourceOnRoadCategoryId(Short value) {
        set(0, value);
    }

    /**
     * Getter for <code>template.mobile_source_on_road_category_emission_factors.mobile_source_on_road_category_id</code>.
     */
    public Short getMobileSourceOnRoadCategoryId() {
        return (Short) get(0);
    }

    /**
     * Setter for <code>template.mobile_source_on_road_category_emission_factors.road_type</code>.
     */
    public void setRoadType(RoadType value) {
        set(1, value);
    }

    /**
     * Getter for <code>template.mobile_source_on_road_category_emission_factors.road_type</code>.
     */
    public RoadType getRoadType() {
        return (RoadType) get(1);
    }

    /**
     * Setter for <code>template.mobile_source_on_road_category_emission_factors.substance_id</code>.
     */
    public void setSubstanceId(Short value) {
        set(2, value);
    }

    /**
     * Getter for <code>template.mobile_source_on_road_category_emission_factors.substance_id</code>.
     */
    public Short getSubstanceId() {
        return (Short) get(2);
    }

    /**
     * Setter for <code>template.mobile_source_on_road_category_emission_factors.emission_factor</code>.
     */
    public void setEmissionFactor(Float value) {
        set(3, value);
    }

    /**
     * Getter for <code>template.mobile_source_on_road_category_emission_factors.emission_factor</code>.
     */
    public Float getEmissionFactor() {
        return (Float) get(3);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record3<Short, RoadType, Short> key() {
        return (Record3) super.key();
    }

    // -------------------------------------------------------------------------
    // Record4 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row4<Short, RoadType, Short, Float> fieldsRow() {
        return (Row4) super.fieldsRow();
    }

    @Override
    public Row4<Short, RoadType, Short, Float> valuesRow() {
        return (Row4) super.valuesRow();
    }

    @Override
    public Field<Short> field1() {
        return MobileSourceOnRoadCategoryEmissionFactors.MOBILE_SOURCE_ON_ROAD_CATEGORY_EMISSION_FACTORS.MOBILE_SOURCE_ON_ROAD_CATEGORY_ID;
    }

    @Override
    public Field<RoadType> field2() {
        return MobileSourceOnRoadCategoryEmissionFactors.MOBILE_SOURCE_ON_ROAD_CATEGORY_EMISSION_FACTORS.ROAD_TYPE;
    }

    @Override
    public Field<Short> field3() {
        return MobileSourceOnRoadCategoryEmissionFactors.MOBILE_SOURCE_ON_ROAD_CATEGORY_EMISSION_FACTORS.SUBSTANCE_ID;
    }

    @Override
    public Field<Float> field4() {
        return MobileSourceOnRoadCategoryEmissionFactors.MOBILE_SOURCE_ON_ROAD_CATEGORY_EMISSION_FACTORS.EMISSION_FACTOR;
    }

    @Override
    public Short component1() {
        return getMobileSourceOnRoadCategoryId();
    }

    @Override
    public RoadType component2() {
        return getRoadType();
    }

    @Override
    public Short component3() {
        return getSubstanceId();
    }

    @Override
    public Float component4() {
        return getEmissionFactor();
    }

    @Override
    public Short value1() {
        return getMobileSourceOnRoadCategoryId();
    }

    @Override
    public RoadType value2() {
        return getRoadType();
    }

    @Override
    public Short value3() {
        return getSubstanceId();
    }

    @Override
    public Float value4() {
        return getEmissionFactor();
    }

    @Override
    public MobileSourceOnRoadCategoryEmissionFactorsRecord value1(Short value) {
        setMobileSourceOnRoadCategoryId(value);
        return this;
    }

    @Override
    public MobileSourceOnRoadCategoryEmissionFactorsRecord value2(RoadType value) {
        setRoadType(value);
        return this;
    }

    @Override
    public MobileSourceOnRoadCategoryEmissionFactorsRecord value3(Short value) {
        setSubstanceId(value);
        return this;
    }

    @Override
    public MobileSourceOnRoadCategoryEmissionFactorsRecord value4(Float value) {
        setEmissionFactor(value);
        return this;
    }

    @Override
    public MobileSourceOnRoadCategoryEmissionFactorsRecord values(Short value1, RoadType value2, Short value3, Float value4) {
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
     * Create a detached MobileSourceOnRoadCategoryEmissionFactorsRecord
     */
    public MobileSourceOnRoadCategoryEmissionFactorsRecord() {
        super(MobileSourceOnRoadCategoryEmissionFactors.MOBILE_SOURCE_ON_ROAD_CATEGORY_EMISSION_FACTORS);
    }

    /**
     * Create a detached, initialised MobileSourceOnRoadCategoryEmissionFactorsRecord
     */
    public MobileSourceOnRoadCategoryEmissionFactorsRecord(Short mobileSourceOnRoadCategoryId, RoadType roadType, Short substanceId, Float emissionFactor) {
        super(MobileSourceOnRoadCategoryEmissionFactors.MOBILE_SOURCE_ON_ROAD_CATEGORY_EMISSION_FACTORS);

        set(0, mobileSourceOnRoadCategoryId);
        set(1, roadType);
        set(2, substanceId);
        set(3, emissionFactor);
    }
}
