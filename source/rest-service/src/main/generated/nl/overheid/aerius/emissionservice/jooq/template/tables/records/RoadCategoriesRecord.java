/*
 * This file is generated by jOOQ.
 */
package nl.overheid.aerius.emissionservice.jooq.template.tables.records;


import nl.overheid.aerius.emissionservice.jooq.public_.enums.RoadType;
import nl.overheid.aerius.emissionservice.jooq.public_.enums.VehicleType;
import nl.overheid.aerius.emissionservice.jooq.template.tables.RoadCategories;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record6;
import org.jooq.Row6;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * Tabel met daarin de verschillende soorten wegen en de verschillende type 
 * voertuigen op die wegen.
 * 
 * Dit zijn de standaard categorieen voor wegverkeer (bijv. personenauto's).
 * 
 * 
 * @file source/database/src/main/sql/template/02_emission_factors/02-tables/roads.sql
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class RoadCategoriesRecord extends UpdatableRecordImpl<RoadCategoriesRecord> implements Record6<Integer, Integer, RoadType, VehicleType, String, String> {

    private static final long serialVersionUID = -1847320892;

    /**
     * Setter for <code>template.road_categories.road_category_id</code>.
     */
    public void setRoadCategoryId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>template.road_categories.road_category_id</code>.
     */
    public Integer getRoadCategoryId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>template.road_categories.gcn_sector_id</code>.
     */
    public void setGcnSectorId(Integer value) {
        set(1, value);
    }

    /**
     * Getter for <code>template.road_categories.gcn_sector_id</code>.
     */
    public Integer getGcnSectorId() {
        return (Integer) get(1);
    }

    /**
     * Setter for <code>template.road_categories.road_type</code>.
     */
    public void setRoadType(RoadType value) {
        set(2, value);
    }

    /**
     * Getter for <code>template.road_categories.road_type</code>.
     */
    public RoadType getRoadType() {
        return (RoadType) get(2);
    }

    /**
     * Setter for <code>template.road_categories.vehicle_type</code>.
     */
    public void setVehicleType(VehicleType value) {
        set(3, value);
    }

    /**
     * Getter for <code>template.road_categories.vehicle_type</code>.
     */
    public VehicleType getVehicleType() {
        return (VehicleType) get(3);
    }

    /**
     * Setter for <code>template.road_categories.name</code>.
     */
    public void setName(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>template.road_categories.name</code>.
     */
    public String getName() {
        return (String) get(4);
    }

    /**
     * Setter for <code>template.road_categories.description</code>.
     */
    public void setDescription(String value) {
        set(5, value);
    }

    /**
     * Getter for <code>template.road_categories.description</code>.
     */
    public String getDescription() {
        return (String) get(5);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<Integer> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record6 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row6<Integer, Integer, RoadType, VehicleType, String, String> fieldsRow() {
        return (Row6) super.fieldsRow();
    }

    @Override
    public Row6<Integer, Integer, RoadType, VehicleType, String, String> valuesRow() {
        return (Row6) super.valuesRow();
    }

    @Override
    public Field<Integer> field1() {
        return RoadCategories.ROAD_CATEGORIES.ROAD_CATEGORY_ID;
    }

    @Override
    public Field<Integer> field2() {
        return RoadCategories.ROAD_CATEGORIES.GCN_SECTOR_ID;
    }

    @Override
    public Field<RoadType> field3() {
        return RoadCategories.ROAD_CATEGORIES.ROAD_TYPE;
    }

    @Override
    public Field<VehicleType> field4() {
        return RoadCategories.ROAD_CATEGORIES.VEHICLE_TYPE;
    }

    @Override
    public Field<String> field5() {
        return RoadCategories.ROAD_CATEGORIES.NAME;
    }

    @Override
    public Field<String> field6() {
        return RoadCategories.ROAD_CATEGORIES.DESCRIPTION;
    }

    @Override
    public Integer component1() {
        return getRoadCategoryId();
    }

    @Override
    public Integer component2() {
        return getGcnSectorId();
    }

    @Override
    public RoadType component3() {
        return getRoadType();
    }

    @Override
    public VehicleType component4() {
        return getVehicleType();
    }

    @Override
    public String component5() {
        return getName();
    }

    @Override
    public String component6() {
        return getDescription();
    }

    @Override
    public Integer value1() {
        return getRoadCategoryId();
    }

    @Override
    public Integer value2() {
        return getGcnSectorId();
    }

    @Override
    public RoadType value3() {
        return getRoadType();
    }

    @Override
    public VehicleType value4() {
        return getVehicleType();
    }

    @Override
    public String value5() {
        return getName();
    }

    @Override
    public String value6() {
        return getDescription();
    }

    @Override
    public RoadCategoriesRecord value1(Integer value) {
        setRoadCategoryId(value);
        return this;
    }

    @Override
    public RoadCategoriesRecord value2(Integer value) {
        setGcnSectorId(value);
        return this;
    }

    @Override
    public RoadCategoriesRecord value3(RoadType value) {
        setRoadType(value);
        return this;
    }

    @Override
    public RoadCategoriesRecord value4(VehicleType value) {
        setVehicleType(value);
        return this;
    }

    @Override
    public RoadCategoriesRecord value5(String value) {
        setName(value);
        return this;
    }

    @Override
    public RoadCategoriesRecord value6(String value) {
        setDescription(value);
        return this;
    }

    @Override
    public RoadCategoriesRecord values(Integer value1, Integer value2, RoadType value3, VehicleType value4, String value5, String value6) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached RoadCategoriesRecord
     */
    public RoadCategoriesRecord() {
        super(RoadCategories.ROAD_CATEGORIES);
    }

    /**
     * Create a detached, initialised RoadCategoriesRecord
     */
    public RoadCategoriesRecord(Integer roadCategoryId, Integer gcnSectorId, RoadType roadType, VehicleType vehicleType, String name, String description) {
        super(RoadCategories.ROAD_CATEGORIES);

        set(0, roadCategoryId);
        set(1, gcnSectorId);
        set(2, roadType);
        set(3, vehicleType);
        set(4, name);
        set(5, description);
    }
}
