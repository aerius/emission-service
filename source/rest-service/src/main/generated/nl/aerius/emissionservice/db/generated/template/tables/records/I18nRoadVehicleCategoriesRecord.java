/*
 * This file is generated by jOOQ.
 */
package nl.aerius.emissionservice.db.generated.template.tables.records;


import nl.aerius.emissionservice.db.generated.i18n.enums.LanguageCodeType;
import nl.aerius.emissionservice.db.generated.template.tables.I18nRoadVehicleCategories;

import org.jooq.Field;
import org.jooq.Record2;
import org.jooq.Record4;
import org.jooq.Row4;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * Translation table for road vehicle categories.
 * 
 * @file
 * source/database/src/main/sql/template/02-emission_factors/i18n/roads.sql
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class I18nRoadVehicleCategoriesRecord extends UpdatableRecordImpl<I18nRoadVehicleCategoriesRecord> implements Record4<Integer, LanguageCodeType, String, String> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for
     * <code>template.i18n_road_vehicle_categories.road_vehicle_category_id</code>.
     */
    public void setRoadVehicleCategoryId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for
     * <code>template.i18n_road_vehicle_categories.road_vehicle_category_id</code>.
     */
    public Integer getRoadVehicleCategoryId() {
        return (Integer) get(0);
    }

    /**
     * Setter for
     * <code>template.i18n_road_vehicle_categories.language_code</code>.
     */
    public void setLanguageCode(LanguageCodeType value) {
        set(1, value);
    }

    /**
     * Getter for
     * <code>template.i18n_road_vehicle_categories.language_code</code>.
     */
    public LanguageCodeType getLanguageCode() {
        return (LanguageCodeType) get(1);
    }

    /**
     * Setter for <code>template.i18n_road_vehicle_categories.name</code>.
     */
    public void setName(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>template.i18n_road_vehicle_categories.name</code>.
     */
    public String getName() {
        return (String) get(2);
    }

    /**
     * Setter for
     * <code>template.i18n_road_vehicle_categories.description</code>.
     */
    public void setDescription(String value) {
        set(3, value);
    }

    /**
     * Getter for
     * <code>template.i18n_road_vehicle_categories.description</code>.
     */
    public String getDescription() {
        return (String) get(3);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record2<Integer, LanguageCodeType> key() {
        return (Record2) super.key();
    }

    // -------------------------------------------------------------------------
    // Record4 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row4<Integer, LanguageCodeType, String, String> fieldsRow() {
        return (Row4) super.fieldsRow();
    }

    @Override
    public Row4<Integer, LanguageCodeType, String, String> valuesRow() {
        return (Row4) super.valuesRow();
    }

    @Override
    public Field<Integer> field1() {
        return I18nRoadVehicleCategories.I18N_ROAD_VEHICLE_CATEGORIES.ROAD_VEHICLE_CATEGORY_ID;
    }

    @Override
    public Field<LanguageCodeType> field2() {
        return I18nRoadVehicleCategories.I18N_ROAD_VEHICLE_CATEGORIES.LANGUAGE_CODE;
    }

    @Override
    public Field<String> field3() {
        return I18nRoadVehicleCategories.I18N_ROAD_VEHICLE_CATEGORIES.NAME;
    }

    @Override
    public Field<String> field4() {
        return I18nRoadVehicleCategories.I18N_ROAD_VEHICLE_CATEGORIES.DESCRIPTION;
    }

    @Override
    public Integer component1() {
        return getRoadVehicleCategoryId();
    }

    @Override
    public LanguageCodeType component2() {
        return getLanguageCode();
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
    public Integer value1() {
        return getRoadVehicleCategoryId();
    }

    @Override
    public LanguageCodeType value2() {
        return getLanguageCode();
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
    public I18nRoadVehicleCategoriesRecord value1(Integer value) {
        setRoadVehicleCategoryId(value);
        return this;
    }

    @Override
    public I18nRoadVehicleCategoriesRecord value2(LanguageCodeType value) {
        setLanguageCode(value);
        return this;
    }

    @Override
    public I18nRoadVehicleCategoriesRecord value3(String value) {
        setName(value);
        return this;
    }

    @Override
    public I18nRoadVehicleCategoriesRecord value4(String value) {
        setDescription(value);
        return this;
    }

    @Override
    public I18nRoadVehicleCategoriesRecord values(Integer value1, LanguageCodeType value2, String value3, String value4) {
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
     * Create a detached I18nRoadVehicleCategoriesRecord
     */
    public I18nRoadVehicleCategoriesRecord() {
        super(I18nRoadVehicleCategories.I18N_ROAD_VEHICLE_CATEGORIES);
    }

    /**
     * Create a detached, initialised I18nRoadVehicleCategoriesRecord
     */
    public I18nRoadVehicleCategoriesRecord(Integer roadVehicleCategoryId, LanguageCodeType languageCode, String name, String description) {
        super(I18nRoadVehicleCategories.I18N_ROAD_VEHICLE_CATEGORIES);

        setRoadVehicleCategoryId(roadVehicleCategoryId);
        setLanguageCode(languageCode);
        setName(name);
        setDescription(description);
    }
}