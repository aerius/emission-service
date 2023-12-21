/*
 * This file is generated by jOOQ.
 */
package nl.aerius.emissionservice.db.generated.template.tables;


import java.util.function.Function;

import nl.aerius.emissionservice.db.generated.template.Keys;
import nl.aerius.emissionservice.db.generated.template.Template;
import nl.aerius.emissionservice.db.generated.template.tables.records.SectorsRecord;

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
 * Table containing AERIUS sectors.
 * 
 * @file
 * source/database/src/main/sql/template/01-sectors/02-tables/01-sectors.sql
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Sectors extends TableImpl<SectorsRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>template.sectors</code>
     */
    public static final Sectors SECTORS = new Sectors();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<SectorsRecord> getRecordType() {
        return SectorsRecord.class;
    }

    /**
     * The column <code>template.sectors.sector_id</code>.
     */
    public final TableField<SectorsRecord, Integer> SECTOR_ID = createField(DSL.name("sector_id"), SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>template.sectors.description</code>.
     */
    public final TableField<SectorsRecord, String> DESCRIPTION = createField(DSL.name("description"), SQLDataType.CLOB.nullable(false), this, "");

    private Sectors(Name alias, Table<SectorsRecord> aliased) {
        this(alias, aliased, null);
    }

    private Sectors(Name alias, Table<SectorsRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment("Table containing AERIUS sectors.\r\n\r\n@file source/database/src/main/sql/template/01-sectors/02-tables/01-sectors.sql"), TableOptions.table());
    }

    /**
     * Create an aliased <code>template.sectors</code> table reference
     */
    public Sectors(String alias) {
        this(DSL.name(alias), SECTORS);
    }

    /**
     * Create an aliased <code>template.sectors</code> table reference
     */
    public Sectors(Name alias) {
        this(alias, SECTORS);
    }

    /**
     * Create a <code>template.sectors</code> table reference
     */
    public Sectors() {
        this(DSL.name("sectors"), null);
    }

    public <O extends Record> Sectors(Table<O> child, ForeignKey<O, SectorsRecord> key) {
        super(child, key, SECTORS);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : Template.TEMPLATE;
    }

    @Override
    public UniqueKey<SectorsRecord> getPrimaryKey() {
        return Keys.SECTORS_PKEY;
    }

    @Override
    public Sectors as(String alias) {
        return new Sectors(DSL.name(alias), this);
    }

    @Override
    public Sectors as(Name alias) {
        return new Sectors(alias, this);
    }

    @Override
    public Sectors as(Table<?> alias) {
        return new Sectors(alias.getQualifiedName(), this);
    }

    /**
     * Rename this table
     */
    @Override
    public Sectors rename(String name) {
        return new Sectors(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Sectors rename(Name name) {
        return new Sectors(name, null);
    }

    /**
     * Rename this table
     */
    @Override
    public Sectors rename(Table<?> name) {
        return new Sectors(name.getQualifiedName(), null);
    }

    // -------------------------------------------------------------------------
    // Row2 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row2<Integer, String> fieldsRow() {
        return (Row2) super.fieldsRow();
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Function)}.
     */
    public <U> SelectField<U> mapping(Function2<? super Integer, ? super String, ? extends U> from) {
        return convertFrom(Records.mapping(from));
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Class,
     * Function)}.
     */
    public <U> SelectField<U> mapping(Class<U> toType, Function2<? super Integer, ? super String, ? extends U> from) {
        return convertFrom(toType, Records.mapping(from));
    }
}
