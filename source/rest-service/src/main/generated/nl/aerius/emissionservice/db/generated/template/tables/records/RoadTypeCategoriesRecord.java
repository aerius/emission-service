/*
 * This file is generated by jOOQ.
 */
package nl.aerius.emissionservice.db.generated.template.tables.records;


import nl.aerius.emissionservice.db.generated.template.tables.RoadTypeCategories;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record3;
import org.jooq.Row3;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * Table containing the different road type categories.
 * 
 * @file
 * source/database/src/main/sql/template/02-emission_factors/02-tables/roads.sql
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class RoadTypeCategoriesRecord extends UpdatableRecordImpl<RoadTypeCategoriesRecord> implements Record3<Integer, String, String> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for
     * <code>template.road_type_categories.road_type_category_id</code>.
     */
    public void setRoadTypeCategoryId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for
     * <code>template.road_type_categories.road_type_category_id</code>.
     */
    public Integer getRoadTypeCategoryId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>template.road_type_categories.code</code>.
     */
    public void setCode(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>template.road_type_categories.code</code>.
     */
    public String getCode() {
        return (String) get(1);
    }

    /**
     * Setter for <code>template.road_type_categories.name</code>.
     */
    public void setName(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>template.road_type_categories.name</code>.
     */
    public String getName() {
        return (String) get(2);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<Integer> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record3 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row3<Integer, String, String> fieldsRow() {
        return (Row3) super.fieldsRow();
    }

    @Override
    public Row3<Integer, String, String> valuesRow() {
        return (Row3) super.valuesRow();
    }

    @Override
    public Field<Integer> field1() {
        return RoadTypeCategories.ROAD_TYPE_CATEGORIES.ROAD_TYPE_CATEGORY_ID;
    }

    @Override
    public Field<String> field2() {
        return RoadTypeCategories.ROAD_TYPE_CATEGORIES.CODE;
    }

    @Override
    public Field<String> field3() {
        return RoadTypeCategories.ROAD_TYPE_CATEGORIES.NAME;
    }

    @Override
    public Integer component1() {
        return getRoadTypeCategoryId();
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
    public Integer value1() {
        return getRoadTypeCategoryId();
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
    public RoadTypeCategoriesRecord value1(Integer value) {
        setRoadTypeCategoryId(value);
        return this;
    }

    @Override
    public RoadTypeCategoriesRecord value2(String value) {
        setCode(value);
        return this;
    }

    @Override
    public RoadTypeCategoriesRecord value3(String value) {
        setName(value);
        return this;
    }

    @Override
    public RoadTypeCategoriesRecord values(Integer value1, String value2, String value3) {
        value1(value1);
        value2(value2);
        value3(value3);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached RoadTypeCategoriesRecord
     */
    public RoadTypeCategoriesRecord() {
        super(RoadTypeCategories.ROAD_TYPE_CATEGORIES);
    }

    /**
     * Create a detached, initialised RoadTypeCategoriesRecord
     */
    public RoadTypeCategoriesRecord(Integer roadTypeCategoryId, String code, String name) {
        super(RoadTypeCategories.ROAD_TYPE_CATEGORIES);

        setRoadTypeCategoryId(roadTypeCategoryId);
        setCode(code);
        setName(name);
    }
}