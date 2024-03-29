/*
 * This file is generated by jOOQ.
 */
package nl.aerius.emissionservice.db.generated.template.tables.records;


import nl.aerius.emissionservice.db.generated.template.tables.GcnSectors;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record3;
import org.jooq.Row3;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * Table containing GCN (RIVM) sectors.
 * Every GCN sector is linked to an AERIUS sector. This allows us to link
 * deposition to AERIUS sources if GCN/RIVM sources are used (Monitor).
 * 
 * @file
 * source/database/src/main/sql/template/01-sectors/02-tables/01-sectors.sql
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class GcnSectorsRecord extends UpdatableRecordImpl<GcnSectorsRecord> implements Record3<Integer, Integer, String> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>template.gcn_sectors.gcn_sector_id</code>.
     */
    public void setGcnSectorId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>template.gcn_sectors.gcn_sector_id</code>.
     */
    public Integer getGcnSectorId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>template.gcn_sectors.sector_id</code>.
     */
    public void setSectorId(Integer value) {
        set(1, value);
    }

    /**
     * Getter for <code>template.gcn_sectors.sector_id</code>.
     */
    public Integer getSectorId() {
        return (Integer) get(1);
    }

    /**
     * Setter for <code>template.gcn_sectors.description</code>.
     */
    public void setDescription(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>template.gcn_sectors.description</code>.
     */
    public String getDescription() {
        return (String) get(2);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<Integer> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record3 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row3<Integer, Integer, String> fieldsRow() {
        return (Row3) super.fieldsRow();
    }

    @Override
    public Row3<Integer, Integer, String> valuesRow() {
        return (Row3) super.valuesRow();
    }

    @Override
    public Field<Integer> field1() {
        return GcnSectors.GCN_SECTORS.GCN_SECTOR_ID;
    }

    @Override
    public Field<Integer> field2() {
        return GcnSectors.GCN_SECTORS.SECTOR_ID;
    }

    @Override
    public Field<String> field3() {
        return GcnSectors.GCN_SECTORS.DESCRIPTION;
    }

    @Override
    public Integer component1() {
        return getGcnSectorId();
    }

    @Override
    public Integer component2() {
        return getSectorId();
    }

    @Override
    public String component3() {
        return getDescription();
    }

    @Override
    public Integer value1() {
        return getGcnSectorId();
    }

    @Override
    public Integer value2() {
        return getSectorId();
    }

    @Override
    public String value3() {
        return getDescription();
    }

    @Override
    public GcnSectorsRecord value1(Integer value) {
        setGcnSectorId(value);
        return this;
    }

    @Override
    public GcnSectorsRecord value2(Integer value) {
        setSectorId(value);
        return this;
    }

    @Override
    public GcnSectorsRecord value3(String value) {
        setDescription(value);
        return this;
    }

    @Override
    public GcnSectorsRecord values(Integer value1, Integer value2, String value3) {
        value1(value1);
        value2(value2);
        value3(value3);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached GcnSectorsRecord
     */
    public GcnSectorsRecord() {
        super(GcnSectors.GCN_SECTORS);
    }

    /**
     * Create a detached, initialised GcnSectorsRecord
     */
    public GcnSectorsRecord(Integer gcnSectorId, Integer sectorId, String description) {
        super(GcnSectors.GCN_SECTORS);

        setGcnSectorId(gcnSectorId);
        setSectorId(sectorId);
        setDescription(description);
    }
}
