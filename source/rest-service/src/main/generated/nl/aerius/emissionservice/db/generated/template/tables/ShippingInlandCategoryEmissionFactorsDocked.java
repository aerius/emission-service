/*
 * This file is generated by jOOQ.
 */
package nl.aerius.emissionservice.db.generated.template.tables;


import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

import nl.aerius.emissionservice.db.generated.public_.enums.ShippingInlandLadenState;
import nl.aerius.emissionservice.db.generated.public_.tables.Substances;
import nl.aerius.emissionservice.db.generated.template.Keys;
import nl.aerius.emissionservice.db.generated.template.Template;
import nl.aerius.emissionservice.db.generated.template.tables.records.ShippingInlandCategoryEmissionFactorsDockedRecord;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Function5;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Records;
import org.jooq.Row5;
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
 * Table containing the emission factors for inland shipping categories for
 * docked ships.
 * These emission factors are defined per ship type, laden state and substance.
 * 
 * The emission factors are specified by year (year-dependant), and represent
 * the emission factor when not moving (for example when docked), in g/(hour *
 * number of ships).
 * 
 * @file
 * source/database/src/main/sql/template/02-emission_factors/02-tables/shipping_inland.sql
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class ShippingInlandCategoryEmissionFactorsDocked extends TableImpl<ShippingInlandCategoryEmissionFactorsDockedRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of
     * <code>template.shipping_inland_category_emission_factors_docked</code>
     */
    public static final ShippingInlandCategoryEmissionFactorsDocked SHIPPING_INLAND_CATEGORY_EMISSION_FACTORS_DOCKED = new ShippingInlandCategoryEmissionFactorsDocked();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<ShippingInlandCategoryEmissionFactorsDockedRecord> getRecordType() {
        return ShippingInlandCategoryEmissionFactorsDockedRecord.class;
    }

    /**
     * The column
     * <code>template.shipping_inland_category_emission_factors_docked.shipping_inland_category_id</code>.
     */
    public final TableField<ShippingInlandCategoryEmissionFactorsDockedRecord, Short> SHIPPING_INLAND_CATEGORY_ID = createField(DSL.name("shipping_inland_category_id"), SQLDataType.SMALLINT.nullable(false), this, "");

    /**
     * The column
     * <code>template.shipping_inland_category_emission_factors_docked.laden_state</code>.
     */
    public final TableField<ShippingInlandCategoryEmissionFactorsDockedRecord, ShippingInlandLadenState> LADEN_STATE = createField(DSL.name("laden_state"), SQLDataType.VARCHAR.nullable(false).asEnumDataType(nl.aerius.emissionservice.db.generated.public_.enums.ShippingInlandLadenState.class), this, "");

    /**
     * The column
     * <code>template.shipping_inland_category_emission_factors_docked.year</code>.
     */
    public final TableField<ShippingInlandCategoryEmissionFactorsDockedRecord, Short> YEAR = createField(DSL.name("year"), nl.aerius.emissionservice.db.generated.public_.Domains.YEAR_TYPE.getDataType().nullable(false), this, "");

    /**
     * The column
     * <code>template.shipping_inland_category_emission_factors_docked.substance_id</code>.
     */
    public final TableField<ShippingInlandCategoryEmissionFactorsDockedRecord, Short> SUBSTANCE_ID = createField(DSL.name("substance_id"), SQLDataType.SMALLINT.nullable(false), this, "");

    /**
     * The column
     * <code>template.shipping_inland_category_emission_factors_docked.emission_factor</code>.
     */
    public final TableField<ShippingInlandCategoryEmissionFactorsDockedRecord, Float> EMISSION_FACTOR = createField(DSL.name("emission_factor"), nl.aerius.emissionservice.db.generated.public_.Domains.POSREAL.getDataType().nullable(false), this, "");

    private ShippingInlandCategoryEmissionFactorsDocked(Name alias, Table<ShippingInlandCategoryEmissionFactorsDockedRecord> aliased) {
        this(alias, aliased, null);
    }

    private ShippingInlandCategoryEmissionFactorsDocked(Name alias, Table<ShippingInlandCategoryEmissionFactorsDockedRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment("Table containing the emission factors for inland shipping categories for docked ships.\r\nThese emission factors are defined per ship type, laden state and substance.\r\n\r\nThe emission factors are specified by year (year-dependant), and represent the emission factor when not moving (for example when docked), in g/(hour * number of ships).\r\n\r\n@file source/database/src/main/sql/template/02-emission_factors/02-tables/shipping_inland.sql"), TableOptions.table());
    }

    /**
     * Create an aliased
     * <code>template.shipping_inland_category_emission_factors_docked</code>
     * table reference
     */
    public ShippingInlandCategoryEmissionFactorsDocked(String alias) {
        this(DSL.name(alias), SHIPPING_INLAND_CATEGORY_EMISSION_FACTORS_DOCKED);
    }

    /**
     * Create an aliased
     * <code>template.shipping_inland_category_emission_factors_docked</code>
     * table reference
     */
    public ShippingInlandCategoryEmissionFactorsDocked(Name alias) {
        this(alias, SHIPPING_INLAND_CATEGORY_EMISSION_FACTORS_DOCKED);
    }

    /**
     * Create a
     * <code>template.shipping_inland_category_emission_factors_docked</code>
     * table reference
     */
    public ShippingInlandCategoryEmissionFactorsDocked() {
        this(DSL.name("shipping_inland_category_emission_factors_docked"), null);
    }

    public <O extends Record> ShippingInlandCategoryEmissionFactorsDocked(Table<O> child, ForeignKey<O, ShippingInlandCategoryEmissionFactorsDockedRecord> key) {
        super(child, key, SHIPPING_INLAND_CATEGORY_EMISSION_FACTORS_DOCKED);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : Template.TEMPLATE;
    }

    @Override
    public UniqueKey<ShippingInlandCategoryEmissionFactorsDockedRecord> getPrimaryKey() {
        return Keys.SHIPPING_INLAND_CATEGORY_EMISSION_FACTORS_DOCKED_PKEY;
    }

    @Override
    public List<ForeignKey<ShippingInlandCategoryEmissionFactorsDockedRecord, ?>> getReferences() {
        return Arrays.asList(Keys.SHIPPING_INLAND_CATEGORY_EMISSION_FACTORS_DOCKED__SHIPPING_INLAND_CATEGORY_EMISSION_FACTORS_DOCKED_FKEY_CATEGORIE, Keys.SHIPPING_INLAND_CATEGORY_EMISSION_FACTORS_DOCKED__SHIPPING_INLAND_CATEGORY_EMISSION_FACTORS_DOCKED_FKEY_SUBSTANCE);
    }

    private transient ShippingInlandCategories _shippingInlandCategories;
    private transient Substances _substances;

    /**
     * Get the implicit join path to the
     * <code>template.shipping_inland_categories</code> table.
     */
    public ShippingInlandCategories shippingInlandCategories() {
        if (_shippingInlandCategories == null)
            _shippingInlandCategories = new ShippingInlandCategories(this, Keys.SHIPPING_INLAND_CATEGORY_EMISSION_FACTORS_DOCKED__SHIPPING_INLAND_CATEGORY_EMISSION_FACTORS_DOCKED_FKEY_CATEGORIE);

        return _shippingInlandCategories;
    }

    /**
     * Get the implicit join path to the <code>public.substances</code> table.
     */
    public Substances substances() {
        if (_substances == null)
            _substances = new Substances(this, Keys.SHIPPING_INLAND_CATEGORY_EMISSION_FACTORS_DOCKED__SHIPPING_INLAND_CATEGORY_EMISSION_FACTORS_DOCKED_FKEY_SUBSTANCE);

        return _substances;
    }

    @Override
    public ShippingInlandCategoryEmissionFactorsDocked as(String alias) {
        return new ShippingInlandCategoryEmissionFactorsDocked(DSL.name(alias), this);
    }

    @Override
    public ShippingInlandCategoryEmissionFactorsDocked as(Name alias) {
        return new ShippingInlandCategoryEmissionFactorsDocked(alias, this);
    }

    @Override
    public ShippingInlandCategoryEmissionFactorsDocked as(Table<?> alias) {
        return new ShippingInlandCategoryEmissionFactorsDocked(alias.getQualifiedName(), this);
    }

    /**
     * Rename this table
     */
    @Override
    public ShippingInlandCategoryEmissionFactorsDocked rename(String name) {
        return new ShippingInlandCategoryEmissionFactorsDocked(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public ShippingInlandCategoryEmissionFactorsDocked rename(Name name) {
        return new ShippingInlandCategoryEmissionFactorsDocked(name, null);
    }

    /**
     * Rename this table
     */
    @Override
    public ShippingInlandCategoryEmissionFactorsDocked rename(Table<?> name) {
        return new ShippingInlandCategoryEmissionFactorsDocked(name.getQualifiedName(), null);
    }

    // -------------------------------------------------------------------------
    // Row5 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row5<Short, ShippingInlandLadenState, Short, Short, Float> fieldsRow() {
        return (Row5) super.fieldsRow();
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Function)}.
     */
    public <U> SelectField<U> mapping(Function5<? super Short, ? super ShippingInlandLadenState, ? super Short, ? super Short, ? super Float, ? extends U> from) {
        return convertFrom(Records.mapping(from));
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Class,
     * Function)}.
     */
    public <U> SelectField<U> mapping(Class<U> toType, Function5<? super Short, ? super ShippingInlandLadenState, ? super Short, ? super Short, ? super Float, ? extends U> from) {
        return convertFrom(toType, Records.mapping(from));
    }
}
