/*
 * This file is generated by jOOQ.
 */
package nl.aerius.emissionservice.db.generated.template.tables.records;


import nl.aerius.emissionservice.db.generated.public_.enums.ShippingInlandLadenState;
import nl.aerius.emissionservice.db.generated.template.tables.ShippingInlandSourceCharacteristicsDockedView;

import org.jooq.Field;
import org.jooq.Record8;
import org.jooq.Row8;
import org.jooq.impl.TableRecordImpl;


/**
 * View retourneert de emissie karakteristieken voor aanlegplaatsen voor
 * binnenvaart.
 * 
 * @file
 * source/database/src/main/sql/template/02-emission_factors/04-views/shipping_inland.sql
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class ShippingInlandSourceCharacteristicsDockedViewRecord extends TableRecordImpl<ShippingInlandSourceCharacteristicsDockedViewRecord> implements Record8<Short, ShippingInlandLadenState, Integer, Float, Float, Float, Integer, String> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for
     * <code>template.shipping_inland_source_characteristics_docked_view.shipping_inland_category_id</code>.
     */
    public void setShippingInlandCategoryId(Short value) {
        set(0, value);
    }

    /**
     * Getter for
     * <code>template.shipping_inland_source_characteristics_docked_view.shipping_inland_category_id</code>.
     */
    public Short getShippingInlandCategoryId() {
        return (Short) get(0);
    }

    /**
     * Setter for
     * <code>template.shipping_inland_source_characteristics_docked_view.laden_state</code>.
     */
    public void setLadenState(ShippingInlandLadenState value) {
        set(1, value);
    }

    /**
     * Getter for
     * <code>template.shipping_inland_source_characteristics_docked_view.laden_state</code>.
     */
    public ShippingInlandLadenState getLadenState() {
        return (ShippingInlandLadenState) get(1);
    }

    /**
     * Setter for
     * <code>template.shipping_inland_source_characteristics_docked_view.gcn_sector_id</code>.
     */
    public void setGcnSectorId(Integer value) {
        set(2, value);
    }

    /**
     * Getter for
     * <code>template.shipping_inland_source_characteristics_docked_view.gcn_sector_id</code>.
     */
    public Integer getGcnSectorId() {
        return (Integer) get(2);
    }

    /**
     * Setter for
     * <code>template.shipping_inland_source_characteristics_docked_view.heat_content</code>.
     */
    public void setHeatContent(Float value) {
        set(3, value);
    }

    /**
     * Getter for
     * <code>template.shipping_inland_source_characteristics_docked_view.heat_content</code>.
     */
    public Float getHeatContent() {
        return (Float) get(3);
    }

    /**
     * Setter for
     * <code>template.shipping_inland_source_characteristics_docked_view.height</code>.
     */
    public void setHeight(Float value) {
        set(4, value);
    }

    /**
     * Getter for
     * <code>template.shipping_inland_source_characteristics_docked_view.height</code>.
     */
    public Float getHeight() {
        return (Float) get(4);
    }

    /**
     * Setter for
     * <code>template.shipping_inland_source_characteristics_docked_view.spread</code>.
     */
    public void setSpread(Float value) {
        set(5, value);
    }

    /**
     * Getter for
     * <code>template.shipping_inland_source_characteristics_docked_view.spread</code>.
     */
    public Float getSpread() {
        return (Float) get(5);
    }

    /**
     * Setter for
     * <code>template.shipping_inland_source_characteristics_docked_view.emission_diurnal_variation_id</code>.
     */
    public void setEmissionDiurnalVariationId(Integer value) {
        set(6, value);
    }

    /**
     * Getter for
     * <code>template.shipping_inland_source_characteristics_docked_view.emission_diurnal_variation_id</code>.
     */
    public Integer getEmissionDiurnalVariationId() {
        return (Integer) get(6);
    }

    /**
     * Setter for
     * <code>template.shipping_inland_source_characteristics_docked_view.emission_diurnal_variation_code</code>.
     */
    public void setEmissionDiurnalVariationCode(String value) {
        set(7, value);
    }

    /**
     * Getter for
     * <code>template.shipping_inland_source_characteristics_docked_view.emission_diurnal_variation_code</code>.
     */
    public String getEmissionDiurnalVariationCode() {
        return (String) get(7);
    }

    // -------------------------------------------------------------------------
    // Record8 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row8<Short, ShippingInlandLadenState, Integer, Float, Float, Float, Integer, String> fieldsRow() {
        return (Row8) super.fieldsRow();
    }

    @Override
    public Row8<Short, ShippingInlandLadenState, Integer, Float, Float, Float, Integer, String> valuesRow() {
        return (Row8) super.valuesRow();
    }

    @Override
    public Field<Short> field1() {
        return ShippingInlandSourceCharacteristicsDockedView.SHIPPING_INLAND_SOURCE_CHARACTERISTICS_DOCKED_VIEW.SHIPPING_INLAND_CATEGORY_ID;
    }

    @Override
    public Field<ShippingInlandLadenState> field2() {
        return ShippingInlandSourceCharacteristicsDockedView.SHIPPING_INLAND_SOURCE_CHARACTERISTICS_DOCKED_VIEW.LADEN_STATE;
    }

    @Override
    public Field<Integer> field3() {
        return ShippingInlandSourceCharacteristicsDockedView.SHIPPING_INLAND_SOURCE_CHARACTERISTICS_DOCKED_VIEW.GCN_SECTOR_ID;
    }

    @Override
    public Field<Float> field4() {
        return ShippingInlandSourceCharacteristicsDockedView.SHIPPING_INLAND_SOURCE_CHARACTERISTICS_DOCKED_VIEW.HEAT_CONTENT;
    }

    @Override
    public Field<Float> field5() {
        return ShippingInlandSourceCharacteristicsDockedView.SHIPPING_INLAND_SOURCE_CHARACTERISTICS_DOCKED_VIEW.HEIGHT;
    }

    @Override
    public Field<Float> field6() {
        return ShippingInlandSourceCharacteristicsDockedView.SHIPPING_INLAND_SOURCE_CHARACTERISTICS_DOCKED_VIEW.SPREAD;
    }

    @Override
    public Field<Integer> field7() {
        return ShippingInlandSourceCharacteristicsDockedView.SHIPPING_INLAND_SOURCE_CHARACTERISTICS_DOCKED_VIEW.EMISSION_DIURNAL_VARIATION_ID;
    }

    @Override
    public Field<String> field8() {
        return ShippingInlandSourceCharacteristicsDockedView.SHIPPING_INLAND_SOURCE_CHARACTERISTICS_DOCKED_VIEW.EMISSION_DIURNAL_VARIATION_CODE;
    }

    @Override
    public Short component1() {
        return getShippingInlandCategoryId();
    }

    @Override
    public ShippingInlandLadenState component2() {
        return getLadenState();
    }

    @Override
    public Integer component3() {
        return getGcnSectorId();
    }

    @Override
    public Float component4() {
        return getHeatContent();
    }

    @Override
    public Float component5() {
        return getHeight();
    }

    @Override
    public Float component6() {
        return getSpread();
    }

    @Override
    public Integer component7() {
        return getEmissionDiurnalVariationId();
    }

    @Override
    public String component8() {
        return getEmissionDiurnalVariationCode();
    }

    @Override
    public Short value1() {
        return getShippingInlandCategoryId();
    }

    @Override
    public ShippingInlandLadenState value2() {
        return getLadenState();
    }

    @Override
    public Integer value3() {
        return getGcnSectorId();
    }

    @Override
    public Float value4() {
        return getHeatContent();
    }

    @Override
    public Float value5() {
        return getHeight();
    }

    @Override
    public Float value6() {
        return getSpread();
    }

    @Override
    public Integer value7() {
        return getEmissionDiurnalVariationId();
    }

    @Override
    public String value8() {
        return getEmissionDiurnalVariationCode();
    }

    @Override
    public ShippingInlandSourceCharacteristicsDockedViewRecord value1(Short value) {
        setShippingInlandCategoryId(value);
        return this;
    }

    @Override
    public ShippingInlandSourceCharacteristicsDockedViewRecord value2(ShippingInlandLadenState value) {
        setLadenState(value);
        return this;
    }

    @Override
    public ShippingInlandSourceCharacteristicsDockedViewRecord value3(Integer value) {
        setGcnSectorId(value);
        return this;
    }

    @Override
    public ShippingInlandSourceCharacteristicsDockedViewRecord value4(Float value) {
        setHeatContent(value);
        return this;
    }

    @Override
    public ShippingInlandSourceCharacteristicsDockedViewRecord value5(Float value) {
        setHeight(value);
        return this;
    }

    @Override
    public ShippingInlandSourceCharacteristicsDockedViewRecord value6(Float value) {
        setSpread(value);
        return this;
    }

    @Override
    public ShippingInlandSourceCharacteristicsDockedViewRecord value7(Integer value) {
        setEmissionDiurnalVariationId(value);
        return this;
    }

    @Override
    public ShippingInlandSourceCharacteristicsDockedViewRecord value8(String value) {
        setEmissionDiurnalVariationCode(value);
        return this;
    }

    @Override
    public ShippingInlandSourceCharacteristicsDockedViewRecord values(Short value1, ShippingInlandLadenState value2, Integer value3, Float value4, Float value5, Float value6, Integer value7, String value8) {
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
     * Create a detached ShippingInlandSourceCharacteristicsDockedViewRecord
     */
    public ShippingInlandSourceCharacteristicsDockedViewRecord() {
        super(ShippingInlandSourceCharacteristicsDockedView.SHIPPING_INLAND_SOURCE_CHARACTERISTICS_DOCKED_VIEW);
    }

    /**
     * Create a detached, initialised
     * ShippingInlandSourceCharacteristicsDockedViewRecord
     */
    public ShippingInlandSourceCharacteristicsDockedViewRecord(Short shippingInlandCategoryId, ShippingInlandLadenState ladenState, Integer gcnSectorId, Float heatContent, Float height, Float spread, Integer emissionDiurnalVariationId, String emissionDiurnalVariationCode) {
        super(ShippingInlandSourceCharacteristicsDockedView.SHIPPING_INLAND_SOURCE_CHARACTERISTICS_DOCKED_VIEW);

        setShippingInlandCategoryId(shippingInlandCategoryId);
        setLadenState(ladenState);
        setGcnSectorId(gcnSectorId);
        setHeatContent(heatContent);
        setHeight(height);
        setSpread(spread);
        setEmissionDiurnalVariationId(emissionDiurnalVariationId);
        setEmissionDiurnalVariationCode(emissionDiurnalVariationCode);
    }
}