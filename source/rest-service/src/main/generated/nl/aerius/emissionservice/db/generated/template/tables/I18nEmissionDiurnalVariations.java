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
import nl.aerius.emissionservice.db.generated.template.tables.records.I18nEmissionDiurnalVariationsRecord;

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
 * Table containing i18n localization for different types of diurnal variation.
 * 
 * @file source/database/src/main/sql/template/01-sectors/i18n/base_keys.sql
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class I18nEmissionDiurnalVariations extends TableImpl<I18nEmissionDiurnalVariationsRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of
     * <code>template.i18n_emission_diurnal_variations</code>
     */
    public static final I18nEmissionDiurnalVariations I18N_EMISSION_DIURNAL_VARIATIONS = new I18nEmissionDiurnalVariations();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<I18nEmissionDiurnalVariationsRecord> getRecordType() {
        return I18nEmissionDiurnalVariationsRecord.class;
    }

    /**
     * The column
     * <code>template.i18n_emission_diurnal_variations.emission_diurnal_variation_id</code>.
     */
    public final TableField<I18nEmissionDiurnalVariationsRecord, Integer> EMISSION_DIURNAL_VARIATION_ID = createField(DSL.name("emission_diurnal_variation_id"), SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column
     * <code>template.i18n_emission_diurnal_variations.language_code</code>.
     */
    public final TableField<I18nEmissionDiurnalVariationsRecord, LanguageCodeType> LANGUAGE_CODE = createField(DSL.name("language_code"), SQLDataType.VARCHAR.nullable(false).asEnumDataType(nl.aerius.emissionservice.db.generated.i18n.enums.LanguageCodeType.class), this, "");

    /**
     * The column <code>template.i18n_emission_diurnal_variations.name</code>.
     */
    public final TableField<I18nEmissionDiurnalVariationsRecord, String> NAME = createField(DSL.name("name"), SQLDataType.CLOB.nullable(false), this, "");

    /**
     * The column
     * <code>template.i18n_emission_diurnal_variations.description</code>.
     */
    public final TableField<I18nEmissionDiurnalVariationsRecord, String> DESCRIPTION = createField(DSL.name("description"), SQLDataType.CLOB, this, "");

    private I18nEmissionDiurnalVariations(Name alias, Table<I18nEmissionDiurnalVariationsRecord> aliased) {
        this(alias, aliased, null);
    }

    private I18nEmissionDiurnalVariations(Name alias, Table<I18nEmissionDiurnalVariationsRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment("Table containing i18n localization for different types of diurnal variation.\r\n\r\n@file source/database/src/main/sql/template/01-sectors/i18n/base_keys.sql"), TableOptions.table());
    }

    /**
     * Create an aliased <code>template.i18n_emission_diurnal_variations</code>
     * table reference
     */
    public I18nEmissionDiurnalVariations(String alias) {
        this(DSL.name(alias), I18N_EMISSION_DIURNAL_VARIATIONS);
    }

    /**
     * Create an aliased <code>template.i18n_emission_diurnal_variations</code>
     * table reference
     */
    public I18nEmissionDiurnalVariations(Name alias) {
        this(alias, I18N_EMISSION_DIURNAL_VARIATIONS);
    }

    /**
     * Create a <code>template.i18n_emission_diurnal_variations</code> table
     * reference
     */
    public I18nEmissionDiurnalVariations() {
        this(DSL.name("i18n_emission_diurnal_variations"), null);
    }

    public <O extends Record> I18nEmissionDiurnalVariations(Table<O> child, ForeignKey<O, I18nEmissionDiurnalVariationsRecord> key) {
        super(child, key, I18N_EMISSION_DIURNAL_VARIATIONS);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : Template.TEMPLATE;
    }

    @Override
    public UniqueKey<I18nEmissionDiurnalVariationsRecord> getPrimaryKey() {
        return Keys.I18N_EMISSION_DIURNAL_VARIATIONS_PKEY;
    }

    @Override
    public List<UniqueKey<I18nEmissionDiurnalVariationsRecord>> getUniqueKeys() {
        return Arrays.asList(Keys.I18N_EMISSION_DIURNAL_VARIATIONS_UNIQUE_NAME);
    }

    @Override
    public List<ForeignKey<I18nEmissionDiurnalVariationsRecord, ?>> getReferences() {
        return Arrays.asList(Keys.I18N_EMISSION_DIURNAL_VARIATIONS__I18N_EMISSION_DIURNAL_VARIATIONS_FKEY);
    }

    private transient EmissionDiurnalVariations _emissionDiurnalVariations;

    /**
     * Get the implicit join path to the
     * <code>template.emission_diurnal_variations</code> table.
     */
    public EmissionDiurnalVariations emissionDiurnalVariations() {
        if (_emissionDiurnalVariations == null)
            _emissionDiurnalVariations = new EmissionDiurnalVariations(this, Keys.I18N_EMISSION_DIURNAL_VARIATIONS__I18N_EMISSION_DIURNAL_VARIATIONS_FKEY);

        return _emissionDiurnalVariations;
    }

    @Override
    public I18nEmissionDiurnalVariations as(String alias) {
        return new I18nEmissionDiurnalVariations(DSL.name(alias), this);
    }

    @Override
    public I18nEmissionDiurnalVariations as(Name alias) {
        return new I18nEmissionDiurnalVariations(alias, this);
    }

    @Override
    public I18nEmissionDiurnalVariations as(Table<?> alias) {
        return new I18nEmissionDiurnalVariations(alias.getQualifiedName(), this);
    }

    /**
     * Rename this table
     */
    @Override
    public I18nEmissionDiurnalVariations rename(String name) {
        return new I18nEmissionDiurnalVariations(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public I18nEmissionDiurnalVariations rename(Name name) {
        return new I18nEmissionDiurnalVariations(name, null);
    }

    /**
     * Rename this table
     */
    @Override
    public I18nEmissionDiurnalVariations rename(Table<?> name) {
        return new I18nEmissionDiurnalVariations(name.getQualifiedName(), null);
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
