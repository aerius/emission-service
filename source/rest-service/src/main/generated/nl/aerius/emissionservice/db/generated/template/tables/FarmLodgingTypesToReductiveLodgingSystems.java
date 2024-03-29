/*
 * This file is generated by jOOQ.
 */
package nl.aerius.emissionservice.db.generated.template.tables;


import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

import nl.aerius.emissionservice.db.generated.template.Keys;
import nl.aerius.emissionservice.db.generated.template.Template;
import nl.aerius.emissionservice.db.generated.template.tables.records.FarmLodgingTypesToReductiveLodgingSystemsRecord;

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
 * Table linking (N:N) which emission reducing lodging techniques can be stacked
 * on which lodging system.
 * This table contains the allowed combinations within the RAV way of working,
 * however within calculator every combination is possible.
 * 
 * @file
 * source/database/src/main/sql/template/02-emission_factors/02-tables/farms.sql
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class FarmLodgingTypesToReductiveLodgingSystems extends TableImpl<FarmLodgingTypesToReductiveLodgingSystemsRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of
     * <code>template.farm_lodging_types_to_reductive_lodging_systems</code>
     */
    public static final FarmLodgingTypesToReductiveLodgingSystems FARM_LODGING_TYPES_TO_REDUCTIVE_LODGING_SYSTEMS = new FarmLodgingTypesToReductiveLodgingSystems();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<FarmLodgingTypesToReductiveLodgingSystemsRecord> getRecordType() {
        return FarmLodgingTypesToReductiveLodgingSystemsRecord.class;
    }

    /**
     * The column
     * <code>template.farm_lodging_types_to_reductive_lodging_systems.farm_lodging_type_id</code>.
     */
    public final TableField<FarmLodgingTypesToReductiveLodgingSystemsRecord, Integer> FARM_LODGING_TYPE_ID = createField(DSL.name("farm_lodging_type_id"), SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column
     * <code>template.farm_lodging_types_to_reductive_lodging_systems.farm_reductive_lodging_system_id</code>.
     */
    public final TableField<FarmLodgingTypesToReductiveLodgingSystemsRecord, Integer> FARM_REDUCTIVE_LODGING_SYSTEM_ID = createField(DSL.name("farm_reductive_lodging_system_id"), SQLDataType.INTEGER.nullable(false), this, "");

    private FarmLodgingTypesToReductiveLodgingSystems(Name alias, Table<FarmLodgingTypesToReductiveLodgingSystemsRecord> aliased) {
        this(alias, aliased, null);
    }

    private FarmLodgingTypesToReductiveLodgingSystems(Name alias, Table<FarmLodgingTypesToReductiveLodgingSystemsRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment("Table linking (N:N) which emission reducing lodging techniques can be stacked on which lodging system.\r\nThis table contains the allowed combinations within the RAV way of working, however within calculator every combination is possible.\r\n\r\n@file source/database/src/main/sql/template/02-emission_factors/02-tables/farms.sql"), TableOptions.table());
    }

    /**
     * Create an aliased
     * <code>template.farm_lodging_types_to_reductive_lodging_systems</code>
     * table reference
     */
    public FarmLodgingTypesToReductiveLodgingSystems(String alias) {
        this(DSL.name(alias), FARM_LODGING_TYPES_TO_REDUCTIVE_LODGING_SYSTEMS);
    }

    /**
     * Create an aliased
     * <code>template.farm_lodging_types_to_reductive_lodging_systems</code>
     * table reference
     */
    public FarmLodgingTypesToReductiveLodgingSystems(Name alias) {
        this(alias, FARM_LODGING_TYPES_TO_REDUCTIVE_LODGING_SYSTEMS);
    }

    /**
     * Create a
     * <code>template.farm_lodging_types_to_reductive_lodging_systems</code>
     * table reference
     */
    public FarmLodgingTypesToReductiveLodgingSystems() {
        this(DSL.name("farm_lodging_types_to_reductive_lodging_systems"), null);
    }

    public <O extends Record> FarmLodgingTypesToReductiveLodgingSystems(Table<O> child, ForeignKey<O, FarmLodgingTypesToReductiveLodgingSystemsRecord> key) {
        super(child, key, FARM_LODGING_TYPES_TO_REDUCTIVE_LODGING_SYSTEMS);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : Template.TEMPLATE;
    }

    @Override
    public UniqueKey<FarmLodgingTypesToReductiveLodgingSystemsRecord> getPrimaryKey() {
        return Keys.FARM_LODGING_TYPES_TO_REDUCTIVE_LODGING_SYSTEMS_PKEY;
    }

    @Override
    public List<ForeignKey<FarmLodgingTypesToReductiveLodgingSystemsRecord, ?>> getReferences() {
        return Arrays.asList(Keys.FARM_LODGING_TYPES_TO_REDUCTIVE_LODGING_SYSTEMS__FARM_LODGING_TYPES_TO_REDUCTIVE_LODGING_SYSTEMS_FKEY_TYPES, Keys.FARM_LODGING_TYPES_TO_REDUCTIVE_LODGING_SYSTEMS__FARM_LODGING_TYPES_TO_REDUCTIVE_LODGING_SYSTEMS_FKEY_REDUCTIVE);
    }

    private transient FarmLodgingTypes _farmLodgingTypes;
    private transient FarmReductiveLodgingSystems _farmReductiveLodgingSystems;

    /**
     * Get the implicit join path to the
     * <code>template.farm_lodging_types</code> table.
     */
    public FarmLodgingTypes farmLodgingTypes() {
        if (_farmLodgingTypes == null)
            _farmLodgingTypes = new FarmLodgingTypes(this, Keys.FARM_LODGING_TYPES_TO_REDUCTIVE_LODGING_SYSTEMS__FARM_LODGING_TYPES_TO_REDUCTIVE_LODGING_SYSTEMS_FKEY_TYPES);

        return _farmLodgingTypes;
    }

    /**
     * Get the implicit join path to the
     * <code>template.farm_reductive_lodging_systems</code> table.
     */
    public FarmReductiveLodgingSystems farmReductiveLodgingSystems() {
        if (_farmReductiveLodgingSystems == null)
            _farmReductiveLodgingSystems = new FarmReductiveLodgingSystems(this, Keys.FARM_LODGING_TYPES_TO_REDUCTIVE_LODGING_SYSTEMS__FARM_LODGING_TYPES_TO_REDUCTIVE_LODGING_SYSTEMS_FKEY_REDUCTIVE);

        return _farmReductiveLodgingSystems;
    }

    @Override
    public FarmLodgingTypesToReductiveLodgingSystems as(String alias) {
        return new FarmLodgingTypesToReductiveLodgingSystems(DSL.name(alias), this);
    }

    @Override
    public FarmLodgingTypesToReductiveLodgingSystems as(Name alias) {
        return new FarmLodgingTypesToReductiveLodgingSystems(alias, this);
    }

    @Override
    public FarmLodgingTypesToReductiveLodgingSystems as(Table<?> alias) {
        return new FarmLodgingTypesToReductiveLodgingSystems(alias.getQualifiedName(), this);
    }

    /**
     * Rename this table
     */
    @Override
    public FarmLodgingTypesToReductiveLodgingSystems rename(String name) {
        return new FarmLodgingTypesToReductiveLodgingSystems(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public FarmLodgingTypesToReductiveLodgingSystems rename(Name name) {
        return new FarmLodgingTypesToReductiveLodgingSystems(name, null);
    }

    /**
     * Rename this table
     */
    @Override
    public FarmLodgingTypesToReductiveLodgingSystems rename(Table<?> name) {
        return new FarmLodgingTypesToReductiveLodgingSystems(name.getQualifiedName(), null);
    }

    // -------------------------------------------------------------------------
    // Row2 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row2<Integer, Integer> fieldsRow() {
        return (Row2) super.fieldsRow();
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Function)}.
     */
    public <U> SelectField<U> mapping(Function2<? super Integer, ? super Integer, ? extends U> from) {
        return convertFrom(Records.mapping(from));
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Class,
     * Function)}.
     */
    public <U> SelectField<U> mapping(Class<U> toType, Function2<? super Integer, ? super Integer, ? extends U> from) {
        return convertFrom(toType, Records.mapping(from));
    }
}
