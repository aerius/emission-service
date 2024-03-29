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
import nl.aerius.emissionservice.db.generated.template.tables.records.GcnSectorSourceCharacteristicsRecord;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Function7;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Records;
import org.jooq.Row7;
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
 * Table containing the predefined OPS characteristics per GCN sector.
 * 
 * @file
 * source/database/src/main/sql/template/01-sectors/02-tables/02-source_characteristics.sql
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class GcnSectorSourceCharacteristics extends TableImpl<GcnSectorSourceCharacteristicsRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of
     * <code>template.gcn_sector_source_characteristics</code>
     */
    public static final GcnSectorSourceCharacteristics GCN_SECTOR_SOURCE_CHARACTERISTICS = new GcnSectorSourceCharacteristics();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<GcnSectorSourceCharacteristicsRecord> getRecordType() {
        return GcnSectorSourceCharacteristicsRecord.class;
    }

    /**
     * The column
     * <code>template.gcn_sector_source_characteristics.gcn_sector_id</code>.
     */
    public final TableField<GcnSectorSourceCharacteristicsRecord, Integer> GCN_SECTOR_ID = createField(DSL.name("gcn_sector_id"), SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column
     * <code>template.gcn_sector_source_characteristics.substance_id</code>.
     */
    public final TableField<GcnSectorSourceCharacteristicsRecord, Short> SUBSTANCE_ID = createField(DSL.name("substance_id"), SQLDataType.SMALLINT.nullable(false), this, "");

    /**
     * The column
     * <code>template.gcn_sector_source_characteristics.heat_content</code>.
     */
    public final TableField<GcnSectorSourceCharacteristicsRecord, Float> HEAT_CONTENT = createField(DSL.name("heat_content"), nl.aerius.emissionservice.db.generated.public_.Domains.POSREAL.getDataType().nullable(false), this, "");

    /**
     * The column
     * <code>template.gcn_sector_source_characteristics.height</code>.
     */
    public final TableField<GcnSectorSourceCharacteristicsRecord, Float> HEIGHT = createField(DSL.name("height"), nl.aerius.emissionservice.db.generated.public_.Domains.POSREAL.getDataType().nullable(false), this, "");

    /**
     * The column
     * <code>template.gcn_sector_source_characteristics.spread</code>.
     */
    public final TableField<GcnSectorSourceCharacteristicsRecord, Float> SPREAD = createField(DSL.name("spread"), nl.aerius.emissionservice.db.generated.public_.Domains.POSREAL.getDataType().nullable(false), this, "");

    /**
     * The column
     * <code>template.gcn_sector_source_characteristics.emission_diurnal_variation_id</code>.
     */
    public final TableField<GcnSectorSourceCharacteristicsRecord, Integer> EMISSION_DIURNAL_VARIATION_ID = createField(DSL.name("emission_diurnal_variation_id"), SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column
     * <code>template.gcn_sector_source_characteristics.particle_size_distribution</code>.
     */
    public final TableField<GcnSectorSourceCharacteristicsRecord, Integer> PARTICLE_SIZE_DISTRIBUTION = createField(DSL.name("particle_size_distribution"), SQLDataType.INTEGER.nullable(false), this, "");

    private GcnSectorSourceCharacteristics(Name alias, Table<GcnSectorSourceCharacteristicsRecord> aliased) {
        this(alias, aliased, null);
    }

    private GcnSectorSourceCharacteristics(Name alias, Table<GcnSectorSourceCharacteristicsRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment("Table containing the predefined OPS characteristics per GCN sector.\r\n\r\n@file source/database/src/main/sql/template/01-sectors/02-tables/02-source_characteristics.sql"), TableOptions.table());
    }

    /**
     * Create an aliased <code>template.gcn_sector_source_characteristics</code>
     * table reference
     */
    public GcnSectorSourceCharacteristics(String alias) {
        this(DSL.name(alias), GCN_SECTOR_SOURCE_CHARACTERISTICS);
    }

    /**
     * Create an aliased <code>template.gcn_sector_source_characteristics</code>
     * table reference
     */
    public GcnSectorSourceCharacteristics(Name alias) {
        this(alias, GCN_SECTOR_SOURCE_CHARACTERISTICS);
    }

    /**
     * Create a <code>template.gcn_sector_source_characteristics</code> table
     * reference
     */
    public GcnSectorSourceCharacteristics() {
        this(DSL.name("gcn_sector_source_characteristics"), null);
    }

    public <O extends Record> GcnSectorSourceCharacteristics(Table<O> child, ForeignKey<O, GcnSectorSourceCharacteristicsRecord> key) {
        super(child, key, GCN_SECTOR_SOURCE_CHARACTERISTICS);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : Template.TEMPLATE;
    }

    @Override
    public UniqueKey<GcnSectorSourceCharacteristicsRecord> getPrimaryKey() {
        return Keys.GCN_SECTOR_SOURCE_CHARACTERISTICS_PKEY;
    }

    @Override
    public List<ForeignKey<GcnSectorSourceCharacteristicsRecord, ?>> getReferences() {
        return Arrays.asList(Keys.GCN_SECTOR_SOURCE_CHARACTERISTICS__GCN_SECTOR_SOURCE_CHARACTERISTICS_FKEY_GCN_SECTORS, Keys.GCN_SECTOR_SOURCE_CHARACTERISTICS__GCN_SECTOR_SOURCE_CHARACTERISTICS_FKEY_GCN_SUBSTANCES, Keys.GCN_SECTOR_SOURCE_CHARACTERISTICS__GCN_SECTOR_SOURCE_CHARACTERISTICS_FKEY_EMISSION_DIURNAL_VARIATI);
    }

    private transient GcnSectors _gcnSectors;
    private transient Substances _substances;
    private transient EmissionDiurnalVariations _emissionDiurnalVariations;

    /**
     * Get the implicit join path to the <code>template.gcn_sectors</code>
     * table.
     */
    public GcnSectors gcnSectors() {
        if (_gcnSectors == null)
            _gcnSectors = new GcnSectors(this, Keys.GCN_SECTOR_SOURCE_CHARACTERISTICS__GCN_SECTOR_SOURCE_CHARACTERISTICS_FKEY_GCN_SECTORS);

        return _gcnSectors;
    }

    /**
     * Get the implicit join path to the <code>public.substances</code> table.
     */
    public Substances substances() {
        if (_substances == null)
            _substances = new Substances(this, Keys.GCN_SECTOR_SOURCE_CHARACTERISTICS__GCN_SECTOR_SOURCE_CHARACTERISTICS_FKEY_GCN_SUBSTANCES);

        return _substances;
    }

    /**
     * Get the implicit join path to the
     * <code>template.emission_diurnal_variations</code> table.
     */
    public EmissionDiurnalVariations emissionDiurnalVariations() {
        if (_emissionDiurnalVariations == null)
            _emissionDiurnalVariations = new EmissionDiurnalVariations(this, Keys.GCN_SECTOR_SOURCE_CHARACTERISTICS__GCN_SECTOR_SOURCE_CHARACTERISTICS_FKEY_EMISSION_DIURNAL_VARIATI);

        return _emissionDiurnalVariations;
    }

    @Override
    public GcnSectorSourceCharacteristics as(String alias) {
        return new GcnSectorSourceCharacteristics(DSL.name(alias), this);
    }

    @Override
    public GcnSectorSourceCharacteristics as(Name alias) {
        return new GcnSectorSourceCharacteristics(alias, this);
    }

    @Override
    public GcnSectorSourceCharacteristics as(Table<?> alias) {
        return new GcnSectorSourceCharacteristics(alias.getQualifiedName(), this);
    }

    /**
     * Rename this table
     */
    @Override
    public GcnSectorSourceCharacteristics rename(String name) {
        return new GcnSectorSourceCharacteristics(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public GcnSectorSourceCharacteristics rename(Name name) {
        return new GcnSectorSourceCharacteristics(name, null);
    }

    /**
     * Rename this table
     */
    @Override
    public GcnSectorSourceCharacteristics rename(Table<?> name) {
        return new GcnSectorSourceCharacteristics(name.getQualifiedName(), null);
    }

    // -------------------------------------------------------------------------
    // Row7 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row7<Integer, Short, Float, Float, Float, Integer, Integer> fieldsRow() {
        return (Row7) super.fieldsRow();
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Function)}.
     */
    public <U> SelectField<U> mapping(Function7<? super Integer, ? super Short, ? super Float, ? super Float, ? super Float, ? super Integer, ? super Integer, ? extends U> from) {
        return convertFrom(Records.mapping(from));
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Class,
     * Function)}.
     */
    public <U> SelectField<U> mapping(Class<U> toType, Function7<? super Integer, ? super Short, ? super Float, ? super Float, ? super Float, ? super Integer, ? super Integer, ? extends U> from) {
        return convertFrom(toType, Records.mapping(from));
    }
}
