/*
 * This file is generated by jOOQ.
 */
package nl.aerius.emissionservice.db.generated.template.tables.records;


import nl.aerius.emissionservice.db.generated.public_.enums.ShippingMovementType;
import nl.aerius.emissionservice.db.generated.template.tables.ShippingMaritimeCategoryEmissionFactors;

import org.jooq.Field;
import org.jooq.Record4;
import org.jooq.Record5;
import org.jooq.Row5;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * De emissie factoren voor verschillende soorten schepen voor zeescheepvaart.
 * Deze factoren zijn uniek per scheepstype per stof per jaar per snelheid.
 * 
 * Hierin worden de emissiefactoren per jaar weergegeven, emission_factor is de
 * emissie factor tijdens varen (in kg/(kilometer * aantal schepen)) bij een
 * bepaalde snelheid.
 * De emission_factor bij een snelheid van 0 is de emissie factor tijdens
 * stilliggen.
 * (in kg/(aantal schepen * uur stilliggen)).
 * 
 * @file
 * source/database/src/main/sql/template/02-emission_factors/02-tables/shipping_maritime.sql
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class ShippingMaritimeCategoryEmissionFactorsRecord extends UpdatableRecordImpl<ShippingMaritimeCategoryEmissionFactorsRecord> implements Record5<Short, Short, Short, ShippingMovementType, Float> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for
     * <code>template.shipping_maritime_category_emission_factors.shipping_maritime_category_id</code>.
     */
    public void setShippingMaritimeCategoryId(Short value) {
        set(0, value);
    }

    /**
     * Getter for
     * <code>template.shipping_maritime_category_emission_factors.shipping_maritime_category_id</code>.
     */
    public Short getShippingMaritimeCategoryId() {
        return (Short) get(0);
    }

    /**
     * Setter for
     * <code>template.shipping_maritime_category_emission_factors.year</code>.
     */
    public void setYear(Short value) {
        set(1, value);
    }

    /**
     * Getter for
     * <code>template.shipping_maritime_category_emission_factors.year</code>.
     */
    public Short getYear() {
        return (Short) get(1);
    }

    /**
     * Setter for
     * <code>template.shipping_maritime_category_emission_factors.substance_id</code>.
     */
    public void setSubstanceId(Short value) {
        set(2, value);
    }

    /**
     * Getter for
     * <code>template.shipping_maritime_category_emission_factors.substance_id</code>.
     */
    public Short getSubstanceId() {
        return (Short) get(2);
    }

    /**
     * Setter for
     * <code>template.shipping_maritime_category_emission_factors.movement_type</code>.
     */
    public void setMovementType(ShippingMovementType value) {
        set(3, value);
    }

    /**
     * Getter for
     * <code>template.shipping_maritime_category_emission_factors.movement_type</code>.
     */
    public ShippingMovementType getMovementType() {
        return (ShippingMovementType) get(3);
    }

    /**
     * Setter for
     * <code>template.shipping_maritime_category_emission_factors.emission_factor</code>.
     */
    public void setEmissionFactor(Float value) {
        set(4, value);
    }

    /**
     * Getter for
     * <code>template.shipping_maritime_category_emission_factors.emission_factor</code>.
     */
    public Float getEmissionFactor() {
        return (Float) get(4);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record4<Short, Short, ShippingMovementType, Short> key() {
        return (Record4) super.key();
    }

    // -------------------------------------------------------------------------
    // Record5 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row5<Short, Short, Short, ShippingMovementType, Float> fieldsRow() {
        return (Row5) super.fieldsRow();
    }

    @Override
    public Row5<Short, Short, Short, ShippingMovementType, Float> valuesRow() {
        return (Row5) super.valuesRow();
    }

    @Override
    public Field<Short> field1() {
        return ShippingMaritimeCategoryEmissionFactors.SHIPPING_MARITIME_CATEGORY_EMISSION_FACTORS.SHIPPING_MARITIME_CATEGORY_ID;
    }

    @Override
    public Field<Short> field2() {
        return ShippingMaritimeCategoryEmissionFactors.SHIPPING_MARITIME_CATEGORY_EMISSION_FACTORS.YEAR;
    }

    @Override
    public Field<Short> field3() {
        return ShippingMaritimeCategoryEmissionFactors.SHIPPING_MARITIME_CATEGORY_EMISSION_FACTORS.SUBSTANCE_ID;
    }

    @Override
    public Field<ShippingMovementType> field4() {
        return ShippingMaritimeCategoryEmissionFactors.SHIPPING_MARITIME_CATEGORY_EMISSION_FACTORS.MOVEMENT_TYPE;
    }

    @Override
    public Field<Float> field5() {
        return ShippingMaritimeCategoryEmissionFactors.SHIPPING_MARITIME_CATEGORY_EMISSION_FACTORS.EMISSION_FACTOR;
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
    public Short component3() {
        return getSubstanceId();
    }

    @Override
    public ShippingMovementType component4() {
        return getMovementType();
    }

    @Override
    public Float component5() {
        return getEmissionFactor();
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
    public Short value3() {
        return getSubstanceId();
    }

    @Override
    public ShippingMovementType value4() {
        return getMovementType();
    }

    @Override
    public Float value5() {
        return getEmissionFactor();
    }

    @Override
    public ShippingMaritimeCategoryEmissionFactorsRecord value1(Short value) {
        setShippingMaritimeCategoryId(value);
        return this;
    }

    @Override
    public ShippingMaritimeCategoryEmissionFactorsRecord value2(Short value) {
        setYear(value);
        return this;
    }

    @Override
    public ShippingMaritimeCategoryEmissionFactorsRecord value3(Short value) {
        setSubstanceId(value);
        return this;
    }

    @Override
    public ShippingMaritimeCategoryEmissionFactorsRecord value4(ShippingMovementType value) {
        setMovementType(value);
        return this;
    }

    @Override
    public ShippingMaritimeCategoryEmissionFactorsRecord value5(Float value) {
        setEmissionFactor(value);
        return this;
    }

    @Override
    public ShippingMaritimeCategoryEmissionFactorsRecord values(Short value1, Short value2, Short value3, ShippingMovementType value4, Float value5) {
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
     * Create a detached ShippingMaritimeCategoryEmissionFactorsRecord
     */
    public ShippingMaritimeCategoryEmissionFactorsRecord() {
        super(ShippingMaritimeCategoryEmissionFactors.SHIPPING_MARITIME_CATEGORY_EMISSION_FACTORS);
    }

    /**
     * Create a detached, initialised
     * ShippingMaritimeCategoryEmissionFactorsRecord
     */
    public ShippingMaritimeCategoryEmissionFactorsRecord(Short shippingMaritimeCategoryId, Short year, Short substanceId, ShippingMovementType movementType, Float emissionFactor) {
        super(ShippingMaritimeCategoryEmissionFactors.SHIPPING_MARITIME_CATEGORY_EMISSION_FACTORS);

        setShippingMaritimeCategoryId(shippingMaritimeCategoryId);
        setYear(year);
        setSubstanceId(substanceId);
        setMovementType(movementType);
        setEmissionFactor(emissionFactor);
    }
}