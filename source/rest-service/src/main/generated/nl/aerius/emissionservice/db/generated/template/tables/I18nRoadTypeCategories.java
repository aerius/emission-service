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
import nl.aerius.emissionservice.db.generated.template.tables.records.I18nRoadTypeCategoriesRecord;

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
 * Translation table for road type categories.
 * 
 * @file
 * source/database/src/main/sql/template/02-emission_factors/i18n/roads.sql
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class I18nRoadTypeCategories extends TableImpl<I18nRoadTypeCategoriesRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>template.i18n_road_type_categories</code>
     */
    public static final I18nRoadTypeCategories I18N_ROAD_TYPE_CATEGORIES = new I18nRoadTypeCategories();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<I18nRoadTypeCategoriesRecord> getRecordType() {
        return I18nRoadTypeCategoriesRecord.class;
    }

    /**
     * The column
     * <code>template.i18n_road_type_categories.road_type_category_id</code>.
     */
    public final TableField<I18nRoadTypeCategoriesRecord, Integer> ROAD_TYPE_CATEGORY_ID = createField(DSL.name("road_type_category_id"), SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>template.i18n_road_type_categories.language_code</code>.
     */
    public final TableField<I18nRoadTypeCategoriesRecord, LanguageCodeType> LANGUAGE_CODE = createField(DSL.name("language_code"), SQLDataType.VARCHAR.nullable(false).asEnumDataType(nl.aerius.emissionservice.db.generated.i18n.enums.LanguageCodeType.class), this, "");

    /**
     * The column <code>template.i18n_road_type_categories.name</code>.
     */
    public final TableField<I18nRoadTypeCategoriesRecord, String> NAME = createField(DSL.name("name"), SQLDataType.CLOB.nullable(false), this, "");

    /**
     * The column <code>template.i18n_road_type_categories.description</code>.
     */
    public final TableField<I18nRoadTypeCategoriesRecord, String> DESCRIPTION = createField(DSL.name("description"), SQLDataType.CLOB, this, "");

    private I18nRoadTypeCategories(Name alias, Table<I18nRoadTypeCategoriesRecord> aliased) {
        this(alias, aliased, null);
    }

    private I18nRoadTypeCategories(Name alias, Table<I18nRoadTypeCategoriesRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment("Translation table for road type categories.\r\n\r\n@file source/database/src/main/sql/template/02-emission_factors/i18n/roads.sql"), TableOptions.table());
    }

    /**
     * Create an aliased <code>template.i18n_road_type_categories</code> table
     * reference
     */
    public I18nRoadTypeCategories(String alias) {
        this(DSL.name(alias), I18N_ROAD_TYPE_CATEGORIES);
    }

    /**
     * Create an aliased <code>template.i18n_road_type_categories</code> table
     * reference
     */
    public I18nRoadTypeCategories(Name alias) {
        this(alias, I18N_ROAD_TYPE_CATEGORIES);
    }

    /**
     * Create a <code>template.i18n_road_type_categories</code> table reference
     */
    public I18nRoadTypeCategories() {
        this(DSL.name("i18n_road_type_categories"), null);
    }

    public <O extends Record> I18nRoadTypeCategories(Table<O> child, ForeignKey<O, I18nRoadTypeCategoriesRecord> key) {
        super(child, key, I18N_ROAD_TYPE_CATEGORIES);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : Template.TEMPLATE;
    }

    @Override
    public UniqueKey<I18nRoadTypeCategoriesRecord> getPrimaryKey() {
        return Keys.I18N_ROAD_TYPE_CATEGORIES_PKEY;
    }

    @Override
    public List<ForeignKey<I18nRoadTypeCategoriesRecord, ?>> getReferences() {
        return Arrays.asList(Keys.I18N_ROAD_TYPE_CATEGORIES__I18N_ROAD_AREA_CATEGORIES_FKEY);
    }

    private transient RoadTypeCategories _roadTypeCategories;

    /**
     * Get the implicit join path to the
     * <code>template.road_type_categories</code> table.
     */
    public RoadTypeCategories roadTypeCategories() {
        if (_roadTypeCategories == null)
            _roadTypeCategories = new RoadTypeCategories(this, Keys.I18N_ROAD_TYPE_CATEGORIES__I18N_ROAD_AREA_CATEGORIES_FKEY);

        return _roadTypeCategories;
    }

    @Override
    public I18nRoadTypeCategories as(String alias) {
        return new I18nRoadTypeCategories(DSL.name(alias), this);
    }

    @Override
    public I18nRoadTypeCategories as(Name alias) {
        return new I18nRoadTypeCategories(alias, this);
    }

    @Override
    public I18nRoadTypeCategories as(Table<?> alias) {
        return new I18nRoadTypeCategories(alias.getQualifiedName(), this);
    }

    /**
     * Rename this table
     */
    @Override
    public I18nRoadTypeCategories rename(String name) {
        return new I18nRoadTypeCategories(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public I18nRoadTypeCategories rename(Name name) {
        return new I18nRoadTypeCategories(name, null);
    }

    /**
     * Rename this table
     */
    @Override
    public I18nRoadTypeCategories rename(Table<?> name) {
        return new I18nRoadTypeCategories(name.getQualifiedName(), null);
    }

    // -------------------------------------------------------------------------
    // Row4 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row4<Integer, LanguageCodeType, String, String> fieldsRow() {
        return (Row4) super.fieldsRow();
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Function)}.
     */
    public <U> SelectField<U> mapping(Function4<? super Integer, ? super LanguageCodeType, ? super String, ? super String, ? extends U> from) {
        return convertFrom(Records.mapping(from));
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Class,
     * Function)}.
     */
    public <U> SelectField<U> mapping(Class<U> toType, Function4<? super Integer, ? super LanguageCodeType, ? super String, ? super String, ? extends U> from) {
        return convertFrom(toType, Records.mapping(from));
    }
}
