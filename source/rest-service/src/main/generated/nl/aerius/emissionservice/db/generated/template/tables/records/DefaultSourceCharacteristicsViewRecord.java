/*
 * This file is generated by jOOQ.
 */
package nl.aerius.emissionservice.db.generated.template.tables.records;


import nl.aerius.emissionservice.db.generated.template.tables.DefaultSourceCharacteristicsView;

import org.jooq.Field;
import org.jooq.Record8;
import org.jooq.Row8;
import org.jooq.impl.TableRecordImpl;


/**
 * View retourneert de emissie karakteristieken per AERIUS sector.
 * Valt terug op een default GCN bron karakteristieken indien er geen AERIUS
 * default waarde is opgegeven.
 * 
 * @file source/database/src/main/sql/template/01-sectors/04-views.sql
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class DefaultSourceCharacteristicsViewRecord extends TableRecordImpl<DefaultSourceCharacteristicsViewRecord> implements Record8<Integer, Integer, Float, Float, Float, Integer, String, Integer> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for
     * <code>template.default_source_characteristics_view.sector_id</code>.
     */
    public void setSectorId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for
     * <code>template.default_source_characteristics_view.sector_id</code>.
     */
    public Integer getSectorId() {
        return (Integer) get(0);
    }

    /**
     * Setter for
     * <code>template.default_source_characteristics_view.gcn_sector_id</code>.
     */
    public void setGcnSectorId(Integer value) {
        set(1, value);
    }

    /**
     * Getter for
     * <code>template.default_source_characteristics_view.gcn_sector_id</code>.
     */
    public Integer getGcnSectorId() {
        return (Integer) get(1);
    }

    /**
     * Setter for
     * <code>template.default_source_characteristics_view.heat_content</code>.
     */
    public void setHeatContent(Float value) {
        set(2, value);
    }

    /**
     * Getter for
     * <code>template.default_source_characteristics_view.heat_content</code>.
     */
    public Float getHeatContent() {
        return (Float) get(2);
    }

    /**
     * Setter for
     * <code>template.default_source_characteristics_view.height</code>.
     */
    public void setHeight(Float value) {
        set(3, value);
    }

    /**
     * Getter for
     * <code>template.default_source_characteristics_view.height</code>.
     */
    public Float getHeight() {
        return (Float) get(3);
    }

    /**
     * Setter for
     * <code>template.default_source_characteristics_view.spread</code>.
     */
    public void setSpread(Float value) {
        set(4, value);
    }

    /**
     * Getter for
     * <code>template.default_source_characteristics_view.spread</code>.
     */
    public Float getSpread() {
        return (Float) get(4);
    }

    /**
     * Setter for
     * <code>template.default_source_characteristics_view.emission_diurnal_variation_id</code>.
     */
    public void setEmissionDiurnalVariationId(Integer value) {
        set(5, value);
    }

    /**
     * Getter for
     * <code>template.default_source_characteristics_view.emission_diurnal_variation_id</code>.
     */
    public Integer getEmissionDiurnalVariationId() {
        return (Integer) get(5);
    }

    /**
     * Setter for
     * <code>template.default_source_characteristics_view.emission_diurnal_variation_code</code>.
     */
    public void setEmissionDiurnalVariationCode(String value) {
        set(6, value);
    }

    /**
     * Getter for
     * <code>template.default_source_characteristics_view.emission_diurnal_variation_code</code>.
     */
    public String getEmissionDiurnalVariationCode() {
        return (String) get(6);
    }

    /**
     * Setter for
     * <code>template.default_source_characteristics_view.particle_size_distribution</code>.
     */
    public void setParticleSizeDistribution(Integer value) {
        set(7, value);
    }

    /**
     * Getter for
     * <code>template.default_source_characteristics_view.particle_size_distribution</code>.
     */
    public Integer getParticleSizeDistribution() {
        return (Integer) get(7);
    }

    // -------------------------------------------------------------------------
    // Record8 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row8<Integer, Integer, Float, Float, Float, Integer, String, Integer> fieldsRow() {
        return (Row8) super.fieldsRow();
    }

    @Override
    public Row8<Integer, Integer, Float, Float, Float, Integer, String, Integer> valuesRow() {
        return (Row8) super.valuesRow();
    }

    @Override
    public Field<Integer> field1() {
        return DefaultSourceCharacteristicsView.DEFAULT_SOURCE_CHARACTERISTICS_VIEW.SECTOR_ID;
    }

    @Override
    public Field<Integer> field2() {
        return DefaultSourceCharacteristicsView.DEFAULT_SOURCE_CHARACTERISTICS_VIEW.GCN_SECTOR_ID;
    }

    @Override
    public Field<Float> field3() {
        return DefaultSourceCharacteristicsView.DEFAULT_SOURCE_CHARACTERISTICS_VIEW.HEAT_CONTENT;
    }

    @Override
    public Field<Float> field4() {
        return DefaultSourceCharacteristicsView.DEFAULT_SOURCE_CHARACTERISTICS_VIEW.HEIGHT;
    }

    @Override
    public Field<Float> field5() {
        return DefaultSourceCharacteristicsView.DEFAULT_SOURCE_CHARACTERISTICS_VIEW.SPREAD;
    }

    @Override
    public Field<Integer> field6() {
        return DefaultSourceCharacteristicsView.DEFAULT_SOURCE_CHARACTERISTICS_VIEW.EMISSION_DIURNAL_VARIATION_ID;
    }

    @Override
    public Field<String> field7() {
        return DefaultSourceCharacteristicsView.DEFAULT_SOURCE_CHARACTERISTICS_VIEW.EMISSION_DIURNAL_VARIATION_CODE;
    }

    @Override
    public Field<Integer> field8() {
        return DefaultSourceCharacteristicsView.DEFAULT_SOURCE_CHARACTERISTICS_VIEW.PARTICLE_SIZE_DISTRIBUTION;
    }

    @Override
    public Integer component1() {
        return getSectorId();
    }

    @Override
    public Integer component2() {
        return getGcnSectorId();
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
    public String component7() {
        return getEmissionDiurnalVariationCode();
    }

    @Override
    public Integer component8() {
        return getParticleSizeDistribution();
    }

    @Override
    public Integer value1() {
        return getSectorId();
    }

    @Override
    public Integer value2() {
        return getGcnSectorId();
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
    public String value7() {
        return getEmissionDiurnalVariationCode();
    }

    @Override
    public Integer value8() {
        return getParticleSizeDistribution();
    }

    @Override
    public DefaultSourceCharacteristicsViewRecord value1(Integer value) {
        setSectorId(value);
        return this;
    }

    @Override
    public DefaultSourceCharacteristicsViewRecord value2(Integer value) {
        setGcnSectorId(value);
        return this;
    }

    @Override
    public DefaultSourceCharacteristicsViewRecord value3(Float value) {
        setHeatContent(value);
        return this;
    }

    @Override
    public DefaultSourceCharacteristicsViewRecord value4(Float value) {
        setHeight(value);
        return this;
    }

    @Override
    public DefaultSourceCharacteristicsViewRecord value5(Float value) {
        setSpread(value);
        return this;
    }

    @Override
    public DefaultSourceCharacteristicsViewRecord value6(Integer value) {
        setEmissionDiurnalVariationId(value);
        return this;
    }

    @Override
    public DefaultSourceCharacteristicsViewRecord value7(String value) {
        setEmissionDiurnalVariationCode(value);
        return this;
    }

    @Override
    public DefaultSourceCharacteristicsViewRecord value8(Integer value) {
        setParticleSizeDistribution(value);
        return this;
    }

    @Override
    public DefaultSourceCharacteristicsViewRecord values(Integer value1, Integer value2, Float value3, Float value4, Float value5, Integer value6, String value7, Integer value8) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached DefaultSourceCharacteristicsViewRecord
     */
    public DefaultSourceCharacteristicsViewRecord() {
        super(DefaultSourceCharacteristicsView.DEFAULT_SOURCE_CHARACTERISTICS_VIEW);
    }

    /**
     * Create a detached, initialised DefaultSourceCharacteristicsViewRecord
     */
    public DefaultSourceCharacteristicsViewRecord(Integer sectorId, Integer gcnSectorId, Float heatContent, Float height, Float spread, Integer emissionDiurnalVariationId, String emissionDiurnalVariationCode, Integer particleSizeDistribution) {
        super(DefaultSourceCharacteristicsView.DEFAULT_SOURCE_CHARACTERISTICS_VIEW);

        setSectorId(sectorId);
        setGcnSectorId(gcnSectorId);
        setHeatContent(heatContent);
        setHeight(height);
        setSpread(spread);
        setEmissionDiurnalVariationId(emissionDiurnalVariationId);
        setEmissionDiurnalVariationCode(emissionDiurnalVariationCode);
        setParticleSizeDistribution(particleSizeDistribution);
    }
}