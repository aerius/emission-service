/*
 * This file is generated by jOOQ.
 */
package nl.overheid.aerius.emissionservice.jooq.template.tables;


import java.util.Arrays;
import java.util.List;

import nl.overheid.aerius.emissionservice.jooq.public_.tables.Substances;
import nl.overheid.aerius.emissionservice.jooq.template.Keys;
import nl.overheid.aerius.emissionservice.jooq.template.Template;
import nl.overheid.aerius.emissionservice.jooq.template.tables.records.MobileSourceOffRoadCategoryEmissionFactorsRecord;

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
 * De emissie factoren (werkend en stationair) voor stageklassen.
 * 
 * Het veld emission_factor_idle is leeg indien er geen stationaire emissieberekening 
 * mogelijk is voor een stageklasse. Er bevindt zich dan ook geen bijbehorend 
 * record in {@see mobile_source_off_road_category_idle_properties}.
 * 
 * @column emission_factor_working EFW_plb, emissie factor werkend per liter 
 * brandstof (g/l)
 * @column emission_factor_idle EFS_plci, emissie factor stationair per uur 
 * per liter cilinder-inhoud (g/l/uur)
 * 
 * @file source/database/src/main/sql/emission_factors/02-tables/mobile_sources.sql
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class MobileSourceOffRoadCategoryEmissionFactors extends TableImpl<MobileSourceOffRoadCategoryEmissionFactorsRecord> {

    private static final long serialVersionUID = 1089001103;

    /**
     * The reference instance of <code>template.mobile_source_off_road_category_emission_factors</code>
     */
    public static final MobileSourceOffRoadCategoryEmissionFactors MOBILE_SOURCE_OFF_ROAD_CATEGORY_EMISSION_FACTORS = new MobileSourceOffRoadCategoryEmissionFactors();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<MobileSourceOffRoadCategoryEmissionFactorsRecord> getRecordType() {
        return MobileSourceOffRoadCategoryEmissionFactorsRecord.class;
    }

    /**
     * The column <code>template.mobile_source_off_road_category_emission_factors.mobile_source_off_road_category_id</code>.
     */
    public final TableField<MobileSourceOffRoadCategoryEmissionFactorsRecord, Short> MOBILE_SOURCE_OFF_ROAD_CATEGORY_ID = createField(DSL.name("mobile_source_off_road_category_id"), org.jooq.impl.SQLDataType.SMALLINT.nullable(false), this, "");

    /**
     * The column <code>template.mobile_source_off_road_category_emission_factors.substance_id</code>.
     */
    public final TableField<MobileSourceOffRoadCategoryEmissionFactorsRecord, Short> SUBSTANCE_ID = createField(DSL.name("substance_id"), org.jooq.impl.SQLDataType.SMALLINT.nullable(false), this, "");

    /**
     * The column <code>template.mobile_source_off_road_category_emission_factors.emission_factor_working</code>.
     */
    public final TableField<MobileSourceOffRoadCategoryEmissionFactorsRecord, Float> EMISSION_FACTOR_WORKING = createField(DSL.name("emission_factor_working"), org.jooq.impl.SQLDataType.REAL.nullable(false), this, "");

    /**
     * The column <code>template.mobile_source_off_road_category_emission_factors.emission_factor_idle</code>.
     */
    public final TableField<MobileSourceOffRoadCategoryEmissionFactorsRecord, Float> EMISSION_FACTOR_IDLE = createField(DSL.name("emission_factor_idle"), org.jooq.impl.SQLDataType.REAL, this, "");

    /**
     * Create a <code>template.mobile_source_off_road_category_emission_factors</code> table reference
     */
    public MobileSourceOffRoadCategoryEmissionFactors() {
        this(DSL.name("mobile_source_off_road_category_emission_factors"), null);
    }

    /**
     * Create an aliased <code>template.mobile_source_off_road_category_emission_factors</code> table reference
     */
    public MobileSourceOffRoadCategoryEmissionFactors(String alias) {
        this(DSL.name(alias), MOBILE_SOURCE_OFF_ROAD_CATEGORY_EMISSION_FACTORS);
    }

    /**
     * Create an aliased <code>template.mobile_source_off_road_category_emission_factors</code> table reference
     */
    public MobileSourceOffRoadCategoryEmissionFactors(Name alias) {
        this(alias, MOBILE_SOURCE_OFF_ROAD_CATEGORY_EMISSION_FACTORS);
    }

    private MobileSourceOffRoadCategoryEmissionFactors(Name alias, Table<MobileSourceOffRoadCategoryEmissionFactorsRecord> aliased) {
        this(alias, aliased, null);
    }

    private MobileSourceOffRoadCategoryEmissionFactors(Name alias, Table<MobileSourceOffRoadCategoryEmissionFactorsRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment("De emissie factoren (werkend en stationair) voor stageklassen.\r\n\r\nHet veld emission_factor_idle is leeg indien er geen stationaire emissieberekening mogelijk is voor een stageklasse. Er bevindt zich dan ook geen bijbehorend record in {@see mobile_source_off_road_category_idle_properties}.\r\n\r\n@column emission_factor_working EFW_plb, emissie factor werkend per liter brandstof (g/l)\r\n@column emission_factor_idle EFS_plci, emissie factor stationair per uur per liter cilinder-inhoud (g/l/uur)\r\n\r\n@file source/database/src/main/sql/emission_factors/02-tables/mobile_sources.sql"), TableOptions.table());
    }

    public <O extends Record> MobileSourceOffRoadCategoryEmissionFactors(Table<O> child, ForeignKey<O, MobileSourceOffRoadCategoryEmissionFactorsRecord> key) {
        super(child, key, MOBILE_SOURCE_OFF_ROAD_CATEGORY_EMISSION_FACTORS);
    }

    @Override
    public Schema getSchema() {
        return Template.TEMPLATE;
    }

    @Override
    public UniqueKey<MobileSourceOffRoadCategoryEmissionFactorsRecord> getPrimaryKey() {
        return Keys.MOBILE_SOURCE_OFF_ROAD_CATEGORY_EFAC_PKEY;
    }

    @Override
    public List<UniqueKey<MobileSourceOffRoadCategoryEmissionFactorsRecord>> getKeys() {
        return Arrays.<UniqueKey<MobileSourceOffRoadCategoryEmissionFactorsRecord>>asList(Keys.MOBILE_SOURCE_OFF_ROAD_CATEGORY_EFAC_PKEY);
    }

    @Override
    public List<ForeignKey<MobileSourceOffRoadCategoryEmissionFactorsRecord, ?>> getReferences() {
        return Arrays.<ForeignKey<MobileSourceOffRoadCategoryEmissionFactorsRecord, ?>>asList(Keys.MOBILE_SOURCE_OFF_ROAD_CATEGORY_EMISSION_FACTORS__MOBILE_SOURCE_OFF_ROAD_CATEGORY_EFAC_FKEY_MOBILE_OFF_ROAD_CAT, Keys.MOBILE_SOURCE_OFF_ROAD_CATEGORY_EMISSION_FACTORS__MOBILE_SOURCE_OFF_ROAD_CATEGORY_EFAC_FKEY_SUBSTANCES);
    }

    public MobileSourceOffRoadCategories mobileSourceOffRoadCategories() {
        return new MobileSourceOffRoadCategories(this, Keys.MOBILE_SOURCE_OFF_ROAD_CATEGORY_EMISSION_FACTORS__MOBILE_SOURCE_OFF_ROAD_CATEGORY_EFAC_FKEY_MOBILE_OFF_ROAD_CAT);
    }

    public Substances substances() {
        return new Substances(this, Keys.MOBILE_SOURCE_OFF_ROAD_CATEGORY_EMISSION_FACTORS__MOBILE_SOURCE_OFF_ROAD_CATEGORY_EFAC_FKEY_SUBSTANCES);
    }

    @Override
    public MobileSourceOffRoadCategoryEmissionFactors as(String alias) {
        return new MobileSourceOffRoadCategoryEmissionFactors(DSL.name(alias), this);
    }

    @Override
    public MobileSourceOffRoadCategoryEmissionFactors as(Name alias) {
        return new MobileSourceOffRoadCategoryEmissionFactors(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public MobileSourceOffRoadCategoryEmissionFactors rename(String name) {
        return new MobileSourceOffRoadCategoryEmissionFactors(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public MobileSourceOffRoadCategoryEmissionFactors rename(Name name) {
        return new MobileSourceOffRoadCategoryEmissionFactors(name, null);
    }

    // -------------------------------------------------------------------------
    // Row4 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row4<Short, Short, Float, Float> fieldsRow() {
        return (Row4) super.fieldsRow();
    }
}
