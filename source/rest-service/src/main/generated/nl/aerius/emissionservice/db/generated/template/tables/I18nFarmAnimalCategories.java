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
import nl.aerius.emissionservice.db.generated.template.tables.records.I18nFarmAnimalCategoriesRecord;

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
 * Vertaaltabel voor diercategorieën.
 * 
 * @file
 * source/database/src/main/sql/template/02-emission_factors/i18n/farms.sql
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class I18nFarmAnimalCategories extends TableImpl<I18nFarmAnimalCategoriesRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of
     * <code>template.i18n_farm_animal_categories</code>
     */
    public static final I18nFarmAnimalCategories I18N_FARM_ANIMAL_CATEGORIES = new I18nFarmAnimalCategories();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<I18nFarmAnimalCategoriesRecord> getRecordType() {
        return I18nFarmAnimalCategoriesRecord.class;
    }

    /**
     * The column
     * <code>template.i18n_farm_animal_categories.farm_animal_category_id</code>.
     */
    public final TableField<I18nFarmAnimalCategoriesRecord, Integer> FARM_ANIMAL_CATEGORY_ID = createField(DSL.name("farm_animal_category_id"), SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column
     * <code>template.i18n_farm_animal_categories.language_code</code>.
     */
    public final TableField<I18nFarmAnimalCategoriesRecord, LanguageCodeType> LANGUAGE_CODE = createField(DSL.name("language_code"), SQLDataType.VARCHAR.nullable(false).asEnumDataType(nl.aerius.emissionservice.db.generated.i18n.enums.LanguageCodeType.class), this, "");

    /**
     * The column <code>template.i18n_farm_animal_categories.description</code>.
     */
    public final TableField<I18nFarmAnimalCategoriesRecord, String> DESCRIPTION = createField(DSL.name("description"), SQLDataType.CLOB, this, "");

    private I18nFarmAnimalCategories(Name alias, Table<I18nFarmAnimalCategoriesRecord> aliased) {
        this(alias, aliased, null);
    }

    private I18nFarmAnimalCategories(Name alias, Table<I18nFarmAnimalCategoriesRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment("Vertaaltabel voor diercategorieën.\r\n\r\n@file source/database/src/main/sql/template/02-emission_factors/i18n/farms.sql"), TableOptions.table());
    }

    /**
     * Create an aliased <code>template.i18n_farm_animal_categories</code> table
     * reference
     */
    public I18nFarmAnimalCategories(String alias) {
        this(DSL.name(alias), I18N_FARM_ANIMAL_CATEGORIES);
    }

    /**
     * Create an aliased <code>template.i18n_farm_animal_categories</code> table
     * reference
     */
    public I18nFarmAnimalCategories(Name alias) {
        this(alias, I18N_FARM_ANIMAL_CATEGORIES);
    }

    /**
     * Create a <code>template.i18n_farm_animal_categories</code> table
     * reference
     */
    public I18nFarmAnimalCategories() {
        this(DSL.name("i18n_farm_animal_categories"), null);
    }

    public <O extends Record> I18nFarmAnimalCategories(Table<O> child, ForeignKey<O, I18nFarmAnimalCategoriesRecord> key) {
        super(child, key, I18N_FARM_ANIMAL_CATEGORIES);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : Template.TEMPLATE;
    }

    @Override
    public UniqueKey<I18nFarmAnimalCategoriesRecord> getPrimaryKey() {
        return Keys.I18N_FARM_ANIMAL_CATEGORIES_PKEY;
    }

    @Override
    public List<ForeignKey<I18nFarmAnimalCategoriesRecord, ?>> getReferences() {
        return Arrays.asList(Keys.I18N_FARM_ANIMAL_CATEGORIES__I18N_FARM_ANIMAL_CATEGORIES_FKEY);
    }

    private transient FarmAnimalCategories _farmAnimalCategories;

    /**
     * Get the implicit join path to the
     * <code>template.farm_animal_categories</code> table.
     */
    public FarmAnimalCategories farmAnimalCategories() {
        if (_farmAnimalCategories == null)
            _farmAnimalCategories = new FarmAnimalCategories(this, Keys.I18N_FARM_ANIMAL_CATEGORIES__I18N_FARM_ANIMAL_CATEGORIES_FKEY);

        return _farmAnimalCategories;
    }

    @Override
    public I18nFarmAnimalCategories as(String alias) {
        return new I18nFarmAnimalCategories(DSL.name(alias), this);
    }

    @Override
    public I18nFarmAnimalCategories as(Name alias) {
        return new I18nFarmAnimalCategories(alias, this);
    }

    @Override
    public I18nFarmAnimalCategories as(Table<?> alias) {
        return new I18nFarmAnimalCategories(alias.getQualifiedName(), this);
    }

    /**
     * Rename this table
     */
    @Override
    public I18nFarmAnimalCategories rename(String name) {
        return new I18nFarmAnimalCategories(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public I18nFarmAnimalCategories rename(Name name) {
        return new I18nFarmAnimalCategories(name, null);
    }

    /**
     * Rename this table
     */
    @Override
    public I18nFarmAnimalCategories rename(Table<?> name) {
        return new I18nFarmAnimalCategories(name.getQualifiedName(), null);
    }

    // -------------------------------------------------------------------------
    // Row3 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row3<Integer, LanguageCodeType, String> fieldsRow() {
        return (Row3) super.fieldsRow();
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Function)}.
     */
    public <U> SelectField<U> mapping(Function3<? super Integer, ? super LanguageCodeType, ? super String, ? extends U> from) {
        return convertFrom(Records.mapping(from));
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Class,
     * Function)}.
     */
    public <U> SelectField<U> mapping(Class<U> toType, Function3<? super Integer, ? super LanguageCodeType, ? super String, ? extends U> from) {
        return convertFrom(toType, Records.mapping(from));
    }
}