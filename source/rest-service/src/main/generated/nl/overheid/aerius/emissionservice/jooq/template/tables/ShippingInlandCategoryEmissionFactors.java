/*
 * This file is generated by jOOQ.
 */
package nl.overheid.aerius.emissionservice.jooq.template.tables;


import java.util.Arrays;
import java.util.List;

import nl.overheid.aerius.emissionservice.jooq.public_.enums.ShippingInlandLadenState;
import nl.overheid.aerius.emissionservice.jooq.public_.enums.ShippingInlandShipDirectionType;
import nl.overheid.aerius.emissionservice.jooq.public_.tables.Substances;
import nl.overheid.aerius.emissionservice.jooq.template.Keys;
import nl.overheid.aerius.emissionservice.jooq.template.Template;
import nl.overheid.aerius.emissionservice.jooq.template.tables.records.ShippingInlandCategoryEmissionFactorsRecord;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row7;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.TableOptions;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.TableImpl;


/**
 * De emissie factoren voor de verschillende soorten varende schepen.
 * Deze factoren zijn uniek per scheepstype, vaarwegtype, vaarrichtingen, 
 * ladingstoestand en stof.
 * 
 * Hierin worden de emissiefactoren per jaar weergegeven, emission_factor 
 * is de emissie factor tijdens varen (in kg/(kilometer * aantal schepen)) 
 * bij een bepaalde snelheid.
 * 
 * @file source/database/src/main/sql/template/02_emission_factors/02-tables/shipping_inland.sql
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class ShippingInlandCategoryEmissionFactors extends TableImpl<ShippingInlandCategoryEmissionFactorsRecord> {

    private static final long serialVersionUID = -243519804;

    /**
     * The reference instance of <code>template.shipping_inland_category_emission_factors</code>
     */
    public static final ShippingInlandCategoryEmissionFactors SHIPPING_INLAND_CATEGORY_EMISSION_FACTORS = new ShippingInlandCategoryEmissionFactors();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<ShippingInlandCategoryEmissionFactorsRecord> getRecordType() {
        return ShippingInlandCategoryEmissionFactorsRecord.class;
    }

    /**
     * The column <code>template.shipping_inland_category_emission_factors.shipping_inland_category_id</code>.
     */
    public final TableField<ShippingInlandCategoryEmissionFactorsRecord, Short> SHIPPING_INLAND_CATEGORY_ID = createField(DSL.name("shipping_inland_category_id"), org.jooq.impl.SQLDataType.SMALLINT.nullable(false), this, "");

    /**
     * The column <code>template.shipping_inland_category_emission_factors.shipping_inland_waterway_category_id</code>.
     */
    public final TableField<ShippingInlandCategoryEmissionFactorsRecord, Integer> SHIPPING_INLAND_WATERWAY_CATEGORY_ID = createField(DSL.name("shipping_inland_waterway_category_id"), org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>template.shipping_inland_category_emission_factors.ship_direction</code>.
     */
    public final TableField<ShippingInlandCategoryEmissionFactorsRecord, ShippingInlandShipDirectionType> SHIP_DIRECTION = createField(DSL.name("ship_direction"), org.jooq.impl.SQLDataType.VARCHAR.nullable(false).asEnumDataType(nl.overheid.aerius.emissionservice.jooq.public_.enums.ShippingInlandShipDirectionType.class), this, "");

    /**
     * The column <code>template.shipping_inland_category_emission_factors.laden_state</code>.
     */
    public final TableField<ShippingInlandCategoryEmissionFactorsRecord, ShippingInlandLadenState> LADEN_STATE = createField(DSL.name("laden_state"), org.jooq.impl.SQLDataType.VARCHAR.nullable(false).asEnumDataType(nl.overheid.aerius.emissionservice.jooq.public_.enums.ShippingInlandLadenState.class), this, "");

    /**
     * The column <code>template.shipping_inland_category_emission_factors.year</code>.
     */
    public final TableField<ShippingInlandCategoryEmissionFactorsRecord, Short> YEAR = createField(DSL.name("year"), org.jooq.impl.SQLDataType.SMALLINT.nullable(false), this, "");

    /**
     * The column <code>template.shipping_inland_category_emission_factors.substance_id</code>.
     */
    public final TableField<ShippingInlandCategoryEmissionFactorsRecord, Short> SUBSTANCE_ID = createField(DSL.name("substance_id"), org.jooq.impl.SQLDataType.SMALLINT.nullable(false), this, "");

    /**
     * The column <code>template.shipping_inland_category_emission_factors.emission_factor</code>.
     */
    public final TableField<ShippingInlandCategoryEmissionFactorsRecord, Float> EMISSION_FACTOR = createField(DSL.name("emission_factor"), org.jooq.impl.SQLDataType.REAL.nullable(false), this, "");

    /**
     * Create a <code>template.shipping_inland_category_emission_factors</code> table reference
     */
    public ShippingInlandCategoryEmissionFactors() {
        this(DSL.name("shipping_inland_category_emission_factors"), null);
    }

    /**
     * Create an aliased <code>template.shipping_inland_category_emission_factors</code> table reference
     */
    public ShippingInlandCategoryEmissionFactors(String alias) {
        this(DSL.name(alias), SHIPPING_INLAND_CATEGORY_EMISSION_FACTORS);
    }

    /**
     * Create an aliased <code>template.shipping_inland_category_emission_factors</code> table reference
     */
    public ShippingInlandCategoryEmissionFactors(Name alias) {
        this(alias, SHIPPING_INLAND_CATEGORY_EMISSION_FACTORS);
    }

    private ShippingInlandCategoryEmissionFactors(Name alias, Table<ShippingInlandCategoryEmissionFactorsRecord> aliased) {
        this(alias, aliased, null);
    }

    private ShippingInlandCategoryEmissionFactors(Name alias, Table<ShippingInlandCategoryEmissionFactorsRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment("De emissie factoren voor de verschillende soorten varende schepen.\r\nDeze factoren zijn uniek per scheepstype, vaarwegtype, vaarrichtingen, ladingstoestand en stof.\r\n\r\nHierin worden de emissiefactoren per jaar weergegeven, emission_factor is de emissie factor tijdens varen (in kg/(kilometer * aantal schepen)) bij een bepaalde snelheid.\r\n\r\n@file source/database/src/main/sql/template/02_emission_factors/02-tables/shipping_inland.sql"), TableOptions.table());
    }

    public <O extends Record> ShippingInlandCategoryEmissionFactors(Table<O> child, ForeignKey<O, ShippingInlandCategoryEmissionFactorsRecord> key) {
        super(child, key, SHIPPING_INLAND_CATEGORY_EMISSION_FACTORS);
    }

    @Override
    public Schema getSchema() {
        return Template.TEMPLATE;
    }

    @Override
    public UniqueKey<ShippingInlandCategoryEmissionFactorsRecord> getPrimaryKey() {
        return Keys.SHIPPING_INLAND_CATEGORY_EMISSION_FACTORS_PKEY;
    }

    @Override
    public List<UniqueKey<ShippingInlandCategoryEmissionFactorsRecord>> getKeys() {
        return Arrays.<UniqueKey<ShippingInlandCategoryEmissionFactorsRecord>>asList(Keys.SHIPPING_INLAND_CATEGORY_EMISSION_FACTORS_PKEY);
    }

    @Override
    public List<ForeignKey<ShippingInlandCategoryEmissionFactorsRecord, ?>> getReferences() {
        return Arrays.<ForeignKey<ShippingInlandCategoryEmissionFactorsRecord, ?>>asList(Keys.SHIPPING_INLAND_CATEGORY_EMISSION_FACTORS__SHIPPING_INLAND_CATEGORY_EMISSION_FACTORS_FKEY_CATEGORIES, Keys.SHIPPING_INLAND_CATEGORY_EMISSION_FACTORS__SHIPPING_INLAND_CATEGORY_EMISSION_FACTORS_FKEY_WATERWAY_CATEGOR, Keys.SHIPPING_INLAND_CATEGORY_EMISSION_FACTORS__SHIPPING_INLAND_CATEGORY_EMISSION_FACTORS_FKEY_SUBSTANCES);
    }

    public ShippingInlandCategories shippingInlandCategories() {
        return new ShippingInlandCategories(this, Keys.SHIPPING_INLAND_CATEGORY_EMISSION_FACTORS__SHIPPING_INLAND_CATEGORY_EMISSION_FACTORS_FKEY_CATEGORIES);
    }

    public ShippingInlandWaterwayCategories shippingInlandWaterwayCategories() {
        return new ShippingInlandWaterwayCategories(this, Keys.SHIPPING_INLAND_CATEGORY_EMISSION_FACTORS__SHIPPING_INLAND_CATEGORY_EMISSION_FACTORS_FKEY_WATERWAY_CATEGOR);
    }

    public Substances substances() {
        return new Substances(this, Keys.SHIPPING_INLAND_CATEGORY_EMISSION_FACTORS__SHIPPING_INLAND_CATEGORY_EMISSION_FACTORS_FKEY_SUBSTANCES);
    }

    @Override
    public ShippingInlandCategoryEmissionFactors as(String alias) {
        return new ShippingInlandCategoryEmissionFactors(DSL.name(alias), this);
    }

    @Override
    public ShippingInlandCategoryEmissionFactors as(Name alias) {
        return new ShippingInlandCategoryEmissionFactors(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public ShippingInlandCategoryEmissionFactors rename(String name) {
        return new ShippingInlandCategoryEmissionFactors(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public ShippingInlandCategoryEmissionFactors rename(Name name) {
        return new ShippingInlandCategoryEmissionFactors(name, null);
    }

    // -------------------------------------------------------------------------
    // Row7 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row7<Short, Integer, ShippingInlandShipDirectionType, ShippingInlandLadenState, Short, Short, Float> fieldsRow() {
        return (Row7) super.fieldsRow();
    }
}
