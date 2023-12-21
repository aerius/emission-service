/*
 * This file is generated by jOOQ.
 */
package nl.aerius.emissionservice.db.generated.template.tables;


import java.util.function.Function;

import nl.aerius.emissionservice.db.generated.template.Keys;
import nl.aerius.emissionservice.db.generated.template.Template;
import nl.aerius.emissionservice.db.generated.template.tables.records.ShippingMaritimeMooringManeuverFactorsRecord;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Function4;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Records;
import org.jooq.Row4;
import org.jooq.Schema;
import org.jooq.SelectField;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.TableOptions;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.SQLDataType;
import org.jooq.impl.TableImpl;


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
public class ShippingMaritimeMooringManeuverFactors extends TableImpl<ShippingMaritimeMooringManeuverFactorsRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of
     * <code>template.shipping_maritime_mooring_maneuver_factors</code>
     */
    public static final ShippingMaritimeMooringManeuverFactors SHIPPING_MARITIME_MOORING_MANEUVER_FACTORS = new ShippingMaritimeMooringManeuverFactors();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<ShippingMaritimeMooringManeuverFactorsRecord> getRecordType() {
        return ShippingMaritimeMooringManeuverFactorsRecord.class;
    }

    /**
     * The column
     * <code>template.shipping_maritime_mooring_maneuver_factors.tonnage_category_id</code>.
     */
    public final TableField<ShippingMaritimeMooringManeuverFactorsRecord, Short> TONNAGE_CATEGORY_ID = createField(DSL.name("tonnage_category_id"), SQLDataType.SMALLINT.nullable(false), this, "");

    /**
     * The column
     * <code>template.shipping_maritime_mooring_maneuver_factors.tonnage_lower_threshold</code>.
     */
    public final TableField<ShippingMaritimeMooringManeuverFactorsRecord, Integer> TONNAGE_LOWER_THRESHOLD = createField(DSL.name("tonnage_lower_threshold"), SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column
     * <code>template.shipping_maritime_mooring_maneuver_factors.maneuver_factor</code>.
     */
    public final TableField<ShippingMaritimeMooringManeuverFactorsRecord, Float> MANEUVER_FACTOR = createField(DSL.name("maneuver_factor"), nl.aerius.emissionservice.db.generated.public_.Domains.POSREAL.getDataType().nullable(false), this, "");

    /**
     * The column
     * <code>template.shipping_maritime_mooring_maneuver_factors.maneuver_length</code>.
     */
    public final TableField<ShippingMaritimeMooringManeuverFactorsRecord, Float> MANEUVER_LENGTH = createField(DSL.name("maneuver_length"), nl.aerius.emissionservice.db.generated.public_.Domains.POSREAL.getDataType().nullable(false), this, "");

    private ShippingMaritimeMooringManeuverFactors(Name alias, Table<ShippingMaritimeMooringManeuverFactorsRecord> aliased) {
        this(alias, aliased, null);
    }

    private ShippingMaritimeMooringManeuverFactors(Name alias, Table<ShippingMaritimeMooringManeuverFactorsRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment("Table containing the maneuver factors and maneuver lengths for bruto tonnage ranges.\r\n\r\n@column tonnage_lower_threshold The lower threshold/boundary of the bruto tonnage range. The upper threshold/boundary is the lower threshold of the next range.\r\n@column maneuver_factor The factor that should be applied to the emission for the section of the route where maneuvering near a dock is expected.\r\n@column maneuver_length The length of the route from a dock for which maneuvering is expected, and for which the maneuver factor should be applied.\r\n\r\n@file source/database/src/main/sql/template/02-emission_factors/02-tables/shipping_maritime.sql"), TableOptions.table());
    }

    /**
     * Create an aliased
     * <code>template.shipping_maritime_mooring_maneuver_factors</code> table
     * reference
     */
    public ShippingMaritimeMooringManeuverFactors(String alias) {
        this(DSL.name(alias), SHIPPING_MARITIME_MOORING_MANEUVER_FACTORS);
    }

    /**
     * Create an aliased
     * <code>template.shipping_maritime_mooring_maneuver_factors</code> table
     * reference
     */
    public ShippingMaritimeMooringManeuverFactors(Name alias) {
        this(alias, SHIPPING_MARITIME_MOORING_MANEUVER_FACTORS);
    }

    /**
     * Create a <code>template.shipping_maritime_mooring_maneuver_factors</code>
     * table reference
     */
    public ShippingMaritimeMooringManeuverFactors() {
        this(DSL.name("shipping_maritime_mooring_maneuver_factors"), null);
    }

    public <O extends Record> ShippingMaritimeMooringManeuverFactors(Table<O> child, ForeignKey<O, ShippingMaritimeMooringManeuverFactorsRecord> key) {
        super(child, key, SHIPPING_MARITIME_MOORING_MANEUVER_FACTORS);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : Template.TEMPLATE;
    }

    @Override
    public UniqueKey<ShippingMaritimeMooringManeuverFactorsRecord> getPrimaryKey() {
        return Keys.SHIPPING_MARITIME_MOORING_MANEUVER_FACTORS_PKEY;
    }

    @Override
    public ShippingMaritimeMooringManeuverFactors as(String alias) {
        return new ShippingMaritimeMooringManeuverFactors(DSL.name(alias), this);
    }

    @Override
    public ShippingMaritimeMooringManeuverFactors as(Name alias) {
        return new ShippingMaritimeMooringManeuverFactors(alias, this);
    }

    @Override
    public ShippingMaritimeMooringManeuverFactors as(Table<?> alias) {
        return new ShippingMaritimeMooringManeuverFactors(alias.getQualifiedName(), this);
    }

    /**
     * Rename this table
     */
    @Override
    public ShippingMaritimeMooringManeuverFactors rename(String name) {
        return new ShippingMaritimeMooringManeuverFactors(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public ShippingMaritimeMooringManeuverFactors rename(Name name) {
        return new ShippingMaritimeMooringManeuverFactors(name, null);
    }

    /**
     * Rename this table
     */
    @Override
    public ShippingMaritimeMooringManeuverFactors rename(Table<?> name) {
        return new ShippingMaritimeMooringManeuverFactors(name.getQualifiedName(), null);
    }

    // -------------------------------------------------------------------------
    // Row4 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row4<Short, Integer, Float, Float> fieldsRow() {
        return (Row4) super.fieldsRow();
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Function)}.
     */
    public <U> SelectField<U> mapping(Function4<? super Short, ? super Integer, ? super Float, ? super Float, ? extends U> from) {
        return convertFrom(Records.mapping(from));
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Class,
     * Function)}.
     */
    public <U> SelectField<U> mapping(Class<U> toType, Function4<? super Short, ? super Integer, ? super Float, ? super Float, ? extends U> from) {
        return convertFrom(toType, Records.mapping(from));
    }
}