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
import nl.aerius.emissionservice.db.generated.template.tables.records.I18nMachineryFuelTypesRecord;

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
 * Vertaaltabel voor categorieën van verschillende soorten brandstof.
 * 
 * @file
 * source/database/src/main/sql/template/02-emission_factors/i18n/machinery_types.sql
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class I18nMachineryFuelTypes extends TableImpl<I18nMachineryFuelTypesRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>template.i18n_machinery_fuel_types</code>
     */
    public static final I18nMachineryFuelTypes I18N_MACHINERY_FUEL_TYPES = new I18nMachineryFuelTypes();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<I18nMachineryFuelTypesRecord> getRecordType() {
        return I18nMachineryFuelTypesRecord.class;
    }

    /**
     * The column
     * <code>template.i18n_machinery_fuel_types.machinery_fuel_type_id</code>.
     */
    public final TableField<I18nMachineryFuelTypesRecord, Integer> MACHINERY_FUEL_TYPE_ID = createField(DSL.name("machinery_fuel_type_id"), SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>template.i18n_machinery_fuel_types.language_code</code>.
     */
    public final TableField<I18nMachineryFuelTypesRecord, LanguageCodeType> LANGUAGE_CODE = createField(DSL.name("language_code"), SQLDataType.VARCHAR.nullable(false).asEnumDataType(nl.aerius.emissionservice.db.generated.i18n.enums.LanguageCodeType.class), this, "");

    /**
     * The column <code>template.i18n_machinery_fuel_types.name</code>.
     */
    public final TableField<I18nMachineryFuelTypesRecord, String> NAME = createField(DSL.name("name"), SQLDataType.CLOB.nullable(false), this, "");

    private I18nMachineryFuelTypes(Name alias, Table<I18nMachineryFuelTypesRecord> aliased) {
        this(alias, aliased, null);
    }

    private I18nMachineryFuelTypes(Name alias, Table<I18nMachineryFuelTypesRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment("Vertaaltabel voor categorieën van verschillende soorten brandstof.\r\n\r\n@file source/database/src/main/sql/template/02-emission_factors/i18n/machinery_types.sql"), TableOptions.table());
    }

    /**
     * Create an aliased <code>template.i18n_machinery_fuel_types</code> table
     * reference
     */
    public I18nMachineryFuelTypes(String alias) {
        this(DSL.name(alias), I18N_MACHINERY_FUEL_TYPES);
    }

    /**
     * Create an aliased <code>template.i18n_machinery_fuel_types</code> table
     * reference
     */
    public I18nMachineryFuelTypes(Name alias) {
        this(alias, I18N_MACHINERY_FUEL_TYPES);
    }

    /**
     * Create a <code>template.i18n_machinery_fuel_types</code> table reference
     */
    public I18nMachineryFuelTypes() {
        this(DSL.name("i18n_machinery_fuel_types"), null);
    }

    public <O extends Record> I18nMachineryFuelTypes(Table<O> child, ForeignKey<O, I18nMachineryFuelTypesRecord> key) {
        super(child, key, I18N_MACHINERY_FUEL_TYPES);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : Template.TEMPLATE;
    }

    @Override
    public UniqueKey<I18nMachineryFuelTypesRecord> getPrimaryKey() {
        return Keys.I18N_MACHINERY_FUEL_TYPES_PKEY;
    }

    @Override
    public List<ForeignKey<I18nMachineryFuelTypesRecord, ?>> getReferences() {
        return Arrays.asList(Keys.I18N_MACHINERY_FUEL_TYPES__I18N_MACHINERY_FUEL_TYPES_FKEY);
    }

    private transient MachineryFuelTypes _machineryFuelTypes;

    /**
     * Get the implicit join path to the
     * <code>template.machinery_fuel_types</code> table.
     */
    public MachineryFuelTypes machineryFuelTypes() {
        if (_machineryFuelTypes == null)
            _machineryFuelTypes = new MachineryFuelTypes(this, Keys.I18N_MACHINERY_FUEL_TYPES__I18N_MACHINERY_FUEL_TYPES_FKEY);

        return _machineryFuelTypes;
    }

    @Override
    public I18nMachineryFuelTypes as(String alias) {
        return new I18nMachineryFuelTypes(DSL.name(alias), this);
    }

    @Override
    public I18nMachineryFuelTypes as(Name alias) {
        return new I18nMachineryFuelTypes(alias, this);
    }

    @Override
    public I18nMachineryFuelTypes as(Table<?> alias) {
        return new I18nMachineryFuelTypes(alias.getQualifiedName(), this);
    }

    /**
     * Rename this table
     */
    @Override
    public I18nMachineryFuelTypes rename(String name) {
        return new I18nMachineryFuelTypes(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public I18nMachineryFuelTypes rename(Name name) {
        return new I18nMachineryFuelTypes(name, null);
    }

    /**
     * Rename this table
     */
    @Override
    public I18nMachineryFuelTypes rename(Table<?> name) {
        return new I18nMachineryFuelTypes(name.getQualifiedName(), null);
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