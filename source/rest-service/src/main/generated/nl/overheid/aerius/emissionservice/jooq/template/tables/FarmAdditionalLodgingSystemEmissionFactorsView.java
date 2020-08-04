/*
 * This file is generated by jOOQ.
 */
package nl.overheid.aerius.emissionservice.jooq.template.tables;


import nl.overheid.aerius.emissionservice.jooq.template.Template;
import nl.overheid.aerius.emissionservice.jooq.template.tables.records.FarmAdditionalLodgingSystemEmissionFactorsViewRecord;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row9;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.TableOptions;
import org.jooq.impl.DSL;
import org.jooq.impl.TableImpl;


/**
 * Geeft de eigenschappen van een additionele staltechniek, inclusief code, 
 * beschrijving, diercategorie, emissiefactoren, of het een luchtwasser is, 
 * en de stalbeschrijvingen die er bij gekozen kunnen worden.
 * 
 * @file source/database/src/main/sql/template/02_emission_factors/04-views/farms.sql
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class FarmAdditionalLodgingSystemEmissionFactorsView extends TableImpl<FarmAdditionalLodgingSystemEmissionFactorsViewRecord> {

    private static final long serialVersionUID = 701398489;

    /**
     * The reference instance of <code>template.farm_additional_lodging_system_emission_factors_view</code>
     */
    public static final FarmAdditionalLodgingSystemEmissionFactorsView FARM_ADDITIONAL_LODGING_SYSTEM_EMISSION_FACTORS_VIEW = new FarmAdditionalLodgingSystemEmissionFactorsView();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<FarmAdditionalLodgingSystemEmissionFactorsViewRecord> getRecordType() {
        return FarmAdditionalLodgingSystemEmissionFactorsViewRecord.class;
    }

    /**
     * The column <code>template.farm_additional_lodging_system_emission_factors_view.farm_additional_lodging_system_id</code>.
     */
    public final TableField<FarmAdditionalLodgingSystemEmissionFactorsViewRecord, Integer> FARM_ADDITIONAL_LODGING_SYSTEM_ID = createField(DSL.name("farm_additional_lodging_system_id"), org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>template.farm_additional_lodging_system_emission_factors_view.code</code>.
     */
    public final TableField<FarmAdditionalLodgingSystemEmissionFactorsViewRecord, String> CODE = createField(DSL.name("code"), org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * The column <code>template.farm_additional_lodging_system_emission_factors_view.name</code>.
     */
    public final TableField<FarmAdditionalLodgingSystemEmissionFactorsViewRecord, String> NAME = createField(DSL.name("name"), org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * The column <code>template.farm_additional_lodging_system_emission_factors_view.description</code>.
     */
    public final TableField<FarmAdditionalLodgingSystemEmissionFactorsViewRecord, String> DESCRIPTION = createField(DSL.name("description"), org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * The column <code>template.farm_additional_lodging_system_emission_factors_view.farm_animal_category_id</code>.
     */
    public final TableField<FarmAdditionalLodgingSystemEmissionFactorsViewRecord, Integer> FARM_ANIMAL_CATEGORY_ID = createField(DSL.name("farm_animal_category_id"), org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>template.farm_additional_lodging_system_emission_factors_view.farm_lodging_system_definition_id</code>.
     */
    public final TableField<FarmAdditionalLodgingSystemEmissionFactorsViewRecord, Integer> FARM_LODGING_SYSTEM_DEFINITION_ID = createField(DSL.name("farm_lodging_system_definition_id"), org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>template.farm_additional_lodging_system_emission_factors_view.substance_id</code>.
     */
    public final TableField<FarmAdditionalLodgingSystemEmissionFactorsViewRecord, Short> SUBSTANCE_ID = createField(DSL.name("substance_id"), org.jooq.impl.SQLDataType.SMALLINT, this, "");

    /**
     * The column <code>template.farm_additional_lodging_system_emission_factors_view.emission_factor</code>.
     */
    public final TableField<FarmAdditionalLodgingSystemEmissionFactorsViewRecord, Float> EMISSION_FACTOR = createField(DSL.name("emission_factor"), org.jooq.impl.SQLDataType.REAL, this, "");

    /**
     * The column <code>template.farm_additional_lodging_system_emission_factors_view.scrubber</code>.
     */
    public final TableField<FarmAdditionalLodgingSystemEmissionFactorsViewRecord, Boolean> SCRUBBER = createField(DSL.name("scrubber"), org.jooq.impl.SQLDataType.BOOLEAN, this, "");

    /**
     * Create a <code>template.farm_additional_lodging_system_emission_factors_view</code> table reference
     */
    public FarmAdditionalLodgingSystemEmissionFactorsView() {
        this(DSL.name("farm_additional_lodging_system_emission_factors_view"), null);
    }

    /**
     * Create an aliased <code>template.farm_additional_lodging_system_emission_factors_view</code> table reference
     */
    public FarmAdditionalLodgingSystemEmissionFactorsView(String alias) {
        this(DSL.name(alias), FARM_ADDITIONAL_LODGING_SYSTEM_EMISSION_FACTORS_VIEW);
    }

    /**
     * Create an aliased <code>template.farm_additional_lodging_system_emission_factors_view</code> table reference
     */
    public FarmAdditionalLodgingSystemEmissionFactorsView(Name alias) {
        this(alias, FARM_ADDITIONAL_LODGING_SYSTEM_EMISSION_FACTORS_VIEW);
    }

    private FarmAdditionalLodgingSystemEmissionFactorsView(Name alias, Table<FarmAdditionalLodgingSystemEmissionFactorsViewRecord> aliased) {
        this(alias, aliased, null);
    }

    private FarmAdditionalLodgingSystemEmissionFactorsView(Name alias, Table<FarmAdditionalLodgingSystemEmissionFactorsViewRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment("Geeft de eigenschappen van een additionele staltechniek, inclusief code, beschrijving, diercategorie, emissiefactoren, of het een luchtwasser is, en de stalbeschrijvingen die er bij gekozen kunnen worden.\r\n\r\n@file source/database/src/main/sql/template/02_emission_factors/04-views/farms.sql"), TableOptions.view("create view \"farm_additional_lodging_system_emission_factors_view\" as  SELECT farm_additional_lodging_systems.farm_additional_lodging_system_id,\n    farm_additional_lodging_systems.code,\n    farm_additional_lodging_systems.name,\n    farm_additional_lodging_systems.description,\n    farm_additional_lodging_systems.farm_animal_category_id,\n    farm_additional_lodging_systems_to_lodging_system_definitions.farm_lodging_system_definition_id,\n    farm_additional_lodging_system_emission_factors.substance_id,\n    farm_additional_lodging_system_emission_factors.emission_factor,\n    farm_additional_lodging_systems.scrubber\n   FROM (((template.farm_additional_lodging_systems\n     JOIN template.farm_animal_categories USING (farm_animal_category_id))\n     JOIN template.farm_additional_lodging_system_emission_factors USING (farm_additional_lodging_system_id))\n     JOIN template.farm_additional_lodging_systems_to_lodging_system_definitions USING (farm_additional_lodging_system_id));"));
    }

    public <O extends Record> FarmAdditionalLodgingSystemEmissionFactorsView(Table<O> child, ForeignKey<O, FarmAdditionalLodgingSystemEmissionFactorsViewRecord> key) {
        super(child, key, FARM_ADDITIONAL_LODGING_SYSTEM_EMISSION_FACTORS_VIEW);
    }

    @Override
    public Schema getSchema() {
        return Template.TEMPLATE;
    }

    @Override
    public FarmAdditionalLodgingSystemEmissionFactorsView as(String alias) {
        return new FarmAdditionalLodgingSystemEmissionFactorsView(DSL.name(alias), this);
    }

    @Override
    public FarmAdditionalLodgingSystemEmissionFactorsView as(Name alias) {
        return new FarmAdditionalLodgingSystemEmissionFactorsView(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public FarmAdditionalLodgingSystemEmissionFactorsView rename(String name) {
        return new FarmAdditionalLodgingSystemEmissionFactorsView(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public FarmAdditionalLodgingSystemEmissionFactorsView rename(Name name) {
        return new FarmAdditionalLodgingSystemEmissionFactorsView(name, null);
    }

    // -------------------------------------------------------------------------
    // Row9 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row9<Integer, String, String, String, Integer, Integer, Short, Float, Boolean> fieldsRow() {
        return (Row9) super.fieldsRow();
    }
}
