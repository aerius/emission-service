/*
 * This file is generated by jOOQ.
 */
package nl.aerius.emissionservice.db.generated.i18n.tables;


import java.util.function.Function;

import nl.aerius.emissionservice.db.generated.i18n.I18n;
import nl.aerius.emissionservice.db.generated.i18n.Keys;
import nl.aerius.emissionservice.db.generated.i18n.enums.LanguageCodeType;
import nl.aerius.emissionservice.db.generated.i18n.tables.records.SystemInfoMessagesRecord;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Function2;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Records;
import org.jooq.Row2;
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
 * System info table for localized messages, for showing system messages.
 * 
 * @file source/database/src/main/sql/i18n/02-tables.sql
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class SystemInfoMessages extends TableImpl<SystemInfoMessagesRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>i18n.system_info_messages</code>
     */
    public static final SystemInfoMessages SYSTEM_INFO_MESSAGES = new SystemInfoMessages();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<SystemInfoMessagesRecord> getRecordType() {
        return SystemInfoMessagesRecord.class;
    }

    /**
     * The column <code>i18n.system_info_messages.language_code</code>.
     */
    public final TableField<SystemInfoMessagesRecord, LanguageCodeType> LANGUAGE_CODE = createField(DSL.name("language_code"), SQLDataType.VARCHAR.nullable(false).asEnumDataType(nl.aerius.emissionservice.db.generated.i18n.enums.LanguageCodeType.class), this, "");

    /**
     * The column <code>i18n.system_info_messages.message</code>.
     */
    public final TableField<SystemInfoMessagesRecord, String> MESSAGE = createField(DSL.name("message"), SQLDataType.CLOB.nullable(false), this, "");

    private SystemInfoMessages(Name alias, Table<SystemInfoMessagesRecord> aliased) {
        this(alias, aliased, null);
    }

    private SystemInfoMessages(Name alias, Table<SystemInfoMessagesRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment("System info table for localized messages, for showing system messages.\r\n\r\n@file source/database/src/main/sql/i18n/02-tables.sql"), TableOptions.table());
    }

    /**
     * Create an aliased <code>i18n.system_info_messages</code> table reference
     */
    public SystemInfoMessages(String alias) {
        this(DSL.name(alias), SYSTEM_INFO_MESSAGES);
    }

    /**
     * Create an aliased <code>i18n.system_info_messages</code> table reference
     */
    public SystemInfoMessages(Name alias) {
        this(alias, SYSTEM_INFO_MESSAGES);
    }

    /**
     * Create a <code>i18n.system_info_messages</code> table reference
     */
    public SystemInfoMessages() {
        this(DSL.name("system_info_messages"), null);
    }

    public <O extends Record> SystemInfoMessages(Table<O> child, ForeignKey<O, SystemInfoMessagesRecord> key) {
        super(child, key, SYSTEM_INFO_MESSAGES);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : I18n.I18N;
    }

    @Override
    public UniqueKey<SystemInfoMessagesRecord> getPrimaryKey() {
        return Keys.SYSTEM_INFO_MESSAGES_PKEY;
    }

    @Override
    public SystemInfoMessages as(String alias) {
        return new SystemInfoMessages(DSL.name(alias), this);
    }

    @Override
    public SystemInfoMessages as(Name alias) {
        return new SystemInfoMessages(alias, this);
    }

    @Override
    public SystemInfoMessages as(Table<?> alias) {
        return new SystemInfoMessages(alias.getQualifiedName(), this);
    }

    /**
     * Rename this table
     */
    @Override
    public SystemInfoMessages rename(String name) {
        return new SystemInfoMessages(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public SystemInfoMessages rename(Name name) {
        return new SystemInfoMessages(name, null);
    }

    /**
     * Rename this table
     */
    @Override
    public SystemInfoMessages rename(Table<?> name) {
        return new SystemInfoMessages(name.getQualifiedName(), null);
    }

    // -------------------------------------------------------------------------
    // Row2 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row2<LanguageCodeType, String> fieldsRow() {
        return (Row2) super.fieldsRow();
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Function)}.
     */
    public <U> SelectField<U> mapping(Function2<? super LanguageCodeType, ? super String, ? extends U> from) {
        return convertFrom(Records.mapping(from));
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Class,
     * Function)}.
     */
    public <U> SelectField<U> mapping(Class<U> toType, Function2<? super LanguageCodeType, ? super String, ? extends U> from) {
        return convertFrom(toType, Records.mapping(from));
    }
}
