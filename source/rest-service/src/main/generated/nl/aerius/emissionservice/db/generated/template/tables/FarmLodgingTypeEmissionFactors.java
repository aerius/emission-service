/*
 * This file is generated by jOOQ.
 */
package nl.aerius.emissionservice.db.generated.template.tables;


import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

import nl.aerius.emissionservice.db.generated.public_.tables.Substances;
import nl.aerius.emissionservice.db.generated.template.Keys;
import nl.aerius.emissionservice.db.generated.template.Template;
import nl.aerius.emissionservice.db.generated.template.tables.records.FarmLodgingTypeEmissionFactorsRecord;

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
 * Table containing the emission factors (kg/year) for farm lodging systems.
 * 
 * @file
 * source/database/src/main/sql/template/02-emission_factors/02-tables/farms.sql
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class FarmLodgingTypeEmissionFactors extends TableImpl<FarmLodgingTypeEmissionFactorsRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of
     * <code>template.farm_lodging_type_emission_factors</code>
     */
    public static final FarmLodgingTypeEmissionFactors FARM_LODGING_TYPE_EMISSION_FACTORS = new FarmLodgingTypeEmissionFactors();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<FarmLodgingTypeEmissionFactorsRecord> getRecordType() {
        return FarmLodgingTypeEmissionFactorsRecord.class;
    }

    /**
     * The column
     * <code>template.farm_lodging_type_emission_factors.farm_lodging_type_id</code>.
     */
    public final TableField<FarmLodgingTypeEmissionFactorsRecord, Integer> FARM_LODGING_TYPE_ID = createField(DSL.name("farm_lodging_type_id"), SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column
     * <code>template.farm_lodging_type_emission_factors.substance_id</code>.
     */
    public final TableField<FarmLodgingTypeEmissionFactorsRecord, Short> SUBSTANCE_ID = createField(DSL.name("substance_id"), SQLDataType.SMALLINT.nullable(false), this, "");

    /**
     * The column
     * <code>template.farm_lodging_type_emission_factors.emission_factor</code>.
     */
    public final TableField<FarmLodgingTypeEmissionFactorsRecord, Float> EMISSION_FACTOR = createField(DSL.name("emission_factor"), nl.aerius.emissionservice.db.generated.public_.Domains.POSREAL.getDataType().nullable(false), this, "");

    private FarmLodgingTypeEmissionFactors(Name alias, Table<FarmLodgingTypeEmissionFactorsRecord> aliased) {
        this(alias, aliased, null);
    }

    private FarmLodgingTypeEmissionFactors(Name alias, Table<FarmLodgingTypeEmissionFactorsRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment("Table containing the emission factors (kg/year) for farm lodging systems.\r\n\r\n@file source/database/src/main/sql/template/02-emission_factors/02-tables/farms.sql"), TableOptions.table());
    }

    /**
     * Create an aliased
     * <code>template.farm_lodging_type_emission_factors</code> table reference
     */
    public FarmLodgingTypeEmissionFactors(String alias) {
        this(DSL.name(alias), FARM_LODGING_TYPE_EMISSION_FACTORS);
    }

    /**
     * Create an aliased
     * <code>template.farm_lodging_type_emission_factors</code> table reference
     */
    public FarmLodgingTypeEmissionFactors(Name alias) {
        this(alias, FARM_LODGING_TYPE_EMISSION_FACTORS);
    }

    /**
     * Create a <code>template.farm_lodging_type_emission_factors</code> table
     * reference
     */
    public FarmLodgingTypeEmissionFactors() {
        this(DSL.name("farm_lodging_type_emission_factors"), null);
    }

    public <O extends Record> FarmLodgingTypeEmissionFactors(Table<O> child, ForeignKey<O, FarmLodgingTypeEmissionFactorsRecord> key) {
        super(child, key, FARM_LODGING_TYPE_EMISSION_FACTORS);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : Template.TEMPLATE;
    }

    @Override
    public UniqueKey<FarmLodgingTypeEmissionFactorsRecord> getPrimaryKey() {
        return Keys.FARM_LODGING_TYPE_EMISSION_FACTORS_PKEY;
    }

    @Override
    public List<ForeignKey<FarmLodgingTypeEmissionFactorsRecord, ?>> getReferences() {
        return Arrays.asList(Keys.FARM_LODGING_TYPE_EMISSION_FACTORS__FARM_LODGING_TYPE_EMISSION_FACTORS_FKEY_FARM_LODGING_TYPES, Keys.FARM_LODGING_TYPE_EMISSION_FACTORS__FARM_LODGING_TYPE_EMISSION_FACTORS_FKEY_SUBSTANCES);
    }

    private transient FarmLodgingTypes _farmLodgingTypes;
    private transient Substances _substances;

    /**
     * Get the implicit join path to the
     * <code>template.farm_lodging_types</code> table.
     */
    public FarmLodgingTypes farmLodgingTypes() {
        if (_farmLodgingTypes == null)
            _farmLodgingTypes = new FarmLodgingTypes(this, Keys.FARM_LODGING_TYPE_EMISSION_FACTORS__FARM_LODGING_TYPE_EMISSION_FACTORS_FKEY_FARM_LODGING_TYPES);

        return _farmLodgingTypes;
    }

    /**
     * Get the implicit join path to the <code>public.substances</code> table.
     */
    public Substances substances() {
        if (_substances == null)
            _substances = new Substances(this, Keys.FARM_LODGING_TYPE_EMISSION_FACTORS__FARM_LODGING_TYPE_EMISSION_FACTORS_FKEY_SUBSTANCES);

        return _substances;
    }

    @Override
    public FarmLodgingTypeEmissionFactors as(String alias) {
        return new FarmLodgingTypeEmissionFactors(DSL.name(alias), this);
    }

    @Override
    public FarmLodgingTypeEmissionFactors as(Name alias) {
        return new FarmLodgingTypeEmissionFactors(alias, this);
    }

    @Override
    public FarmLodgingTypeEmissionFactors as(Table<?> alias) {
        return new FarmLodgingTypeEmissionFactors(alias.getQualifiedName(), this);
    }

    /**
     * Rename this table
     */
    @Override
    public FarmLodgingTypeEmissionFactors rename(String name) {
        return new FarmLodgingTypeEmissionFactors(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public FarmLodgingTypeEmissionFactors rename(Name name) {
        return new FarmLodgingTypeEmissionFactors(name, null);
    }

    /**
     * Rename this table
     */
    @Override
    public FarmLodgingTypeEmissionFactors rename(Table<?> name) {
        return new FarmLodgingTypeEmissionFactors(name.getQualifiedName(), null);
    }

    // -------------------------------------------------------------------------
    // Row3 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row3<Integer, Short, Float> fieldsRow() {
        return (Row3) super.fieldsRow();
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Function)}.
     */
    public <U> SelectField<U> mapping(Function3<? super Integer, ? super Short, ? super Float, ? extends U> from) {
        return convertFrom(Records.mapping(from));
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Class,
     * Function)}.
     */
    public <U> SelectField<U> mapping(Class<U> toType, Function3<? super Integer, ? super Short, ? super Float, ? extends U> from) {
        return convertFrom(toType, Records.mapping(from));
    }
}
