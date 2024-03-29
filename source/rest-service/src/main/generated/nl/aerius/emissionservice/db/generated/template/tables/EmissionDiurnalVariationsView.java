/*
 * This file is generated by jOOQ.
 */
package nl.aerius.emissionservice.db.generated.template.tables;


import java.util.function.Function;

import nl.aerius.emissionservice.db.generated.template.Template;
import nl.aerius.emissionservice.db.generated.template.tables.records.EmissionDiurnalVariationsViewRecord;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Function4;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Records;
import org.jooq.Row4;
import org.jooq.Schema;
import org.jooq.SelectField;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.TableOptions;
import org.jooq.impl.DSL;
import org.jooq.impl.SQLDataType;
import org.jooq.impl.TableImpl;


/**
 * View returning the different types of diurnal variation.
 * 
 * @file source/database/src/main/sql/template/01-sectors/04-views.sql
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class EmissionDiurnalVariationsView extends TableImpl<EmissionDiurnalVariationsViewRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of
     * <code>template.emission_diurnal_variations_view</code>
     */
    public static final EmissionDiurnalVariationsView EMISSION_DIURNAL_VARIATIONS_VIEW = new EmissionDiurnalVariationsView();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<EmissionDiurnalVariationsViewRecord> getRecordType() {
        return EmissionDiurnalVariationsViewRecord.class;
    }

    /**
     * The column
     * <code>template.emission_diurnal_variations_view.emission_diurnal_variation_id</code>.
     */
    public final TableField<EmissionDiurnalVariationsViewRecord, Integer> EMISSION_DIURNAL_VARIATION_ID = createField(DSL.name("emission_diurnal_variation_id"), SQLDataType.INTEGER, this, "");

    /**
     * The column
     * <code>template.emission_diurnal_variations_view.emission_diurnal_variation_code</code>.
     */
    public final TableField<EmissionDiurnalVariationsViewRecord, String> EMISSION_DIURNAL_VARIATION_CODE = createField(DSL.name("emission_diurnal_variation_code"), SQLDataType.CLOB, this, "");

    /**
     * The column
     * <code>template.emission_diurnal_variations_view.emission_diurnal_variation_name</code>.
     */
    public final TableField<EmissionDiurnalVariationsViewRecord, String> EMISSION_DIURNAL_VARIATION_NAME = createField(DSL.name("emission_diurnal_variation_name"), SQLDataType.CLOB, this, "");

    /**
     * The column
     * <code>template.emission_diurnal_variations_view.as_diurnal_variation_description</code>.
     */
    public final TableField<EmissionDiurnalVariationsViewRecord, String> AS_DIURNAL_VARIATION_DESCRIPTION = createField(DSL.name("as_diurnal_variation_description"), SQLDataType.CLOB, this, "");

    private EmissionDiurnalVariationsView(Name alias, Table<EmissionDiurnalVariationsViewRecord> aliased) {
        this(alias, aliased, null);
    }

    private EmissionDiurnalVariationsView(Name alias, Table<EmissionDiurnalVariationsViewRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment("View returning the different types of diurnal variation.\r\n\r\n@file source/database/src/main/sql/template/01-sectors/04-views.sql"), TableOptions.view("""
        create view "emission_diurnal_variations_view" as  SELECT emission_diurnal_variations.emission_diurnal_variation_id,
         emission_diurnal_variations.code AS emission_diurnal_variation_code,
         emission_diurnal_variations.name AS emission_diurnal_variation_name,
         emission_diurnal_variations.description AS as_diurnal_variation_description
        FROM template.emission_diurnal_variations;
        """));
    }

    /**
     * Create an aliased <code>template.emission_diurnal_variations_view</code>
     * table reference
     */
    public EmissionDiurnalVariationsView(String alias) {
        this(DSL.name(alias), EMISSION_DIURNAL_VARIATIONS_VIEW);
    }

    /**
     * Create an aliased <code>template.emission_diurnal_variations_view</code>
     * table reference
     */
    public EmissionDiurnalVariationsView(Name alias) {
        this(alias, EMISSION_DIURNAL_VARIATIONS_VIEW);
    }

    /**
     * Create a <code>template.emission_diurnal_variations_view</code> table
     * reference
     */
    public EmissionDiurnalVariationsView() {
        this(DSL.name("emission_diurnal_variations_view"), null);
    }

    public <O extends Record> EmissionDiurnalVariationsView(Table<O> child, ForeignKey<O, EmissionDiurnalVariationsViewRecord> key) {
        super(child, key, EMISSION_DIURNAL_VARIATIONS_VIEW);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : Template.TEMPLATE;
    }

    @Override
    public EmissionDiurnalVariationsView as(String alias) {
        return new EmissionDiurnalVariationsView(DSL.name(alias), this);
    }

    @Override
    public EmissionDiurnalVariationsView as(Name alias) {
        return new EmissionDiurnalVariationsView(alias, this);
    }

    @Override
    public EmissionDiurnalVariationsView as(Table<?> alias) {
        return new EmissionDiurnalVariationsView(alias.getQualifiedName(), this);
    }

    /**
     * Rename this table
     */
    @Override
    public EmissionDiurnalVariationsView rename(String name) {
        return new EmissionDiurnalVariationsView(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public EmissionDiurnalVariationsView rename(Name name) {
        return new EmissionDiurnalVariationsView(name, null);
    }

    /**
     * Rename this table
     */
    @Override
    public EmissionDiurnalVariationsView rename(Table<?> name) {
        return new EmissionDiurnalVariationsView(name.getQualifiedName(), null);
    }

    // -------------------------------------------------------------------------
    // Row4 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row4<Integer, String, String, String> fieldsRow() {
        return (Row4) super.fieldsRow();
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Function)}.
     */
    public <U> SelectField<U> mapping(Function4<? super Integer, ? super String, ? super String, ? super String, ? extends U> from) {
        return convertFrom(Records.mapping(from));
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Class,
     * Function)}.
     */
    public <U> SelectField<U> mapping(Class<U> toType, Function4<? super Integer, ? super String, ? super String, ? super String, ? extends U> from) {
        return convertFrom(toType, Records.mapping(from));
    }
}
