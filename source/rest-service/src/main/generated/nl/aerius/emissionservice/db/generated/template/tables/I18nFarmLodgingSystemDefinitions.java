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
import nl.aerius.emissionservice.db.generated.template.tables.records.I18nFarmLodgingSystemDefinitionsRecord;

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
 * Translation table for lodging system definitions for farms.
 * 
 * @file
 * source/database/src/main/sql/template/02-emission_factors/i18n/farms.sql
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class I18nFarmLodgingSystemDefinitions extends TableImpl<I18nFarmLodgingSystemDefinitionsRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of
     * <code>template.i18n_farm_lodging_system_definitions</code>
     */
    public static final I18nFarmLodgingSystemDefinitions I18N_FARM_LODGING_SYSTEM_DEFINITIONS = new I18nFarmLodgingSystemDefinitions();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<I18nFarmLodgingSystemDefinitionsRecord> getRecordType() {
        return I18nFarmLodgingSystemDefinitionsRecord.class;
    }

    /**
     * The column
     * <code>template.i18n_farm_lodging_system_definitions.farm_lodging_system_definition_id</code>.
     */
    public final TableField<I18nFarmLodgingSystemDefinitionsRecord, Integer> FARM_LODGING_SYSTEM_DEFINITION_ID = createField(DSL.name("farm_lodging_system_definition_id"), SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column
     * <code>template.i18n_farm_lodging_system_definitions.language_code</code>.
     */
    public final TableField<I18nFarmLodgingSystemDefinitionsRecord, LanguageCodeType> LANGUAGE_CODE = createField(DSL.name("language_code"), SQLDataType.VARCHAR.nullable(false).asEnumDataType(nl.aerius.emissionservice.db.generated.i18n.enums.LanguageCodeType.class), this, "");

    /**
     * The column
     * <code>template.i18n_farm_lodging_system_definitions.description</code>.
     */
    public final TableField<I18nFarmLodgingSystemDefinitionsRecord, String> DESCRIPTION = createField(DSL.name("description"), SQLDataType.CLOB, this, "");

    private I18nFarmLodgingSystemDefinitions(Name alias, Table<I18nFarmLodgingSystemDefinitionsRecord> aliased) {
        this(alias, aliased, null);
    }

    private I18nFarmLodgingSystemDefinitions(Name alias, Table<I18nFarmLodgingSystemDefinitionsRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment("Translation table for lodging system definitions for farms.\r\n\r\n@file source/database/src/main/sql/template/02-emission_factors/i18n/farms.sql"), TableOptions.table());
    }

    /**
     * Create an aliased
     * <code>template.i18n_farm_lodging_system_definitions</code> table
     * reference
     */
    public I18nFarmLodgingSystemDefinitions(String alias) {
        this(DSL.name(alias), I18N_FARM_LODGING_SYSTEM_DEFINITIONS);
    }

    /**
     * Create an aliased
     * <code>template.i18n_farm_lodging_system_definitions</code> table
     * reference
     */
    public I18nFarmLodgingSystemDefinitions(Name alias) {
        this(alias, I18N_FARM_LODGING_SYSTEM_DEFINITIONS);
    }

    /**
     * Create a <code>template.i18n_farm_lodging_system_definitions</code> table
     * reference
     */
    public I18nFarmLodgingSystemDefinitions() {
        this(DSL.name("i18n_farm_lodging_system_definitions"), null);
    }

    public <O extends Record> I18nFarmLodgingSystemDefinitions(Table<O> child, ForeignKey<O, I18nFarmLodgingSystemDefinitionsRecord> key) {
        super(child, key, I18N_FARM_LODGING_SYSTEM_DEFINITIONS);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : Template.TEMPLATE;
    }

    @Override
    public UniqueKey<I18nFarmLodgingSystemDefinitionsRecord> getPrimaryKey() {
        return Keys.I18N_FARM_LODGING_SYSTEM_DEFINITIONS_PKEY;
    }

    @Override
    public List<ForeignKey<I18nFarmLodgingSystemDefinitionsRecord, ?>> getReferences() {
        return Arrays.asList(Keys.I18N_FARM_LODGING_SYSTEM_DEFINITIONS__I18N_FARM_LODGING_SYSTEM_DEFINITIONS_FKEY);
    }

    private transient FarmLodgingSystemDefinitions _farmLodgingSystemDefinitions;

    /**
     * Get the implicit join path to the
     * <code>template.farm_lodging_system_definitions</code> table.
     */
    public FarmLodgingSystemDefinitions farmLodgingSystemDefinitions() {
        if (_farmLodgingSystemDefinitions == null)
            _farmLodgingSystemDefinitions = new FarmLodgingSystemDefinitions(this, Keys.I18N_FARM_LODGING_SYSTEM_DEFINITIONS__I18N_FARM_LODGING_SYSTEM_DEFINITIONS_FKEY);

        return _farmLodgingSystemDefinitions;
    }

    @Override
    public I18nFarmLodgingSystemDefinitions as(String alias) {
        return new I18nFarmLodgingSystemDefinitions(DSL.name(alias), this);
    }

    @Override
    public I18nFarmLodgingSystemDefinitions as(Name alias) {
        return new I18nFarmLodgingSystemDefinitions(alias, this);
    }

    @Override
    public I18nFarmLodgingSystemDefinitions as(Table<?> alias) {
        return new I18nFarmLodgingSystemDefinitions(alias.getQualifiedName(), this);
    }

    /**
     * Rename this table
     */
    @Override
    public I18nFarmLodgingSystemDefinitions rename(String name) {
        return new I18nFarmLodgingSystemDefinitions(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public I18nFarmLodgingSystemDefinitions rename(Name name) {
        return new I18nFarmLodgingSystemDefinitions(name, null);
    }

    /**
     * Rename this table
     */
    @Override
    public I18nFarmLodgingSystemDefinitions rename(Table<?> name) {
        return new I18nFarmLodgingSystemDefinitions(name.getQualifiedName(), null);
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
