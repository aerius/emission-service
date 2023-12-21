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
import nl.aerius.emissionservice.db.generated.template.tables.records.I18nFarmLodgingTypesRecord;

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
 * Translation table for lodging systems for farms.
 * 
 * @file
 * source/database/src/main/sql/template/02-emission_factors/i18n/farms.sql
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class I18nFarmLodgingTypes extends TableImpl<I18nFarmLodgingTypesRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>template.i18n_farm_lodging_types</code>
     */
    public static final I18nFarmLodgingTypes I18N_FARM_LODGING_TYPES = new I18nFarmLodgingTypes();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<I18nFarmLodgingTypesRecord> getRecordType() {
        return I18nFarmLodgingTypesRecord.class;
    }

    /**
     * The column
     * <code>template.i18n_farm_lodging_types.farm_lodging_type_id</code>.
     */
    public final TableField<I18nFarmLodgingTypesRecord, Integer> FARM_LODGING_TYPE_ID = createField(DSL.name("farm_lodging_type_id"), SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>template.i18n_farm_lodging_types.language_code</code>.
     */
    public final TableField<I18nFarmLodgingTypesRecord, LanguageCodeType> LANGUAGE_CODE = createField(DSL.name("language_code"), SQLDataType.VARCHAR.nullable(false).asEnumDataType(nl.aerius.emissionservice.db.generated.i18n.enums.LanguageCodeType.class), this, "");

    /**
     * The column <code>template.i18n_farm_lodging_types.description</code>.
     */
    public final TableField<I18nFarmLodgingTypesRecord, String> DESCRIPTION = createField(DSL.name("description"), SQLDataType.CLOB, this, "");

    private I18nFarmLodgingTypes(Name alias, Table<I18nFarmLodgingTypesRecord> aliased) {
        this(alias, aliased, null);
    }

    private I18nFarmLodgingTypes(Name alias, Table<I18nFarmLodgingTypesRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment("Translation table for lodging systems for farms.\r\n\r\n@file source/database/src/main/sql/template/02-emission_factors/i18n/farms.sql"), TableOptions.table());
    }

    /**
     * Create an aliased <code>template.i18n_farm_lodging_types</code> table
     * reference
     */
    public I18nFarmLodgingTypes(String alias) {
        this(DSL.name(alias), I18N_FARM_LODGING_TYPES);
    }

    /**
     * Create an aliased <code>template.i18n_farm_lodging_types</code> table
     * reference
     */
    public I18nFarmLodgingTypes(Name alias) {
        this(alias, I18N_FARM_LODGING_TYPES);
    }

    /**
     * Create a <code>template.i18n_farm_lodging_types</code> table reference
     */
    public I18nFarmLodgingTypes() {
        this(DSL.name("i18n_farm_lodging_types"), null);
    }

    public <O extends Record> I18nFarmLodgingTypes(Table<O> child, ForeignKey<O, I18nFarmLodgingTypesRecord> key) {
        super(child, key, I18N_FARM_LODGING_TYPES);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : Template.TEMPLATE;
    }

    @Override
    public UniqueKey<I18nFarmLodgingTypesRecord> getPrimaryKey() {
        return Keys.I18N_FARM_LODGING_TYPES_PKEY;
    }

    @Override
    public List<ForeignKey<I18nFarmLodgingTypesRecord, ?>> getReferences() {
        return Arrays.asList(Keys.I18N_FARM_LODGING_TYPES__I18N_FARM_LODGING_TYPES_FKEY);
    }

    private transient FarmLodgingTypes _farmLodgingTypes;

    /**
     * Get the implicit join path to the
     * <code>template.farm_lodging_types</code> table.
     */
    public FarmLodgingTypes farmLodgingTypes() {
        if (_farmLodgingTypes == null)
            _farmLodgingTypes = new FarmLodgingTypes(this, Keys.I18N_FARM_LODGING_TYPES__I18N_FARM_LODGING_TYPES_FKEY);

        return _farmLodgingTypes;
    }

    @Override
    public I18nFarmLodgingTypes as(String alias) {
        return new I18nFarmLodgingTypes(DSL.name(alias), this);
    }

    @Override
    public I18nFarmLodgingTypes as(Name alias) {
        return new I18nFarmLodgingTypes(alias, this);
    }

    @Override
    public I18nFarmLodgingTypes as(Table<?> alias) {
        return new I18nFarmLodgingTypes(alias.getQualifiedName(), this);
    }

    /**
     * Rename this table
     */
    @Override
    public I18nFarmLodgingTypes rename(String name) {
        return new I18nFarmLodgingTypes(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public I18nFarmLodgingTypes rename(Name name) {
        return new I18nFarmLodgingTypes(name, null);
    }

    /**
     * Rename this table
     */
    @Override
    public I18nFarmLodgingTypes rename(Table<?> name) {
        return new I18nFarmLodgingTypes(name.getQualifiedName(), null);
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
