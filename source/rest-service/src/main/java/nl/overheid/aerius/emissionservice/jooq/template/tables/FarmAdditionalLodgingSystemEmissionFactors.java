/*
 * This file is generated by jOOQ.
 */
package nl.overheid.aerius.emissionservice.jooq.template.tables;


import java.util.Arrays;
import java.util.List;

import nl.overheid.aerius.emissionservice.jooq.public_.tables.Substances;
import nl.overheid.aerius.emissionservice.jooq.template.Keys;
import nl.overheid.aerius.emissionservice.jooq.template.Template;
import nl.overheid.aerius.emissionservice.jooq.template.tables.records.FarmAdditionalLodgingSystemEmissionFactorsRecord;

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
 * Bevat de emissiefactoren (kg/jaar) van de additionele staltechnieken.
 * Deze emissiefactor wordt extra toegepast op een deel van het aantal dieren 
 * van het stalsysteem waarop gestapeld wordt.
 * 
 * @file source/database/src/main/sql/emission_factors/02-tables/farms.sql
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class FarmAdditionalLodgingSystemEmissionFactors extends TableImpl<FarmAdditionalLodgingSystemEmissionFactorsRecord> {

    private static final long serialVersionUID = 574968780;

    /**
     * The reference instance of <code>template.farm_additional_lodging_system_emission_factors</code>
     */
    public static final FarmAdditionalLodgingSystemEmissionFactors FARM_ADDITIONAL_LODGING_SYSTEM_EMISSION_FACTORS = new FarmAdditionalLodgingSystemEmissionFactors();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<FarmAdditionalLodgingSystemEmissionFactorsRecord> getRecordType() {
        return FarmAdditionalLodgingSystemEmissionFactorsRecord.class;
    }

    /**
     * The column <code>template.farm_additional_lodging_system_emission_factors.farm_additional_lodging_system_id</code>.
     */
    public final TableField<FarmAdditionalLodgingSystemEmissionFactorsRecord, Integer> FARM_ADDITIONAL_LODGING_SYSTEM_ID = createField(DSL.name("farm_additional_lodging_system_id"), org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>template.farm_additional_lodging_system_emission_factors.substance_id</code>.
     */
    public final TableField<FarmAdditionalLodgingSystemEmissionFactorsRecord, Short> SUBSTANCE_ID = createField(DSL.name("substance_id"), org.jooq.impl.SQLDataType.SMALLINT.nullable(false), this, "");

    /**
     * The column <code>template.farm_additional_lodging_system_emission_factors.emission_factor</code>.
     */
    public final TableField<FarmAdditionalLodgingSystemEmissionFactorsRecord, Float> EMISSION_FACTOR = createField(DSL.name("emission_factor"), org.jooq.impl.SQLDataType.REAL.nullable(false), this, "");

    /**
     * Create a <code>template.farm_additional_lodging_system_emission_factors</code> table reference
     */
    public FarmAdditionalLodgingSystemEmissionFactors() {
        this(DSL.name("farm_additional_lodging_system_emission_factors"), null);
    }

    /**
     * Create an aliased <code>template.farm_additional_lodging_system_emission_factors</code> table reference
     */
    public FarmAdditionalLodgingSystemEmissionFactors(String alias) {
        this(DSL.name(alias), FARM_ADDITIONAL_LODGING_SYSTEM_EMISSION_FACTORS);
    }

    /**
     * Create an aliased <code>template.farm_additional_lodging_system_emission_factors</code> table reference
     */
    public FarmAdditionalLodgingSystemEmissionFactors(Name alias) {
        this(alias, FARM_ADDITIONAL_LODGING_SYSTEM_EMISSION_FACTORS);
    }

    private FarmAdditionalLodgingSystemEmissionFactors(Name alias, Table<FarmAdditionalLodgingSystemEmissionFactorsRecord> aliased) {
        this(alias, aliased, null);
    }

    private FarmAdditionalLodgingSystemEmissionFactors(Name alias, Table<FarmAdditionalLodgingSystemEmissionFactorsRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment("Bevat de emissiefactoren (kg/jaar) van de additionele staltechnieken.\r\nDeze emissiefactor wordt extra toegepast op een deel van het aantal dieren van het stalsysteem waarop gestapeld wordt.\r\n\r\n@file source/database/src/main/sql/emission_factors/02-tables/farms.sql"), TableOptions.table());
    }

    public <O extends Record> FarmAdditionalLodgingSystemEmissionFactors(Table<O> child, ForeignKey<O, FarmAdditionalLodgingSystemEmissionFactorsRecord> key) {
        super(child, key, FARM_ADDITIONAL_LODGING_SYSTEM_EMISSION_FACTORS);
    }

    @Override
    public Schema getSchema() {
        return Template.TEMPLATE;
    }

    @Override
    public UniqueKey<FarmAdditionalLodgingSystemEmissionFactorsRecord> getPrimaryKey() {
        return Keys.FARM_ADDITIONAL_LODGING_SYSTEM_EMISSION_FACTORS_PKEY;
    }

    @Override
    public List<UniqueKey<FarmAdditionalLodgingSystemEmissionFactorsRecord>> getKeys() {
        return Arrays.<UniqueKey<FarmAdditionalLodgingSystemEmissionFactorsRecord>>asList(Keys.FARM_ADDITIONAL_LODGING_SYSTEM_EMISSION_FACTORS_PKEY);
    }

    @Override
    public List<ForeignKey<FarmAdditionalLodgingSystemEmissionFactorsRecord, ?>> getReferences() {
        return Arrays.<ForeignKey<FarmAdditionalLodgingSystemEmissionFactorsRecord, ?>>asList(Keys.FARM_ADDITIONAL_LODGING_SYSTEM_EMISSION_FACTORS__FARM_ADDITIONAL_LODGING_SYSTEM_EMISSION_FACTORS_FKEY_TYPES, Keys.FARM_ADDITIONAL_LODGING_SYSTEM_EMISSION_FACTORS__FARM_ADDITIONAL_LODGING_SYSTEM_EMISSION_FACTORS_FKEY_SUBSTANCES);
    }

    public FarmAdditionalLodgingSystems farmAdditionalLodgingSystems() {
        return new FarmAdditionalLodgingSystems(this, Keys.FARM_ADDITIONAL_LODGING_SYSTEM_EMISSION_FACTORS__FARM_ADDITIONAL_LODGING_SYSTEM_EMISSION_FACTORS_FKEY_TYPES);
    }

    public Substances substances() {
        return new Substances(this, Keys.FARM_ADDITIONAL_LODGING_SYSTEM_EMISSION_FACTORS__FARM_ADDITIONAL_LODGING_SYSTEM_EMISSION_FACTORS_FKEY_SUBSTANCES);
    }

    @Override
    public FarmAdditionalLodgingSystemEmissionFactors as(String alias) {
        return new FarmAdditionalLodgingSystemEmissionFactors(DSL.name(alias), this);
    }

    @Override
    public FarmAdditionalLodgingSystemEmissionFactors as(Name alias) {
        return new FarmAdditionalLodgingSystemEmissionFactors(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public FarmAdditionalLodgingSystemEmissionFactors rename(String name) {
        return new FarmAdditionalLodgingSystemEmissionFactors(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public FarmAdditionalLodgingSystemEmissionFactors rename(Name name) {
        return new FarmAdditionalLodgingSystemEmissionFactors(name, null);
    }

    // -------------------------------------------------------------------------
    // Row3 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row3<Integer, Short, Float> fieldsRow() {
        return (Row3) super.fieldsRow();
    }
}
