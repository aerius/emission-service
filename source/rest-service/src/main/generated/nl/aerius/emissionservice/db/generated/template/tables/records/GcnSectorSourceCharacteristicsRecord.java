/*
 * This file is generated by jOOQ.
 */
package nl.aerius.emissionservice.db.generated.template.tables.records;


import nl.aerius.emissionservice.db.generated.template.tables.GcnSectorSourceCharacteristics;

import org.jooq.Field;
import org.jooq.Record2;
import org.jooq.Record7;
import org.jooq.Row7;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * Table containing the predefined OPS characteristics per GCN sector.
 * 
 * @file
 * source/database/src/main/sql/template/01-sectors/02-tables/02-source_characteristics.sql
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class GcnSectorSourceCharacteristicsRecord extends UpdatableRecordImpl<GcnSectorSourceCharacteristicsRecord> implements Record7<Integer, Short, Float, Float, Float, Integer, Integer> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for
     * <code>template.gcn_sector_source_characteristics.gcn_sector_id</code>.
     */
    public void setGcnSectorId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for
     * <code>template.gcn_sector_source_characteristics.gcn_sector_id</code>.
     */
    public Integer getGcnSectorId() {
        return (Integer) get(0);
    }

    /**
     * Setter for
     * <code>template.gcn_sector_source_characteristics.substance_id</code>.
     */
    public void setSubstanceId(Short value) {
        set(1, value);
    }

    /**
     * Getter for
     * <code>template.gcn_sector_source_characteristics.substance_id</code>.
     */
    public Short getSubstanceId() {
        return (Short) get(1);
    }

    /**
     * Setter for
     * <code>template.gcn_sector_source_characteristics.heat_content</code>.
     */
    public void setHeatContent(Float value) {
        set(2, value);
    }

    /**
     * Getter for
     * <code>template.gcn_sector_source_characteristics.heat_content</code>.
     */
    public Float getHeatContent() {
        return (Float) get(2);
    }

    /**
     * Setter for
     * <code>template.gcn_sector_source_characteristics.height</code>.
     */
    public void setHeight(Float value) {
        set(3, value);
    }

    /**
     * Getter for
     * <code>template.gcn_sector_source_characteristics.height</code>.
     */
    public Float getHeight() {
        return (Float) get(3);
    }

    /**
     * Setter for
     * <code>template.gcn_sector_source_characteristics.spread</code>.
     */
    public void setSpread(Float value) {
        set(4, value);
    }

    /**
     * Getter for
     * <code>template.gcn_sector_source_characteristics.spread</code>.
     */
    public Float getSpread() {
        return (Float) get(4);
    }

    /**
     * Setter for
     * <code>template.gcn_sector_source_characteristics.emission_diurnal_variation_id</code>.
     */
    public void setEmissionDiurnalVariationId(Integer value) {
        set(5, value);
    }

    /**
     * Getter for
     * <code>template.gcn_sector_source_characteristics.emission_diurnal_variation_id</code>.
     */
    public Integer getEmissionDiurnalVariationId() {
        return (Integer) get(5);
    }

    /**
     * Setter for
     * <code>template.gcn_sector_source_characteristics.particle_size_distribution</code>.
     */
    public void setParticleSizeDistribution(Integer value) {
        set(6, value);
    }

    /**
     * Getter for
     * <code>template.gcn_sector_source_characteristics.particle_size_distribution</code>.
     */
    public Integer getParticleSizeDistribution() {
        return (Integer) get(6);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record2<Integer, Short> key() {
        return (Record2) super.key();
    }

    // -------------------------------------------------------------------------
    // Record7 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row7<Integer, Short, Float, Float, Float, Integer, Integer> fieldsRow() {
        return (Row7) super.fieldsRow();
    }

    @Override
    public Row7<Integer, Short, Float, Float, Float, Integer, Integer> valuesRow() {
        return (Row7) super.valuesRow();
    }

    @Override
    public Field<Integer> field1() {
        return GcnSectorSourceCharacteristics.GCN_SECTOR_SOURCE_CHARACTERISTICS.GCN_SECTOR_ID;
    }

    @Override
    public Field<Short> field2() {
        return GcnSectorSourceCharacteristics.GCN_SECTOR_SOURCE_CHARACTERISTICS.SUBSTANCE_ID;
    }

    @Override
    public Field<Float> field3() {
        return GcnSectorSourceCharacteristics.GCN_SECTOR_SOURCE_CHARACTERISTICS.HEAT_CONTENT;
    }

    @Override
    public Field<Float> field4() {
        return GcnSectorSourceCharacteristics.GCN_SECTOR_SOURCE_CHARACTERISTICS.HEIGHT;
    }

    @Override
    public Field<Float> field5() {
        return GcnSectorSourceCharacteristics.GCN_SECTOR_SOURCE_CHARACTERISTICS.SPREAD;
    }

    @Override
    public Field<Integer> field6() {
        return GcnSectorSourceCharacteristics.GCN_SECTOR_SOURCE_CHARACTERISTICS.EMISSION_DIURNAL_VARIATION_ID;
    }

    @Override
    public Field<Integer> field7() {
        return GcnSectorSourceCharacteristics.GCN_SECTOR_SOURCE_CHARACTERISTICS.PARTICLE_SIZE_DISTRIBUTION;
    }

    @Override
    public Integer component1() {
        return getGcnSectorId();
    }

    @Override
    public Short component2() {
        return getSubstanceId();
    }

    @Override
    public Float component3() {
        return getHeatContent();
    }

    @Override
    public Float component4() {
        return getHeight();
    }

    @Override
    public Float component5() {
        return getSpread();
    }

    @Override
    public Integer component6() {
        return getEmissionDiurnalVariationId();
    }

    @Override
    public Integer component7() {
        return getParticleSizeDistribution();
    }

    @Override
    public Integer value1() {
        return getGcnSectorId();
    }

    @Override
    public Short value2() {
        return getSubstanceId();
    }

    @Override
    public Float value3() {
        return getHeatContent();
    }

    @Override
    public Float value4() {
        return getHeight();
    }

    @Override
    public Float value5() {
        return getSpread();
    }

    @Override
    public Integer value6() {
        return getEmissionDiurnalVariationId();
    }

    @Override
    public Integer value7() {
        return getParticleSizeDistribution();
    }

    @Override
    public GcnSectorSourceCharacteristicsRecord value1(Integer value) {
        setGcnSectorId(value);
        return this;
    }

    @Override
    public GcnSectorSourceCharacteristicsRecord value2(Short value) {
        setSubstanceId(value);
        return this;
    }

    @Override
    public GcnSectorSourceCharacteristicsRecord value3(Float value) {
        setHeatContent(value);
        return this;
    }

    @Override
    public GcnSectorSourceCharacteristicsRecord value4(Float value) {
        setHeight(value);
        return this;
    }

    @Override
    public GcnSectorSourceCharacteristicsRecord value5(Float value) {
        setSpread(value);
        return this;
    }

    @Override
    public GcnSectorSourceCharacteristicsRecord value6(Integer value) {
        setEmissionDiurnalVariationId(value);
        return this;
    }

    @Override
    public GcnSectorSourceCharacteristicsRecord value7(Integer value) {
        setParticleSizeDistribution(value);
        return this;
    }

    @Override
    public GcnSectorSourceCharacteristicsRecord values(Integer value1, Short value2, Float value3, Float value4, Float value5, Integer value6, Integer value7) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached GcnSectorSourceCharacteristicsRecord
     */
    public GcnSectorSourceCharacteristicsRecord() {
        super(GcnSectorSourceCharacteristics.GCN_SECTOR_SOURCE_CHARACTERISTICS);
    }

    /**
     * Create a detached, initialised GcnSectorSourceCharacteristicsRecord
     */
    public GcnSectorSourceCharacteristicsRecord(Integer gcnSectorId, Short substanceId, Float heatContent, Float height, Float spread, Integer emissionDiurnalVariationId, Integer particleSizeDistribution) {
        super(GcnSectorSourceCharacteristics.GCN_SECTOR_SOURCE_CHARACTERISTICS);

        setGcnSectorId(gcnSectorId);
        setSubstanceId(substanceId);
        setHeatContent(heatContent);
        setHeight(height);
        setSpread(spread);
        setEmissionDiurnalVariationId(emissionDiurnalVariationId);
        setParticleSizeDistribution(particleSizeDistribution);
    }
}
