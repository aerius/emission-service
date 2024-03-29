/*
 * This file is generated by jOOQ.
 */
package nl.aerius.emissionservice.db.generated.template.tables.records;


import nl.aerius.emissionservice.db.generated.template.tables.DatasetMetadata;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record2;
import org.jooq.Row2;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * Table containing metadata for this dataset.
 * 
 * @file source/database/src/main/sql/template/dataset_metadata.sql
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class DatasetMetadataRecord extends UpdatableRecordImpl<DatasetMetadataRecord> implements Record2<String, String> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>template.dataset_metadata.key</code>.
     */
    public void setKey(String value) {
        set(0, value);
    }

    /**
     * Getter for <code>template.dataset_metadata.key</code>.
     */
    public String getKey() {
        return (String) get(0);
    }

    /**
     * Setter for <code>template.dataset_metadata.value</code>.
     */
    public void setValue(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>template.dataset_metadata.value</code>.
     */
    public String getValue() {
        return (String) get(1);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<String> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record2 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row2<String, String> fieldsRow() {
        return (Row2) super.fieldsRow();
    }

    @Override
    public Row2<String, String> valuesRow() {
        return (Row2) super.valuesRow();
    }

    @Override
    public Field<String> field1() {
        return DatasetMetadata.DATASET_METADATA.KEY;
    }

    @Override
    public Field<String> field2() {
        return DatasetMetadata.DATASET_METADATA.VALUE;
    }

    @Override
    public String component1() {
        return getKey();
    }

    @Override
    public String component2() {
        return getValue();
    }

    @Override
    public String value1() {
        return getKey();
    }

    @Override
    public String value2() {
        return getValue();
    }

    @Override
    public DatasetMetadataRecord value1(String value) {
        setKey(value);
        return this;
    }

    @Override
    public DatasetMetadataRecord value2(String value) {
        setValue(value);
        return this;
    }

    @Override
    public DatasetMetadataRecord values(String value1, String value2) {
        value1(value1);
        value2(value2);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached DatasetMetadataRecord
     */
    public DatasetMetadataRecord() {
        super(DatasetMetadata.DATASET_METADATA);
    }

    /**
     * Create a detached, initialised DatasetMetadataRecord
     */
    public DatasetMetadataRecord(String key, String value) {
        super(DatasetMetadata.DATASET_METADATA);

        setKey(key);
        setValue(value);
    }
}
