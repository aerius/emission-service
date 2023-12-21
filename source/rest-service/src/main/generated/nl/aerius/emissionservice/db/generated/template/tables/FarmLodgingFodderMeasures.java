/*
 * This file is generated by jOOQ.
 */
package nl.aerius.emissionservice.db.generated.template.tables;


import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

import nl.aerius.emissionservice.db.generated.template.Keys;
import nl.aerius.emissionservice.db.generated.template.Template;
import nl.aerius.emissionservice.db.generated.template.tables.records.FarmLodgingFodderMeasuresRecord;

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
 * Table containing fodder and managment measures.
 * These are measures that result in lower emissions, and can be applied on a
 * lodging system (farm_lodging_type).
 * For NL: see
 * https://wetten.overheid.nl/jci1.3:c:BWBR0013629&amp;bijlage=2&amp;z=2023-04-01&amp;g=2023-04-01
 * 
 * 
 * @file
 * source/database/src/main/sql/template/02-emission_factors/02-tables/farms.sql
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class FarmLodgingFodderMeasures extends TableImpl<FarmLodgingFodderMeasuresRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of
     * <code>template.farm_lodging_fodder_measures</code>
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
     * The column
     * <code>template.farm_lodging_fodder_measures.farm_lodging_fodder_measure_id</code>.
     */
    public final TableField<FarmLodgingFodderMeasuresRecord, Integer> FARM_LODGING_FODDER_MEASURE_ID = createField(DSL.name("farm_lodging_fodder_measure_id"), SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>template.farm_lodging_fodder_measures.code</code>.
     */
    public final TableField<FarmLodgingFodderMeasuresRecord, String> CODE = createField(DSL.name("code"), SQLDataType.CLOB.nullable(false), this, "");

    /**
     * The column <code>template.farm_lodging_fodder_measures.name</code>.
     */
    public final TableField<FarmLodgingFodderMeasuresRecord, String> NAME = createField(DSL.name("name"), SQLDataType.CLOB.nullable(false), this, "");

    /**
     * The column
     * <code>template.farm_lodging_fodder_measures.description</code>.
     */
    public final TableField<FarmLodgingFodderMeasuresRecord, String> DESCRIPTION = createField(DSL.name("description"), SQLDataType.CLOB, this, "");

    private FarmLodgingFodderMeasures(Name alias, Table<FarmLodgingFodderMeasuresRecord> aliased) {
        this(alias, aliased, null);
    }

    private FarmLodgingFodderMeasures(Name alias, Table<FarmLodgingFodderMeasuresRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment("Table containing fodder and managment measures.\r\nThese are measures that result in lower emissions, and can be applied on a lodging system (farm_lodging_type).\r\nFor NL: see https://wetten.overheid.nl/jci1.3:c:BWBR0013629&bijlage=2&z=2023-04-01&g=2023-04-01\r\n\r\n@file source/database/src/main/sql/template/02-emission_factors/02-tables/farms.sql"), TableOptions.table());
    }

    /**
     * Create an aliased <code>template.farm_lodging_fodder_measures</code>
     * table reference
     */
    public FarmLodgingFodderMeasures(String alias) {
        this(DSL.name(alias), FARM_LODGING_FODDER_MEASURES);
    }

    /**
     * Create an aliased <code>template.farm_lodging_fodder_measures</code>
     * table reference
     */
    public FarmLodgingFodderMeasures(Name alias) {
        this(alias, FARM_LODGING_FODDER_MEASURES);
    }

    /**
     * Create a <code>template.farm_lodging_fodder_measures</code> table
     * reference
     */
    public FarmLodgingFodderMeasures() {
        this(DSL.name("farm_lodging_fodder_measures"), null);
    }

    public <O extends Record> FarmLodgingFodderMeasures(Table<O> child, ForeignKey<O, FarmLodgingFodderMeasuresRecord> key) {
        super(child, key, FARM_LODGING_FODDER_MEASURES);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : Template.TEMPLATE;
    }

    @Override
    public UniqueKey<FarmLodgingFodderMeasuresRecord> getPrimaryKey() {
        return Keys.FARM_LODGING_FODDER_MEASURES_PKEY;
    }

    @Override
    public List<UniqueKey<FarmLodgingFodderMeasuresRecord>> getUniqueKeys() {
        return Arrays.asList(Keys.FARM_LODGING_FODDER_MEASURES_CODE_KEY, Keys.FARM_LODGING_FODDER_MEASURES_NAME_KEY);
    }

    @Override
    public FarmLodgingFodderMeasures as(String alias) {
        return new FarmLodgingFodderMeasures(DSL.name(alias), this);
    }

    @Override
    public FarmLodgingFodderMeasures as(Name alias) {
        return new FarmLodgingFodderMeasures(alias, this);
    }

    @Override
    public FarmLodgingFodderMeasures as(Table<?> alias) {
        return new FarmLodgingFodderMeasures(alias.getQualifiedName(), this);
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

    /**
     * Rename this table
     */
    @Override
    public FarmLodgingFodderMeasures rename(Table<?> name) {
        return new FarmLodgingFodderMeasures(name.getQualifiedName(), null);
    }

    // -------------------------------------------------------------------------
    // Row4 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row4<Integer, String, String, String> fieldsRow() {
        return (Row4) super.fieldsRow();
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Function)}.
     */
    public <U> SelectField<U> mapping(Function4<? super Integer, ? super String, ? super String, ? super String, ? extends U> from) {
        return convertFrom(Records.mapping(from));
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Class,
     * Function)}.
     */
    public <U> SelectField<U> mapping(Class<U> toType, Function4<? super Integer, ? super String, ? super String, ? super String, ? extends U> from) {
        return convertFrom(toType, Records.mapping(from));
    }
}
