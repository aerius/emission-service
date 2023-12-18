/*
 * This file is generated by jOOQ.
 */
package nl.aerius.emissionservice.db.generated.template.tables;


import java.util.function.Function;

import nl.aerius.emissionservice.db.generated.template.Template;
import nl.aerius.emissionservice.db.generated.template.tables.records.MachineryTypesViewRecord;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Function14;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Records;
import org.jooq.Row14;
import org.jooq.Schema;
import org.jooq.SelectField;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.TableOptions;
import org.jooq.impl.DSL;
import org.jooq.impl.SQLDataType;
import org.jooq.impl.TableImpl;


/**
 * Geeft informatie over de werktuigen terug, inclusief brandstof informatie.
 * 
 * @file
 * source/database/src/main/sql/template/02-emission_factors/04-views/machinery_types.sql
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class MachineryTypesView extends TableImpl<MachineryTypesViewRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>template.machinery_types_view</code>
     */
    public static final MachineryTypesView MACHINERY_TYPES_VIEW = new MachineryTypesView();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<MachineryTypesViewRecord> getRecordType() {
        return MachineryTypesViewRecord.class;
    }

    /**
     * The column <code>template.machinery_types_view.machinery_type_id</code>.
     */
    public final TableField<MachineryTypesViewRecord, Integer> MACHINERY_TYPE_ID = createField(DSL.name("machinery_type_id"), SQLDataType.INTEGER, this, "");

    /**
     * The column <code>template.machinery_types_view.sector_id</code>.
     */
    public final TableField<MachineryTypesViewRecord, Integer> SECTOR_ID = createField(DSL.name("sector_id"), SQLDataType.INTEGER, this, "");

    /**
     * The column <code>template.machinery_types_view.machinery_code</code>.
     */
    public final TableField<MachineryTypesViewRecord, String> MACHINERY_CODE = createField(DSL.name("machinery_code"), SQLDataType.CLOB, this, "");

    /**
     * The column <code>template.machinery_types_view.machinery_name</code>.
     */
    public final TableField<MachineryTypesViewRecord, String> MACHINERY_NAME = createField(DSL.name("machinery_name"), SQLDataType.CLOB, this, "");

    /**
     * The column <code>template.machinery_types_view.sort_order</code>.
     */
    public final TableField<MachineryTypesViewRecord, Integer> SORT_ORDER = createField(DSL.name("sort_order"), SQLDataType.INTEGER, this, "");

    /**
     * The column
     * <code>template.machinery_types_view.machinery_fuel_type_id</code>.
     */
    public final TableField<MachineryTypesViewRecord, Integer> MACHINERY_FUEL_TYPE_ID = createField(DSL.name("machinery_fuel_type_id"), SQLDataType.INTEGER, this, "");

    /**
     * The column <code>template.machinery_types_view.fuel_code</code>.
     */
    public final TableField<MachineryTypesViewRecord, String> FUEL_CODE = createField(DSL.name("fuel_code"), SQLDataType.CLOB, this, "");

    /**
     * The column <code>template.machinery_types_view.fuel_name</code>.
     */
    public final TableField<MachineryTypesViewRecord, String> FUEL_NAME = createField(DSL.name("fuel_name"), SQLDataType.CLOB, this, "");

    /**
     * The column <code>template.machinery_types_view.fuel_density</code>.
     */
    public final TableField<MachineryTypesViewRecord, Float> FUEL_DENSITY = createField(DSL.name("fuel_density"), nl.aerius.emissionservice.db.generated.public_.Domains.POSREAL.getDataType(), this, "");

    /**
     * The column <code>template.machinery_types_view.power</code>.
     */
    public final TableField<MachineryTypesViewRecord, Integer> POWER = createField(DSL.name("power"), nl.aerius.emissionservice.db.generated.public_.Domains.POSINT.getDataType(), this, "");

    /**
     * The column <code>template.machinery_types_view.load</code>.
     */
    public final TableField<MachineryTypesViewRecord, Float> LOAD = createField(DSL.name("load"), nl.aerius.emissionservice.db.generated.public_.Domains.FRACTION.getDataType(), this, "");

    /**
     * The column <code>template.machinery_types_view.energy_efficiency</code>.
     */
    public final TableField<MachineryTypesViewRecord, Float> ENERGY_EFFICIENCY = createField(DSL.name("energy_efficiency"), nl.aerius.emissionservice.db.generated.public_.Domains.POSREAL.getDataType(), this, "");

    /**
     * The column <code>template.machinery_types_view.substance_id</code>.
     */
    public final TableField<MachineryTypesViewRecord, Integer> SUBSTANCE_ID = createField(DSL.name("substance_id"), SQLDataType.INTEGER, this, "");

    /**
     * The column <code>template.machinery_types_view.emission_factor</code>.
     */
    public final TableField<MachineryTypesViewRecord, Float> EMISSION_FACTOR = createField(DSL.name("emission_factor"), nl.aerius.emissionservice.db.generated.public_.Domains.POSREAL.getDataType(), this, "");

    private MachineryTypesView(Name alias, Table<MachineryTypesViewRecord> aliased) {
        this(alias, aliased, null);
    }

    private MachineryTypesView(Name alias, Table<MachineryTypesViewRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment("Geeft informatie over de werktuigen terug, inclusief brandstof informatie.\r\n\r\n@file source/database/src/main/sql/template/02-emission_factors/04-views/machinery_types.sql"), TableOptions.view("""
        create view "machinery_types_view" as  SELECT machinery_types.machinery_type_id,
          machinery_types.sector_id,
          machinery_types.code AS machinery_code,
          machinery_types.name AS machinery_name,
          machinery_types.sort_order,
          machinery_type_fuel_options.machinery_fuel_type_id,
          machinery_fuel_types.code AS fuel_code,
          machinery_fuel_types.name AS fuel_name,
          machinery_fuel_types.density AS fuel_density,
          machinery_type_fuel_options.power,
          machinery_type_fuel_options.load,
          machinery_type_fuel_options.energy_efficiency,
          machinery_type_emission_factors.substance_id,
          machinery_type_emission_factors.emission_factor
         FROM (((template.machinery_types
           JOIN template.machinery_type_fuel_options USING (machinery_type_id))
           JOIN template.machinery_fuel_types USING (machinery_fuel_type_id))
           JOIN template.machinery_type_emission_factors USING (machinery_type_id, machinery_fuel_type_id))
        ORDER BY machinery_types.machinery_type_id, machinery_type_fuel_options.machinery_fuel_type_id, machinery_type_emission_factors.substance_id;
        """));
    }

    /**
     * Create an aliased <code>template.machinery_types_view</code> table
     * reference
     */
    public MachineryTypesView(String alias) {
        this(DSL.name(alias), MACHINERY_TYPES_VIEW);
    }

    /**
     * Create an aliased <code>template.machinery_types_view</code> table
     * reference
     */
    public MachineryTypesView(Name alias) {
        this(alias, MACHINERY_TYPES_VIEW);
    }

    /**
     * Create a <code>template.machinery_types_view</code> table reference
     */
    public MachineryTypesView() {
        this(DSL.name("machinery_types_view"), null);
    }

    public <O extends Record> MachineryTypesView(Table<O> child, ForeignKey<O, MachineryTypesViewRecord> key) {
        super(child, key, MACHINERY_TYPES_VIEW);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : Template.TEMPLATE;
    }

    @Override
    public MachineryTypesView as(String alias) {
        return new MachineryTypesView(DSL.name(alias), this);
    }

    @Override
    public MachineryTypesView as(Name alias) {
        return new MachineryTypesView(alias, this);
    }

    @Override
    public MachineryTypesView as(Table<?> alias) {
        return new MachineryTypesView(alias.getQualifiedName(), this);
    }

    /**
     * Rename this table
     */
    @Override
    public MachineryTypesView rename(String name) {
        return new MachineryTypesView(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public MachineryTypesView rename(Name name) {
        return new MachineryTypesView(name, null);
    }

    /**
     * Rename this table
     */
    @Override
    public MachineryTypesView rename(Table<?> name) {
        return new MachineryTypesView(name.getQualifiedName(), null);
    }

    // -------------------------------------------------------------------------
    // Row14 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row14<Integer, Integer, String, String, Integer, Integer, String, String, Float, Integer, Float, Float, Integer, Float> fieldsRow() {
        return (Row14) super.fieldsRow();
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Function)}.
     */
    public <U> SelectField<U> mapping(Function14<? super Integer, ? super Integer, ? super String, ? super String, ? super Integer, ? super Integer, ? super String, ? super String, ? super Float, ? super Integer, ? super Float, ? super Float, ? super Integer, ? super Float, ? extends U> from) {
        return convertFrom(Records.mapping(from));
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Class,
     * Function)}.
     */
    public <U> SelectField<U> mapping(Class<U> toType, Function14<? super Integer, ? super Integer, ? super String, ? super String, ? super Integer, ? super Integer, ? super String, ? super String, ? super Float, ? super Integer, ? super Float, ? super Float, ? super Integer, ? super Float, ? extends U> from) {
        return convertFrom(toType, Records.mapping(from));
    }
}