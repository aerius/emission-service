/*
 * This file is generated by jOOQ.
 */
package nl.aerius.emissionservice.db.generated.template.tables;


import java.util.function.Function;

import nl.aerius.emissionservice.db.generated.public_.enums.UnitType;
import nl.aerius.emissionservice.db.generated.template.Template;
import nl.aerius.emissionservice.db.generated.template.tables.records.PlanCategoriesSourceCharacteristicsViewRecord;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Function13;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Records;
import org.jooq.Row13;
import org.jooq.Schema;
import org.jooq.SelectField;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.TableOptions;
import org.jooq.impl.DSL;
import org.jooq.impl.SQLDataType;
import org.jooq.impl.TableImpl;


/**
 * View retourneert de categorieen voor plannen. Dit bevat onder andere de
 * emissiefactoren en de emissie karakteristieken.
 * Zie plan_categories en plan_category_emission_factors voor meer informatie.
 * 
 * @file
 * source/database/src/main/sql/template/02-emission_factors/04-views/misc.sql
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class PlanCategoriesSourceCharacteristicsView extends TableImpl<PlanCategoriesSourceCharacteristicsViewRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of
     * <code>template.plan_categories_source_characteristics_view</code>
     */
    public static final PlanCategoriesSourceCharacteristicsView PLAN_CATEGORIES_SOURCE_CHARACTERISTICS_VIEW = new PlanCategoriesSourceCharacteristicsView();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<PlanCategoriesSourceCharacteristicsViewRecord> getRecordType() {
        return PlanCategoriesSourceCharacteristicsViewRecord.class;
    }

    /**
     * The column
     * <code>template.plan_categories_source_characteristics_view.plan_category_id</code>.
     */
    public final TableField<PlanCategoriesSourceCharacteristicsViewRecord, Short> PLAN_CATEGORY_ID = createField(DSL.name("plan_category_id"), SQLDataType.SMALLINT, this, "");

    /**
     * The column
     * <code>template.plan_categories_source_characteristics_view.code</code>.
     */
    public final TableField<PlanCategoriesSourceCharacteristicsViewRecord, String> CODE = createField(DSL.name("code"), SQLDataType.CLOB, this, "");

    /**
     * The column
     * <code>template.plan_categories_source_characteristics_view.name</code>.
     */
    public final TableField<PlanCategoriesSourceCharacteristicsViewRecord, String> NAME = createField(DSL.name("name"), SQLDataType.CLOB, this, "");

    /**
     * The column
     * <code>template.plan_categories_source_characteristics_view.gcn_sector_id</code>.
     */
    public final TableField<PlanCategoriesSourceCharacteristicsViewRecord, Integer> GCN_SECTOR_ID = createField(DSL.name("gcn_sector_id"), SQLDataType.INTEGER, this, "");

    /**
     * The column
     * <code>template.plan_categories_source_characteristics_view.substance_id</code>.
     */
    public final TableField<PlanCategoriesSourceCharacteristicsViewRecord, Short> SUBSTANCE_ID = createField(DSL.name("substance_id"), SQLDataType.SMALLINT, this, "");

    /**
     * The column
     * <code>template.plan_categories_source_characteristics_view.category_unit</code>.
     */
    public final TableField<PlanCategoriesSourceCharacteristicsViewRecord, UnitType> CATEGORY_UNIT = createField(DSL.name("category_unit"), SQLDataType.VARCHAR.asEnumDataType(nl.aerius.emissionservice.db.generated.public_.enums.UnitType.class), this, "");

    /**
     * The column
     * <code>template.plan_categories_source_characteristics_view.emission_factor</code>.
     */
    public final TableField<PlanCategoriesSourceCharacteristicsViewRecord, Float> EMISSION_FACTOR = createField(DSL.name("emission_factor"), nl.aerius.emissionservice.db.generated.public_.Domains.POSREAL.getDataType(), this, "");

    /**
     * The column
     * <code>template.plan_categories_source_characteristics_view.heat_content</code>.
     */
    public final TableField<PlanCategoriesSourceCharacteristicsViewRecord, Float> HEAT_CONTENT = createField(DSL.name("heat_content"), nl.aerius.emissionservice.db.generated.public_.Domains.POSREAL.getDataType(), this, "");

    /**
     * The column
     * <code>template.plan_categories_source_characteristics_view.height</code>.
     */
    public final TableField<PlanCategoriesSourceCharacteristicsViewRecord, Float> HEIGHT = createField(DSL.name("height"), nl.aerius.emissionservice.db.generated.public_.Domains.POSREAL.getDataType(), this, "");

    /**
     * The column
     * <code>template.plan_categories_source_characteristics_view.spread</code>.
     */
    public final TableField<PlanCategoriesSourceCharacteristicsViewRecord, Float> SPREAD = createField(DSL.name("spread"), nl.aerius.emissionservice.db.generated.public_.Domains.POSREAL.getDataType(), this, "");

    /**
     * The column
     * <code>template.plan_categories_source_characteristics_view.particle_size_distribution</code>.
     */
    public final TableField<PlanCategoriesSourceCharacteristicsViewRecord, Integer> PARTICLE_SIZE_DISTRIBUTION = createField(DSL.name("particle_size_distribution"), SQLDataType.INTEGER, this, "");

    /**
     * The column
     * <code>template.plan_categories_source_characteristics_view.emission_diurnal_variation_id</code>.
     */
    public final TableField<PlanCategoriesSourceCharacteristicsViewRecord, Integer> EMISSION_DIURNAL_VARIATION_ID = createField(DSL.name("emission_diurnal_variation_id"), SQLDataType.INTEGER, this, "");

    /**
     * The column
     * <code>template.plan_categories_source_characteristics_view.emission_diurnal_variation_code</code>.
     */
    public final TableField<PlanCategoriesSourceCharacteristicsViewRecord, String> EMISSION_DIURNAL_VARIATION_CODE = createField(DSL.name("emission_diurnal_variation_code"), SQLDataType.CLOB, this, "");

    private PlanCategoriesSourceCharacteristicsView(Name alias, Table<PlanCategoriesSourceCharacteristicsViewRecord> aliased) {
        this(alias, aliased, null);
    }

    private PlanCategoriesSourceCharacteristicsView(Name alias, Table<PlanCategoriesSourceCharacteristicsViewRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment("View retourneert de categorieen voor plannen. Dit bevat onder andere de emissiefactoren en de emissie karakteristieken.\r\nZie plan_categories en plan_category_emission_factors voor meer informatie.\r\n\r\n@file source/database/src/main/sql/template/02-emission_factors/04-views/misc.sql"), TableOptions.view("""
        create view "plan_categories_source_characteristics_view" as  SELECT plan_categories.plan_category_id,
          plan_categories.code,
          plan_categories.name,
          plan_categories.gcn_sector_id,
          gcn_sector_source_characteristics.substance_id,
          plan_categories.category_unit,
          plan_category_emission_factors.emission_factor,
          gcn_sector_source_characteristics.heat_content,
          gcn_sector_source_characteristics.height,
          gcn_sector_source_characteristics.spread,
          gcn_sector_source_characteristics.particle_size_distribution,
          emission_diurnal_variations.emission_diurnal_variation_id,
          emission_diurnal_variations.code AS emission_diurnal_variation_code
         FROM (((template.plan_categories
           JOIN template.plan_category_emission_factors USING (plan_category_id))
           LEFT JOIN template.gcn_sector_source_characteristics USING (gcn_sector_id, substance_id))
           JOIN template.emission_diurnal_variations USING (emission_diurnal_variation_id))
        ORDER BY plan_categories.plan_category_id;
        """));
    }

    /**
     * Create an aliased
     * <code>template.plan_categories_source_characteristics_view</code> table
     * reference
     */
    public PlanCategoriesSourceCharacteristicsView(String alias) {
        this(DSL.name(alias), PLAN_CATEGORIES_SOURCE_CHARACTERISTICS_VIEW);
    }

    /**
     * Create an aliased
     * <code>template.plan_categories_source_characteristics_view</code> table
     * reference
     */
    public PlanCategoriesSourceCharacteristicsView(Name alias) {
        this(alias, PLAN_CATEGORIES_SOURCE_CHARACTERISTICS_VIEW);
    }

    /**
     * Create a
     * <code>template.plan_categories_source_characteristics_view</code> table
     * reference
     */
    public PlanCategoriesSourceCharacteristicsView() {
        this(DSL.name("plan_categories_source_characteristics_view"), null);
    }

    public <O extends Record> PlanCategoriesSourceCharacteristicsView(Table<O> child, ForeignKey<O, PlanCategoriesSourceCharacteristicsViewRecord> key) {
        super(child, key, PLAN_CATEGORIES_SOURCE_CHARACTERISTICS_VIEW);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : Template.TEMPLATE;
    }

    @Override
    public PlanCategoriesSourceCharacteristicsView as(String alias) {
        return new PlanCategoriesSourceCharacteristicsView(DSL.name(alias), this);
    }

    @Override
    public PlanCategoriesSourceCharacteristicsView as(Name alias) {
        return new PlanCategoriesSourceCharacteristicsView(alias, this);
    }

    @Override
    public PlanCategoriesSourceCharacteristicsView as(Table<?> alias) {
        return new PlanCategoriesSourceCharacteristicsView(alias.getQualifiedName(), this);
    }

    /**
     * Rename this table
     */
    @Override
    public PlanCategoriesSourceCharacteristicsView rename(String name) {
        return new PlanCategoriesSourceCharacteristicsView(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public PlanCategoriesSourceCharacteristicsView rename(Name name) {
        return new PlanCategoriesSourceCharacteristicsView(name, null);
    }

    /**
     * Rename this table
     */
    @Override
    public PlanCategoriesSourceCharacteristicsView rename(Table<?> name) {
        return new PlanCategoriesSourceCharacteristicsView(name.getQualifiedName(), null);
    }

    // -------------------------------------------------------------------------
    // Row13 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row13<Short, String, String, Integer, Short, UnitType, Float, Float, Float, Float, Integer, Integer, String> fieldsRow() {
        return (Row13) super.fieldsRow();
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Function)}.
     */
    public <U> SelectField<U> mapping(Function13<? super Short, ? super String, ? super String, ? super Integer, ? super Short, ? super UnitType, ? super Float, ? super Float, ? super Float, ? super Float, ? super Integer, ? super Integer, ? super String, ? extends U> from) {
        return convertFrom(Records.mapping(from));
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Class,
     * Function)}.
     */
    public <U> SelectField<U> mapping(Class<U> toType, Function13<? super Short, ? super String, ? super String, ? super Integer, ? super Short, ? super UnitType, ? super Float, ? super Float, ? super Float, ? super Float, ? super Integer, ? super Integer, ? super String, ? extends U> from) {
        return convertFrom(toType, Records.mapping(from));
    }
}
