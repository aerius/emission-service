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
import nl.aerius.emissionservice.db.generated.template.tables.records.FarmReductiveLodgingSystemReductionFactorsRecord;

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
 * Table containing the reduction factors (factor 0..1) for the emission
 * reducing lodging techniques.
 * These reduction factors are applied on the total emission of the lodging
 * system on which it is stacked, including any additional lodging techniques
 * that have been stacked.
 * 
 * @file
 * source/database/src/main/sql/template/02-emission_factors/02-tables/farms.sql
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class FarmReductiveLodgingSystemReductionFactors extends TableImpl<FarmReductiveLodgingSystemReductionFactorsRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of
     * <code>template.farm_reductive_lodging_system_reduction_factors</code>
     */
    public static final FarmReductiveLodgingSystemReductionFactors FARM_REDUCTIVE_LODGING_SYSTEM_REDUCTION_FACTORS = new FarmReductiveLodgingSystemReductionFactors();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<FarmReductiveLodgingSystemReductionFactorsRecord> getRecordType() {
        return FarmReductiveLodgingSystemReductionFactorsRecord.class;
    }

    /**
     * The column
     * <code>template.farm_reductive_lodging_system_reduction_factors.farm_reductive_lodging_system_id</code>.
     */
    public final TableField<FarmReductiveLodgingSystemReductionFactorsRecord, Integer> FARM_REDUCTIVE_LODGING_SYSTEM_ID = createField(DSL.name("farm_reductive_lodging_system_id"), SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column
     * <code>template.farm_reductive_lodging_system_reduction_factors.substance_id</code>.
     */
    public final TableField<FarmReductiveLodgingSystemReductionFactorsRecord, Short> SUBSTANCE_ID = createField(DSL.name("substance_id"), SQLDataType.SMALLINT.nullable(false), this, "");

    /**
     * The column
     * <code>template.farm_reductive_lodging_system_reduction_factors.reduction_factor</code>.
     */
    public final TableField<FarmReductiveLodgingSystemReductionFactorsRecord, Float> REDUCTION_FACTOR = createField(DSL.name("reduction_factor"), nl.aerius.emissionservice.db.generated.public_.Domains.FRACTION.getDataType().nullable(false), this, "");

    private FarmReductiveLodgingSystemReductionFactors(Name alias, Table<FarmReductiveLodgingSystemReductionFactorsRecord> aliased) {
        this(alias, aliased, null);
    }

    private FarmReductiveLodgingSystemReductionFactors(Name alias, Table<FarmReductiveLodgingSystemReductionFactorsRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment("Table containing the reduction factors (factor 0..1) for the emission reducing lodging techniques.\r\nThese reduction factors are applied on the total emission of the lodging system on which it is stacked, including any additional lodging techniques that have been stacked.\r\n\r\n@file source/database/src/main/sql/template/02-emission_factors/02-tables/farms.sql"), TableOptions.table());
    }

    /**
     * Create an aliased
     * <code>template.farm_reductive_lodging_system_reduction_factors</code>
     * table reference
     */
    public FarmReductiveLodgingSystemReductionFactors(String alias) {
        this(DSL.name(alias), FARM_REDUCTIVE_LODGING_SYSTEM_REDUCTION_FACTORS);
    }

    /**
     * Create an aliased
     * <code>template.farm_reductive_lodging_system_reduction_factors</code>
     * table reference
     */
    public FarmReductiveLodgingSystemReductionFactors(Name alias) {
        this(alias, FARM_REDUCTIVE_LODGING_SYSTEM_REDUCTION_FACTORS);
    }

    /**
     * Create a
     * <code>template.farm_reductive_lodging_system_reduction_factors</code>
     * table reference
     */
    public FarmReductiveLodgingSystemReductionFactors() {
        this(DSL.name("farm_reductive_lodging_system_reduction_factors"), null);
    }

    public <O extends Record> FarmReductiveLodgingSystemReductionFactors(Table<O> child, ForeignKey<O, FarmReductiveLodgingSystemReductionFactorsRecord> key) {
        super(child, key, FARM_REDUCTIVE_LODGING_SYSTEM_REDUCTION_FACTORS);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : Template.TEMPLATE;
    }

    @Override
    public UniqueKey<FarmReductiveLodgingSystemReductionFactorsRecord> getPrimaryKey() {
        return Keys.FARM_REDUCTIVE_LODGING_SYSTEM_REDUCTION_FACTORS_PKEY;
    }

    @Override
    public List<ForeignKey<FarmReductiveLodgingSystemReductionFactorsRecord, ?>> getReferences() {
        return Arrays.asList(Keys.FARM_REDUCTIVE_LODGING_SYSTEM_REDUCTION_FACTORS__FARM_REDUCTIVE_LODGING_SYSTEM_REDUCTION_FACTORS_FKEY_TYPES, Keys.FARM_REDUCTIVE_LODGING_SYSTEM_REDUCTION_FACTORS__FARM_REDUCTIVE_LODGING_SYSTEM_REDUCTION_FACTORS_FKEY_SUBSTANCES);
    }

    private transient FarmReductiveLodgingSystems _farmReductiveLodgingSystems;
    private transient Substances _substances;

    /**
     * Get the implicit join path to the
     * <code>template.farm_reductive_lodging_systems</code> table.
     */
    public FarmReductiveLodgingSystems farmReductiveLodgingSystems() {
        if (_farmReductiveLodgingSystems == null)
            _farmReductiveLodgingSystems = new FarmReductiveLodgingSystems(this, Keys.FARM_REDUCTIVE_LODGING_SYSTEM_REDUCTION_FACTORS__FARM_REDUCTIVE_LODGING_SYSTEM_REDUCTION_FACTORS_FKEY_TYPES);

        return _farmReductiveLodgingSystems;
    }

    /**
     * Get the implicit join path to the <code>public.substances</code> table.
     */
    public Substances substances() {
        if (_substances == null)
            _substances = new Substances(this, Keys.FARM_REDUCTIVE_LODGING_SYSTEM_REDUCTION_FACTORS__FARM_REDUCTIVE_LODGING_SYSTEM_REDUCTION_FACTORS_FKEY_SUBSTANCES);

        return _substances;
    }

    @Override
    public FarmReductiveLodgingSystemReductionFactors as(String alias) {
        return new FarmReductiveLodgingSystemReductionFactors(DSL.name(alias), this);
    }

    @Override
    public FarmReductiveLodgingSystemReductionFactors as(Name alias) {
        return new FarmReductiveLodgingSystemReductionFactors(alias, this);
    }

    @Override
    public FarmReductiveLodgingSystemReductionFactors as(Table<?> alias) {
        return new FarmReductiveLodgingSystemReductionFactors(alias.getQualifiedName(), this);
    }

    /**
     * Rename this table
     */
    @Override
    public FarmReductiveLodgingSystemReductionFactors rename(String name) {
        return new FarmReductiveLodgingSystemReductionFactors(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public FarmReductiveLodgingSystemReductionFactors rename(Name name) {
        return new FarmReductiveLodgingSystemReductionFactors(name, null);
    }

    /**
     * Rename this table
     */
    @Override
    public FarmReductiveLodgingSystemReductionFactors rename(Table<?> name) {
        return new FarmReductiveLodgingSystemReductionFactors(name.getQualifiedName(), null);
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
