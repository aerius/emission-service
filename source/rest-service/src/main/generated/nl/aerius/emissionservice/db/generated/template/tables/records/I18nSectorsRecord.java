/*
 * This file is generated by jOOQ.
 */
package nl.aerius.emissionservice.db.generated.template.tables.records;


import nl.aerius.emissionservice.db.generated.i18n.enums.LanguageCodeType;
import nl.aerius.emissionservice.db.generated.template.tables.I18nSectors;

import org.jooq.Field;
import org.jooq.Record2;
import org.jooq.Record3;
import org.jooq.Row3;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * Table containing i18n localization for sectors.
 * 
 * @file source/database/src/main/sql/template/01-sectors/i18n/base_keys.sql
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class I18nSectorsRecord extends UpdatableRecordImpl<I18nSectorsRecord> implements Record3<Integer, LanguageCodeType, String> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>template.i18n_sectors.sector_id</code>.
     */
    public void setSectorId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>template.i18n_sectors.sector_id</code>.
     */
    public Integer getSectorId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>template.i18n_sectors.language_code</code>.
     */
    public void setLanguageCode(LanguageCodeType value) {
        set(1, value);
    }

    /**
     * Getter for <code>template.i18n_sectors.language_code</code>.
     */
    public LanguageCodeType getLanguageCode() {
        return (LanguageCodeType) get(1);
    }

    /**
     * Setter for <code>template.i18n_sectors.description</code>.
     */
    public void setDescription(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>template.i18n_sectors.description</code>.
     */
    public String getDescription() {
        return (String) get(2);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record2<Integer, LanguageCodeType> key() {
        return (Record2) super.key();
    }

    // -------------------------------------------------------------------------
    // Record3 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row3<Integer, LanguageCodeType, String> fieldsRow() {
        return (Row3) super.fieldsRow();
    }

    @Override
    public Row3<Integer, LanguageCodeType, String> valuesRow() {
        return (Row3) super.valuesRow();
    }

    @Override
    public Field<Integer> field1() {
        return I18nSectors.I18N_SECTORS.SECTOR_ID;
    }

    @Override
    public Field<LanguageCodeType> field2() {
        return I18nSectors.I18N_SECTORS.LANGUAGE_CODE;
    }

    @Override
    public Field<String> field3() {
        return I18nSectors.I18N_SECTORS.DESCRIPTION;
    }

    @Override
    public Integer component1() {
        return getSectorId();
    }

    @Override
    public LanguageCodeType component2() {
        return getLanguageCode();
    }

    @Override
    public String component3() {
        return getDescription();
    }

    @Override
    public Integer value1() {
        return getSectorId();
    }

    @Override
    public LanguageCodeType value2() {
        return getLanguageCode();
    }

    @Override
    public String value3() {
        return getDescription();
    }

    @Override
    public I18nSectorsRecord value1(Integer value) {
        setSectorId(value);
        return this;
    }

    @Override
    public I18nSectorsRecord value2(LanguageCodeType value) {
        setLanguageCode(value);
        return this;
    }

    @Override
    public I18nSectorsRecord value3(String value) {
        setDescription(value);
        return this;
    }

    @Override
    public I18nSectorsRecord values(Integer value1, LanguageCodeType value2, String value3) {
        value1(value1);
        value2(value2);
        value3(value3);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached I18nSectorsRecord
     */
    public I18nSectorsRecord() {
        super(I18nSectors.I18N_SECTORS);
    }

    /**
     * Create a detached, initialised I18nSectorsRecord
     */
    public I18nSectorsRecord(Integer sectorId, LanguageCodeType languageCode, String description) {
        super(I18nSectors.I18N_SECTORS);

        setSectorId(sectorId);
        setLanguageCode(languageCode);
        setDescription(description);
    }
}
