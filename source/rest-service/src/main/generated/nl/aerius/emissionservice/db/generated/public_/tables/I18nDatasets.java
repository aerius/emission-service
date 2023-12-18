/*
 * This file is generated by jOOQ.
 */
package nl.aerius.emissionservice.db.generated.public_.tables;


import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

import nl.aerius.emissionservice.db.generated.i18n.enums.LanguageCodeType;
import nl.aerius.emissionservice.db.generated.public_.Keys;
import nl.aerius.emissionservice.db.generated.public_.Public;
import nl.aerius.emissionservice.db.generated.public_.tables.records.I18nDatasetsRecord;

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
 * Vertaaltabel voor de verschillende datasets die beschikbaar zijn.
 * 
 * @file source/database/src/main/sql/datasets/02-tables.sql
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class I18nDatasets extends TableImpl<I18nDatasetsRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>public.i18n_datasets</code>
     */
    public static final I18nDatasets I18N_DATASETS = new I18nDatasets();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<I18nDatasetsRecord> getRecordType() {
        return I18nDatasetsRecord.class;
    }

    /**
     * The column <code>public.i18n_datasets.code</code>.
     */
    public final TableField<I18nDatasetsRecord, String> CODE = createField(DSL.name("code"), SQLDataType.CLOB.nullable(false), this, "");

    /**
     * The column <code>public.i18n_datasets.language_code</code>.
     */
    public final TableField<I18nDatasetsRecord, LanguageCodeType> LANGUAGE_CODE = createField(DSL.name("language_code"), SQLDataType.VARCHAR.nullable(false).asEnumDataType(nl.aerius.emissionservice.db.generated.i18n.enums.LanguageCodeType.class), this, "");

    /**
     * The column <code>public.i18n_datasets.name</code>.
     */
    public final TableField<I18nDatasetsRecord, String> NAME = createField(DSL.name("name"), SQLDataType.CLOB.nullable(false), this, "");

    /**
     * The column <code>public.i18n_datasets.description</code>.
     */
    public final TableField<I18nDatasetsRecord, String> DESCRIPTION = createField(DSL.name("description"), SQLDataType.CLOB, this, "");

    private I18nDatasets(Name alias, Table<I18nDatasetsRecord> aliased) {
        this(alias, aliased, null);
    }

    private I18nDatasets(Name alias, Table<I18nDatasetsRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment("Vertaaltabel voor de verschillende datasets die beschikbaar zijn.\r\n\r\n@file source/database/src/main/sql/datasets/02-tables.sql"), TableOptions.table());
    }

    /**
     * Create an aliased <code>public.i18n_datasets</code> table reference
     */
    public I18nDatasets(String alias) {
        this(DSL.name(alias), I18N_DATASETS);
    }

    /**
     * Create an aliased <code>public.i18n_datasets</code> table reference
     */
    public I18nDatasets(Name alias) {
        this(alias, I18N_DATASETS);
    }

    /**
     * Create a <code>public.i18n_datasets</code> table reference
     */
    public I18nDatasets() {
        this(DSL.name("i18n_datasets"), null);
    }

    public <O extends Record> I18nDatasets(Table<O> child, ForeignKey<O, I18nDatasetsRecord> key) {
        super(child, key, I18N_DATASETS);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : Public.PUBLIC;
    }

    @Override
    public UniqueKey<I18nDatasetsRecord> getPrimaryKey() {
        return Keys.I18N_DATASETS_PKEY;
    }

    @Override
    public List<ForeignKey<I18nDatasetsRecord, ?>> getReferences() {
        return Arrays.asList(Keys.I18N_DATASETS__I18N_DATASETS);
    }

    private transient Datasets _datasets;

    /**
     * Get the implicit join path to the <code>public.datasets</code> table.
     */
    public Datasets datasets() {
        if (_datasets == null)
            _datasets = new Datasets(this, Keys.I18N_DATASETS__I18N_DATASETS);

        return _datasets;
    }

    @Override
    public I18nDatasets as(String alias) {
        return new I18nDatasets(DSL.name(alias), this);
    }

    @Override
    public I18nDatasets as(Name alias) {
        return new I18nDatasets(alias, this);
    }

    @Override
    public I18nDatasets as(Table<?> alias) {
        return new I18nDatasets(alias.getQualifiedName(), this);
    }

    /**
     * Rename this table
     */
    @Override
    public I18nDatasets rename(String name) {
        return new I18nDatasets(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public I18nDatasets rename(Name name) {
        return new I18nDatasets(name, null);
    }

    /**
     * Rename this table
     */
    @Override
    public I18nDatasets rename(Table<?> name) {
        return new I18nDatasets(name.getQualifiedName(), null);
    }

    // -------------------------------------------------------------------------
    // Row4 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row4<String, LanguageCodeType, String, String> fieldsRow() {
        return (Row4) super.fieldsRow();
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Function)}.
     */
    public <U> SelectField<U> mapping(Function4<? super String, ? super LanguageCodeType, ? super String, ? super String, ? extends U> from) {
        return convertFrom(Records.mapping(from));
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Class,
     * Function)}.
     */
    public <U> SelectField<U> mapping(Class<U> toType, Function4<? super String, ? super LanguageCodeType, ? super String, ? super String, ? extends U> from) {
        return convertFrom(toType, Records.mapping(from));
    }
}