/*
 * This file is generated by jOOQ.
 */
package nl.aerius.emissionservice.db.generated.template.tables;


import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

import nl.aerius.emissionservice.db.generated.i18n.enums.LanguageCodeType;
import nl.aerius.emissionservice.db.generated.template.Keys;
import nl.aerius.emissionservice.db.generated.template.Template;
import nl.aerius.emissionservice.db.generated.template.tables.records.I18nShippingInlandCategoriesRecord;

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
 * Vertaaltabel voor categorieën van verschillende soorten binnenvaart-schepen.
 * 
 * @file
 * source/database/src/main/sql/template/02-emission_factors/i18n/shipping_inland.sql
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class I18nShippingInlandCategories extends TableImpl<I18nShippingInlandCategoriesRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of
     * <code>template.i18n_shipping_inland_categories</code>
     */
    public static final I18nShippingInlandCategories I18N_SHIPPING_INLAND_CATEGORIES = new I18nShippingInlandCategories();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<I18nShippingInlandCategoriesRecord> getRecordType() {
        return I18nShippingInlandCategoriesRecord.class;
    }

    /**
     * The column
     * <code>template.i18n_shipping_inland_categories.shipping_inland_category_id</code>.
     */
    public final TableField<I18nShippingInlandCategoriesRecord, Short> SHIPPING_INLAND_CATEGORY_ID = createField(DSL.name("shipping_inland_category_id"), SQLDataType.SMALLINT.nullable(false), this, "");

    /**
     * The column
     * <code>template.i18n_shipping_inland_categories.language_code</code>.
     */
    public final TableField<I18nShippingInlandCategoriesRecord, LanguageCodeType> LANGUAGE_CODE = createField(DSL.name("language_code"), SQLDataType.VARCHAR.nullable(false).asEnumDataType(nl.aerius.emissionservice.db.generated.i18n.enums.LanguageCodeType.class), this, "");

    /**
     * The column <code>template.i18n_shipping_inland_categories.name</code>.
     */
    public final TableField<I18nShippingInlandCategoriesRecord, String> NAME = createField(DSL.name("name"), SQLDataType.CLOB.nullable(false), this, "");

    /**
     * The column
     * <code>template.i18n_shipping_inland_categories.description</code>.
     */
    public final TableField<I18nShippingInlandCategoriesRecord, String> DESCRIPTION = createField(DSL.name("description"), SQLDataType.CLOB, this, "");

    private I18nShippingInlandCategories(Name alias, Table<I18nShippingInlandCategoriesRecord> aliased) {
        this(alias, aliased, null);
    }

    private I18nShippingInlandCategories(Name alias, Table<I18nShippingInlandCategoriesRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment("Vertaaltabel voor categorieën van verschillende soorten binnenvaart-schepen.\r\n\r\n@file source/database/src/main/sql/template/02-emission_factors/i18n/shipping_inland.sql"), TableOptions.table());
    }

    /**
     * Create an aliased <code>template.i18n_shipping_inland_categories</code>
     * table reference
     */
    public I18nShippingInlandCategories(String alias) {
        this(DSL.name(alias), I18N_SHIPPING_INLAND_CATEGORIES);
    }

    /**
     * Create an aliased <code>template.i18n_shipping_inland_categories</code>
     * table reference
     */
    public I18nShippingInlandCategories(Name alias) {
        this(alias, I18N_SHIPPING_INLAND_CATEGORIES);
    }

    /**
     * Create a <code>template.i18n_shipping_inland_categories</code> table
     * reference
     */
    public I18nShippingInlandCategories() {
        this(DSL.name("i18n_shipping_inland_categories"), null);
    }

    public <O extends Record> I18nShippingInlandCategories(Table<O> child, ForeignKey<O, I18nShippingInlandCategoriesRecord> key) {
        super(child, key, I18N_SHIPPING_INLAND_CATEGORIES);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : Template.TEMPLATE;
    }

    @Override
    public UniqueKey<I18nShippingInlandCategoriesRecord> getPrimaryKey() {
        return Keys.I18N_SHIPPING_INLAND_CATEGORIES_PKEY;
    }

    @Override
    public List<ForeignKey<I18nShippingInlandCategoriesRecord, ?>> getReferences() {
        return Arrays.asList(Keys.I18N_SHIPPING_INLAND_CATEGORIES__I18N_SHIPPING_INLAND_CATEGOR_FKEY);
    }

    private transient ShippingInlandCategories _shippingInlandCategories;

    /**
     * Get the implicit join path to the
     * <code>template.shipping_inland_categories</code> table.
     */
    public ShippingInlandCategories shippingInlandCategories() {
        if (_shippingInlandCategories == null)
            _shippingInlandCategories = new ShippingInlandCategories(this, Keys.I18N_SHIPPING_INLAND_CATEGORIES__I18N_SHIPPING_INLAND_CATEGOR_FKEY);

        return _shippingInlandCategories;
    }

    @Override
    public I18nShippingInlandCategories as(String alias) {
        return new I18nShippingInlandCategories(DSL.name(alias), this);
    }

    @Override
    public I18nShippingInlandCategories as(Name alias) {
        return new I18nShippingInlandCategories(alias, this);
    }

    @Override
    public I18nShippingInlandCategories as(Table<?> alias) {
        return new I18nShippingInlandCategories(alias.getQualifiedName(), this);
    }

    /**
     * Rename this table
     */
    @Override
    public I18nShippingInlandCategories rename(String name) {
        return new I18nShippingInlandCategories(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public I18nShippingInlandCategories rename(Name name) {
        return new I18nShippingInlandCategories(name, null);
    }

    /**
     * Rename this table
     */
    @Override
    public I18nShippingInlandCategories rename(Table<?> name) {
        return new I18nShippingInlandCategories(name.getQualifiedName(), null);
    }

    // -------------------------------------------------------------------------
    // Row4 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row4<Short, LanguageCodeType, String, String> fieldsRow() {
        return (Row4) super.fieldsRow();
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Function)}.
     */
    public <U> SelectField<U> mapping(Function4<? super Short, ? super LanguageCodeType, ? super String, ? super String, ? extends U> from) {
        return convertFrom(Records.mapping(from));
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Class,
     * Function)}.
     */
    public <U> SelectField<U> mapping(Class<U> toType, Function4<? super Short, ? super LanguageCodeType, ? super String, ? super String, ? extends U> from) {
        return convertFrom(toType, Records.mapping(from));
    }
}