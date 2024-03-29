/*
 * This file is generated by jOOQ.
 */
package nl.aerius.emissionservice.db.generated.template.tables;


import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

import nl.aerius.emissionservice.db.generated.template.Keys;
import nl.aerius.emissionservice.db.generated.template.Template;
import nl.aerius.emissionservice.db.generated.template.tables.records.ShippingMaritimeCategoryManeuverPropertiesRecord;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Function3;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Records;
import org.jooq.Row3;
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
 * Table containing maneuver properties for maritime shipping categories.
 * 
 * @column maneuver_factor The factor to increase emissions at the starting
 * section of a route due to maneuvring the ship near the dock.
 * @column maneuver_length The length of the route for which the factor should
 * be applied.
 * 
 * @file
 * source/database/src/main/sql/template/02-emission_factors/02-tables/shipping_maritime.sql
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class ShippingMaritimeCategoryManeuverProperties extends TableImpl<ShippingMaritimeCategoryManeuverPropertiesRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of
     * <code>template.shipping_maritime_category_maneuver_properties</code>
     */
    public static final ShippingMaritimeCategoryManeuverProperties SHIPPING_MARITIME_CATEGORY_MANEUVER_PROPERTIES = new ShippingMaritimeCategoryManeuverProperties();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<ShippingMaritimeCategoryManeuverPropertiesRecord> getRecordType() {
        return ShippingMaritimeCategoryManeuverPropertiesRecord.class;
    }

    /**
     * The column
     * <code>template.shipping_maritime_category_maneuver_properties.shipping_maritime_category_id</code>.
     */
    public final TableField<ShippingMaritimeCategoryManeuverPropertiesRecord, Short> SHIPPING_MARITIME_CATEGORY_ID = createField(DSL.name("shipping_maritime_category_id"), SQLDataType.SMALLINT.nullable(false), this, "");

    /**
     * The column
     * <code>template.shipping_maritime_category_maneuver_properties.maneuver_factor</code>.
     */
    public final TableField<ShippingMaritimeCategoryManeuverPropertiesRecord, Float> MANEUVER_FACTOR = createField(DSL.name("maneuver_factor"), nl.aerius.emissionservice.db.generated.public_.Domains.POSREAL.getDataType().nullable(false), this, "");

    /**
     * The column
     * <code>template.shipping_maritime_category_maneuver_properties.maneuver_length</code>.
     */
    public final TableField<ShippingMaritimeCategoryManeuverPropertiesRecord, Float> MANEUVER_LENGTH = createField(DSL.name("maneuver_length"), nl.aerius.emissionservice.db.generated.public_.Domains.POSREAL.getDataType().nullable(false), this, "");

    private ShippingMaritimeCategoryManeuverProperties(Name alias, Table<ShippingMaritimeCategoryManeuverPropertiesRecord> aliased) {
        this(alias, aliased, null);
    }

    private ShippingMaritimeCategoryManeuverProperties(Name alias, Table<ShippingMaritimeCategoryManeuverPropertiesRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment("Table containing maneuver properties for maritime shipping categories.\r\n\r\n@column maneuver_factor The factor to increase emissions at the starting section of a route due to maneuvring the ship near the dock.\r\n@column maneuver_length The length of the route for which the factor should be applied.\r\n\r\n@file source/database/src/main/sql/template/02-emission_factors/02-tables/shipping_maritime.sql"), TableOptions.table());
    }

    /**
     * Create an aliased
     * <code>template.shipping_maritime_category_maneuver_properties</code>
     * table reference
     */
    public ShippingMaritimeCategoryManeuverProperties(String alias) {
        this(DSL.name(alias), SHIPPING_MARITIME_CATEGORY_MANEUVER_PROPERTIES);
    }

    /**
     * Create an aliased
     * <code>template.shipping_maritime_category_maneuver_properties</code>
     * table reference
     */
    public ShippingMaritimeCategoryManeuverProperties(Name alias) {
        this(alias, SHIPPING_MARITIME_CATEGORY_MANEUVER_PROPERTIES);
    }

    /**
     * Create a
     * <code>template.shipping_maritime_category_maneuver_properties</code>
     * table reference
     */
    public ShippingMaritimeCategoryManeuverProperties() {
        this(DSL.name("shipping_maritime_category_maneuver_properties"), null);
    }

    public <O extends Record> ShippingMaritimeCategoryManeuverProperties(Table<O> child, ForeignKey<O, ShippingMaritimeCategoryManeuverPropertiesRecord> key) {
        super(child, key, SHIPPING_MARITIME_CATEGORY_MANEUVER_PROPERTIES);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : Template.TEMPLATE;
    }

    @Override
    public UniqueKey<ShippingMaritimeCategoryManeuverPropertiesRecord> getPrimaryKey() {
        return Keys.SHIPPING_MARITIME_CATEGORY_MANEUVER_PROPERTIES_PKEY;
    }

    @Override
    public List<ForeignKey<ShippingMaritimeCategoryManeuverPropertiesRecord, ?>> getReferences() {
        return Arrays.asList(Keys.SHIPPING_MARITIME_CATEGORY_MANEUVER_PROPERTIES__SHIPPING_MARITIME_CATEGORY_MANEUVER_PROPERTIES_FKEY_CATEGORIES);
    }

    private transient ShippingMaritimeCategories _shippingMaritimeCategories;

    /**
     * Get the implicit join path to the
     * <code>template.shipping_maritime_categories</code> table.
     */
    public ShippingMaritimeCategories shippingMaritimeCategories() {
        if (_shippingMaritimeCategories == null)
            _shippingMaritimeCategories = new ShippingMaritimeCategories(this, Keys.SHIPPING_MARITIME_CATEGORY_MANEUVER_PROPERTIES__SHIPPING_MARITIME_CATEGORY_MANEUVER_PROPERTIES_FKEY_CATEGORIES);

        return _shippingMaritimeCategories;
    }

    @Override
    public ShippingMaritimeCategoryManeuverProperties as(String alias) {
        return new ShippingMaritimeCategoryManeuverProperties(DSL.name(alias), this);
    }

    @Override
    public ShippingMaritimeCategoryManeuverProperties as(Name alias) {
        return new ShippingMaritimeCategoryManeuverProperties(alias, this);
    }

    @Override
    public ShippingMaritimeCategoryManeuverProperties as(Table<?> alias) {
        return new ShippingMaritimeCategoryManeuverProperties(alias.getQualifiedName(), this);
    }

    /**
     * Rename this table
     */
    @Override
    public ShippingMaritimeCategoryManeuverProperties rename(String name) {
        return new ShippingMaritimeCategoryManeuverProperties(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public ShippingMaritimeCategoryManeuverProperties rename(Name name) {
        return new ShippingMaritimeCategoryManeuverProperties(name, null);
    }

    /**
     * Rename this table
     */
    @Override
    public ShippingMaritimeCategoryManeuverProperties rename(Table<?> name) {
        return new ShippingMaritimeCategoryManeuverProperties(name.getQualifiedName(), null);
    }

    // -------------------------------------------------------------------------
    // Row3 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row3<Short, Float, Float> fieldsRow() {
        return (Row3) super.fieldsRow();
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Function)}.
     */
    public <U> SelectField<U> mapping(Function3<? super Short, ? super Float, ? super Float, ? extends U> from) {
        return convertFrom(Records.mapping(from));
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Class,
     * Function)}.
     */
    public <U> SelectField<U> mapping(Class<U> toType, Function3<? super Short, ? super Float, ? super Float, ? extends U> from) {
        return convertFrom(toType, Records.mapping(from));
    }
}
