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
import nl.aerius.emissionservice.db.generated.template.tables.records.I18nShippingMaritimeCategoriesRecord;

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
 * Translation table for maritime shipping categories.
 * 
 * @file
 * source/database/src/main/sql/template/02-emission_factors/i18n/shipping_maritime.sql
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class I18nShippingMaritimeCategories extends TableImpl<I18nShippingMaritimeCategoriesRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of
     * <code>template.i18n_shipping_maritime_categories</code>
     */
    public static final I18nShippingMaritimeCategories I18N_SHIPPING_MARITIME_CATEGORIES = new I18nShippingMaritimeCategories();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<I18nShippingMaritimeCategoriesRecord> getRecordType() {
        return I18nShippingMaritimeCategoriesRecord.class;
    }

    /**
     * The column
     * <code>template.i18n_shipping_maritime_categories.shipping_maritime_category_id</code>.
     */
    public final TableField<I18nShippingMaritimeCategoriesRecord, Short> SHIPPING_MARITIME_CATEGORY_ID = createField(DSL.name("shipping_maritime_category_id"), SQLDataType.SMALLINT.nullable(false), this, "");

    /**
     * The column
     * <code>template.i18n_shipping_maritime_categories.language_code</code>.
     */
    public final TableField<I18nShippingMaritimeCategoriesRecord, LanguageCodeType> LANGUAGE_CODE = createField(DSL.name("language_code"), SQLDataType.VARCHAR.nullable(false).asEnumDataType(nl.aerius.emissionservice.db.generated.i18n.enums.LanguageCodeType.class), this, "");

    /**
     * The column <code>template.i18n_shipping_maritime_categories.name</code>.
     */
    public final TableField<I18nShippingMaritimeCategoriesRecord, String> NAME = createField(DSL.name("name"), SQLDataType.CLOB.nullable(false), this, "");

    /**
     * The column
     * <code>template.i18n_shipping_maritime_categories.description</code>.
     */
    public final TableField<I18nShippingMaritimeCategoriesRecord, String> DESCRIPTION = createField(DSL.name("description"), SQLDataType.CLOB, this, "");

    private I18nShippingMaritimeCategories(Name alias, Table<I18nShippingMaritimeCategoriesRecord> aliased) {
        this(alias, aliased, null);
    }

    private I18nShippingMaritimeCategories(Name alias, Table<I18nShippingMaritimeCategoriesRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment("Translation table for maritime shipping categories.\r\n\r\n@file source/database/src/main/sql/template/02-emission_factors/i18n/shipping_maritime.sql"), TableOptions.table());
    }

    /**
     * Create an aliased <code>template.i18n_shipping_maritime_categories</code>
     * table reference
     */
    public I18nShippingMaritimeCategories(String alias) {
        this(DSL.name(alias), I18N_SHIPPING_MARITIME_CATEGORIES);
    }

    /**
     * Create an aliased <code>template.i18n_shipping_maritime_categories</code>
     * table reference
     */
    public I18nShippingMaritimeCategories(Name alias) {
        this(alias, I18N_SHIPPING_MARITIME_CATEGORIES);
    }

    /**
     * Create a <code>template.i18n_shipping_maritime_categories</code> table
     * reference
     */
    public I18nShippingMaritimeCategories() {
        this(DSL.name("i18n_shipping_maritime_categories"), null);
    }

    public <O extends Record> I18nShippingMaritimeCategories(Table<O> child, ForeignKey<O, I18nShippingMaritimeCategoriesRecord> key) {
        super(child, key, I18N_SHIPPING_MARITIME_CATEGORIES);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : Template.TEMPLATE;
    }

    @Override
    public UniqueKey<I18nShippingMaritimeCategoriesRecord> getPrimaryKey() {
        return Keys.I18N_SHIPPING_MARITIME_CATEGORIES_PKEY;
    }

    @Override
    public List<ForeignKey<I18nShippingMaritimeCategoriesRecord, ?>> getReferences() {
        return Arrays.asList(Keys.I18N_SHIPPING_MARITIME_CATEGORIES__I18N_SHIPPING_MARITIME_CATEGORIES_FKEY);
    }

    private transient ShippingMaritimeCategories _shippingMaritimeCategories;

    /**
     * Get the implicit join path to the
     * <code>template.shipping_maritime_categories</code> table.
     */
    public ShippingMaritimeCategories shippingMaritimeCategories() {
        if (_shippingMaritimeCategories == null)
            _shippingMaritimeCategories = new ShippingMaritimeCategories(this, Keys.I18N_SHIPPING_MARITIME_CATEGORIES__I18N_SHIPPING_MARITIME_CATEGORIES_FKEY);

        return _shippingMaritimeCategories;
    }

    @Override
    public I18nShippingMaritimeCategories as(String alias) {
        return new I18nShippingMaritimeCategories(DSL.name(alias), this);
    }

    @Override
    public I18nShippingMaritimeCategories as(Name alias) {
        return new I18nShippingMaritimeCategories(alias, this);
    }

    @Override
    public I18nShippingMaritimeCategories as(Table<?> alias) {
        return new I18nShippingMaritimeCategories(alias.getQualifiedName(), this);
    }

    /**
     * Rename this table
     */
    @Override
    public I18nShippingMaritimeCategories rename(String name) {
        return new I18nShippingMaritimeCategories(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public I18nShippingMaritimeCategories rename(Name name) {
        return new I18nShippingMaritimeCategories(name, null);
    }

    /**
     * Rename this table
     */
    @Override
    public I18nShippingMaritimeCategories rename(Table<?> name) {
        return new I18nShippingMaritimeCategories(name.getQualifiedName(), null);
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
