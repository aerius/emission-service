/*
 * This file is generated by jOOQ.
 */
package nl.overheid.aerius.emissionservice.jooq.template.tables;


import java.util.Arrays;
import java.util.List;

import nl.overheid.aerius.emissionservice.jooq.public_.tables.Substances;
import nl.overheid.aerius.emissionservice.jooq.template.Keys;
import nl.overheid.aerius.emissionservice.jooq.template.Template;
import nl.overheid.aerius.emissionservice.jooq.template.tables.records.FarmLodgingFodderMeasureReductionFactorsRecord;

import org.jooq.Check;
import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row5;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.TableOptions;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.Internal;
import org.jooq.impl.TableImpl;


/**
 * Bevat de reductie factoren (factor 0..1) van de voer- en managementmaatregelen.
 * 
 * Als er maatregelen op een stalsysteem worden toegepast, wordt van de combinatie 
 * van maatregelen eerst een enkele reductiefactor bepaalt. Deze reductiefactor 
 * wordt vervolgens toegepast op de totale emissie van het stalsysteem waarop 
 * gestapeld wordt, inclusief eventuele additionele en emissiereducerende 
 * staltechnieken die hierop gestapeld zijn.
 * 
 * @column reduction_factor_floor De reductiefactor voor de emissie vanaf 
 * de vloer
 * @column reduction_factor_cellar De reductiefactor voor de emissie uit de 
 * mestkelder
 * @column reduction_factor_total De gecombineerde reductiefactor voor de 
 * emissie vanaf de vloer en uit de mestkelder
 * 
 * @file source/database/src/main/sql/template/02_emission_factors/02-tables/farms.sql
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class FarmLodgingFodderMeasureReductionFactors extends TableImpl<FarmLodgingFodderMeasureReductionFactorsRecord> {

    private static final long serialVersionUID = -1485811274;

    /**
     * The reference instance of <code>template.farm_lodging_fodder_measure_reduction_factors</code>
     */
    public static final FarmLodgingFodderMeasureReductionFactors FARM_LODGING_FODDER_MEASURE_REDUCTION_FACTORS = new FarmLodgingFodderMeasureReductionFactors();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<FarmLodgingFodderMeasureReductionFactorsRecord> getRecordType() {
        return FarmLodgingFodderMeasureReductionFactorsRecord.class;
    }

    /**
     * The column <code>template.farm_lodging_fodder_measure_reduction_factors.farm_lodging_fodder_measure_id</code>.
     */
    public final TableField<FarmLodgingFodderMeasureReductionFactorsRecord, Integer> FARM_LODGING_FODDER_MEASURE_ID = createField(DSL.name("farm_lodging_fodder_measure_id"), org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>template.farm_lodging_fodder_measure_reduction_factors.substance_id</code>.
     */
    public final TableField<FarmLodgingFodderMeasureReductionFactorsRecord, Short> SUBSTANCE_ID = createField(DSL.name("substance_id"), org.jooq.impl.SQLDataType.SMALLINT.nullable(false), this, "");

    /**
     * The column <code>template.farm_lodging_fodder_measure_reduction_factors.reduction_factor_floor</code>.
     */
    public final TableField<FarmLodgingFodderMeasureReductionFactorsRecord, Float> REDUCTION_FACTOR_FLOOR = createField(DSL.name("reduction_factor_floor"), org.jooq.impl.SQLDataType.REAL.nullable(false), this, "");

    /**
     * The column <code>template.farm_lodging_fodder_measure_reduction_factors.reduction_factor_cellar</code>.
     */
    public final TableField<FarmLodgingFodderMeasureReductionFactorsRecord, Float> REDUCTION_FACTOR_CELLAR = createField(DSL.name("reduction_factor_cellar"), org.jooq.impl.SQLDataType.REAL.nullable(false), this, "");

    /**
     * The column <code>template.farm_lodging_fodder_measure_reduction_factors.reduction_factor_total</code>.
     */
    public final TableField<FarmLodgingFodderMeasureReductionFactorsRecord, Float> REDUCTION_FACTOR_TOTAL = createField(DSL.name("reduction_factor_total"), org.jooq.impl.SQLDataType.REAL.nullable(false), this, "");

    /**
     * Create a <code>template.farm_lodging_fodder_measure_reduction_factors</code> table reference
     */
    public FarmLodgingFodderMeasureReductionFactors() {
        this(DSL.name("farm_lodging_fodder_measure_reduction_factors"), null);
    }

    /**
     * Create an aliased <code>template.farm_lodging_fodder_measure_reduction_factors</code> table reference
     */
    public FarmLodgingFodderMeasureReductionFactors(String alias) {
        this(DSL.name(alias), FARM_LODGING_FODDER_MEASURE_REDUCTION_FACTORS);
    }

    /**
     * Create an aliased <code>template.farm_lodging_fodder_measure_reduction_factors</code> table reference
     */
    public FarmLodgingFodderMeasureReductionFactors(Name alias) {
        this(alias, FARM_LODGING_FODDER_MEASURE_REDUCTION_FACTORS);
    }

    private FarmLodgingFodderMeasureReductionFactors(Name alias, Table<FarmLodgingFodderMeasureReductionFactorsRecord> aliased) {
        this(alias, aliased, null);
    }

    private FarmLodgingFodderMeasureReductionFactors(Name alias, Table<FarmLodgingFodderMeasureReductionFactorsRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment("Bevat de reductie factoren (factor 0..1) van de voer- en managementmaatregelen.\r\nAls er maatregelen op een stalsysteem worden toegepast, wordt van de combinatie van maatregelen eerst een enkele reductiefactor bepaalt. Deze reductiefactor wordt vervolgens toegepast op de totale emissie van het stalsysteem waarop gestapeld wordt, inclusief eventuele additionele en emissiereducerende staltechnieken die hierop gestapeld zijn.\r\n\r\n@column reduction_factor_floor De reductiefactor voor de emissie vanaf de vloer\r\n@column reduction_factor_cellar De reductiefactor voor de emissie uit de mestkelder\r\n@column reduction_factor_total De gecombineerde reductiefactor voor de emissie vanaf de vloer en uit de mestkelder\r\n\r\n@file source/database/src/main/sql/template/02_emission_factors/02-tables/farms.sql"), TableOptions.table());
    }

    public <O extends Record> FarmLodgingFodderMeasureReductionFactors(Table<O> child, ForeignKey<O, FarmLodgingFodderMeasureReductionFactorsRecord> key) {
        super(child, key, FARM_LODGING_FODDER_MEASURE_REDUCTION_FACTORS);
    }

    @Override
    public Schema getSchema() {
        return Template.TEMPLATE;
    }

    @Override
    public UniqueKey<FarmLodgingFodderMeasureReductionFactorsRecord> getPrimaryKey() {
        return Keys.FARM_LODGING_FODDER_MEASURE_REDUCTION_FACTORS_PKEY;
    }

    @Override
    public List<UniqueKey<FarmLodgingFodderMeasureReductionFactorsRecord>> getKeys() {
        return Arrays.<UniqueKey<FarmLodgingFodderMeasureReductionFactorsRecord>>asList(Keys.FARM_LODGING_FODDER_MEASURE_REDUCTION_FACTORS_PKEY);
    }

    @Override
    public List<ForeignKey<FarmLodgingFodderMeasureReductionFactorsRecord, ?>> getReferences() {
        return Arrays.<ForeignKey<FarmLodgingFodderMeasureReductionFactorsRecord, ?>>asList(Keys.FARM_LODGING_FODDER_MEASURE_REDUCTION_FACTORS__FARM_LODGING_FODDER_MEASURE_REDUCTION_FACTORS_FKEY_MEASURES, Keys.FARM_LODGING_FODDER_MEASURE_REDUCTION_FACTORS__FARM_LODGING_FODDER_MEASURE_REDUCTION_FACTORS_FKEY_SUBSTANCES);
    }

    public FarmLodgingFodderMeasures farmLodgingFodderMeasures() {
        return new FarmLodgingFodderMeasures(this, Keys.FARM_LODGING_FODDER_MEASURE_REDUCTION_FACTORS__FARM_LODGING_FODDER_MEASURE_REDUCTION_FACTORS_FKEY_MEASURES);
    }

    public Substances substances() {
        return new Substances(this, Keys.FARM_LODGING_FODDER_MEASURE_REDUCTION_FACTORS__FARM_LODGING_FODDER_MEASURE_REDUCTION_FACTORS_FKEY_SUBSTANCES);
    }

    @Override
    public List<Check<FarmLodgingFodderMeasureReductionFactorsRecord>> getChecks() {
        return Arrays.<Check<FarmLodgingFodderMeasureReductionFactorsRecord>>asList(
              Internal.createCheck(this, DSL.name("farm_lodging_fodder_measure_reduction_factors_chk_factotal"), "(\nCASE\n    WHEN ((reduction_factor_floor)::real = (reduction_factor_cellar)::real) THEN ((reduction_factor_total)::real = (reduction_factor_floor)::real)\n    ELSE ((reduction_factor_total)::real <= ((reduction_factor_floor)::real + (reduction_factor_cellar)::real))\nEND)", true)
        );
    }

    @Override
    public FarmLodgingFodderMeasureReductionFactors as(String alias) {
        return new FarmLodgingFodderMeasureReductionFactors(DSL.name(alias), this);
    }

    @Override
    public FarmLodgingFodderMeasureReductionFactors as(Name alias) {
        return new FarmLodgingFodderMeasureReductionFactors(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public FarmLodgingFodderMeasureReductionFactors rename(String name) {
        return new FarmLodgingFodderMeasureReductionFactors(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public FarmLodgingFodderMeasureReductionFactors rename(Name name) {
        return new FarmLodgingFodderMeasureReductionFactors(name, null);
    }

    // -------------------------------------------------------------------------
    // Row5 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row5<Integer, Short, Float, Float, Float> fieldsRow() {
        return (Row5) super.fieldsRow();
    }
}
