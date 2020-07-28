/*
 * This file is generated by jOOQ.
 */
package nl.overheid.aerius.emissionservice.jooq.template.tables;


import java.util.Arrays;
import java.util.List;

import nl.overheid.aerius.emissionservice.jooq.public_.enums.RoadType;
import nl.overheid.aerius.emissionservice.jooq.public_.enums.VehicleType;
import nl.overheid.aerius.emissionservice.jooq.template.Keys;
import nl.overheid.aerius.emissionservice.jooq.template.Template;
import nl.overheid.aerius.emissionservice.jooq.template.tables.records.RoadCategoriesRecord;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row6;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.TableOptions;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.TableImpl;


/**
 * Tabel met daarin de verschillende soorten wegen en de verschillende type 
 * voertuigen op die wegen.
 * 
 * Dit zijn de standaard categorieen voor wegverkeer (bijv. personenauto's).
 * 
 * 
 * @file source/database/src/main/sql/emission_factors/02-tables/roads.sql
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class RoadCategories extends TableImpl<RoadCategoriesRecord> {

    private static final long serialVersionUID = -511272656;

    /**
     * The reference instance of <code>template.road_categories</code>
     */
    public static final RoadCategories ROAD_CATEGORIES = new RoadCategories();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<RoadCategoriesRecord> getRecordType() {
        return RoadCategoriesRecord.class;
    }

    /**
     * The column <code>template.road_categories.road_category_id</code>.
     */
    public final TableField<RoadCategoriesRecord, Integer> ROAD_CATEGORY_ID = createField(DSL.name("road_category_id"), org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>template.road_categories.gcn_sector_id</code>.
     */
    public final TableField<RoadCategoriesRecord, Integer> GCN_SECTOR_ID = createField(DSL.name("gcn_sector_id"), org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>template.road_categories.road_type</code>.
     */
    public final TableField<RoadCategoriesRecord, RoadType> ROAD_TYPE = createField(DSL.name("road_type"), org.jooq.impl.SQLDataType.VARCHAR.nullable(false).asEnumDataType(nl.overheid.aerius.emissionservice.jooq.public_.enums.RoadType.class), this, "");

    /**
     * The column <code>template.road_categories.vehicle_type</code>.
     */
    public final TableField<RoadCategoriesRecord, VehicleType> VEHICLE_TYPE = createField(DSL.name("vehicle_type"), org.jooq.impl.SQLDataType.VARCHAR.nullable(false).asEnumDataType(nl.overheid.aerius.emissionservice.jooq.public_.enums.VehicleType.class), this, "");

    /**
     * The column <code>template.road_categories.name</code>.
     */
    public final TableField<RoadCategoriesRecord, String> NAME = createField(DSL.name("name"), org.jooq.impl.SQLDataType.CLOB.nullable(false), this, "");

    /**
     * The column <code>template.road_categories.description</code>.
     */
    public final TableField<RoadCategoriesRecord, String> DESCRIPTION = createField(DSL.name("description"), org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * Create a <code>template.road_categories</code> table reference
     */
    public RoadCategories() {
        this(DSL.name("road_categories"), null);
    }

    /**
     * Create an aliased <code>template.road_categories</code> table reference
     */
    public RoadCategories(String alias) {
        this(DSL.name(alias), ROAD_CATEGORIES);
    }

    /**
     * Create an aliased <code>template.road_categories</code> table reference
     */
    public RoadCategories(Name alias) {
        this(alias, ROAD_CATEGORIES);
    }

    private RoadCategories(Name alias, Table<RoadCategoriesRecord> aliased) {
        this(alias, aliased, null);
    }

    private RoadCategories(Name alias, Table<RoadCategoriesRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment("Tabel met daarin de verschillende soorten wegen en de verschillende type voertuigen op die wegen.\r\n\r\nDit zijn de standaard categorieen voor wegverkeer (bijv. personenauto's).\r\n\r\n@file source/database/src/main/sql/emission_factors/02-tables/roads.sql"), TableOptions.table());
    }

    public <O extends Record> RoadCategories(Table<O> child, ForeignKey<O, RoadCategoriesRecord> key) {
        super(child, key, ROAD_CATEGORIES);
    }

    @Override
    public Schema getSchema() {
        return Template.TEMPLATE;
    }

    @Override
    public UniqueKey<RoadCategoriesRecord> getPrimaryKey() {
        return Keys.ROAD_CATEGORIES_PKEY;
    }

    @Override
    public List<UniqueKey<RoadCategoriesRecord>> getKeys() {
        return Arrays.<UniqueKey<RoadCategoriesRecord>>asList(Keys.ROAD_CATEGORIES_PKEY, Keys.ROAD_CATEGORIES_ROAD_AND_VEHICLE_TYPE_UNIQUE, Keys.ROAD_CATEGORIES_NAME_KEY);
    }

    @Override
    public List<ForeignKey<RoadCategoriesRecord, ?>> getReferences() {
        return Arrays.<ForeignKey<RoadCategoriesRecord, ?>>asList(Keys.ROAD_CATEGORIES__ROAD_CATEGORIES_FKEY_GCN_SECTORS);
    }

    public GcnSectors gcnSectors() {
        return new GcnSectors(this, Keys.ROAD_CATEGORIES__ROAD_CATEGORIES_FKEY_GCN_SECTORS);
    }

    @Override
    public RoadCategories as(String alias) {
        return new RoadCategories(DSL.name(alias), this);
    }

    @Override
    public RoadCategories as(Name alias) {
        return new RoadCategories(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public RoadCategories rename(String name) {
        return new RoadCategories(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public RoadCategories rename(Name name) {
        return new RoadCategories(name, null);
    }

    // -------------------------------------------------------------------------
    // Row6 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row6<Integer, Integer, RoadType, VehicleType, String, String> fieldsRow() {
        return (Row6) super.fieldsRow();
    }
}
