/*
 * This file is generated by jOOQ.
 */
package nl.aerius.emissionservice.db.generated.template.tables;


import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

import nl.aerius.emissionservice.db.generated.public_.enums.ShippingMovementType;
import nl.aerius.emissionservice.db.generated.template.Keys;
import nl.aerius.emissionservice.db.generated.template.Template;
import nl.aerius.emissionservice.db.generated.template.tables.records.ShippingMaritimeCategorySourceCharacteristicsRecord;

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
 * Table containing the OPS characteristics per maritime shipping category.
 * 
 * These characteristics all depend on the type of the ship and the type of
 * movement.
 * 
 * @file
 * source/database/src/main/sql/template/02-emission_factors/02-tables/shipping_maritime.sql
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class ShippingMaritimeCategorySourceCharacteristics extends TableImpl<ShippingMaritimeCategorySourceCharacteristicsRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of
     * <code>template.shipping_maritime_category_source_characteristics</code>
     */
    public static final ShippingMaritimeCategorySourceCharacteristics SHIPPING_MARITIME_CATEGORY_SOURCE_CHARACTERISTICS = new ShippingMaritimeCategorySourceCharacteristics();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<ShippingMaritimeCategorySourceCharacteristicsRecord> getRecordType() {
        return ShippingMaritimeCategorySourceCharacteristicsRecord.class;
    }

    /**
     * The column
     * <code>template.shipping_maritime_category_source_characteristics.shipping_maritime_category_id</code>.
     */
    public final TableField<ShippingMaritimeCategorySourceCharacteristicsRecord, Short> SHIPPING_MARITIME_CATEGORY_ID = createField(DSL.name("shipping_maritime_category_id"), SQLDataType.SMALLINT.nullable(false), this, "");

    /**
     * The column
     * <code>template.shipping_maritime_category_source_characteristics.year</code>.
     */
    public final TableField<ShippingMaritimeCategorySourceCharacteristicsRecord, Short> YEAR = createField(DSL.name("year"), nl.aerius.emissionservice.db.generated.public_.Domains.YEAR_TYPE.getDataType().nullable(false), this, "");

    /**
     * The column
     * <code>template.shipping_maritime_category_source_characteristics.movement_type</code>.
     */
    public final TableField<ShippingMaritimeCategorySourceCharacteristicsRecord, ShippingMovementType> MOVEMENT_TYPE = createField(DSL.name("movement_type"), SQLDataType.VARCHAR.nullable(false).asEnumDataType(nl.aerius.emissionservice.db.generated.public_.enums.ShippingMovementType.class), this, "");

    /**
     * The column
     * <code>template.shipping_maritime_category_source_characteristics.gcn_sector_id</code>.
     */
    public final TableField<ShippingMaritimeCategorySourceCharacteristicsRecord, Integer> GCN_SECTOR_ID = createField(DSL.name("gcn_sector_id"), SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column
     * <code>template.shipping_maritime_category_source_characteristics.heat_content</code>.
     */
    public final TableField<ShippingMaritimeCategorySourceCharacteristicsRecord, Float> HEAT_CONTENT = createField(DSL.name("heat_content"), nl.aerius.emissionservice.db.generated.public_.Domains.POSREAL.getDataType().nullable(false), this, "");

    /**
     * The column
     * <code>template.shipping_maritime_category_source_characteristics.height</code>.
     */
    public final TableField<ShippingMaritimeCategorySourceCharacteristicsRecord, Float> HEIGHT = createField(DSL.name("height"), nl.aerius.emissionservice.db.generated.public_.Domains.POSREAL.getDataType().nullable(false), this, "");

    /**
     * The column
     * <code>template.shipping_maritime_category_source_characteristics.spread</code>.
     */
    public final TableField<ShippingMaritimeCategorySourceCharacteristicsRecord, Float> SPREAD = createField(DSL.name("spread"), nl.aerius.emissionservice.db.generated.public_.Domains.POSREAL.getDataType().nullable(false), this, "");

    private ShippingMaritimeCategorySourceCharacteristics(Name alias, Table<ShippingMaritimeCategorySourceCharacteristicsRecord> aliased) {
        this(alias, aliased, null);
    }

    private ShippingMaritimeCategorySourceCharacteristics(Name alias, Table<ShippingMaritimeCategorySourceCharacteristicsRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment("Table containing the OPS characteristics per maritime shipping category.\r\n\r\nThese characteristics all depend on the type of the ship and the type of movement.\r\n\r\n@file source/database/src/main/sql/template/02-emission_factors/02-tables/shipping_maritime.sql"), TableOptions.table());
    }

    /**
     * Create an aliased
     * <code>template.shipping_maritime_category_source_characteristics</code>
     * table reference
     */
    public ShippingMaritimeCategorySourceCharacteristics(String alias) {
        this(DSL.name(alias), SHIPPING_MARITIME_CATEGORY_SOURCE_CHARACTERISTICS);
    }

    /**
     * Create an aliased
     * <code>template.shipping_maritime_category_source_characteristics</code>
     * table reference
     */
    public ShippingMaritimeCategorySourceCharacteristics(Name alias) {
        this(alias, SHIPPING_MARITIME_CATEGORY_SOURCE_CHARACTERISTICS);
    }

    /**
     * Create a
     * <code>template.shipping_maritime_category_source_characteristics</code>
     * table reference
     */
    public ShippingMaritimeCategorySourceCharacteristics() {
        this(DSL.name("shipping_maritime_category_source_characteristics"), null);
    }

    public <O extends Record> ShippingMaritimeCategorySourceCharacteristics(Table<O> child, ForeignKey<O, ShippingMaritimeCategorySourceCharacteristicsRecord> key) {
        super(child, key, SHIPPING_MARITIME_CATEGORY_SOURCE_CHARACTERISTICS);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : Template.TEMPLATE;
    }

    @Override
    public UniqueKey<ShippingMaritimeCategorySourceCharacteristicsRecord> getPrimaryKey() {
        return Keys.SHIPPING_MARITIME_CATEGORY_SOURCE_CHAR_PKEY;
    }

    @Override
    public List<ForeignKey<ShippingMaritimeCategorySourceCharacteristicsRecord, ?>> getReferences() {
        return Arrays.asList(Keys.SHIPPING_MARITIME_CATEGORY_SOURCE_CHARACTERISTICS__SHIPPING_MARITIME_CATEGORY_SOURCE_CHAR_FKEY_CATEGORIES, Keys.SHIPPING_MARITIME_CATEGORY_SOURCE_CHARACTERISTICS__SHIPPING_MARITIME_CATEGORY_SOURCE_CHAR_FKEY_GCN_SECTORS);
    }

    private transient ShippingMaritimeCategories _shippingMaritimeCategories;
    private transient GcnSectors _gcnSectors;

    /**
     * Get the implicit join path to the
     * <code>template.shipping_maritime_categories</code> table.
     */
    public ShippingMaritimeCategories shippingMaritimeCategories() {
        if (_shippingMaritimeCategories == null)
            _shippingMaritimeCategories = new ShippingMaritimeCategories(this, Keys.SHIPPING_MARITIME_CATEGORY_SOURCE_CHARACTERISTICS__SHIPPING_MARITIME_CATEGORY_SOURCE_CHAR_FKEY_CATEGORIES);

        return _shippingMaritimeCategories;
    }

    /**
     * Get the implicit join path to the <code>template.gcn_sectors</code>
     * table.
     */
    public GcnSectors gcnSectors() {
        if (_gcnSectors == null)
            _gcnSectors = new GcnSectors(this, Keys.SHIPPING_MARITIME_CATEGORY_SOURCE_CHARACTERISTICS__SHIPPING_MARITIME_CATEGORY_SOURCE_CHAR_FKEY_GCN_SECTORS);

        return _gcnSectors;
    }

    @Override
    public ShippingMaritimeCategorySourceCharacteristics as(String alias) {
        return new ShippingMaritimeCategorySourceCharacteristics(DSL.name(alias), this);
    }

    @Override
    public ShippingMaritimeCategorySourceCharacteristics as(Name alias) {
        return new ShippingMaritimeCategorySourceCharacteristics(alias, this);
    }

    @Override
    public ShippingMaritimeCategorySourceCharacteristics as(Table<?> alias) {
        return new ShippingMaritimeCategorySourceCharacteristics(alias.getQualifiedName(), this);
    }

    /**
     * Rename this table
     */
    @Override
    public ShippingMaritimeCategorySourceCharacteristics rename(String name) {
        return new ShippingMaritimeCategorySourceCharacteristics(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public ShippingMaritimeCategorySourceCharacteristics rename(Name name) {
        return new ShippingMaritimeCategorySourceCharacteristics(name, null);
    }

    /**
     * Rename this table
     */
    @Override
    public ShippingMaritimeCategorySourceCharacteristics rename(Table<?> name) {
        return new ShippingMaritimeCategorySourceCharacteristics(name.getQualifiedName(), null);
    }

    // -------------------------------------------------------------------------
    // Row7 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row7<Short, Short, ShippingMovementType, Integer, Float, Float, Float> fieldsRow() {
        return (Row7) super.fieldsRow();
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Function)}.
     */
    public <U> SelectField<U> mapping(Function7<? super Short, ? super Short, ? super ShippingMovementType, ? super Integer, ? super Float, ? super Float, ? super Float, ? extends U> from) {
        return convertFrom(Records.mapping(from));
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Class,
     * Function)}.
     */
    public <U> SelectField<U> mapping(Class<U> toType, Function7<? super Short, ? super Short, ? super ShippingMovementType, ? super Integer, ? super Float, ? super Float, ? super Float, ? extends U> from) {
        return convertFrom(toType, Records.mapping(from));
    }
}
