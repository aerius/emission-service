/*
 * This file is generated by jOOQ.
 */
package nl.overheid.aerius.emissionservice.jooq.template.tables;


import nl.overheid.aerius.emissionservice.jooq.public_.enums.ShippingMovementType;
import nl.overheid.aerius.emissionservice.jooq.template.Template;
import nl.overheid.aerius.emissionservice.jooq.template.tables.records.ShippingMaritimeSourceCharacteristicsViewRecord;

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
 * View retourneert de emissie karakteristieken voor zeescheep vaart.
 * 
 * @file source/database/src/main/sql/template/02_emission_factors/04-views/shipping_maritime.sql
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class ShippingMaritimeSourceCharacteristicsView extends TableImpl<ShippingMaritimeSourceCharacteristicsViewRecord> {

    private static final long serialVersionUID = 1272088229;

    /**
     * The reference instance of <code>template.shipping_maritime_source_characteristics_view</code>
     */
    public static final ShippingMaritimeSourceCharacteristicsView SHIPPING_MARITIME_SOURCE_CHARACTERISTICS_VIEW = new ShippingMaritimeSourceCharacteristicsView();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<ShippingMaritimeSourceCharacteristicsViewRecord> getRecordType() {
        return ShippingMaritimeSourceCharacteristicsViewRecord.class;
    }

    /**
     * The column <code>template.shipping_maritime_source_characteristics_view.shipping_maritime_category_id</code>.
     */
    public final TableField<ShippingMaritimeSourceCharacteristicsViewRecord, Short> SHIPPING_MARITIME_CATEGORY_ID = createField(DSL.name("shipping_maritime_category_id"), org.jooq.impl.SQLDataType.SMALLINT, this, "");

    /**
     * The column <code>template.shipping_maritime_source_characteristics_view.year</code>.
     */
    public final TableField<ShippingMaritimeSourceCharacteristicsViewRecord, Short> YEAR = createField(DSL.name("year"), org.jooq.impl.SQLDataType.SMALLINT, this, "");

    /**
     * The column <code>template.shipping_maritime_source_characteristics_view.movement_type</code>.
     */
    public final TableField<ShippingMaritimeSourceCharacteristicsViewRecord, ShippingMovementType> MOVEMENT_TYPE = createField(DSL.name("movement_type"), org.jooq.impl.SQLDataType.VARCHAR.asEnumDataType(nl.overheid.aerius.emissionservice.jooq.public_.enums.ShippingMovementType.class), this, "");

    /**
     * The column <code>template.shipping_maritime_source_characteristics_view.gcn_sector_id</code>.
     */
    public final TableField<ShippingMaritimeSourceCharacteristicsViewRecord, Integer> GCN_SECTOR_ID = createField(DSL.name("gcn_sector_id"), org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>template.shipping_maritime_source_characteristics_view.heat_content</code>.
     */
    public final TableField<ShippingMaritimeSourceCharacteristicsViewRecord, Float> HEAT_CONTENT = createField(DSL.name("heat_content"), org.jooq.impl.SQLDataType.REAL, this, "");

    /**
     * The column <code>template.shipping_maritime_source_characteristics_view.height</code>.
     */
    public final TableField<ShippingMaritimeSourceCharacteristicsViewRecord, Float> HEIGHT = createField(DSL.name("height"), org.jooq.impl.SQLDataType.REAL, this, "");

    /**
     * The column <code>template.shipping_maritime_source_characteristics_view.spread</code>.
     */
    public final TableField<ShippingMaritimeSourceCharacteristicsViewRecord, Float> SPREAD = createField(DSL.name("spread"), org.jooq.impl.SQLDataType.REAL, this, "");

    /**
     * The column <code>template.shipping_maritime_source_characteristics_view.emission_diurnal_variation_id</code>.
     */
    public final TableField<ShippingMaritimeSourceCharacteristicsViewRecord, Integer> EMISSION_DIURNAL_VARIATION_ID = createField(DSL.name("emission_diurnal_variation_id"), org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>template.shipping_maritime_source_characteristics_view.emission_diurnal_variation_code</code>.
     */
    public final TableField<ShippingMaritimeSourceCharacteristicsViewRecord, String> EMISSION_DIURNAL_VARIATION_CODE = createField(DSL.name("emission_diurnal_variation_code"), org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * Create a <code>template.shipping_maritime_source_characteristics_view</code> table reference
     */
    public ShippingMaritimeSourceCharacteristicsView() {
        this(DSL.name("shipping_maritime_source_characteristics_view"), null);
    }

    /**
     * Create an aliased <code>template.shipping_maritime_source_characteristics_view</code> table reference
     */
    public ShippingMaritimeSourceCharacteristicsView(String alias) {
        this(DSL.name(alias), SHIPPING_MARITIME_SOURCE_CHARACTERISTICS_VIEW);
    }

    /**
     * Create an aliased <code>template.shipping_maritime_source_characteristics_view</code> table reference
     */
    public ShippingMaritimeSourceCharacteristicsView(Name alias) {
        this(alias, SHIPPING_MARITIME_SOURCE_CHARACTERISTICS_VIEW);
    }

    private ShippingMaritimeSourceCharacteristicsView(Name alias, Table<ShippingMaritimeSourceCharacteristicsViewRecord> aliased) {
        this(alias, aliased, null);
    }

    private ShippingMaritimeSourceCharacteristicsView(Name alias, Table<ShippingMaritimeSourceCharacteristicsViewRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment("View retourneert de emissie karakteristieken voor zeescheep vaart.\r\n\r\n@file source/database/src/main/sql/template/02_emission_factors/04-views/shipping_maritime.sql"), TableOptions.view("create view \"shipping_maritime_source_characteristics_view\" as  SELECT shipping_maritime_category_source_characteristics.shipping_maritime_category_id,\n    shipping_maritime_category_source_characteristics.year,\n    shipping_maritime_category_source_characteristics.movement_type,\n    shipping_maritime_category_source_characteristics.gcn_sector_id,\n    shipping_maritime_category_source_characteristics.heat_content,\n    shipping_maritime_category_source_characteristics.height,\n    shipping_maritime_category_source_characteristics.spread,\n    emission_diurnal_variations.emission_diurnal_variation_id,\n    emission_diurnal_variations.code AS emission_diurnal_variation_code\n   FROM ((template.shipping_maritime_category_source_characteristics\n     JOIN template.default_gcn_sector_source_characteristics_view USING (gcn_sector_id))\n     JOIN template.emission_diurnal_variations USING (emission_diurnal_variation_id));"));
    }

    public <O extends Record> ShippingMaritimeSourceCharacteristicsView(Table<O> child, ForeignKey<O, ShippingMaritimeSourceCharacteristicsViewRecord> key) {
        super(child, key, SHIPPING_MARITIME_SOURCE_CHARACTERISTICS_VIEW);
    }

    @Override
    public Schema getSchema() {
        return Template.TEMPLATE;
    }

    @Override
    public ShippingMaritimeSourceCharacteristicsView as(String alias) {
        return new ShippingMaritimeSourceCharacteristicsView(DSL.name(alias), this);
    }

    @Override
    public ShippingMaritimeSourceCharacteristicsView as(Name alias) {
        return new ShippingMaritimeSourceCharacteristicsView(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public ShippingMaritimeSourceCharacteristicsView rename(String name) {
        return new ShippingMaritimeSourceCharacteristicsView(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public ShippingMaritimeSourceCharacteristicsView rename(Name name) {
        return new ShippingMaritimeSourceCharacteristicsView(name, null);
    }

    // -------------------------------------------------------------------------
    // Row9 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row9<Short, Short, ShippingMovementType, Integer, Float, Float, Float, Integer, String> fieldsRow() {
        return (Row9) super.fieldsRow();
    }
}
