/*
 * This file is generated by jOOQ.
 */
package nl.aerius.emissionservice.db.generated.template.tables;


import java.util.function.Function;

import nl.aerius.emissionservice.db.generated.public_.enums.ShippingInlandShipDirectionType;
import nl.aerius.emissionservice.db.generated.template.Template;
import nl.aerius.emissionservice.db.generated.template.tables.records.ShippingInlandWaterwayCategoriesViewRecord;

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
import org.jooq.impl.DSL;
import org.jooq.impl.SQLDataType;
import org.jooq.impl.TableImpl;


/**
 * View returning the waterway categories.
 * 
 * @file
 * source/database/src/main/sql/template/02-emission_factors/04-views/shipping_inland.sql
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class ShippingInlandWaterwayCategoriesView extends TableImpl<ShippingInlandWaterwayCategoriesViewRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of
     * <code>template.shipping_inland_waterway_categories_view</code>
     */
    public static final ShippingInlandWaterwayCategoriesView SHIPPING_INLAND_WATERWAY_CATEGORIES_VIEW = new ShippingInlandWaterwayCategoriesView();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<ShippingInlandWaterwayCategoriesViewRecord> getRecordType() {
        return ShippingInlandWaterwayCategoriesViewRecord.class;
    }

    /**
     * The column
     * <code>template.shipping_inland_waterway_categories_view.shipping_inland_waterway_category_id</code>.
     */
    public final TableField<ShippingInlandWaterwayCategoriesViewRecord, Integer> SHIPPING_INLAND_WATERWAY_CATEGORY_ID = createField(DSL.name("shipping_inland_waterway_category_id"), SQLDataType.INTEGER, this, "");

    /**
     * The column
     * <code>template.shipping_inland_waterway_categories_view.code</code>.
     */
    public final TableField<ShippingInlandWaterwayCategoriesViewRecord, String> CODE = createField(DSL.name("code"), SQLDataType.CLOB, this, "");

    /**
     * The column
     * <code>template.shipping_inland_waterway_categories_view.name</code>.
     */
    public final TableField<ShippingInlandWaterwayCategoriesViewRecord, String> NAME = createField(DSL.name("name"), SQLDataType.CLOB, this, "");

    /**
     * The column
     * <code>template.shipping_inland_waterway_categories_view.ship_direction</code>.
     */
    public final TableField<ShippingInlandWaterwayCategoriesViewRecord, ShippingInlandShipDirectionType> SHIP_DIRECTION = createField(DSL.name("ship_direction"), SQLDataType.VARCHAR.asEnumDataType(nl.aerius.emissionservice.db.generated.public_.enums.ShippingInlandShipDirectionType.class), this, "");

    private ShippingInlandWaterwayCategoriesView(Name alias, Table<ShippingInlandWaterwayCategoriesViewRecord> aliased) {
        this(alias, aliased, null);
    }

    private ShippingInlandWaterwayCategoriesView(Name alias, Table<ShippingInlandWaterwayCategoriesViewRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment("View returning the waterway categories.\r\n\r\n@file source/database/src/main/sql/template/02-emission_factors/04-views/shipping_inland.sql"), TableOptions.view("""
        create view "shipping_inland_waterway_categories_view" as  SELECT DISTINCT shipping_inland_category_emission_factors.shipping_inland_waterway_category_id,
          shipping_inland_waterway_categories.code,
          shipping_inland_waterway_categories.name,
          shipping_inland_category_emission_factors.ship_direction
         FROM (template.shipping_inland_category_emission_factors
           JOIN template.shipping_inland_waterway_categories USING (shipping_inland_waterway_category_id))
        ORDER BY shipping_inland_category_emission_factors.shipping_inland_waterway_category_id;
        """));
    }

    /**
     * Create an aliased
     * <code>template.shipping_inland_waterway_categories_view</code> table
     * reference
     */
    public ShippingInlandWaterwayCategoriesView(String alias) {
        this(DSL.name(alias), SHIPPING_INLAND_WATERWAY_CATEGORIES_VIEW);
    }

    /**
     * Create an aliased
     * <code>template.shipping_inland_waterway_categories_view</code> table
     * reference
     */
    public ShippingInlandWaterwayCategoriesView(Name alias) {
        this(alias, SHIPPING_INLAND_WATERWAY_CATEGORIES_VIEW);
    }

    /**
     * Create a <code>template.shipping_inland_waterway_categories_view</code>
     * table reference
     */
    public ShippingInlandWaterwayCategoriesView() {
        this(DSL.name("shipping_inland_waterway_categories_view"), null);
    }

    public <O extends Record> ShippingInlandWaterwayCategoriesView(Table<O> child, ForeignKey<O, ShippingInlandWaterwayCategoriesViewRecord> key) {
        super(child, key, SHIPPING_INLAND_WATERWAY_CATEGORIES_VIEW);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : Template.TEMPLATE;
    }

    @Override
    public ShippingInlandWaterwayCategoriesView as(String alias) {
        return new ShippingInlandWaterwayCategoriesView(DSL.name(alias), this);
    }

    @Override
    public ShippingInlandWaterwayCategoriesView as(Name alias) {
        return new ShippingInlandWaterwayCategoriesView(alias, this);
    }

    @Override
    public ShippingInlandWaterwayCategoriesView as(Table<?> alias) {
        return new ShippingInlandWaterwayCategoriesView(alias.getQualifiedName(), this);
    }

    /**
     * Rename this table
     */
    @Override
    public ShippingInlandWaterwayCategoriesView rename(String name) {
        return new ShippingInlandWaterwayCategoriesView(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public ShippingInlandWaterwayCategoriesView rename(Name name) {
        return new ShippingInlandWaterwayCategoriesView(name, null);
    }

    /**
     * Rename this table
     */
    @Override
    public ShippingInlandWaterwayCategoriesView rename(Table<?> name) {
        return new ShippingInlandWaterwayCategoriesView(name.getQualifiedName(), null);
    }

    // -------------------------------------------------------------------------
    // Row4 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row4<Integer, String, String, ShippingInlandShipDirectionType> fieldsRow() {
        return (Row4) super.fieldsRow();
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Function)}.
     */
    public <U> SelectField<U> mapping(Function4<? super Integer, ? super String, ? super String, ? super ShippingInlandShipDirectionType, ? extends U> from) {
        return convertFrom(Records.mapping(from));
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Class,
     * Function)}.
     */
    public <U> SelectField<U> mapping(Class<U> toType, Function4<? super Integer, ? super String, ? super String, ? super ShippingInlandShipDirectionType, ? extends U> from) {
        return convertFrom(toType, Records.mapping(from));
    }
}
