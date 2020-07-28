/*
 * This file is generated by jOOQ.
 */
package nl.overheid.aerius.emissionservice.jooq.template.tables;


import java.util.Arrays;
import java.util.List;

import nl.overheid.aerius.emissionservice.jooq.template.Keys;
import nl.overheid.aerius.emissionservice.jooq.template.Template;
import nl.overheid.aerius.emissionservice.jooq.template.tables.records.ShippingInlandCategoriesRecord;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row4;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.TableOptions;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.TableImpl;


/**
 * De categories van verschillende soorten binnenvaart-schepen.
 * In de naam wordt ook de tonnages aangegeven. De naam wordt verder gebruikt 
 * als identificatie van de categorie voor een gebruiker.
 * 
 * Standaard kenmerken voor een specifieke scheepstype kunnen via sector verkregen 
 * worden.
 * 
 * @file source/database/src/main/sql/emission_factors/02-tables/shipping_inland.sql
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class ShippingInlandCategories extends TableImpl<ShippingInlandCategoriesRecord> {

    private static final long serialVersionUID = 322887167;

    /**
     * The reference instance of <code>template.shipping_inland_categories</code>
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
     * The column <code>template.shipping_inland_categories.shipping_inland_category_id</code>.
     */
    public final TableField<ShippingInlandCategoriesRecord, Short> SHIPPING_INLAND_CATEGORY_ID = createField(DSL.name("shipping_inland_category_id"), org.jooq.impl.SQLDataType.SMALLINT.nullable(false), this, "");

    /**
     * The column <code>template.shipping_inland_categories.code</code>.
     */
    public final TableField<ShippingInlandCategoriesRecord, String> CODE = createField(DSL.name("code"), org.jooq.impl.SQLDataType.CLOB.nullable(false), this, "");

    /**
     * The column <code>template.shipping_inland_categories.name</code>.
     */
    public final TableField<ShippingInlandCategoriesRecord, String> NAME = createField(DSL.name("name"), org.jooq.impl.SQLDataType.CLOB.nullable(false), this, "");

    /**
     * The column <code>template.shipping_inland_categories.description</code>.
     */
    public final TableField<ShippingInlandCategoriesRecord, String> DESCRIPTION = createField(DSL.name("description"), org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * Create a <code>template.shipping_inland_categories</code> table reference
     */
    public ShippingInlandCategories() {
        this(DSL.name("shipping_inland_categories"), null);
    }

    /**
     * Create an aliased <code>template.shipping_inland_categories</code> table reference
     */
    public ShippingInlandCategories(String alias) {
        this(DSL.name(alias), SHIPPING_INLAND_CATEGORIES);
    }

    /**
     * Create an aliased <code>template.shipping_inland_categories</code> table reference
     */
    public ShippingInlandCategories(Name alias) {
        this(alias, SHIPPING_INLAND_CATEGORIES);
    }

    private ShippingInlandCategories(Name alias, Table<ShippingInlandCategoriesRecord> aliased) {
        this(alias, aliased, null);
    }

    private ShippingInlandCategories(Name alias, Table<ShippingInlandCategoriesRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment("De categories van verschillende soorten binnenvaart-schepen.\r\nIn de naam wordt ook de tonnages aangegeven. De naam wordt verder gebruikt als identificatie van de categorie voor een gebruiker.\r\n\r\nStandaard kenmerken voor een specifieke scheepstype kunnen via sector verkregen worden.\r\n\r\n@file source/database/src/main/sql/emission_factors/02-tables/shipping_inland.sql"), TableOptions.table());
    }

    public <O extends Record> ShippingInlandCategories(Table<O> child, ForeignKey<O, ShippingInlandCategoriesRecord> key) {
        super(child, key, SHIPPING_INLAND_CATEGORIES);
    }

    @Override
    public Schema getSchema() {
        return Template.TEMPLATE;
    }

    @Override
    public UniqueKey<ShippingInlandCategoriesRecord> getPrimaryKey() {
        return Keys.SHIPPING_INLAND_CATEGORIES_PKEY;
    }

    @Override
    public List<UniqueKey<ShippingInlandCategoriesRecord>> getKeys() {
        return Arrays.<UniqueKey<ShippingInlandCategoriesRecord>>asList(Keys.SHIPPING_INLAND_CATEGORIES_PKEY, Keys.SHIPPING_INLAND_CATEGORIES_CODE_KEY, Keys.SHIPPING_INLAND_CATEGORIES_NAME_KEY);
    }

    @Override
    public ShippingInlandCategories as(String alias) {
        return new ShippingInlandCategories(DSL.name(alias), this);
    }

    @Override
    public ShippingInlandCategories as(Name alias) {
        return new ShippingInlandCategories(alias, this);
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

    // -------------------------------------------------------------------------
    // Row4 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row4<Short, String, String, String> fieldsRow() {
        return (Row4) super.fieldsRow();
    }
}
