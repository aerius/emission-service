/*
 * This file is generated by jOOQ.
 */
package nl.aerius.emissionservice.db.generated.template.tables;


import java.util.function.Function;

import nl.aerius.emissionservice.db.generated.template.Template;
import nl.aerius.emissionservice.db.generated.template.tables.records.FarmReductiveLodgingSystemReductionFactorsViewRecord;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Function9;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Records;
import org.jooq.Row9;
import org.jooq.Schema;
import org.jooq.SelectField;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.TableOptions;
import org.jooq.impl.DSL;
import org.jooq.impl.SQLDataType;
import org.jooq.impl.TableImpl;


/**
 * Geeft de eigenschappen van een emissiereducerende staltechniek, inclusief
 * code, beschrijving, diercategorie, reductiefactoren, of het een luchtwasser
 * is, en de stalbeschrijvingen die er bij gekozen kunnen worden.
 * 
 * @file
 * source/database/src/main/sql/template/02-emission_factors/04-views/farms.sql
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class FarmReductiveLodgingSystemReductionFactorsView extends TableImpl<FarmReductiveLodgingSystemReductionFactorsViewRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of
     * <code>template.farm_reductive_lodging_system_reduction_factors_view</code>
     */
    public static final FarmReductiveLodgingSystemReductionFactorsView FARM_REDUCTIVE_LODGING_SYSTEM_REDUCTION_FACTORS_VIEW = new FarmReductiveLodgingSystemReductionFactorsView();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<FarmReductiveLodgingSystemReductionFactorsViewRecord> getRecordType() {
        return FarmReductiveLodgingSystemReductionFactorsViewRecord.class;
    }

    /**
     * The column
     * <code>template.farm_reductive_lodging_system_reduction_factors_view.farm_reductive_lodging_system_id</code>.
     */
    public final TableField<FarmReductiveLodgingSystemReductionFactorsViewRecord, Integer> FARM_REDUCTIVE_LODGING_SYSTEM_ID = createField(DSL.name("farm_reductive_lodging_system_id"), SQLDataType.INTEGER, this, "");

    /**
     * The column
     * <code>template.farm_reductive_lodging_system_reduction_factors_view.code</code>.
     */
    public final TableField<FarmReductiveLodgingSystemReductionFactorsViewRecord, String> CODE = createField(DSL.name("code"), SQLDataType.CLOB, this, "");

    /**
     * The column
     * <code>template.farm_reductive_lodging_system_reduction_factors_view.name</code>.
     */
    public final TableField<FarmReductiveLodgingSystemReductionFactorsViewRecord, String> NAME = createField(DSL.name("name"), SQLDataType.CLOB, this, "");

    /**
     * The column
     * <code>template.farm_reductive_lodging_system_reduction_factors_view.description</code>.
     */
    public final TableField<FarmReductiveLodgingSystemReductionFactorsViewRecord, String> DESCRIPTION = createField(DSL.name("description"), SQLDataType.CLOB, this, "");

    /**
     * The column
     * <code>template.farm_reductive_lodging_system_reduction_factors_view.farm_animal_category_id</code>.
     */
    public final TableField<FarmReductiveLodgingSystemReductionFactorsViewRecord, Integer> FARM_ANIMAL_CATEGORY_ID = createField(DSL.name("farm_animal_category_id"), SQLDataType.INTEGER, this, "");

    /**
     * The column
     * <code>template.farm_reductive_lodging_system_reduction_factors_view.farm_lodging_system_definition_id</code>.
     */
    public final TableField<FarmReductiveLodgingSystemReductionFactorsViewRecord, Integer> FARM_LODGING_SYSTEM_DEFINITION_ID = createField(DSL.name("farm_lodging_system_definition_id"), SQLDataType.INTEGER, this, "");

    /**
     * The column
     * <code>template.farm_reductive_lodging_system_reduction_factors_view.substance_id</code>.
     */
    public final TableField<FarmReductiveLodgingSystemReductionFactorsViewRecord, Short> SUBSTANCE_ID = createField(DSL.name("substance_id"), SQLDataType.SMALLINT, this, "");

    /**
     * The column
     * <code>template.farm_reductive_lodging_system_reduction_factors_view.reduction_factor</code>.
     */
    public final TableField<FarmReductiveLodgingSystemReductionFactorsViewRecord, Float> REDUCTION_FACTOR = createField(DSL.name("reduction_factor"), nl.aerius.emissionservice.db.generated.public_.Domains.FRACTION.getDataType(), this, "");

    /**
     * The column
     * <code>template.farm_reductive_lodging_system_reduction_factors_view.scrubber</code>.
     */
    public final TableField<FarmReductiveLodgingSystemReductionFactorsViewRecord, Boolean> SCRUBBER = createField(DSL.name("scrubber"), SQLDataType.BOOLEAN, this, "");

    private FarmReductiveLodgingSystemReductionFactorsView(Name alias, Table<FarmReductiveLodgingSystemReductionFactorsViewRecord> aliased) {
        this(alias, aliased, null);
    }

    private FarmReductiveLodgingSystemReductionFactorsView(Name alias, Table<FarmReductiveLodgingSystemReductionFactorsViewRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment("Geeft de eigenschappen van een emissiereducerende staltechniek, inclusief code, beschrijving, diercategorie, reductiefactoren, of het een luchtwasser is, en de stalbeschrijvingen die er bij gekozen kunnen worden.\r\n\r\n@file source/database/src/main/sql/template/02-emission_factors/04-views/farms.sql"), TableOptions.view("""
        create view "farm_reductive_lodging_system_reduction_factors_view" as  SELECT farm_reductive_lodging_systems.farm_reductive_lodging_system_id,
         farm_reductive_lodging_systems.code,
         farm_reductive_lodging_systems.name,
         farm_reductive_lodging_systems.description,
         farm_reductive_lodging_systems.farm_animal_category_id,
         farm_reductive_lodging_systems_to_lodging_system_definitions.farm_lodging_system_definition_id,
         farm_reductive_lodging_system_reduction_factors.substance_id,
         farm_reductive_lodging_system_reduction_factors.reduction_factor,
         farm_reductive_lodging_systems.scrubber
        FROM (((template.farm_reductive_lodging_systems
          JOIN template.farm_animal_categories USING (farm_animal_category_id))
          JOIN template.farm_reductive_lodging_system_reduction_factors USING (farm_reductive_lodging_system_id))
          JOIN template.farm_reductive_lodging_systems_to_lodging_system_definitions USING (farm_reductive_lodging_system_id));
        """));
    }

    /**
     * Create an aliased
     * <code>template.farm_reductive_lodging_system_reduction_factors_view</code>
     * table reference
     */
    public FarmReductiveLodgingSystemReductionFactorsView(String alias) {
        this(DSL.name(alias), FARM_REDUCTIVE_LODGING_SYSTEM_REDUCTION_FACTORS_VIEW);
    }

    /**
     * Create an aliased
     * <code>template.farm_reductive_lodging_system_reduction_factors_view</code>
     * table reference
     */
    public FarmReductiveLodgingSystemReductionFactorsView(Name alias) {
        this(alias, FARM_REDUCTIVE_LODGING_SYSTEM_REDUCTION_FACTORS_VIEW);
    }

    /**
     * Create a
     * <code>template.farm_reductive_lodging_system_reduction_factors_view</code>
     * table reference
     */
    public FarmReductiveLodgingSystemReductionFactorsView() {
        this(DSL.name("farm_reductive_lodging_system_reduction_factors_view"), null);
    }

    public <O extends Record> FarmReductiveLodgingSystemReductionFactorsView(Table<O> child, ForeignKey<O, FarmReductiveLodgingSystemReductionFactorsViewRecord> key) {
        super(child, key, FARM_REDUCTIVE_LODGING_SYSTEM_REDUCTION_FACTORS_VIEW);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : Template.TEMPLATE;
    }

    @Override
    public FarmReductiveLodgingSystemReductionFactorsView as(String alias) {
        return new FarmReductiveLodgingSystemReductionFactorsView(DSL.name(alias), this);
    }

    @Override
    public FarmReductiveLodgingSystemReductionFactorsView as(Name alias) {
        return new FarmReductiveLodgingSystemReductionFactorsView(alias, this);
    }

    @Override
    public FarmReductiveLodgingSystemReductionFactorsView as(Table<?> alias) {
        return new FarmReductiveLodgingSystemReductionFactorsView(alias.getQualifiedName(), this);
    }

    /**
     * Rename this table
     */
    @Override
    public FarmReductiveLodgingSystemReductionFactorsView rename(String name) {
        return new FarmReductiveLodgingSystemReductionFactorsView(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public FarmReductiveLodgingSystemReductionFactorsView rename(Name name) {
        return new FarmReductiveLodgingSystemReductionFactorsView(name, null);
    }

    /**
     * Rename this table
     */
    @Override
    public FarmReductiveLodgingSystemReductionFactorsView rename(Table<?> name) {
        return new FarmReductiveLodgingSystemReductionFactorsView(name.getQualifiedName(), null);
    }

    // -------------------------------------------------------------------------
    // Row9 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row9<Integer, String, String, String, Integer, Integer, Short, Float, Boolean> fieldsRow() {
        return (Row9) super.fieldsRow();
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Function)}.
     */
    public <U> SelectField<U> mapping(Function9<? super Integer, ? super String, ? super String, ? super String, ? super Integer, ? super Integer, ? super Short, ? super Float, ? super Boolean, ? extends U> from) {
        return convertFrom(Records.mapping(from));
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Class,
     * Function)}.
     */
    public <U> SelectField<U> mapping(Class<U> toType, Function9<? super Integer, ? super String, ? super String, ? super String, ? super Integer, ? super Integer, ? super Short, ? super Float, ? super Boolean, ? extends U> from) {
        return convertFrom(toType, Records.mapping(from));
    }
}