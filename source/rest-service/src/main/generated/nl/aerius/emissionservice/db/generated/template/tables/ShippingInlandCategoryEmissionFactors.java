/*
 * This file is generated by jOOQ.
 */
package nl.aerius.emissionservice.db.generated.template.tables;


import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

import nl.aerius.emissionservice.db.generated.public_.enums.ShippingInlandLadenState;
import nl.aerius.emissionservice.db.generated.public_.enums.ShippingInlandShipDirectionType;
import nl.aerius.emissionservice.db.generated.public_.tables.Substances;
import nl.aerius.emissionservice.db.generated.template.Keys;
import nl.aerius.emissionservice.db.generated.template.Template;
import nl.aerius.emissionservice.db.generated.template.tables.records.ShippingInlandCategoryEmissionFactorsRecord;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Function7;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Records;
import org.jooq.Row7;
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
 * De emissie factoren voor de verschillende soorten varende schepen.
 * Deze factoren zijn uniek per scheepstype, vaarwegtype, vaarrichtingen,
 * ladingstoestand en stof.
 * 
 * Hierin worden de emissiefactoren per jaar weergegeven, emission_factor is de
 * emissie factor tijdens varen (in g/(kilometer * aantal schepen)) bij een
 * bepaalde snelheid.
 * 
 * @file
 * source/database/src/main/sql/template/02-emission_factors/02-tables/shipping_inland.sql
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class ShippingInlandCategoryEmissionFactors extends TableImpl<ShippingInlandCategoryEmissionFactorsRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of
     * <code>template.shipping_inland_category_emission_factors</code>
     */
    public static final ShippingInlandCategoryEmissionFactors SHIPPING_INLAND_CATEGORY_EMISSION_FACTORS = new ShippingInlandCategoryEmissionFactors();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<ShippingInlandCategoryEmissionFactorsRecord> getRecordType() {
        return ShippingInlandCategoryEmissionFactorsRecord.class;
    }

    /**
     * The column
     * <code>template.shipping_inland_category_emission_factors.shipping_inland_category_id</code>.
     */
    public final TableField<ShippingInlandCategoryEmissionFactorsRecord, Short> SHIPPING_INLAND_CATEGORY_ID = createField(DSL.name("shipping_inland_category_id"), SQLDataType.SMALLINT.nullable(false), this, "");

    /**
     * The column
     * <code>template.shipping_inland_category_emission_factors.shipping_inland_waterway_category_id</code>.
     */
    public final TableField<ShippingInlandCategoryEmissionFactorsRecord, Integer> SHIPPING_INLAND_WATERWAY_CATEGORY_ID = createField(DSL.name("shipping_inland_waterway_category_id"), SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column
     * <code>template.shipping_inland_category_emission_factors.ship_direction</code>.
     */
    public final TableField<ShippingInlandCategoryEmissionFactorsRecord, ShippingInlandShipDirectionType> SHIP_DIRECTION = createField(DSL.name("ship_direction"), SQLDataType.VARCHAR.nullable(false).asEnumDataType(nl.aerius.emissionservice.db.generated.public_.enums.ShippingInlandShipDirectionType.class), this, "");

    /**
     * The column
     * <code>template.shipping_inland_category_emission_factors.laden_state</code>.
     */
    public final TableField<ShippingInlandCategoryEmissionFactorsRecord, ShippingInlandLadenState> LADEN_STATE = createField(DSL.name("laden_state"), SQLDataType.VARCHAR.nullable(false).asEnumDataType(nl.aerius.emissionservice.db.generated.public_.enums.ShippingInlandLadenState.class), this, "");

    /**
     * The column
     * <code>template.shipping_inland_category_emission_factors.year</code>.
     */
    public final TableField<ShippingInlandCategoryEmissionFactorsRecord, Short> YEAR = createField(DSL.name("year"), nl.aerius.emissionservice.db.generated.public_.Domains.YEAR_TYPE.getDataType().nullable(false), this, "");

    /**
     * The column
     * <code>template.shipping_inland_category_emission_factors.substance_id</code>.
     */
    public final TableField<ShippingInlandCategoryEmissionFactorsRecord, Short> SUBSTANCE_ID = createField(DSL.name("substance_id"), SQLDataType.SMALLINT.nullable(false), this, "");

    /**
     * The column
     * <code>template.shipping_inland_category_emission_factors.emission_factor</code>.
     */
    public final TableField<ShippingInlandCategoryEmissionFactorsRecord, Float> EMISSION_FACTOR = createField(DSL.name("emission_factor"), nl.aerius.emissionservice.db.generated.public_.Domains.POSREAL.getDataType().nullable(false), this, "");

    private ShippingInlandCategoryEmissionFactors(Name alias, Table<ShippingInlandCategoryEmissionFactorsRecord> aliased) {
        this(alias, aliased, null);
    }

    private ShippingInlandCategoryEmissionFactors(Name alias, Table<ShippingInlandCategoryEmissionFactorsRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment("De emissie factoren voor de verschillende soorten varende schepen.\r\nDeze factoren zijn uniek per scheepstype, vaarwegtype, vaarrichtingen, ladingstoestand en stof.\r\n\r\nHierin worden de emissiefactoren per jaar weergegeven, emission_factor is de emissie factor tijdens varen (in g/(kilometer * aantal schepen)) bij een bepaalde snelheid.\r\n\r\n@file source/database/src/main/sql/template/02-emission_factors/02-tables/shipping_inland.sql"), TableOptions.table());
    }

    /**
     * Create an aliased
     * <code>template.shipping_inland_category_emission_factors</code> table
     * reference
     */
    public ShippingInlandCategoryEmissionFactors(String alias) {
        this(DSL.name(alias), SHIPPING_INLAND_CATEGORY_EMISSION_FACTORS);
    }

    /**
     * Create an aliased
     * <code>template.shipping_inland_category_emission_factors</code> table
     * reference
     */
    public ShippingInlandCategoryEmissionFactors(Name alias) {
        this(alias, SHIPPING_INLAND_CATEGORY_EMISSION_FACTORS);
    }

    /**
     * Create a <code>template.shipping_inland_category_emission_factors</code>
     * table reference
     */
    public ShippingInlandCategoryEmissionFactors() {
        this(DSL.name("shipping_inland_category_emission_factors"), null);
    }

    public <O extends Record> ShippingInlandCategoryEmissionFactors(Table<O> child, ForeignKey<O, ShippingInlandCategoryEmissionFactorsRecord> key) {
        super(child, key, SHIPPING_INLAND_CATEGORY_EMISSION_FACTORS);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : Template.TEMPLATE;
    }

    @Override
    public UniqueKey<ShippingInlandCategoryEmissionFactorsRecord> getPrimaryKey() {
        return Keys.SHIPPING_INLAND_CATEGORY_EMISSION_FACTORS_PKEY;
    }

    @Override
    public List<ForeignKey<ShippingInlandCategoryEmissionFactorsRecord, ?>> getReferences() {
        return Arrays.asList(Keys.SHIPPING_INLAND_CATEGORY_EMISSION_FACTORS__SHIPPING_INLAND_CATEGORY_EMISSION_FACTORS_FKEY_CATEGORIES, Keys.SHIPPING_INLAND_CATEGORY_EMISSION_FACTORS__SHIPPING_INLAND_CATEGORY_EMISSION_FACTORS_FKEY_WATERWAY_CATEGOR, Keys.SHIPPING_INLAND_CATEGORY_EMISSION_FACTORS__SHIPPING_INLAND_CATEGORY_EMISSION_FACTORS_FKEY_SUBSTANCES);
    }

    private transient ShippingInlandCategories _shippingInlandCategories;
    private transient ShippingInlandWaterwayCategories _shippingInlandWaterwayCategories;
    private transient Substances _substances;

    /**
     * Get the implicit join path to the
     * <code>template.shipping_inland_categories</code> table.
     */
    public ShippingInlandCategories shippingInlandCategories() {
        if (_shippingInlandCategories == null)
            _shippingInlandCategories = new ShippingInlandCategories(this, Keys.SHIPPING_INLAND_CATEGORY_EMISSION_FACTORS__SHIPPING_INLAND_CATEGORY_EMISSION_FACTORS_FKEY_CATEGORIES);

        return _shippingInlandCategories;
    }

    /**
     * Get the implicit join path to the
     * <code>template.shipping_inland_waterway_categories</code> table.
     */
    public ShippingInlandWaterwayCategories shippingInlandWaterwayCategories() {
        if (_shippingInlandWaterwayCategories == null)
            _shippingInlandWaterwayCategories = new ShippingInlandWaterwayCategories(this, Keys.SHIPPING_INLAND_CATEGORY_EMISSION_FACTORS__SHIPPING_INLAND_CATEGORY_EMISSION_FACTORS_FKEY_WATERWAY_CATEGOR);

        return _shippingInlandWaterwayCategories;
    }

    /**
     * Get the implicit join path to the <code>public.substances</code> table.
     */
    public Substances substances() {
        if (_substances == null)
            _substances = new Substances(this, Keys.SHIPPING_INLAND_CATEGORY_EMISSION_FACTORS__SHIPPING_INLAND_CATEGORY_EMISSION_FACTORS_FKEY_SUBSTANCES);

        return _substances;
    }

    @Override
    public ShippingInlandCategoryEmissionFactors as(String alias) {
        return new ShippingInlandCategoryEmissionFactors(DSL.name(alias), this);
    }

    @Override
    public ShippingInlandCategoryEmissionFactors as(Name alias) {
        return new ShippingInlandCategoryEmissionFactors(alias, this);
    }

    @Override
    public ShippingInlandCategoryEmissionFactors as(Table<?> alias) {
        return new ShippingInlandCategoryEmissionFactors(alias.getQualifiedName(), this);
    }

    /**
     * Rename this table
     */
    @Override
    public ShippingInlandCategoryEmissionFactors rename(String name) {
        return new ShippingInlandCategoryEmissionFactors(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public ShippingInlandCategoryEmissionFactors rename(Name name) {
        return new ShippingInlandCategoryEmissionFactors(name, null);
    }

    /**
     * Rename this table
     */
    @Override
    public ShippingInlandCategoryEmissionFactors rename(Table<?> name) {
        return new ShippingInlandCategoryEmissionFactors(name.getQualifiedName(), null);
    }

    // -------------------------------------------------------------------------
    // Row7 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row7<Short, Integer, ShippingInlandShipDirectionType, ShippingInlandLadenState, Short, Short, Float> fieldsRow() {
        return (Row7) super.fieldsRow();
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Function)}.
     */
    public <U> SelectField<U> mapping(Function7<? super Short, ? super Integer, ? super ShippingInlandShipDirectionType, ? super ShippingInlandLadenState, ? super Short, ? super Short, ? super Float, ? extends U> from) {
        return convertFrom(Records.mapping(from));
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Class,
     * Function)}.
     */
    public <U> SelectField<U> mapping(Class<U> toType, Function7<? super Short, ? super Integer, ? super ShippingInlandShipDirectionType, ? super ShippingInlandLadenState, ? super Short, ? super Short, ? super Float, ? extends U> from) {
        return convertFrom(toType, Records.mapping(from));
    }
}
