/*
 * This file is generated by jOOQ.
 */
package nl.overheid.aerius.emissionservice.jooq.i18n.tables;


import java.util.Arrays;
import java.util.List;

import nl.overheid.aerius.emissionservice.jooq.i18n.I18n;
import nl.overheid.aerius.emissionservice.jooq.i18n.Keys;
import nl.overheid.aerius.emissionservice.jooq.i18n.enums.LanguageCodeType;
import nl.overheid.aerius.emissionservice.jooq.i18n.tables.records.MessagesRecord;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row3;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.TableOptions;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.TableImpl;


/**
 * Systeem tabel voor localized teksten.
 * 
 * @file source/database/src/main/sql/i18n/02-tables.sql
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Messages extends TableImpl<MessagesRecord> {

    private static final long serialVersionUID = 131708375;

    /**
     * The reference instance of <code>i18n.messages</code>
     */
    public static final Messages MESSAGES = new Messages();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<MessagesRecord> getRecordType() {
        return MessagesRecord.class;
    }

    /**
     * The column <code>i18n.messages.key</code>.
     */
    public final TableField<MessagesRecord, String> KEY = createField(DSL.name("key"), org.jooq.impl.SQLDataType.CLOB.nullable(false), this, "");

    /**
     * The column <code>i18n.messages.language_code</code>.
     */
    public final TableField<MessagesRecord, LanguageCodeType> LANGUAGE_CODE = createField(DSL.name("language_code"), org.jooq.impl.SQLDataType.VARCHAR.nullable(false).asEnumDataType(nl.overheid.aerius.emissionservice.jooq.i18n.enums.LanguageCodeType.class), this, "");

    /**
     * The column <code>i18n.messages.message</code>.
     */
    public final TableField<MessagesRecord, String> MESSAGE = createField(DSL.name("message"), org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * Create a <code>i18n.messages</code> table reference
     */
    public Messages() {
        this(DSL.name("messages"), null);
    }

    /**
     * Create an aliased <code>i18n.messages</code> table reference
     */
    public Messages(String alias) {
        this(DSL.name(alias), MESSAGES);
    }

    /**
     * Create an aliased <code>i18n.messages</code> table reference
     */
    public Messages(Name alias) {
        this(alias, MESSAGES);
    }

    private Messages(Name alias, Table<MessagesRecord> aliased) {
        this(alias, aliased, null);
    }

    private Messages(Name alias, Table<MessagesRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment("Systeem tabel voor localized teksten.\r\n\r\n@file source/database/src/main/sql/i18n/02-tables.sql"), TableOptions.table());
    }

    public <O extends Record> Messages(Table<O> child, ForeignKey<O, MessagesRecord> key) {
        super(child, key, MESSAGES);
    }

    @Override
    public Schema getSchema() {
        return I18n.I18N;
    }

    @Override
    public UniqueKey<MessagesRecord> getPrimaryKey() {
        return Keys.MESSAGES_PKEY;
    }

    @Override
    public List<UniqueKey<MessagesRecord>> getKeys() {
        return Arrays.<UniqueKey<MessagesRecord>>asList(Keys.MESSAGES_PKEY);
    }

    @Override
    public Messages as(String alias) {
        return new Messages(DSL.name(alias), this);
    }

    @Override
    public Messages as(Name alias) {
        return new Messages(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Messages rename(String name) {
        return new Messages(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Messages rename(Name name) {
        return new Messages(name, null);
    }

    // -------------------------------------------------------------------------
    // Row3 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row3<String, LanguageCodeType, String> fieldsRow() {
        return (Row3) super.fieldsRow();
    }
}