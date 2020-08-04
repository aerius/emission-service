/*
 * This file is generated by jOOQ.
 */
package nl.overheid.aerius.emissionservice.jooq.template.tables;


import nl.overheid.aerius.emissionservice.jooq.template.Template;
import nl.overheid.aerius.emissionservice.jooq.template.tables.records.DefaultSourceCharacteristicsViewRecord;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row8;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.TableOptions;
import org.jooq.impl.DSL;
import org.jooq.impl.TableImpl;


/**
 * View retourneert de emissie karakteristieken per AERIUS sector.
 * Valt terug op een default GCN bron karakteristieken indien er geen AERIUS 
 * default waarde is opgegeven.
 * 
 * @file source/database/src/main/sql/template/01_sectors/04-views.sql
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class DefaultSourceCharacteristicsView extends TableImpl<DefaultSourceCharacteristicsViewRecord> {

    private static final long serialVersionUID = -1006552057;

    /**
     * The reference instance of <code>template.default_source_characteristics_view</code>
     */
    public static final DefaultSourceCharacteristicsView DEFAULT_SOURCE_CHARACTERISTICS_VIEW = new DefaultSourceCharacteristicsView();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<DefaultSourceCharacteristicsViewRecord> getRecordType() {
        return DefaultSourceCharacteristicsViewRecord.class;
    }

    /**
     * The column <code>template.default_source_characteristics_view.sector_id</code>.
     */
    public final TableField<DefaultSourceCharacteristicsViewRecord, Integer> SECTOR_ID = createField(DSL.name("sector_id"), org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>template.default_source_characteristics_view.gcn_sector_id</code>.
     */
    public final TableField<DefaultSourceCharacteristicsViewRecord, Integer> GCN_SECTOR_ID = createField(DSL.name("gcn_sector_id"), org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>template.default_source_characteristics_view.heat_content</code>.
     */
    public final TableField<DefaultSourceCharacteristicsViewRecord, Float> HEAT_CONTENT = createField(DSL.name("heat_content"), org.jooq.impl.SQLDataType.REAL, this, "");

    /**
     * The column <code>template.default_source_characteristics_view.height</code>.
     */
    public final TableField<DefaultSourceCharacteristicsViewRecord, Float> HEIGHT = createField(DSL.name("height"), org.jooq.impl.SQLDataType.REAL, this, "");

    /**
     * The column <code>template.default_source_characteristics_view.spread</code>.
     */
    public final TableField<DefaultSourceCharacteristicsViewRecord, Float> SPREAD = createField(DSL.name("spread"), org.jooq.impl.SQLDataType.REAL, this, "");

    /**
     * The column <code>template.default_source_characteristics_view.emission_diurnal_variation_id</code>.
     */
    public final TableField<DefaultSourceCharacteristicsViewRecord, Integer> EMISSION_DIURNAL_VARIATION_ID = createField(DSL.name("emission_diurnal_variation_id"), org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>template.default_source_characteristics_view.emission_diurnal_variation_code</code>.
     */
    public final TableField<DefaultSourceCharacteristicsViewRecord, String> EMISSION_DIURNAL_VARIATION_CODE = createField(DSL.name("emission_diurnal_variation_code"), org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * The column <code>template.default_source_characteristics_view.particle_size_distribution</code>.
     */
    public final TableField<DefaultSourceCharacteristicsViewRecord, Integer> PARTICLE_SIZE_DISTRIBUTION = createField(DSL.name("particle_size_distribution"), org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * Create a <code>template.default_source_characteristics_view</code> table reference
     */
    public DefaultSourceCharacteristicsView() {
        this(DSL.name("default_source_characteristics_view"), null);
    }

    /**
     * Create an aliased <code>template.default_source_characteristics_view</code> table reference
     */
    public DefaultSourceCharacteristicsView(String alias) {
        this(DSL.name(alias), DEFAULT_SOURCE_CHARACTERISTICS_VIEW);
    }

    /**
     * Create an aliased <code>template.default_source_characteristics_view</code> table reference
     */
    public DefaultSourceCharacteristicsView(Name alias) {
        this(alias, DEFAULT_SOURCE_CHARACTERISTICS_VIEW);
    }

    private DefaultSourceCharacteristicsView(Name alias, Table<DefaultSourceCharacteristicsViewRecord> aliased) {
        this(alias, aliased, null);
    }

    private DefaultSourceCharacteristicsView(Name alias, Table<DefaultSourceCharacteristicsViewRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment("View retourneert de emissie karakteristieken per AERIUS sector.\r\nValt terug op een default GCN bron karakteristieken indien er geen AERIUS default waarde is opgegeven.\r\n\r\n@file source/database/src/main/sql/template/01_sectors/04-views.sql"), TableOptions.view("create view \"default_source_characteristics_view\" as  SELECT source_characteristics.sector_id,\n    source_characteristics.gcn_sector_id,\n    source_characteristics.heat_content,\n    source_characteristics.height,\n    source_characteristics.spread,\n    source_characteristics.emission_diurnal_variation_id,\n    emission_diurnal_variations_view.emission_diurnal_variation_code,\n    source_characteristics.particle_size_distribution\n   FROM (( SELECT sectors.sector_id,\n            sectors_main_gcn_sector.gcn_sector_id,\n            COALESCE(aerius_char.heat_content, gcn_char.heat_content) AS heat_content,\n            COALESCE(aerius_char.height, gcn_char.height) AS height,\n            COALESCE(aerius_char.spread, gcn_char.spread) AS spread,\n            COALESCE(aerius_char.emission_diurnal_variation_id, gcn_char.emission_diurnal_variation_id) AS emission_diurnal_variation_id,\n            COALESCE(aerius_char.particle_size_distribution, gcn_char.particle_size_distribution) AS particle_size_distribution\n           FROM (((template.sectors\n             LEFT JOIN template.sector_default_source_characteristics aerius_char USING (sector_id))\n             LEFT JOIN template.sectors_main_gcn_sector USING (sector_id))\n             LEFT JOIN template.default_gcn_sector_source_characteristics_view gcn_char USING (gcn_sector_id))) source_characteristics\n     JOIN template.emission_diurnal_variations_view USING (emission_diurnal_variation_id));"));
    }

    public <O extends Record> DefaultSourceCharacteristicsView(Table<O> child, ForeignKey<O, DefaultSourceCharacteristicsViewRecord> key) {
        super(child, key, DEFAULT_SOURCE_CHARACTERISTICS_VIEW);
    }

    @Override
    public Schema getSchema() {
        return Template.TEMPLATE;
    }

    @Override
    public DefaultSourceCharacteristicsView as(String alias) {
        return new DefaultSourceCharacteristicsView(DSL.name(alias), this);
    }

    @Override
    public DefaultSourceCharacteristicsView as(Name alias) {
        return new DefaultSourceCharacteristicsView(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public DefaultSourceCharacteristicsView rename(String name) {
        return new DefaultSourceCharacteristicsView(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public DefaultSourceCharacteristicsView rename(Name name) {
        return new DefaultSourceCharacteristicsView(name, null);
    }

    // -------------------------------------------------------------------------
    // Row8 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row8<Integer, Integer, Float, Float, Float, Integer, String, Integer> fieldsRow() {
        return (Row8) super.fieldsRow();
    }
}
