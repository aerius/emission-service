/*
 * This file is generated by jOOQ.
 */
package nl.aerius.emissionservice.db.generated.template.tables.records;


import nl.aerius.emissionservice.db.generated.public_.enums.ShippingMovementType;
import nl.aerius.emissionservice.db.generated.template.tables.ShippingMaritimeSourceCharacteristicsView;

import org.jooq.Field;
import org.jooq.Record9;
import org.jooq.Row9;
import org.jooq.impl.TableRecordImpl;


/**
 * View returning the emission characteristics for maritime shipping.
 * 
 * @file
 * source/database/src/main/sql/template/02-emission_factors/04-views/shipping_maritime.sql
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class ShippingMaritimeSourceCharacteristicsViewRecord extends TableRecordImpl<ShippingMaritimeSourceCharacteristicsViewRecord> implements Record9<Short, Short, ShippingMovementType, Integer, Float, Float, Float, Integer, String> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for
     * <code>template.shipping_maritime_source_characteristics_view.shipping_maritime_category_id</code>.
     */
    public void setShippingMaritimeCategoryId(Short value) {
        set(0, value);
    }

    /**
     * Getter for
     * <code>template.shipping_maritime_source_characteristics_view.shipping_maritime_category_id</code>.
     */
    public Short getShippingMaritimeCategoryId() {
        return (Short) get(0);
    }

    /**
     * Setter for
     * <code>template.shipping_maritime_source_characteristics_view.year</code>.
     */
    public void setYear(Short value) {
        set(1, value);
    }

    /**
     * Getter for
     * <code>template.shipping_maritime_source_characteristics_view.year</code>.
     */
    public Short getYear() {
        return (Short) get(1);
    }

    /**
     * Setter for
     * <code>template.shipping_maritime_source_characteristics_view.movement_type</code>.
     */
    public void setMovementType(ShippingMovementType value) {
        set(2, value);
    }

    /**
     * Getter for
     * <code>template.shipping_maritime_source_characteristics_view.movement_type</code>.
     */
    public ShippingMovementType getMovementType() {
        return (ShippingMovementType) get(2);
    }

    /**
     * Setter for
     * <code>template.shipping_maritime_source_characteristics_view.gcn_sector_id</code>.
     */
    public void setGcnSectorId(Integer value) {
        set(3, value);
    }

    /**
     * Getter for
     * <code>template.shipping_maritime_source_characteristics_view.gcn_sector_id</code>.
     */
    public Integer getGcnSectorId() {
        return (Integer) get(3);
    }

    /**
     * Setter for
     * <code>template.shipping_maritime_source_characteristics_view.heat_content</code>.
     */
    public void setHeatContent(Float value) {
        set(4, value);
    }

    /**
     * Getter for
     * <code>template.shipping_maritime_source_characteristics_view.heat_content</code>.
     */
    public Float getHeatContent() {
        return (Float) get(4);
    }

    /**
     * Setter for
     * <code>template.shipping_maritime_source_characteristics_view.height</code>.
     */
    public void setHeight(Float value) {
        set(5, value);
    }

    /**
     * Getter for
     * <code>template.shipping_maritime_source_characteristics_view.height</code>.
     */
    public Float getHeight() {
        return (Float) get(5);
    }

    /**
     * Setter for
     * <code>template.shipping_maritime_source_characteristics_view.spread</code>.
     */
    public void setSpread(Float value) {
        set(6, value);
    }

    /**
     * Getter for
     * <code>template.shipping_maritime_source_characteristics_view.spread</code>.
     */
    public Float getSpread() {
        return (Float) get(6);
    }

    /**
     * Setter for
     * <code>template.shipping_maritime_source_characteristics_view.emission_diurnal_variation_id</code>.
     */
    public void setEmissionDiurnalVariationId(Integer value) {
        set(7, value);
    }

    /**
     * Getter for
     * <code>template.shipping_maritime_source_characteristics_view.emission_diurnal_variation_id</code>.
     */
    public Integer getEmissionDiurnalVariationId() {
        return (Integer) get(7);
    }

    /**
     * Setter for
     * <code>template.shipping_maritime_source_characteristics_view.emission_diurnal_variation_code</code>.
     */
    public void setEmissionDiurnalVariationCode(String value) {
        set(8, value);
    }

    /**
     * Getter for
     * <code>template.shipping_maritime_source_characteristics_view.emission_diurnal_variation_code</code>.
     */
    public String getEmissionDiurnalVariationCode() {
        return (String) get(8);
    }

    // -------------------------------------------------------------------------
    // Record9 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row9<Short, Short, ShippingMovementType, Integer, Float, Float, Float, Integer, String> fieldsRow() {
        return (Row9) super.fieldsRow();
    }

    @Override
    public Row9<Short, Short, ShippingMovementType, Integer, Float, Float, Float, Integer, String> valuesRow() {
        return (Row9) super.valuesRow();
    }

    @Override
    public Field<Short> field1() {
        return ShippingMaritimeSourceCharacteristicsView.SHIPPING_MARITIME_SOURCE_CHARACTERISTICS_VIEW.SHIPPING_MARITIME_CATEGORY_ID;
    }

    @Override
    public Field<Short> field2() {
        return ShippingMaritimeSourceCharacteristicsView.SHIPPING_MARITIME_SOURCE_CHARACTERISTICS_VIEW.YEAR;
    }

    @Override
    public Field<ShippingMovementType> field3() {
        return ShippingMaritimeSourceCharacteristicsView.SHIPPING_MARITIME_SOURCE_CHARACTERISTICS_VIEW.MOVEMENT_TYPE;
    }

    @Override
    public Field<Integer> field4() {
        return ShippingMaritimeSourceCharacteristicsView.SHIPPING_MARITIME_SOURCE_CHARACTERISTICS_VIEW.GCN_SECTOR_ID;
    }

    @Override
    public Field<Float> field5() {
        return ShippingMaritimeSourceCharacteristicsView.SHIPPING_MARITIME_SOURCE_CHARACTERISTICS_VIEW.HEAT_CONTENT;
    }

    @Override
    public Field<Float> field6() {
        return ShippingMaritimeSourceCharacteristicsView.SHIPPING_MARITIME_SOURCE_CHARACTERISTICS_VIEW.HEIGHT;
    }

    @Override
    public Field<Float> field7() {
        return ShippingMaritimeSourceCharacteristicsView.SHIPPING_MARITIME_SOURCE_CHARACTERISTICS_VIEW.SPREAD;
    }

    @Override
    public Field<Integer> field8() {
        return ShippingMaritimeSourceCharacteristicsView.SHIPPING_MARITIME_SOURCE_CHARACTERISTICS_VIEW.EMISSION_DIURNAL_VARIATION_ID;
    }

    @Override
    public Field<String> field9() {
        return ShippingMaritimeSourceCharacteristicsView.SHIPPING_MARITIME_SOURCE_CHARACTERISTICS_VIEW.EMISSION_DIURNAL_VARIATION_CODE;
    }

    @Override
    public Short component1() {
        return getShippingMaritimeCategoryId();
    }

    @Override
    public Short component2() {
        return getYear();
    }

    @Override
    public ShippingMovementType component3() {
        return getMovementType();
    }

    @Override
    public Integer component4() {
        return getGcnSectorId();
    }

    @Override
    public Float component5() {
        return getHeatContent();
    }

    @Override
    public Float component6() {
        return getHeight();
    }

    @Override
    public Float component7() {
        return getSpread();
    }

    @Override
    public Integer component8() {
        return getEmissionDiurnalVariationId();
    }

    @Override
    public String component9() {
        return getEmissionDiurnalVariationCode();
    }

    @Override
    public Short value1() {
        return getShippingMaritimeCategoryId();
    }

    @Override
    public Short value2() {
        return getYear();
    }

    @Override
    public ShippingMovementType value3() {
        return getMovementType();
    }

    @Override
    public Integer value4() {
        return getGcnSectorId();
    }

    @Override
    public Float value5() {
        return getHeatContent();
    }

    @Override
    public Float value6() {
        return getHeight();
    }

    @Override
    public Float value7() {
        return getSpread();
    }

    @Override
    public Integer value8() {
        return getEmissionDiurnalVariationId();
    }

    @Override
    public String value9() {
        return getEmissionDiurnalVariationCode();
    }

    @Override
    public ShippingMaritimeSourceCharacteristicsViewRecord value1(Short value) {
        setShippingMaritimeCategoryId(value);
        return this;
    }

    @Override
    public ShippingMaritimeSourceCharacteristicsViewRecord value2(Short value) {
        setYear(value);
        return this;
    }

    @Override
    public ShippingMaritimeSourceCharacteristicsViewRecord value3(ShippingMovementType value) {
        setMovementType(value);
        return this;
    }

    @Override
    public ShippingMaritimeSourceCharacteristicsViewRecord value4(Integer value) {
        setGcnSectorId(value);
        return this;
    }

    @Override
    public ShippingMaritimeSourceCharacteristicsViewRecord value5(Float value) {
        setHeatContent(value);
        return this;
    }

    @Override
    public ShippingMaritimeSourceCharacteristicsViewRecord value6(Float value) {
        setHeight(value);
        return this;
    }

    @Override
    public ShippingMaritimeSourceCharacteristicsViewRecord value7(Float value) {
        setSpread(value);
        return this;
    }

    @Override
    public ShippingMaritimeSourceCharacteristicsViewRecord value8(Integer value) {
        setEmissionDiurnalVariationId(value);
        return this;
    }

    @Override
    public ShippingMaritimeSourceCharacteristicsViewRecord value9(String value) {
        setEmissionDiurnalVariationCode(value);
        return this;
    }

    @Override
    public ShippingMaritimeSourceCharacteristicsViewRecord values(Short value1, Short value2, ShippingMovementType value3, Integer value4, Float value5, Float value6, Float value7, Integer value8, String value9) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        value9(value9);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached ShippingMaritimeSourceCharacteristicsViewRecord
     */
    public ShippingMaritimeSourceCharacteristicsViewRecord() {
        super(ShippingMaritimeSourceCharacteristicsView.SHIPPING_MARITIME_SOURCE_CHARACTERISTICS_VIEW);
    }

    /**
     * Create a detached, initialised
     * ShippingMaritimeSourceCharacteristicsViewRecord
     */
    public ShippingMaritimeSourceCharacteristicsViewRecord(Short shippingMaritimeCategoryId, Short year, ShippingMovementType movementType, Integer gcnSectorId, Float heatContent, Float height, Float spread, Integer emissionDiurnalVariationId, String emissionDiurnalVariationCode) {
        super(ShippingMaritimeSourceCharacteristicsView.SHIPPING_MARITIME_SOURCE_CHARACTERISTICS_VIEW);

        setShippingMaritimeCategoryId(shippingMaritimeCategoryId);
        setYear(year);
        setMovementType(movementType);
        setGcnSectorId(gcnSectorId);
        setHeatContent(heatContent);
        setHeight(height);
        setSpread(spread);
        setEmissionDiurnalVariationId(emissionDiurnalVariationId);
        setEmissionDiurnalVariationCode(emissionDiurnalVariationCode);
    }
}
