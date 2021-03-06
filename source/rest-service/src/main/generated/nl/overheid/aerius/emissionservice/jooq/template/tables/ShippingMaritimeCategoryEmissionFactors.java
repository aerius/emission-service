/*
 * This file is generated by jOOQ.
 */
package nl.overheid.aerius.emissionservice.jooq.template.tables;


import java.util.Arrays;
import java.util.List;

import nl.overheid.aerius.emissionservice.jooq.public_.enums.ShippingMovementType;
import nl.overheid.aerius.emissionservice.jooq.public_.tables.Substances;
import nl.overheid.aerius.emissionservice.jooq.template.Keys;
import nl.overheid.aerius.emissionservice.jooq.template.Template;
import nl.overheid.aerius.emissionservice.jooq.template.tables.records.ShippingMaritimeCategoryEmissionFactorsRecord;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row5;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.TableOptions;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.TableImpl;


/**
 * De emissie factoren voor verschillende soorten schepen voor zeescheepvaart.
 * 
 * Deze factoren zijn uniek per scheepstype per stof per jaar per snelheid.
 * 
 * 
 * Hierin worden de emissiefactoren per jaar weergegeven, emission_factor 
 * is de emissie factor tijdens varen (in kg/(kilometer * aantal schepen)) 
 * bij een bepaalde snelheid.
 * De emission_factor bij een snelheid van 0 is de emissie factor tijdens 
 * stilliggen.
 * (in kg/(aantal schepen * uur stilliggen)).
 * 
 * @file source/database/src/main/sql/template/02_emission_factors/02-tables/shipping_maritime.sql
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class ShippingMaritimeCategoryEmissionFactors extends TableImpl<ShippingMaritimeCategoryEmissionFactorsRecord> {

    private static final long serialVersionUID = 1069924592;

    /**
     * The reference instance of <code>template.shipping_maritime_category_emission_factors</code>
     */
    public static final ShippingMaritimeCategoryEmissionFactors SHIPPING_MARITIME_CATEGORY_EMISSION_FACTORS = new ShippingMaritimeCategoryEmissionFactors();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<ShippingMaritimeCategoryEmissionFactorsRecord> getRecordType() {
        return ShippingMaritimeCategoryEmissionFactorsRecord.class;
    }

    /**
     * The column <code>template.shipping_maritime_category_emission_factors.shipping_maritime_category_id</code>.
     */
    public final TableField<ShippingMaritimeCategoryEmissionFactorsRecord, Short> SHIPPING_MARITIME_CATEGORY_ID = createField(DSL.name("shipping_maritime_category_id"), org.jooq.impl.SQLDataType.SMALLINT.nullable(false), this, "");

    /**
     * The column <code>template.shipping_maritime_category_emission_factors.year</code>.
     */
    public final TableField<ShippingMaritimeCategoryEmissionFactorsRecord, Short> YEAR = createField(DSL.name("year"), org.jooq.impl.SQLDataType.SMALLINT.nullable(false), this, "");

    /**
     * The column <code>template.shipping_maritime_category_emission_factors.substance_id</code>.
     */
    public final TableField<ShippingMaritimeCategoryEmissionFactorsRecord, Short> SUBSTANCE_ID = createField(DSL.name("substance_id"), org.jooq.impl.SQLDataType.SMALLINT.nullable(false), this, "");

    /**
     * The column <code>template.shipping_maritime_category_emission_factors.movement_type</code>.
     */
    public final TableField<ShippingMaritimeCategoryEmissionFactorsRecord, ShippingMovementType> MOVEMENT_TYPE = createField(DSL.name("movement_type"), org.jooq.impl.SQLDataType.VARCHAR.nullable(false).asEnumDataType(nl.overheid.aerius.emissionservice.jooq.public_.enums.ShippingMovementType.class), this, "");

    /**
     * The column <code>template.shipping_maritime_category_emission_factors.emission_factor</code>.
     */
    public final TableField<ShippingMaritimeCategoryEmissionFactorsRecord, Float> EMISSION_FACTOR = createField(DSL.name("emission_factor"), org.jooq.impl.SQLDataType.REAL.nullable(false), this, "");

    /**
     * Create a <code>template.shipping_maritime_category_emission_factors</code> table reference
     */
    public ShippingMaritimeCategoryEmissionFactors() {
        this(DSL.name("shipping_maritime_category_emission_factors"), null);
    }

    /**
     * Create an aliased <code>template.shipping_maritime_category_emission_factors</code> table reference
     */
    public ShippingMaritimeCategoryEmissionFactors(String alias) {
        this(DSL.name(alias), SHIPPING_MARITIME_CATEGORY_EMISSION_FACTORS);
    }

    /**
     * Create an aliased <code>template.shipping_maritime_category_emission_factors</code> table reference
     */
    public ShippingMaritimeCategoryEmissionFactors(Name alias) {
        this(alias, SHIPPING_MARITIME_CATEGORY_EMISSION_FACTORS);
    }

    private ShippingMaritimeCategoryEmissionFactors(Name alias, Table<ShippingMaritimeCategoryEmissionFactorsRecord> aliased) {
        this(alias, aliased, null);
    }

    private ShippingMaritimeCategoryEmissionFactors(Name alias, Table<ShippingMaritimeCategoryEmissionFactorsRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment("De emissie factoren voor verschillende soorten schepen voor zeescheepvaart.\r\nDeze factoren zijn uniek per scheepstype per stof per jaar per snelheid.\r\n\r\nHierin worden de emissiefactoren per jaar weergegeven, emission_factor is de emissie factor tijdens varen (in kg/(kilometer * aantal schepen)) bij een bepaalde snelheid.\r\nDe emission_factor bij een snelheid van 0 is de emissie factor tijdens stilliggen.\r\n(in kg/(aantal schepen * uur stilliggen)).\r\n\r\n@file source/database/src/main/sql/template/02_emission_factors/02-tables/shipping_maritime.sql"), TableOptions.table());
    }

    public <O extends Record> ShippingMaritimeCategoryEmissionFactors(Table<O> child, ForeignKey<O, ShippingMaritimeCategoryEmissionFactorsRecord> key) {
        super(child, key, SHIPPING_MARITIME_CATEGORY_EMISSION_FACTORS);
    }

    @Override
    public Schema getSchema() {
        return Template.TEMPLATE;
    }

    @Override
    public UniqueKey<ShippingMaritimeCategoryEmissionFactorsRecord> getPrimaryKey() {
        return Keys.SHIPPING_MARITIME_CATEGORY_EMISSION_FACTORS_PKEY;
    }

    @Override
    public List<UniqueKey<ShippingMaritimeCategoryEmissionFactorsRecord>> getKeys() {
        return Arrays.<UniqueKey<ShippingMaritimeCategoryEmissionFactorsRecord>>asList(Keys.SHIPPING_MARITIME_CATEGORY_EMISSION_FACTORS_PKEY);
    }

    @Override
    public List<ForeignKey<ShippingMaritimeCategoryEmissionFactorsRecord, ?>> getReferences() {
        return Arrays.<ForeignKey<ShippingMaritimeCategoryEmissionFactorsRecord, ?>>asList(Keys.SHIPPING_MARITIME_CATEGORY_EMISSION_FACTORS__SHIPPING_MARITIME_CATEGORY_EMISSION_FACTORS_FKEY_CATEGORIES, Keys.SHIPPING_MARITIME_CATEGORY_EMISSION_FACTORS__SHIPPING_MARITIME_CATEGORY_EMISSION_FACTORS_FKEY_SUBSTANCES);
    }

    public ShippingMaritimeCategories shippingMaritimeCategories() {
        return new ShippingMaritimeCategories(this, Keys.SHIPPING_MARITIME_CATEGORY_EMISSION_FACTORS__SHIPPING_MARITIME_CATEGORY_EMISSION_FACTORS_FKEY_CATEGORIES);
    }

    public Substances substances() {
        return new Substances(this, Keys.SHIPPING_MARITIME_CATEGORY_EMISSION_FACTORS__SHIPPING_MARITIME_CATEGORY_EMISSION_FACTORS_FKEY_SUBSTANCES);
    }

    @Override
    public ShippingMaritimeCategoryEmissionFactors as(String alias) {
        return new ShippingMaritimeCategoryEmissionFactors(DSL.name(alias), this);
    }

    @Override
    public ShippingMaritimeCategoryEmissionFactors as(Name alias) {
        return new ShippingMaritimeCategoryEmissionFactors(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public ShippingMaritimeCategoryEmissionFactors rename(String name) {
        return new ShippingMaritimeCategoryEmissionFactors(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public ShippingMaritimeCategoryEmissionFactors rename(Name name) {
        return new ShippingMaritimeCategoryEmissionFactors(name, null);
    }

    // -------------------------------------------------------------------------
    // Row5 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row5<Short, Short, Short, ShippingMovementType, Float> fieldsRow() {
        return (Row5) super.fieldsRow();
    }
}
