/*
 * This file is generated by jOOQ.
 */
package nl.aerius.emissionservice.db.generated.template.tables;


import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

import nl.aerius.emissionservice.db.generated.public_.enums.UnitType;
import nl.aerius.emissionservice.db.generated.template.Keys;
import nl.aerius.emissionservice.db.generated.template.Template;
import nl.aerius.emissionservice.db.generated.template.tables.records.PlanCategoriesRecord;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Function6;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Records;
import org.jooq.Row6;
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
 * De categorieën van verschillende soorten plannen.
 * 
 * De naam is hierbij de identificatie van de categorie voor de gebruiker.
 * 
 * @file
 * source/database/src/main/sql/template/02-emission_factors/02-tables/plans.sql
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class PlanCategories extends TableImpl<PlanCategoriesRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>template.plan_categories</code>
     */
    public static final PlanCategories PLAN_CATEGORIES = new PlanCategories();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<PlanCategoriesRecord> getRecordType() {
        return PlanCategoriesRecord.class;
    }

    /**
     * The column <code>template.plan_categories.plan_category_id</code>.
     */
    public final TableField<PlanCategoriesRecord, Short> PLAN_CATEGORY_ID = createField(DSL.name("plan_category_id"), SQLDataType.SMALLINT.nullable(false), this, "");

    /**
     * The column <code>template.plan_categories.gcn_sector_id</code>.
     */
    public final TableField<PlanCategoriesRecord, Integer> GCN_SECTOR_ID = createField(DSL.name("gcn_sector_id"), SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>template.plan_categories.code</code>.
     */
    public final TableField<PlanCategoriesRecord, String> CODE = createField(DSL.name("code"), SQLDataType.CLOB.nullable(false), this, "");

    /**
     * The column <code>template.plan_categories.name</code>.
     */
    public final TableField<PlanCategoriesRecord, String> NAME = createField(DSL.name("name"), SQLDataType.CLOB.nullable(false), this, "");

    /**
     * The column <code>template.plan_categories.category_unit</code>.
     */
    public final TableField<PlanCategoriesRecord, UnitType> CATEGORY_UNIT = createField(DSL.name("category_unit"), SQLDataType.VARCHAR.nullable(false).asEnumDataType(nl.aerius.emissionservice.db.generated.public_.enums.UnitType.class), this, "");

    /**
     * The column <code>template.plan_categories.description</code>.
     */
    public final TableField<PlanCategoriesRecord, String> DESCRIPTION = createField(DSL.name("description"), SQLDataType.CLOB, this, "");

    private PlanCategories(Name alias, Table<PlanCategoriesRecord> aliased) {
        this(alias, aliased, null);
    }

    private PlanCategories(Name alias, Table<PlanCategoriesRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment("De categorieën van verschillende soorten plannen.\r\n\r\nDe naam is hierbij de identificatie van de categorie voor de gebruiker.\r\n\r\n@file source/database/src/main/sql/template/02-emission_factors/02-tables/plans.sql"), TableOptions.table());
    }

    /**
     * Create an aliased <code>template.plan_categories</code> table reference
     */
    public PlanCategories(String alias) {
        this(DSL.name(alias), PLAN_CATEGORIES);
    }

    /**
     * Create an aliased <code>template.plan_categories</code> table reference
     */
    public PlanCategories(Name alias) {
        this(alias, PLAN_CATEGORIES);
    }

    /**
     * Create a <code>template.plan_categories</code> table reference
     */
    public PlanCategories() {
        this(DSL.name("plan_categories"), null);
    }

    public <O extends Record> PlanCategories(Table<O> child, ForeignKey<O, PlanCategoriesRecord> key) {
        super(child, key, PLAN_CATEGORIES);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : Template.TEMPLATE;
    }

    @Override
    public UniqueKey<PlanCategoriesRecord> getPrimaryKey() {
        return Keys.PLAN_CATEGORIES_PKEY;
    }

    @Override
    public List<UniqueKey<PlanCategoriesRecord>> getUniqueKeys() {
        return Arrays.asList(Keys.PLAN_CATEGORIES_CODE_KEY, Keys.PLAN_CATEGORIES_NAME_KEY);
    }

    @Override
    public List<ForeignKey<PlanCategoriesRecord, ?>> getReferences() {
        return Arrays.asList(Keys.PLAN_CATEGORIES__PLAN_CATEGORIES_FKEY_GCN_SECTORS);
    }

    private transient GcnSectors _gcnSectors;

    /**
     * Get the implicit join path to the <code>template.gcn_sectors</code>
     * table.
     */
    public GcnSectors gcnSectors() {
        if (_gcnSectors == null)
            _gcnSectors = new GcnSectors(this, Keys.PLAN_CATEGORIES__PLAN_CATEGORIES_FKEY_GCN_SECTORS);

        return _gcnSectors;
    }

    @Override
    public PlanCategories as(String alias) {
        return new PlanCategories(DSL.name(alias), this);
    }

    @Override
    public PlanCategories as(Name alias) {
        return new PlanCategories(alias, this);
    }

    @Override
    public PlanCategories as(Table<?> alias) {
        return new PlanCategories(alias.getQualifiedName(), this);
    }

    /**
     * Rename this table
     */
    @Override
    public PlanCategories rename(String name) {
        return new PlanCategories(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public PlanCategories rename(Name name) {
        return new PlanCategories(name, null);
    }

    /**
     * Rename this table
     */
    @Override
    public PlanCategories rename(Table<?> name) {
        return new PlanCategories(name.getQualifiedName(), null);
    }

    // -------------------------------------------------------------------------
    // Row6 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row6<Short, Integer, String, String, UnitType, String> fieldsRow() {
        return (Row6) super.fieldsRow();
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Function)}.
     */
    public <U> SelectField<U> mapping(Function6<? super Short, ? super Integer, ? super String, ? super String, ? super UnitType, ? super String, ? extends U> from) {
        return convertFrom(Records.mapping(from));
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Class,
     * Function)}.
     */
    public <U> SelectField<U> mapping(Class<U> toType, Function6<? super Short, ? super Integer, ? super String, ? super String, ? super UnitType, ? super String, ? extends U> from) {
        return convertFrom(toType, Records.mapping(from));
    }
}