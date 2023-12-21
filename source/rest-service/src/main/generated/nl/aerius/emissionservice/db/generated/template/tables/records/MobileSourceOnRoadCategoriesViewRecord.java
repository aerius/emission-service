/*
 * This file is generated by jOOQ.
 */
package nl.aerius.emissionservice.db.generated.template.tables.records;


import nl.aerius.emissionservice.db.generated.template.tables.MobileSourceOnRoadCategoriesView;

import org.jooq.Field;
import org.jooq.Record8;
import org.jooq.Row8;
import org.jooq.impl.TableRecordImpl;


/**
 * View returning the on road mobile source categories.
 * 
 * @file
 * source/database/src/main/sql/template/02-emission_factors/04-views/roads.sql
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class MobileSourceOnRoadCategoriesViewRecord extends TableRecordImpl<MobileSourceOnRoadCategoriesViewRecord> implements Record8<Short, String, String, String, String, Short, Short, Float> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for
     * <code>template.mobile_source_on_road_categories_view.mobile_source_on_road_category_id</code>.
     */
    public void setMobileSourceOnRoadCategoryId(Short value) {
        set(0, value);
    }

    /**
     * Getter for
     * <code>template.mobile_source_on_road_categories_view.mobile_source_on_road_category_id</code>.
     */
    public Short getMobileSourceOnRoadCategoryId() {
        return (Short) get(0);
    }

    /**
     * Setter for
     * <code>template.mobile_source_on_road_categories_view.code</code>.
     */
    public void setCode(String value) {
        set(1, value);
    }

    /**
     * Getter for
     * <code>template.mobile_source_on_road_categories_view.code</code>.
     */
    public String getCode() {
        return (String) get(1);
    }

    /**
     * Setter for
     * <code>template.mobile_source_on_road_categories_view.name</code>.
     */
    public void setName(String value) {
        set(2, value);
    }

    /**
     * Getter for
     * <code>template.mobile_source_on_road_categories_view.name</code>.
     */
    public String getName() {
        return (String) get(2);
    }

    /**
     * Setter for
     * <code>template.mobile_source_on_road_categories_view.road_type_code</code>.
     */
    public void setRoadTypeCode(String value) {
        set(3, value);
    }

    /**
     * Getter for
     * <code>template.mobile_source_on_road_categories_view.road_type_code</code>.
     */
    public String getRoadTypeCode() {
        return (String) get(3);
    }

    /**
     * Setter for
     * <code>template.mobile_source_on_road_categories_view.road_type_name</code>.
     */
    public void setRoadTypeName(String value) {
        set(4, value);
    }

    /**
     * Getter for
     * <code>template.mobile_source_on_road_categories_view.road_type_name</code>.
     */
    public String getRoadTypeName() {
        return (String) get(4);
    }

    /**
     * Setter for
     * <code>template.mobile_source_on_road_categories_view.year</code>.
     */
    public void setYear(Short value) {
        set(5, value);
    }

    /**
     * Getter for
     * <code>template.mobile_source_on_road_categories_view.year</code>.
     */
    public Short getYear() {
        return (Short) get(5);
    }

    /**
     * Setter for
     * <code>template.mobile_source_on_road_categories_view.substance_id</code>.
     */
    public void setSubstanceId(Short value) {
        set(6, value);
    }

    /**
     * Getter for
     * <code>template.mobile_source_on_road_categories_view.substance_id</code>.
     */
    public Short getSubstanceId() {
        return (Short) get(6);
    }

    /**
     * Setter for
     * <code>template.mobile_source_on_road_categories_view.emission_factor</code>.
     */
    public void setEmissionFactor(Float value) {
        set(7, value);
    }

    /**
     * Getter for
     * <code>template.mobile_source_on_road_categories_view.emission_factor</code>.
     */
    public Float getEmissionFactor() {
        return (Float) get(7);
    }

    // -------------------------------------------------------------------------
    // Record8 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row8<Short, String, String, String, String, Short, Short, Float> fieldsRow() {
        return (Row8) super.fieldsRow();
    }

    @Override
    public Row8<Short, String, String, String, String, Short, Short, Float> valuesRow() {
        return (Row8) super.valuesRow();
    }

    @Override
    public Field<Short> field1() {
        return MobileSourceOnRoadCategoriesView.MOBILE_SOURCE_ON_ROAD_CATEGORIES_VIEW.MOBILE_SOURCE_ON_ROAD_CATEGORY_ID;
    }

    @Override
    public Field<String> field2() {
        return MobileSourceOnRoadCategoriesView.MOBILE_SOURCE_ON_ROAD_CATEGORIES_VIEW.CODE;
    }

    @Override
    public Field<String> field3() {
        return MobileSourceOnRoadCategoriesView.MOBILE_SOURCE_ON_ROAD_CATEGORIES_VIEW.NAME;
    }

    @Override
    public Field<String> field4() {
        return MobileSourceOnRoadCategoriesView.MOBILE_SOURCE_ON_ROAD_CATEGORIES_VIEW.ROAD_TYPE_CODE;
    }

    @Override
    public Field<String> field5() {
        return MobileSourceOnRoadCategoriesView.MOBILE_SOURCE_ON_ROAD_CATEGORIES_VIEW.ROAD_TYPE_NAME;
    }

    @Override
    public Field<Short> field6() {
        return MobileSourceOnRoadCategoriesView.MOBILE_SOURCE_ON_ROAD_CATEGORIES_VIEW.YEAR;
    }

    @Override
    public Field<Short> field7() {
        return MobileSourceOnRoadCategoriesView.MOBILE_SOURCE_ON_ROAD_CATEGORIES_VIEW.SUBSTANCE_ID;
    }

    @Override
    public Field<Float> field8() {
        return MobileSourceOnRoadCategoriesView.MOBILE_SOURCE_ON_ROAD_CATEGORIES_VIEW.EMISSION_FACTOR;
    }

    @Override
    public Short component1() {
        return getMobileSourceOnRoadCategoryId();
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
        return getRoadTypeCode();
    }

    @Override
    public String component5() {
        return getRoadTypeName();
    }

    @Override
    public Short component6() {
        return getYear();
    }

    @Override
    public Short component7() {
        return getSubstanceId();
    }

    @Override
    public Float component8() {
        return getEmissionFactor();
    }

    @Override
    public Short value1() {
        return getMobileSourceOnRoadCategoryId();
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
        return getRoadTypeCode();
    }

    @Override
    public String value5() {
        return getRoadTypeName();
    }

    @Override
    public Short value6() {
        return getYear();
    }

    @Override
    public Short value7() {
        return getSubstanceId();
    }

    @Override
    public Float value8() {
        return getEmissionFactor();
    }

    @Override
    public MobileSourceOnRoadCategoriesViewRecord value1(Short value) {
        setMobileSourceOnRoadCategoryId(value);
        return this;
    }

    @Override
    public MobileSourceOnRoadCategoriesViewRecord value2(String value) {
        setCode(value);
        return this;
    }

    @Override
    public MobileSourceOnRoadCategoriesViewRecord value3(String value) {
        setName(value);
        return this;
    }

    @Override
    public MobileSourceOnRoadCategoriesViewRecord value4(String value) {
        setRoadTypeCode(value);
        return this;
    }

    @Override
    public MobileSourceOnRoadCategoriesViewRecord value5(String value) {
        setRoadTypeName(value);
        return this;
    }

    @Override
    public MobileSourceOnRoadCategoriesViewRecord value6(Short value) {
        setYear(value);
        return this;
    }

    @Override
    public MobileSourceOnRoadCategoriesViewRecord value7(Short value) {
        setSubstanceId(value);
        return this;
    }

    @Override
    public MobileSourceOnRoadCategoriesViewRecord value8(Float value) {
        setEmissionFactor(value);
        return this;
    }

    @Override
    public MobileSourceOnRoadCategoriesViewRecord values(Short value1, String value2, String value3, String value4, String value5, Short value6, Short value7, Float value8) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached MobileSourceOnRoadCategoriesViewRecord
     */
    public MobileSourceOnRoadCategoriesViewRecord() {
        super(MobileSourceOnRoadCategoriesView.MOBILE_SOURCE_ON_ROAD_CATEGORIES_VIEW);
    }

    /**
     * Create a detached, initialised MobileSourceOnRoadCategoriesViewRecord
     */
    public MobileSourceOnRoadCategoriesViewRecord(Short mobileSourceOnRoadCategoryId, String code, String name, String roadTypeCode, String roadTypeName, Short year, Short substanceId, Float emissionFactor) {
        super(MobileSourceOnRoadCategoriesView.MOBILE_SOURCE_ON_ROAD_CATEGORIES_VIEW);

        setMobileSourceOnRoadCategoryId(mobileSourceOnRoadCategoryId);
        setCode(code);
        setName(name);
        setRoadTypeCode(roadTypeCode);
        setRoadTypeName(roadTypeName);
        setYear(year);
        setSubstanceId(substanceId);
        setEmissionFactor(emissionFactor);
    }
}