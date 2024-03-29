/*
 * This file is generated by jOOQ.
 */
package nl.aerius.emissionservice.db.generated.template.tables;


import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

import nl.aerius.emissionservice.db.generated.template.Keys;
import nl.aerius.emissionservice.db.generated.template.Template;
import nl.aerius.emissionservice.db.generated.template.tables.records.ShippingInlandCategoriesRecord;

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
 * Table containing the inland shipping categories.
 * 
 * @file
 * source/database/src/main/sql/template/02-emission_factors/02-tables/shipping_inland.sql
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class ShippingInlandCategories extends TableImpl<ShippingInlandCategoriesRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of
     * <code>template.shipping_inland_categories</code>
     */
    public static final ShippingInlandCategories SHIPPING_INLAND_CATEGORIES = new ShippingInlandCategories();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<ShippingInlandCategoriesRecord> getRecordType() {
        return ShippingInlandCategoriesRecord.class;
    }

    /**
     * The column
     * <code>template.shipping_inland_categories.shipping_inland_category_id</code>.
     */
    public final TableField<ShippingInlandCategoriesRecord, Short> SHIPPING_INLAND_CATEGORY_ID = createField(DSL.name("shipping_inland_category_id"), SQLDataType.SMALLINT.nullable(false), this, "");

    /**
     * The column <code>template.shipping_inland_categories.code</code>.
     */
    public final TableField<ShippingInlandCategoriesRecord, String> CODE = createField(DSL.name("code"), SQLDataType.CLOB.nullable(false), this, "");

    /**
     * The column <code>template.shipping_inland_categories.name</code>.
     */
    public final TableField<ShippingInlandCategoriesRecord, String> NAME = createField(DSL.name("name"), SQLDataType.CLOB.nullable(false), this, "");

    /**
     * The column <code>template.shipping_inland_categories.description</code>.
     */
    public final TableField<ShippingInlandCategoriesRecord, String> DESCRIPTION = createField(DSL.name("description"), SQLDataType.CLOB, this, "");

    private ShippingInlandCategories(Name alias, Table<ShippingInlandCategoriesRecord> aliased) {
        this(alias, aliased, null);
    }

    private ShippingInlandCategories(Name alias, Table<ShippingInlandCategoriesRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment("Table containing the inland shipping categories.\r\n\r\n@file source/database/src/main/sql/template/02-emission_factors/02-tables/shipping_inland.sql"), TableOptions.table());
    }

    /**
     * Create an aliased <code>template.shipping_inland_categories</code> table
     * reference
     */
    public ShippingInlandCategories(String alias) {
        this(DSL.name(alias), SHIPPING_INLAND_CATEGORIES);
    }

    /**
     * Create an aliased <code>template.shipping_inland_categories</code> table
     * reference
     */
    public ShippingInlandCategories(Name alias) {
        this(alias, SHIPPING_INLAND_CATEGORIES);
    }

    /**
     * Create a <code>template.shipping_inland_categories</code> table reference
     */
    public ShippingInlandCategories() {
        this(DSL.name("shipping_inland_categories"), null);
    }

    public <O extends Record> ShippingInlandCategories(Table<O> child, ForeignKey<O, ShippingInlandCategoriesRecord> key) {
        super(child, key, SHIPPING_INLAND_CATEGORIES);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : Template.TEMPLATE;
    }

    @Override
    public UniqueKey<ShippingInlandCategoriesRecord> getPrimaryKey() {
        return Keys.SHIPPING_INLAND_CATEGORIES_PKEY;
    }

    @Override
    public List<UniqueKey<ShippingInlandCategoriesRecord>> getUniqueKeys() {
        return Arrays.asList(Keys.SHIPPING_INLAND_CATEGORIES_CODE_KEY, Keys.SHIPPING_INLAND_CATEGORIES_NAME_KEY);
    }

    @Override
    public ShippingInlandCategories as(String alias) {
        return new ShippingInlandCategories(DSL.name(alias), this);
    }

    @Override
    public ShippingInlandCategories as(Name alias) {
        return new ShippingInlandCategories(alias, this);
    }

    @Override
    public ShippingInlandCategories as(Table<?> alias) {
        return new ShippingInlandCategories(alias.getQualifiedName(), this);
    }

    /**
     * Rename this table
     */
    @Override
    public ShippingInlandCategories rename(String name) {
        return new ShippingInlandCategories(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public ShippingInlandCategories rename(Name name) {
        return new ShippingInlandCategories(name, null);
    }

    /**
     * Rename this table
     */
    @Override
    public ShippingInlandCategories rename(Table<?> name) {
        return new ShippingInlandCategories(name.getQualifiedName(), null);
    }

    // -------------------------------------------------------------------------
    // Row4 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row4<Short, String, String, String> fieldsRow() {
        return (Row4) super.fieldsRow();
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Function)}.
     */
    public <U> SelectField<U> mapping(Function4<? super Short, ? super String, ? super String, ? super String, ? extends U> from) {
        return convertFrom(Records.mapping(from));
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Class,
     * Function)}.
     */
    public <U> SelectField<U> mapping(Class<U> toType, Function4<? super Short, ? super String, ? super String, ? super String, ? extends U> from) {
        return convertFrom(toType, Records.mapping(from));
    }
}
