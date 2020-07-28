/*
 * This file is generated by jOOQ.
 */
package nl.overheid.aerius.emissionservice.jooq.template.tables;


import java.util.Arrays;
import java.util.List;

import nl.overheid.aerius.emissionservice.jooq.template.Keys;
import nl.overheid.aerius.emissionservice.jooq.template.Template;
import nl.overheid.aerius.emissionservice.jooq.template.tables.records.FarmLodgingFodderMeasuresRecord;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row4;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.TableOptions;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.TableImpl;


/**
 * Voer- en managementmaatregelen; zie http://wetten.overheid.nl/BWBR0013629/geldigheidsdatum_11-06-2015#Bijlage2 
 * en http://www.infomil.nl/onderwerpen/landbouw-tuinbouw/ammoniak/rav/pas-maatregelen/alle-pas-maatregelen/ 
 * Dit zijn maatregelen die zorgen voor minder emissies en toegepast kunnen 
 * worden op een stalsysteem (farm_lodging_type).
 * 
 * @file source/database/src/main/sql/emission_factors/02-tables/farms.sql
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class FarmLodgingFodderMeasures extends TableImpl<FarmLodgingFodderMeasuresRecord> {

    private static final long serialVersionUID = -1378614930;

    /**
     * The reference instance of <code>template.farm_lodging_fodder_measures</code>
     */
    public static final FarmLodgingFodderMeasures FARM_LODGING_FODDER_MEASURES = new FarmLodgingFodderMeasures();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<FarmLodgingFodderMeasuresRecord> getRecordType() {
        return FarmLodgingFodderMeasuresRecord.class;
    }

    /**
     * The column <code>template.farm_lodging_fodder_measures.farm_lodging_fodder_measure_id</code>.
     */
    public final TableField<FarmLodgingFodderMeasuresRecord, Integer> FARM_LODGING_FODDER_MEASURE_ID = createField(DSL.name("farm_lodging_fodder_measure_id"), org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>template.farm_lodging_fodder_measures.code</code>.
     */
    public final TableField<FarmLodgingFodderMeasuresRecord, String> CODE = createField(DSL.name("code"), org.jooq.impl.SQLDataType.CLOB.nullable(false), this, "");

    /**
     * The column <code>template.farm_lodging_fodder_measures.name</code>.
     */
    public final TableField<FarmLodgingFodderMeasuresRecord, String> NAME = createField(DSL.name("name"), org.jooq.impl.SQLDataType.CLOB.nullable(false), this, "");

    /**
     * The column <code>template.farm_lodging_fodder_measures.description</code>.
     */
    public final TableField<FarmLodgingFodderMeasuresRecord, String> DESCRIPTION = createField(DSL.name("description"), org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * Create a <code>template.farm_lodging_fodder_measures</code> table reference
     */
    public FarmLodgingFodderMeasures() {
        this(DSL.name("farm_lodging_fodder_measures"), null);
    }

    /**
     * Create an aliased <code>template.farm_lodging_fodder_measures</code> table reference
     */
    public FarmLodgingFodderMeasures(String alias) {
        this(DSL.name(alias), FARM_LODGING_FODDER_MEASURES);
    }

    /**
     * Create an aliased <code>template.farm_lodging_fodder_measures</code> table reference
     */
    public FarmLodgingFodderMeasures(Name alias) {
        this(alias, FARM_LODGING_FODDER_MEASURES);
    }

    private FarmLodgingFodderMeasures(Name alias, Table<FarmLodgingFodderMeasuresRecord> aliased) {
        this(alias, aliased, null);
    }

    private FarmLodgingFodderMeasures(Name alias, Table<FarmLodgingFodderMeasuresRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment("Voer- en managementmaatregelen; zie http://wetten.overheid.nl/BWBR0013629/geldigheidsdatum_11-06-2015#Bijlage2 en http://www.infomil.nl/onderwerpen/landbouw-tuinbouw/ammoniak/rav/pas-maatregelen/alle-pas-maatregelen/ Dit zijn maatregelen die zorgen voor minder emissies en toegepast kunnen worden op een stalsysteem (farm_lodging_type).\r\n\r\n@file source/database/src/main/sql/emission_factors/02-tables/farms.sql"), TableOptions.table());
    }

    public <O extends Record> FarmLodgingFodderMeasures(Table<O> child, ForeignKey<O, FarmLodgingFodderMeasuresRecord> key) {
        super(child, key, FARM_LODGING_FODDER_MEASURES);
    }

    @Override
    public Schema getSchema() {
        return Template.TEMPLATE;
    }

    @Override
    public UniqueKey<FarmLodgingFodderMeasuresRecord> getPrimaryKey() {
        return Keys.FARM_LODGING_FODDER_MEASURES_PKEY;
    }

    @Override
    public List<UniqueKey<FarmLodgingFodderMeasuresRecord>> getKeys() {
        return Arrays.<UniqueKey<FarmLodgingFodderMeasuresRecord>>asList(Keys.FARM_LODGING_FODDER_MEASURES_PKEY, Keys.FARM_LODGING_FODDER_MEASURES_CODE_KEY, Keys.FARM_LODGING_FODDER_MEASURES_NAME_KEY);
    }

    @Override
    public FarmLodgingFodderMeasures as(String alias) {
        return new FarmLodgingFodderMeasures(DSL.name(alias), this);
    }

    @Override
    public FarmLodgingFodderMeasures as(Name alias) {
        return new FarmLodgingFodderMeasures(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public FarmLodgingFodderMeasures rename(String name) {
        return new FarmLodgingFodderMeasures(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public FarmLodgingFodderMeasures rename(Name name) {
        return new FarmLodgingFodderMeasures(name, null);
    }

    // -------------------------------------------------------------------------
    // Row4 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row4<Integer, String, String, String> fieldsRow() {
        return (Row4) super.fieldsRow();
    }
}
