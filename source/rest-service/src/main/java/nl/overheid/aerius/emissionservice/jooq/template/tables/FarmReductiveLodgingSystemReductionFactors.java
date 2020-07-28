/*
 * This file is generated by jOOQ.
 */
package nl.overheid.aerius.emissionservice.jooq.template.tables;


import java.util.Arrays;
import java.util.List;

import nl.overheid.aerius.emissionservice.jooq.public_.tables.Substances;
import nl.overheid.aerius.emissionservice.jooq.template.Keys;
import nl.overheid.aerius.emissionservice.jooq.template.Template;
import nl.overheid.aerius.emissionservice.jooq.template.tables.records.FarmReductiveLodgingSystemReductionFactorsRecord;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row3;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.TableOptions;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.TableImpl;


/**
 * Bevat de reductiefactoren (factor 0..1) van de emissiereducerende staltechnieken.
 * 
 * Deze reductiefactor wordt toegepast op de totale emissie van het stalsysteem 
 * waarop gestapeld wordt, inclusief eventuele additionele staltechnieken 
 * die hierop gestapeld zijn.
 * 
 * @file source/database/src/main/sql/emission_factors/02-tables/farms.sql
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class FarmReductiveLodgingSystemReductionFactors extends TableImpl<FarmReductiveLodgingSystemReductionFactorsRecord> {

    private static final long serialVersionUID = 598211100;

    /**
     * The reference instance of <code>template.farm_reductive_lodging_system_reduction_factors</code>
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
     * The column <code>template.farm_reductive_lodging_system_reduction_factors.farm_reductive_lodging_system_id</code>.
     */
    public final TableField<FarmReductiveLodgingSystemReductionFactorsRecord, Integer> FARM_REDUCTIVE_LODGING_SYSTEM_ID = createField(DSL.name("farm_reductive_lodging_system_id"), org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>template.farm_reductive_lodging_system_reduction_factors.substance_id</code>.
     */
    public final TableField<FarmReductiveLodgingSystemReductionFactorsRecord, Short> SUBSTANCE_ID = createField(DSL.name("substance_id"), org.jooq.impl.SQLDataType.SMALLINT.nullable(false), this, "");

    /**
     * The column <code>template.farm_reductive_lodging_system_reduction_factors.reduction_factor</code>.
     */
    public final TableField<FarmReductiveLodgingSystemReductionFactorsRecord, Float> REDUCTION_FACTOR = createField(DSL.name("reduction_factor"), org.jooq.impl.SQLDataType.REAL.nullable(false), this, "");

    /**
     * Create a <code>template.farm_reductive_lodging_system_reduction_factors</code> table reference
     */
    public FarmReductiveLodgingSystemReductionFactors() {
        this(DSL.name("farm_reductive_lodging_system_reduction_factors"), null);
    }

    /**
     * Create an aliased <code>template.farm_reductive_lodging_system_reduction_factors</code> table reference
     */
    public FarmReductiveLodgingSystemReductionFactors(String alias) {
        this(DSL.name(alias), FARM_REDUCTIVE_LODGING_SYSTEM_REDUCTION_FACTORS);
    }

    /**
     * Create an aliased <code>template.farm_reductive_lodging_system_reduction_factors</code> table reference
     */
    public FarmReductiveLodgingSystemReductionFactors(Name alias) {
        this(alias, FARM_REDUCTIVE_LODGING_SYSTEM_REDUCTION_FACTORS);
    }

    private FarmReductiveLodgingSystemReductionFactors(Name alias, Table<FarmReductiveLodgingSystemReductionFactorsRecord> aliased) {
        this(alias, aliased, null);
    }

    private FarmReductiveLodgingSystemReductionFactors(Name alias, Table<FarmReductiveLodgingSystemReductionFactorsRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment("Bevat de reductiefactoren (factor 0..1) van de emissiereducerende staltechnieken.\r\nDeze reductiefactor wordt toegepast op de totale emissie van het stalsysteem waarop gestapeld wordt, inclusief eventuele additionele staltechnieken die hierop gestapeld zijn.\r\n\r\n@file source/database/src/main/sql/emission_factors/02-tables/farms.sql"), TableOptions.table());
    }

    public <O extends Record> FarmReductiveLodgingSystemReductionFactors(Table<O> child, ForeignKey<O, FarmReductiveLodgingSystemReductionFactorsRecord> key) {
        super(child, key, FARM_REDUCTIVE_LODGING_SYSTEM_REDUCTION_FACTORS);
    }

    @Override
    public Schema getSchema() {
        return Template.TEMPLATE;
    }

    @Override
    public UniqueKey<FarmReductiveLodgingSystemReductionFactorsRecord> getPrimaryKey() {
        return Keys.FARM_REDUCTIVE_LODGING_SYSTEM_REDUCTION_FACTORS_PKEY;
    }

    @Override
    public List<UniqueKey<FarmReductiveLodgingSystemReductionFactorsRecord>> getKeys() {
        return Arrays.<UniqueKey<FarmReductiveLodgingSystemReductionFactorsRecord>>asList(Keys.FARM_REDUCTIVE_LODGING_SYSTEM_REDUCTION_FACTORS_PKEY);
    }

    @Override
    public List<ForeignKey<FarmReductiveLodgingSystemReductionFactorsRecord, ?>> getReferences() {
        return Arrays.<ForeignKey<FarmReductiveLodgingSystemReductionFactorsRecord, ?>>asList(Keys.FARM_REDUCTIVE_LODGING_SYSTEM_REDUCTION_FACTORS__FARM_REDUCTIVE_LODGING_SYSTEM_REDUCTION_FACTORS_FKEY_TYPES, Keys.FARM_REDUCTIVE_LODGING_SYSTEM_REDUCTION_FACTORS__FARM_REDUCTIVE_LODGING_SYSTEM_REDUCTION_FACTORS_FKEY_SUBSTANCES);
    }

    public FarmReductiveLodgingSystems farmReductiveLodgingSystems() {
        return new FarmReductiveLodgingSystems(this, Keys.FARM_REDUCTIVE_LODGING_SYSTEM_REDUCTION_FACTORS__FARM_REDUCTIVE_LODGING_SYSTEM_REDUCTION_FACTORS_FKEY_TYPES);
    }

    public Substances substances() {
        return new Substances(this, Keys.FARM_REDUCTIVE_LODGING_SYSTEM_REDUCTION_FACTORS__FARM_REDUCTIVE_LODGING_SYSTEM_REDUCTION_FACTORS_FKEY_SUBSTANCES);
    }

    @Override
    public FarmReductiveLodgingSystemReductionFactors as(String alias) {
        return new FarmReductiveLodgingSystemReductionFactors(DSL.name(alias), this);
    }

    @Override
    public FarmReductiveLodgingSystemReductionFactors as(Name alias) {
        return new FarmReductiveLodgingSystemReductionFactors(alias, this);
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

    // -------------------------------------------------------------------------
    // Row3 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row3<Integer, Short, Float> fieldsRow() {
        return (Row3) super.fieldsRow();
    }
}
