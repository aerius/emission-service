/*
 * This file is generated by jOOQ.
 */
package nl.aerius.emissionservice.db.generated.template.tables.records;


import nl.aerius.emissionservice.db.generated.template.tables.ShippingMaritimeMooringManeuverFactors;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record4;
import org.jooq.Row4;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * Table containing the maneuver factors and maneuver lengths for bruto tonnage
 * ranges.
 * 
 * @column tonnage_lower_threshold The lower threshold/boundary of the bruto
 * tonnage range. The upper threshold/boundary is the lower threshold of the
 * next range.
 * @column maneuver_factor The factor that should be applied to the emission for
 * the section of the route where maneuvering near a dock is expected.
 * @column maneuver_length The length of the route from a dock for which
 * maneuvering is expected, and for which the maneuver factor should be applied.
 * 
 * 
 * @file
 * source/database/src/main/sql/template/02-emission_factors/02-tables/shipping_maritime.sql
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class ShippingMaritimeMooringManeuverFactorsRecord extends UpdatableRecordImpl<ShippingMaritimeMooringManeuverFactorsRecord> implements Record4<Short, Integer, Float, Float> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for
     * <code>template.shipping_maritime_mooring_maneuver_factors.tonnage_category_id</code>.
     */
    public void setTonnageCategoryId(Short value) {
        set(0, value);
    }

    /**
     * Getter for
     * <code>template.shipping_maritime_mooring_maneuver_factors.tonnage_category_id</code>.
     */
    public Short getTonnageCategoryId() {
        return (Short) get(0);
    }

    /**
     * Setter for
     * <code>template.shipping_maritime_mooring_maneuver_factors.tonnage_lower_threshold</code>.
     */
    public void setTonnageLowerThreshold(Integer value) {
        set(1, value);
    }

    /**
     * Getter for
     * <code>template.shipping_maritime_mooring_maneuver_factors.tonnage_lower_threshold</code>.
     */
    public Integer getTonnageLowerThreshold() {
        return (Integer) get(1);
    }

    /**
     * Setter for
     * <code>template.shipping_maritime_mooring_maneuver_factors.maneuver_factor</code>.
     */
    public void setManeuverFactor(Float value) {
        set(2, value);
    }

    /**
     * Getter for
     * <code>template.shipping_maritime_mooring_maneuver_factors.maneuver_factor</code>.
     */
    public Float getManeuverFactor() {
        return (Float) get(2);
    }

    /**
     * Setter for
     * <code>template.shipping_maritime_mooring_maneuver_factors.maneuver_length</code>.
     */
    public void setManeuverLength(Float value) {
        set(3, value);
    }

    /**
     * Getter for
     * <code>template.shipping_maritime_mooring_maneuver_factors.maneuver_length</code>.
     */
    public Float getManeuverLength() {
        return (Float) get(3);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<Short> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record4 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row4<Short, Integer, Float, Float> fieldsRow() {
        return (Row4) super.fieldsRow();
    }

    @Override
    public Row4<Short, Integer, Float, Float> valuesRow() {
        return (Row4) super.valuesRow();
    }

    @Override
    public Field<Short> field1() {
        return ShippingMaritimeMooringManeuverFactors.SHIPPING_MARITIME_MOORING_MANEUVER_FACTORS.TONNAGE_CATEGORY_ID;
    }

    @Override
    public Field<Integer> field2() {
        return ShippingMaritimeMooringManeuverFactors.SHIPPING_MARITIME_MOORING_MANEUVER_FACTORS.TONNAGE_LOWER_THRESHOLD;
    }

    @Override
    public Field<Float> field3() {
        return ShippingMaritimeMooringManeuverFactors.SHIPPING_MARITIME_MOORING_MANEUVER_FACTORS.MANEUVER_FACTOR;
    }

    @Override
    public Field<Float> field4() {
        return ShippingMaritimeMooringManeuverFactors.SHIPPING_MARITIME_MOORING_MANEUVER_FACTORS.MANEUVER_LENGTH;
    }

    @Override
    public Short component1() {
        return getTonnageCategoryId();
    }

    @Override
    public Integer component2() {
        return getTonnageLowerThreshold();
    }

    @Override
    public Float component3() {
        return getManeuverFactor();
    }

    @Override
    public Float component4() {
        return getManeuverLength();
    }

    @Override
    public Short value1() {
        return getTonnageCategoryId();
    }

    @Override
    public Integer value2() {
        return getTonnageLowerThreshold();
    }

    @Override
    public Float value3() {
        return getManeuverFactor();
    }

    @Override
    public Float value4() {
        return getManeuverLength();
    }

    @Override
    public ShippingMaritimeMooringManeuverFactorsRecord value1(Short value) {
        setTonnageCategoryId(value);
        return this;
    }

    @Override
    public ShippingMaritimeMooringManeuverFactorsRecord value2(Integer value) {
        setTonnageLowerThreshold(value);
        return this;
    }

    @Override
    public ShippingMaritimeMooringManeuverFactorsRecord value3(Float value) {
        setManeuverFactor(value);
        return this;
    }

    @Override
    public ShippingMaritimeMooringManeuverFactorsRecord value4(Float value) {
        setManeuverLength(value);
        return this;
    }

    @Override
    public ShippingMaritimeMooringManeuverFactorsRecord values(Short value1, Integer value2, Float value3, Float value4) {
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
     * Create a detached ShippingMaritimeMooringManeuverFactorsRecord
     */
    public ShippingMaritimeMooringManeuverFactorsRecord() {
        super(ShippingMaritimeMooringManeuverFactors.SHIPPING_MARITIME_MOORING_MANEUVER_FACTORS);
    }

    /**
     * Create a detached, initialised
     * ShippingMaritimeMooringManeuverFactorsRecord
     */
    public ShippingMaritimeMooringManeuverFactorsRecord(Short tonnageCategoryId, Integer tonnageLowerThreshold, Float maneuverFactor, Float maneuverLength) {
        super(ShippingMaritimeMooringManeuverFactors.SHIPPING_MARITIME_MOORING_MANEUVER_FACTORS);

        setTonnageCategoryId(tonnageCategoryId);
        setTonnageLowerThreshold(tonnageLowerThreshold);
        setManeuverFactor(maneuverFactor);
        setManeuverLength(maneuverLength);
    }
}