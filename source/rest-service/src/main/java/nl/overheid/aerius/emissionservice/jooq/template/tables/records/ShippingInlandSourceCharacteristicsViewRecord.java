/*
 * This file is generated by jOOQ.
 */
package nl.overheid.aerius.emissionservice.jooq.template.tables.records;


import nl.overheid.aerius.emissionservice.jooq.public_.enums.ShippingInlandLadenState;
import nl.overheid.aerius.emissionservice.jooq.public_.enums.ShippingInlandShipDirectionType;
import nl.overheid.aerius.emissionservice.jooq.template.tables.ShippingInlandSourceCharacteristicsView;

import org.jooq.Field;
import org.jooq.Record10;
import org.jooq.Row10;
import org.jooq.impl.TableRecordImpl;


/**
 * View retourneert de emissie karakteristieken voor routes voor binnenvaart.
 * 
 * 
 * @file source/database/src/main/sql/emission_factors/04-views/shipping_inland.sql
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class ShippingInlandSourceCharacteristicsViewRecord extends TableRecordImpl<ShippingInlandSourceCharacteristicsViewRecord> implements Record10<Short, Integer, ShippingInlandShipDirectionType, ShippingInlandLadenState, Integer, Float, Float, Float, Integer, String> {

    private static final long serialVersionUID = 1564865185;

    /**
     * Setter for <code>template.shipping_inland_source_characteristics_view.shipping_inland_category_id</code>.
     */
    public void setShippingInlandCategoryId(Short value) {
        set(0, value);
    }

    /**
     * Getter for <code>template.shipping_inland_source_characteristics_view.shipping_inland_category_id</code>.
     */
    public Short getShippingInlandCategoryId() {
        return (Short) get(0);
    }

    /**
     * Setter for <code>template.shipping_inland_source_characteristics_view.shipping_inland_waterway_category_id</code>.
     */
    public void setShippingInlandWaterwayCategoryId(Integer value) {
        set(1, value);
    }

    /**
     * Getter for <code>template.shipping_inland_source_characteristics_view.shipping_inland_waterway_category_id</code>.
     */
    public Integer getShippingInlandWaterwayCategoryId() {
        return (Integer) get(1);
    }

    /**
     * Setter for <code>template.shipping_inland_source_characteristics_view.ship_direction</code>.
     */
    public void setShipDirection(ShippingInlandShipDirectionType value) {
        set(2, value);
    }

    /**
     * Getter for <code>template.shipping_inland_source_characteristics_view.ship_direction</code>.
     */
    public ShippingInlandShipDirectionType getShipDirection() {
        return (ShippingInlandShipDirectionType) get(2);
    }

    /**
     * Setter for <code>template.shipping_inland_source_characteristics_view.laden_state</code>.
     */
    public void setLadenState(ShippingInlandLadenState value) {
        set(3, value);
    }

    /**
     * Getter for <code>template.shipping_inland_source_characteristics_view.laden_state</code>.
     */
    public ShippingInlandLadenState getLadenState() {
        return (ShippingInlandLadenState) get(3);
    }

    /**
     * Setter for <code>template.shipping_inland_source_characteristics_view.gcn_sector_id</code>.
     */
    public void setGcnSectorId(Integer value) {
        set(4, value);
    }

    /**
     * Getter for <code>template.shipping_inland_source_characteristics_view.gcn_sector_id</code>.
     */
    public Integer getGcnSectorId() {
        return (Integer) get(4);
    }

    /**
     * Setter for <code>template.shipping_inland_source_characteristics_view.heat_content</code>.
     */
    public void setHeatContent(Float value) {
        set(5, value);
    }

    /**
     * Getter for <code>template.shipping_inland_source_characteristics_view.heat_content</code>.
     */
    public Float getHeatContent() {
        return (Float) get(5);
    }

    /**
     * Setter for <code>template.shipping_inland_source_characteristics_view.height</code>.
     */
    public void setHeight(Float value) {
        set(6, value);
    }

    /**
     * Getter for <code>template.shipping_inland_source_characteristics_view.height</code>.
     */
    public Float getHeight() {
        return (Float) get(6);
    }

    /**
     * Setter for <code>template.shipping_inland_source_characteristics_view.spread</code>.
     */
    public void setSpread(Float value) {
        set(7, value);
    }

    /**
     * Getter for <code>template.shipping_inland_source_characteristics_view.spread</code>.
     */
    public Float getSpread() {
        return (Float) get(7);
    }

    /**
     * Setter for <code>template.shipping_inland_source_characteristics_view.emission_diurnal_variation_id</code>.
     */
    public void setEmissionDiurnalVariationId(Integer value) {
        set(8, value);
    }

    /**
     * Getter for <code>template.shipping_inland_source_characteristics_view.emission_diurnal_variation_id</code>.
     */
    public Integer getEmissionDiurnalVariationId() {
        return (Integer) get(8);
    }

    /**
     * Setter for <code>template.shipping_inland_source_characteristics_view.emission_diurnal_variation_code</code>.
     */
    public void setEmissionDiurnalVariationCode(String value) {
        set(9, value);
    }

    /**
     * Getter for <code>template.shipping_inland_source_characteristics_view.emission_diurnal_variation_code</code>.
     */
    public String getEmissionDiurnalVariationCode() {
        return (String) get(9);
    }

    // -------------------------------------------------------------------------
    // Record10 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row10<Short, Integer, ShippingInlandShipDirectionType, ShippingInlandLadenState, Integer, Float, Float, Float, Integer, String> fieldsRow() {
        return (Row10) super.fieldsRow();
    }

    @Override
    public Row10<Short, Integer, ShippingInlandShipDirectionType, ShippingInlandLadenState, Integer, Float, Float, Float, Integer, String> valuesRow() {
        return (Row10) super.valuesRow();
    }

    @Override
    public Field<Short> field1() {
        return ShippingInlandSourceCharacteristicsView.SHIPPING_INLAND_SOURCE_CHARACTERISTICS_VIEW.SHIPPING_INLAND_CATEGORY_ID;
    }

    @Override
    public Field<Integer> field2() {
        return ShippingInlandSourceCharacteristicsView.SHIPPING_INLAND_SOURCE_CHARACTERISTICS_VIEW.SHIPPING_INLAND_WATERWAY_CATEGORY_ID;
    }

    @Override
    public Field<ShippingInlandShipDirectionType> field3() {
        return ShippingInlandSourceCharacteristicsView.SHIPPING_INLAND_SOURCE_CHARACTERISTICS_VIEW.SHIP_DIRECTION;
    }

    @Override
    public Field<ShippingInlandLadenState> field4() {
        return ShippingInlandSourceCharacteristicsView.SHIPPING_INLAND_SOURCE_CHARACTERISTICS_VIEW.LADEN_STATE;
    }

    @Override
    public Field<Integer> field5() {
        return ShippingInlandSourceCharacteristicsView.SHIPPING_INLAND_SOURCE_CHARACTERISTICS_VIEW.GCN_SECTOR_ID;
    }

    @Override
    public Field<Float> field6() {
        return ShippingInlandSourceCharacteristicsView.SHIPPING_INLAND_SOURCE_CHARACTERISTICS_VIEW.HEAT_CONTENT;
    }

    @Override
    public Field<Float> field7() {
        return ShippingInlandSourceCharacteristicsView.SHIPPING_INLAND_SOURCE_CHARACTERISTICS_VIEW.HEIGHT;
    }

    @Override
    public Field<Float> field8() {
        return ShippingInlandSourceCharacteristicsView.SHIPPING_INLAND_SOURCE_CHARACTERISTICS_VIEW.SPREAD;
    }

    @Override
    public Field<Integer> field9() {
        return ShippingInlandSourceCharacteristicsView.SHIPPING_INLAND_SOURCE_CHARACTERISTICS_VIEW.EMISSION_DIURNAL_VARIATION_ID;
    }

    @Override
    public Field<String> field10() {
        return ShippingInlandSourceCharacteristicsView.SHIPPING_INLAND_SOURCE_CHARACTERISTICS_VIEW.EMISSION_DIURNAL_VARIATION_CODE;
    }

    @Override
    public Short component1() {
        return getShippingInlandCategoryId();
    }

    @Override
    public Integer component2() {
        return getShippingInlandWaterwayCategoryId();
    }

    @Override
    public ShippingInlandShipDirectionType component3() {
        return getShipDirection();
    }

    @Override
    public ShippingInlandLadenState component4() {
        return getLadenState();
    }

    @Override
    public Integer component5() {
        return getGcnSectorId();
    }

    @Override
    public Float component6() {
        return getHeatContent();
    }

    @Override
    public Float component7() {
        return getHeight();
    }

    @Override
    public Float component8() {
        return getSpread();
    }

    @Override
    public Integer component9() {
        return getEmissionDiurnalVariationId();
    }

    @Override
    public String component10() {
        return getEmissionDiurnalVariationCode();
    }

    @Override
    public Short value1() {
        return getShippingInlandCategoryId();
    }

    @Override
    public Integer value2() {
        return getShippingInlandWaterwayCategoryId();
    }

    @Override
    public ShippingInlandShipDirectionType value3() {
        return getShipDirection();
    }

    @Override
    public ShippingInlandLadenState value4() {
        return getLadenState();
    }

    @Override
    public Integer value5() {
        return getGcnSectorId();
    }

    @Override
    public Float value6() {
        return getHeatContent();
    }

    @Override
    public Float value7() {
        return getHeight();
    }

    @Override
    public Float value8() {
        return getSpread();
    }

    @Override
    public Integer value9() {
        return getEmissionDiurnalVariationId();
    }

    @Override
    public String value10() {
        return getEmissionDiurnalVariationCode();
    }

    @Override
    public ShippingInlandSourceCharacteristicsViewRecord value1(Short value) {
        setShippingInlandCategoryId(value);
        return this;
    }

    @Override
    public ShippingInlandSourceCharacteristicsViewRecord value2(Integer value) {
        setShippingInlandWaterwayCategoryId(value);
        return this;
    }

    @Override
    public ShippingInlandSourceCharacteristicsViewRecord value3(ShippingInlandShipDirectionType value) {
        setShipDirection(value);
        return this;
    }

    @Override
    public ShippingInlandSourceCharacteristicsViewRecord value4(ShippingInlandLadenState value) {
        setLadenState(value);
        return this;
    }

    @Override
    public ShippingInlandSourceCharacteristicsViewRecord value5(Integer value) {
        setGcnSectorId(value);
        return this;
    }

    @Override
    public ShippingInlandSourceCharacteristicsViewRecord value6(Float value) {
        setHeatContent(value);
        return this;
    }

    @Override
    public ShippingInlandSourceCharacteristicsViewRecord value7(Float value) {
        setHeight(value);
        return this;
    }

    @Override
    public ShippingInlandSourceCharacteristicsViewRecord value8(Float value) {
        setSpread(value);
        return this;
    }

    @Override
    public ShippingInlandSourceCharacteristicsViewRecord value9(Integer value) {
        setEmissionDiurnalVariationId(value);
        return this;
    }

    @Override
    public ShippingInlandSourceCharacteristicsViewRecord value10(String value) {
        setEmissionDiurnalVariationCode(value);
        return this;
    }

    @Override
    public ShippingInlandSourceCharacteristicsViewRecord values(Short value1, Integer value2, ShippingInlandShipDirectionType value3, ShippingInlandLadenState value4, Integer value5, Float value6, Float value7, Float value8, Integer value9, String value10) {
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
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached ShippingInlandSourceCharacteristicsViewRecord
     */
    public ShippingInlandSourceCharacteristicsViewRecord() {
        super(ShippingInlandSourceCharacteristicsView.SHIPPING_INLAND_SOURCE_CHARACTERISTICS_VIEW);
    }

    /**
     * Create a detached, initialised ShippingInlandSourceCharacteristicsViewRecord
     */
    public ShippingInlandSourceCharacteristicsViewRecord(Short shippingInlandCategoryId, Integer shippingInlandWaterwayCategoryId, ShippingInlandShipDirectionType shipDirection, ShippingInlandLadenState ladenState, Integer gcnSectorId, Float heatContent, Float height, Float spread, Integer emissionDiurnalVariationId, String emissionDiurnalVariationCode) {
        super(ShippingInlandSourceCharacteristicsView.SHIPPING_INLAND_SOURCE_CHARACTERISTICS_VIEW);

        set(0, shippingInlandCategoryId);
        set(1, shippingInlandWaterwayCategoryId);
        set(2, shipDirection);
        set(3, ladenState);
        set(4, gcnSectorId);
        set(5, heatContent);
        set(6, height);
        set(7, spread);
        set(8, emissionDiurnalVariationId);
        set(9, emissionDiurnalVariationCode);
    }
}
