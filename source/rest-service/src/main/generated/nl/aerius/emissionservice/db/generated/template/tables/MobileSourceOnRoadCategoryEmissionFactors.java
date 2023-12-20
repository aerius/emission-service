/*
 * This file is generated by jOOQ.
 */
package nl.aerius.emissionservice.db.generated.template.tables;


import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

import nl.aerius.emissionservice.db.generated.public_.tables.Substances;
import nl.aerius.emissionservice.db.generated.template.Keys;
import nl.aerius.emissionservice.db.generated.template.Template;
import nl.aerius.emissionservice.db.generated.template.tables.records.MobileSourceOnRoadCategoryEmissionFactorsRecord;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Function5;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Records;
import org.jooq.Row5;
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
 * Table containing the emission factors for on road mobile source categories.
 * These emission factors are in kg/km/vehicle.
 * 
 * @file
 * source/database/src/main/sql/template/02-emission_factors/02-tables/roads.sql
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class MobileSourceOnRoadCategoryEmissionFactors extends TableImpl<MobileSourceOnRoadCategoryEmissionFactorsRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of
     * <code>template.mobile_source_on_road_category_emission_factors</code>
     */
    public static final MobileSourceOnRoadCategoryEmissionFactors MOBILE_SOURCE_ON_ROAD_CATEGORY_EMISSION_FACTORS = new MobileSourceOnRoadCategoryEmissionFactors();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<MobileSourceOnRoadCategoryEmissionFactorsRecord> getRecordType() {
        return MobileSourceOnRoadCategoryEmissionFactorsRecord.class;
    }

    /**
     * The column
     * <code>template.mobile_source_on_road_category_emission_factors.mobile_source_on_road_category_id</code>.
     */
    public final TableField<MobileSourceOnRoadCategoryEmissionFactorsRecord, Short> MOBILE_SOURCE_ON_ROAD_CATEGORY_ID = createField(DSL.name("mobile_source_on_road_category_id"), SQLDataType.SMALLINT.nullable(false), this, "");

    /**
     * The column
     * <code>template.mobile_source_on_road_category_emission_factors.road_type_category_id</code>.
     */
    public final TableField<MobileSourceOnRoadCategoryEmissionFactorsRecord, Integer> ROAD_TYPE_CATEGORY_ID = createField(DSL.name("road_type_category_id"), SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column
     * <code>template.mobile_source_on_road_category_emission_factors.year</code>.
     */
    public final TableField<MobileSourceOnRoadCategoryEmissionFactorsRecord, Short> YEAR = createField(DSL.name("year"), nl.aerius.emissionservice.db.generated.public_.Domains.YEAR_TYPE.getDataType().nullable(false), this, "");

    /**
     * The column
     * <code>template.mobile_source_on_road_category_emission_factors.substance_id</code>.
     */
    public final TableField<MobileSourceOnRoadCategoryEmissionFactorsRecord, Short> SUBSTANCE_ID = createField(DSL.name("substance_id"), SQLDataType.SMALLINT.nullable(false), this, "");

    /**
     * The column
     * <code>template.mobile_source_on_road_category_emission_factors.emission_factor</code>.
     */
    public final TableField<MobileSourceOnRoadCategoryEmissionFactorsRecord, Float> EMISSION_FACTOR = createField(DSL.name("emission_factor"), nl.aerius.emissionservice.db.generated.public_.Domains.POSREAL.getDataType().nullable(false), this, "");

    private MobileSourceOnRoadCategoryEmissionFactors(Name alias, Table<MobileSourceOnRoadCategoryEmissionFactorsRecord> aliased) {
        this(alias, aliased, null);
    }

    private MobileSourceOnRoadCategoryEmissionFactors(Name alias, Table<MobileSourceOnRoadCategoryEmissionFactorsRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment("Table containing the emission factors for on road mobile source categories.\r\nThese emission factors are in kg/km/vehicle.\r\n\r\n@file source/database/src/main/sql/template/02-emission_factors/02-tables/roads.sql"), TableOptions.table());
    }

    /**
     * Create an aliased
     * <code>template.mobile_source_on_road_category_emission_factors</code>
     * table reference
     */
    public MobileSourceOnRoadCategoryEmissionFactors(String alias) {
        this(DSL.name(alias), MOBILE_SOURCE_ON_ROAD_CATEGORY_EMISSION_FACTORS);
    }

    /**
     * Create an aliased
     * <code>template.mobile_source_on_road_category_emission_factors</code>
     * table reference
     */
    public MobileSourceOnRoadCategoryEmissionFactors(Name alias) {
        this(alias, MOBILE_SOURCE_ON_ROAD_CATEGORY_EMISSION_FACTORS);
    }

    /**
     * Create a
     * <code>template.mobile_source_on_road_category_emission_factors</code>
     * table reference
     */
    public MobileSourceOnRoadCategoryEmissionFactors() {
        this(DSL.name("mobile_source_on_road_category_emission_factors"), null);
    }

    public <O extends Record> MobileSourceOnRoadCategoryEmissionFactors(Table<O> child, ForeignKey<O, MobileSourceOnRoadCategoryEmissionFactorsRecord> key) {
        super(child, key, MOBILE_SOURCE_ON_ROAD_CATEGORY_EMISSION_FACTORS);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : Template.TEMPLATE;
    }

    @Override
    public UniqueKey<MobileSourceOnRoadCategoryEmissionFactorsRecord> getPrimaryKey() {
        return Keys.MOBILE_SOURCE_ON_ROAD_EFAC_PKEY;
    }

    @Override
    public List<ForeignKey<MobileSourceOnRoadCategoryEmissionFactorsRecord, ?>> getReferences() {
        return Arrays.asList(Keys.MOBILE_SOURCE_ON_ROAD_CATEGORY_EMISSION_FACTORS__MOBILE_SOURCE_ON_ROAD_EFAC_FKEY_MOBILE_ON_ROAD_CAT, Keys.MOBILE_SOURCE_ON_ROAD_CATEGORY_EMISSION_FACTORS__MOBILE_SOURCE_ON_ROAD_EFAC_FKEY_ROAD_TYPES, Keys.MOBILE_SOURCE_ON_ROAD_CATEGORY_EMISSION_FACTORS__MOBILE_SOURCE_ON_ROAD_EFAC_FKEY_SUBSTANCES);
    }

    private transient MobileSourceOnRoadCategories _mobileSourceOnRoadCategories;
    private transient RoadTypeCategories _roadTypeCategories;
    private transient Substances _substances;

    /**
     * Get the implicit join path to the
     * <code>template.mobile_source_on_road_categories</code> table.
     */
    public MobileSourceOnRoadCategories mobileSourceOnRoadCategories() {
        if (_mobileSourceOnRoadCategories == null)
            _mobileSourceOnRoadCategories = new MobileSourceOnRoadCategories(this, Keys.MOBILE_SOURCE_ON_ROAD_CATEGORY_EMISSION_FACTORS__MOBILE_SOURCE_ON_ROAD_EFAC_FKEY_MOBILE_ON_ROAD_CAT);

        return _mobileSourceOnRoadCategories;
    }

    /**
     * Get the implicit join path to the
     * <code>template.road_type_categories</code> table.
     */
    public RoadTypeCategories roadTypeCategories() {
        if (_roadTypeCategories == null)
            _roadTypeCategories = new RoadTypeCategories(this, Keys.MOBILE_SOURCE_ON_ROAD_CATEGORY_EMISSION_FACTORS__MOBILE_SOURCE_ON_ROAD_EFAC_FKEY_ROAD_TYPES);

        return _roadTypeCategories;
    }

    /**
     * Get the implicit join path to the <code>public.substances</code> table.
     */
    public Substances substances() {
        if (_substances == null)
            _substances = new Substances(this, Keys.MOBILE_SOURCE_ON_ROAD_CATEGORY_EMISSION_FACTORS__MOBILE_SOURCE_ON_ROAD_EFAC_FKEY_SUBSTANCES);

        return _substances;
    }

    @Override
    public MobileSourceOnRoadCategoryEmissionFactors as(String alias) {
        return new MobileSourceOnRoadCategoryEmissionFactors(DSL.name(alias), this);
    }

    @Override
    public MobileSourceOnRoadCategoryEmissionFactors as(Name alias) {
        return new MobileSourceOnRoadCategoryEmissionFactors(alias, this);
    }

    @Override
    public MobileSourceOnRoadCategoryEmissionFactors as(Table<?> alias) {
        return new MobileSourceOnRoadCategoryEmissionFactors(alias.getQualifiedName(), this);
    }

    /**
     * Rename this table
     */
    @Override
    public MobileSourceOnRoadCategoryEmissionFactors rename(String name) {
        return new MobileSourceOnRoadCategoryEmissionFactors(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public MobileSourceOnRoadCategoryEmissionFactors rename(Name name) {
        return new MobileSourceOnRoadCategoryEmissionFactors(name, null);
    }

    /**
     * Rename this table
     */
    @Override
    public MobileSourceOnRoadCategoryEmissionFactors rename(Table<?> name) {
        return new MobileSourceOnRoadCategoryEmissionFactors(name.getQualifiedName(), null);
    }

    // -------------------------------------------------------------------------
    // Row5 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row5<Short, Integer, Short, Short, Float> fieldsRow() {
        return (Row5) super.fieldsRow();
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Function)}.
     */
    public <U> SelectField<U> mapping(Function5<? super Short, ? super Integer, ? super Short, ? super Short, ? super Float, ? extends U> from) {
        return convertFrom(Records.mapping(from));
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Class,
     * Function)}.
     */
    public <U> SelectField<U> mapping(Class<U> toType, Function5<? super Short, ? super Integer, ? super Short, ? super Short, ? super Float, ? extends U> from) {
        return convertFrom(toType, Records.mapping(from));
    }
}
