/*
 * This file is generated by jOOQ.
 */
package nl.aerius.emissionservice.db.generated.template.tables;


import java.util.function.Function;

import nl.aerius.emissionservice.db.generated.template.Template;
import nl.aerius.emissionservice.db.generated.template.tables.records.DefaultGcnSectorSourceCharacteristicsViewRecord;

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
import org.jooq.impl.DSL;
import org.jooq.impl.SQLDataType;
import org.jooq.impl.TableImpl;


/**
 * View retourneert de default GCN bron karakteristieken.
 * De GCN bron karakteristieken lijst is per GCN sector en stof. Deze view
 * retourneert de bron karakteristieken van de meest relevante stof.
 * 
 * @file source/database/src/main/sql/template/01-sectors/04-views.sql
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class DefaultGcnSectorSourceCharacteristicsView extends TableImpl<DefaultGcnSectorSourceCharacteristicsViewRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of
     * <code>template.default_gcn_sector_source_characteristics_view</code>
     */
    public static final DefaultGcnSectorSourceCharacteristicsView DEFAULT_GCN_SECTOR_SOURCE_CHARACTERISTICS_VIEW = new DefaultGcnSectorSourceCharacteristicsView();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<DefaultGcnSectorSourceCharacteristicsViewRecord> getRecordType() {
        return DefaultGcnSectorSourceCharacteristicsViewRecord.class;
    }

    /**
     * The column
     * <code>template.default_gcn_sector_source_characteristics_view.gcn_sector_id</code>.
     */
    public final TableField<DefaultGcnSectorSourceCharacteristicsViewRecord, Integer> GCN_SECTOR_ID = createField(DSL.name("gcn_sector_id"), SQLDataType.INTEGER, this, "");

    /**
     * The column
     * <code>template.default_gcn_sector_source_characteristics_view.heat_content</code>.
     */
    public final TableField<DefaultGcnSectorSourceCharacteristicsViewRecord, Float> HEAT_CONTENT = createField(DSL.name("heat_content"), nl.aerius.emissionservice.db.generated.public_.Domains.POSREAL.getDataType(), this, "");

    /**
     * The column
     * <code>template.default_gcn_sector_source_characteristics_view.height</code>.
     */
    public final TableField<DefaultGcnSectorSourceCharacteristicsViewRecord, Float> HEIGHT = createField(DSL.name("height"), nl.aerius.emissionservice.db.generated.public_.Domains.POSREAL.getDataType(), this, "");

    /**
     * The column
     * <code>template.default_gcn_sector_source_characteristics_view.spread</code>.
     */
    public final TableField<DefaultGcnSectorSourceCharacteristicsViewRecord, Float> SPREAD = createField(DSL.name("spread"), nl.aerius.emissionservice.db.generated.public_.Domains.POSREAL.getDataType(), this, "");

    /**
     * The column
     * <code>template.default_gcn_sector_source_characteristics_view.emission_diurnal_variation_id</code>.
     */
    public final TableField<DefaultGcnSectorSourceCharacteristicsViewRecord, Integer> EMISSION_DIURNAL_VARIATION_ID = createField(DSL.name("emission_diurnal_variation_id"), SQLDataType.INTEGER, this, "");

    /**
     * The column
     * <code>template.default_gcn_sector_source_characteristics_view.particle_size_distribution</code>.
     */
    public final TableField<DefaultGcnSectorSourceCharacteristicsViewRecord, Integer> PARTICLE_SIZE_DISTRIBUTION = createField(DSL.name("particle_size_distribution"), SQLDataType.INTEGER, this, "");

    private DefaultGcnSectorSourceCharacteristicsView(Name alias, Table<DefaultGcnSectorSourceCharacteristicsViewRecord> aliased) {
        this(alias, aliased, null);
    }

    private DefaultGcnSectorSourceCharacteristicsView(Name alias, Table<DefaultGcnSectorSourceCharacteristicsViewRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment("View retourneert de default GCN bron karakteristieken.\r\nDe GCN bron karakteristieken lijst is per GCN sector en stof. Deze view retourneert de bron karakteristieken van de meest relevante stof.\r\n\r\n@file source/database/src/main/sql/template/01-sectors/04-views.sql"), TableOptions.view("""
        create view "default_gcn_sector_source_characteristics_view" as  SELECT gcn_sector_source_characteristics.gcn_sector_id,
          gcn_sector_source_characteristics.heat_content,
          gcn_sector_source_characteristics.height,
          gcn_sector_source_characteristics.spread,
          gcn_sector_source_characteristics.emission_diurnal_variation_id,
          gcn_sector_source_characteristics.particle_size_distribution
         FROM template.gcn_sector_source_characteristics
        WHERE (((gcn_sector_source_characteristics.substance_id = 11) AND ((gcn_sector_source_characteristics.gcn_sector_id < 4120) OR (gcn_sector_source_characteristics.gcn_sector_id >= 4300))) OR ((gcn_sector_source_characteristics.substance_id = 17) AND (gcn_sector_source_characteristics.gcn_sector_id >= 4120) AND (gcn_sector_source_characteristics.gcn_sector_id < 4300)));
        """));
    }

    /**
     * Create an aliased
     * <code>template.default_gcn_sector_source_characteristics_view</code>
     * table reference
     */
    public DefaultGcnSectorSourceCharacteristicsView(String alias) {
        this(DSL.name(alias), DEFAULT_GCN_SECTOR_SOURCE_CHARACTERISTICS_VIEW);
    }

    /**
     * Create an aliased
     * <code>template.default_gcn_sector_source_characteristics_view</code>
     * table reference
     */
    public DefaultGcnSectorSourceCharacteristicsView(Name alias) {
        this(alias, DEFAULT_GCN_SECTOR_SOURCE_CHARACTERISTICS_VIEW);
    }

    /**
     * Create a
     * <code>template.default_gcn_sector_source_characteristics_view</code>
     * table reference
     */
    public DefaultGcnSectorSourceCharacteristicsView() {
        this(DSL.name("default_gcn_sector_source_characteristics_view"), null);
    }

    public <O extends Record> DefaultGcnSectorSourceCharacteristicsView(Table<O> child, ForeignKey<O, DefaultGcnSectorSourceCharacteristicsViewRecord> key) {
        super(child, key, DEFAULT_GCN_SECTOR_SOURCE_CHARACTERISTICS_VIEW);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : Template.TEMPLATE;
    }

    @Override
    public DefaultGcnSectorSourceCharacteristicsView as(String alias) {
        return new DefaultGcnSectorSourceCharacteristicsView(DSL.name(alias), this);
    }

    @Override
    public DefaultGcnSectorSourceCharacteristicsView as(Name alias) {
        return new DefaultGcnSectorSourceCharacteristicsView(alias, this);
    }

    @Override
    public DefaultGcnSectorSourceCharacteristicsView as(Table<?> alias) {
        return new DefaultGcnSectorSourceCharacteristicsView(alias.getQualifiedName(), this);
    }

    /**
     * Rename this table
     */
    @Override
    public DefaultGcnSectorSourceCharacteristicsView rename(String name) {
        return new DefaultGcnSectorSourceCharacteristicsView(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public DefaultGcnSectorSourceCharacteristicsView rename(Name name) {
        return new DefaultGcnSectorSourceCharacteristicsView(name, null);
    }

    /**
     * Rename this table
     */
    @Override
    public DefaultGcnSectorSourceCharacteristicsView rename(Table<?> name) {
        return new DefaultGcnSectorSourceCharacteristicsView(name.getQualifiedName(), null);
    }

    // -------------------------------------------------------------------------
    // Row6 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row6<Integer, Float, Float, Float, Integer, Integer> fieldsRow() {
        return (Row6) super.fieldsRow();
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Function)}.
     */
    public <U> SelectField<U> mapping(Function6<? super Integer, ? super Float, ? super Float, ? super Float, ? super Integer, ? super Integer, ? extends U> from) {
        return convertFrom(Records.mapping(from));
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Class,
     * Function)}.
     */
    public <U> SelectField<U> mapping(Class<U> toType, Function6<? super Integer, ? super Float, ? super Float, ? super Float, ? super Integer, ? super Integer, ? extends U> from) {
        return convertFrom(toType, Records.mapping(from));
    }
}