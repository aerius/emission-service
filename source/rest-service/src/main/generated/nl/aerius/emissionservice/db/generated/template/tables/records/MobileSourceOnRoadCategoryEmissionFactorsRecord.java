/*
 * This file is generated by jOOQ.
 */
package nl.aerius.emissionservice.db.generated.template.tables.records;


import nl.aerius.emissionservice.db.generated.template.tables.MobileSourceOnRoadCategoryEmissionFactors;

import org.jooq.Field;
import org.jooq.Record4;
import org.jooq.Record5;
import org.jooq.Row5;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * Table containing the emission factors for on road mobile source categories.
 * These emission factors are in kg/km/vehicle.
 * 
 * @file
 * source/database/src/main/sql/template/02-emission_factors/02-tables/roads.sql
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class MobileSourceOnRoadCategoryEmissionFactorsRecord extends UpdatableRecordImpl<MobileSourceOnRoadCategoryEmissionFactorsRecord> implements Record5<Short, Integer, Short, Short, Float> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for
     * <code>template.mobile_source_on_road_category_emission_factors.mobile_source_on_road_category_id</code>.
     */
    public void setMobileSourceOnRoadCategoryId(Short value) {
        set(0, value);
    }

    /**
     * Getter for
     * <code>template.mobile_source_on_road_category_emission_factors.mobile_source_on_road_category_id</code>.
     */
    public Short getMobileSourceOnRoadCategoryId() {
        return (Short) get(0);
    }

    /**
     * Setter for
     * <code>template.mobile_source_on_road_category_emission_factors.road_type_category_id</code>.
     */
    public void setRoadTypeCategoryId(Integer value) {
        set(1, value);
    }

    /**
     * Getter for
     * <code>template.mobile_source_on_road_category_emission_factors.road_type_category_id</code>.
     */
    public Integer getRoadTypeCategoryId() {
        return (Integer) get(1);
    }

    /**
     * Setter for
     * <code>template.mobile_source_on_road_category_emission_factors.year</code>.
     */
    public void setYear(Short value) {
        set(2, value);
    }

    /**
     * Getter for
     * <code>template.mobile_source_on_road_category_emission_factors.year</code>.
     */
    public Short getYear() {
        return (Short) get(2);
    }

    /**
     * Setter for
     * <code>template.mobile_source_on_road_category_emission_factors.substance_id</code>.
     */
    public void setSubstanceId(Short value) {
        set(3, value);
    }

    /**
     * Getter for
     * <code>template.mobile_source_on_road_category_emission_factors.substance_id</code>.
     */
    public Short getSubstanceId() {
        return (Short) get(3);
    }

    /**
     * Setter for
     * <code>template.mobile_source_on_road_category_emission_factors.emission_factor</code>.
     */
    public void setEmissionFactor(Float value) {
        set(4, value);
    }

    /**
     * Getter for
     * <code>template.mobile_source_on_road_category_emission_factors.emission_factor</code>.
     */
    public Float getEmissionFactor() {
        return (Float) get(4);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record4<Short, Integer, Short, Short> key() {
        return (Record4) super.key();
    }

    // -------------------------------------------------------------------------
    // Record5 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row5<Short, Integer, Short, Short, Float> fieldsRow() {
        return (Row5) super.fieldsRow();
    }

    @Override
    public Row5<Short, Integer, Short, Short, Float> valuesRow() {
        return (Row5) super.valuesRow();
    }

    @Override
    public Field<Short> field1() {
        return MobileSourceOnRoadCategoryEmissionFactors.MOBILE_SOURCE_ON_ROAD_CATEGORY_EMISSION_FACTORS.MOBILE_SOURCE_ON_ROAD_CATEGORY_ID;
    }

    @Override
    public Field<Integer> field2() {
        return MobileSourceOnRoadCategoryEmissionFactors.MOBILE_SOURCE_ON_ROAD_CATEGORY_EMISSION_FACTORS.ROAD_TYPE_CATEGORY_ID;
    }

    @Override
    public Field<Short> field3() {
        return MobileSourceOnRoadCategoryEmissionFactors.MOBILE_SOURCE_ON_ROAD_CATEGORY_EMISSION_FACTORS.YEAR;
    }

    @Override
    public Field<Short> field4() {
        return MobileSourceOnRoadCategoryEmissionFactors.MOBILE_SOURCE_ON_ROAD_CATEGORY_EMISSION_FACTORS.SUBSTANCE_ID;
    }

    @Override
    public Field<Float> field5() {
        return MobileSourceOnRoadCategoryEmissionFactors.MOBILE_SOURCE_ON_ROAD_CATEGORY_EMISSION_FACTORS.EMISSION_FACTOR;
    }

    @Override
    public Short component1() {
        return getMobileSourceOnRoadCategoryId();
    }

    @Override
    public Integer component2() {
        return getRoadTypeCategoryId();
    }

    @Override
    public Short component3() {
        return getYear();
    }

    @Override
    public Short component4() {
        return getSubstanceId();
    }

    @Override
    public Float component5() {
        return getEmissionFactor();
    }

    @Override
    public Short value1() {
        return getMobileSourceOnRoadCategoryId();
    }

    @Override
    public Integer value2() {
        return getRoadTypeCategoryId();
    }

    @Override
    public Short value3() {
        return getYear();
    }

    @Override
    public Short value4() {
        return getSubstanceId();
    }

    @Override
    public Float value5() {
        return getEmissionFactor();
    }

    @Override
    public MobileSourceOnRoadCategoryEmissionFactorsRecord value1(Short value) {
        setMobileSourceOnRoadCategoryId(value);
        return this;
    }

    @Override
    public MobileSourceOnRoadCategoryEmissionFactorsRecord value2(Integer value) {
        setRoadTypeCategoryId(value);
        return this;
    }

    @Override
    public MobileSourceOnRoadCategoryEmissionFactorsRecord value3(Short value) {
        setYear(value);
        return this;
    }

    @Override
    public MobileSourceOnRoadCategoryEmissionFactorsRecord value4(Short value) {
        setSubstanceId(value);
        return this;
    }

    @Override
    public MobileSourceOnRoadCategoryEmissionFactorsRecord value5(Float value) {
        setEmissionFactor(value);
        return this;
    }

    @Override
    public MobileSourceOnRoadCategoryEmissionFactorsRecord values(Short value1, Integer value2, Short value3, Short value4, Float value5) {
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
     * Create a detached MobileSourceOnRoadCategoryEmissionFactorsRecord
     */
    public MobileSourceOnRoadCategoryEmissionFactorsRecord() {
        super(MobileSourceOnRoadCategoryEmissionFactors.MOBILE_SOURCE_ON_ROAD_CATEGORY_EMISSION_FACTORS);
    }

    /**
     * Create a detached, initialised
     * MobileSourceOnRoadCategoryEmissionFactorsRecord
     */
    public MobileSourceOnRoadCategoryEmissionFactorsRecord(Short mobileSourceOnRoadCategoryId, Integer roadTypeCategoryId, Short year, Short substanceId, Float emissionFactor) {
        super(MobileSourceOnRoadCategoryEmissionFactors.MOBILE_SOURCE_ON_ROAD_CATEGORY_EMISSION_FACTORS);

        setMobileSourceOnRoadCategoryId(mobileSourceOnRoadCategoryId);
        setRoadTypeCategoryId(roadTypeCategoryId);
        setYear(year);
        setSubstanceId(substanceId);
        setEmissionFactor(emissionFactor);
    }
}
