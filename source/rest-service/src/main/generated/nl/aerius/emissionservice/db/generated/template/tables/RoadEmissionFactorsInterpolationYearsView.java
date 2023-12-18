/*
 * This file is generated by jOOQ.
 */
package nl.aerius.emissionservice.db.generated.template.tables;


import java.util.function.Function;

import nl.aerius.emissionservice.db.generated.template.Template;
import nl.aerius.emissionservice.db.generated.template.tables.records.RoadEmissionFactorsInterpolationYearsViewRecord;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Function6;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Records;
import org.jooq.Row6;
import org.jooq.Schema;
import org.jooq.SelectField;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.TableOptions;
import org.jooq.impl.DSL;
import org.jooq.impl.SQLDataType;
import org.jooq.impl.TableImpl;


/**
 * Deze view retourneert voor alle jaren het begin- en eind-jaar welke gebruikt
 * kunnen worden voor het interpoleren van de wegemissiefactoren.
 * De begin- en eind-jaren worden geselecteerd uit de
 * road_category_emission_factors tabel. De begin- en eind-jaren worden voor
 * iedere key uit die tabel opnieuw bepaald en teruggegeven.
 * 
 * @file
 * source/database/src/main/sql/template/02-emission_factors/04-views/roads.sql
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class RoadEmissionFactorsInterpolationYearsView extends TableImpl<RoadEmissionFactorsInterpolationYearsViewRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of
     * <code>template.road_emission_factors_interpolation_years_view</code>
     */
    public static final RoadEmissionFactorsInterpolationYearsView ROAD_EMISSION_FACTORS_INTERPOLATION_YEARS_VIEW = new RoadEmissionFactorsInterpolationYearsView();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<RoadEmissionFactorsInterpolationYearsViewRecord> getRecordType() {
        return RoadEmissionFactorsInterpolationYearsViewRecord.class;
    }

    /**
     * The column
     * <code>template.road_emission_factors_interpolation_years_view.road_category_id</code>.
     */
    public final TableField<RoadEmissionFactorsInterpolationYearsViewRecord, Integer> ROAD_CATEGORY_ID = createField(DSL.name("road_category_id"), SQLDataType.INTEGER, this, "");

    /**
     * The column
     * <code>template.road_emission_factors_interpolation_years_view.road_speed_profile_id</code>.
     */
    public final TableField<RoadEmissionFactorsInterpolationYearsViewRecord, Integer> ROAD_SPEED_PROFILE_ID = createField(DSL.name("road_speed_profile_id"), SQLDataType.INTEGER, this, "");

    /**
     * The column
     * <code>template.road_emission_factors_interpolation_years_view.substance_id</code>.
     */
    public final TableField<RoadEmissionFactorsInterpolationYearsViewRecord, Short> SUBSTANCE_ID = createField(DSL.name("substance_id"), SQLDataType.SMALLINT, this, "");

    /**
     * The column
     * <code>template.road_emission_factors_interpolation_years_view.year</code>.
     */
    public final TableField<RoadEmissionFactorsInterpolationYearsViewRecord, Short> YEAR = createField(DSL.name("year"), nl.aerius.emissionservice.db.generated.public_.Domains.YEAR_TYPE.getDataType(), this, "");

    /**
     * The column
     * <code>template.road_emission_factors_interpolation_years_view.begin_year</code>.
     */
    public final TableField<RoadEmissionFactorsInterpolationYearsViewRecord, Short> BEGIN_YEAR = createField(DSL.name("begin_year"), SQLDataType.SMALLINT, this, "");

    /**
     * The column
     * <code>template.road_emission_factors_interpolation_years_view.end_year</code>.
     */
    public final TableField<RoadEmissionFactorsInterpolationYearsViewRecord, Short> END_YEAR = createField(DSL.name("end_year"), SQLDataType.SMALLINT, this, "");

    private RoadEmissionFactorsInterpolationYearsView(Name alias, Table<RoadEmissionFactorsInterpolationYearsViewRecord> aliased) {
        this(alias, aliased, null);
    }

    private RoadEmissionFactorsInterpolationYearsView(Name alias, Table<RoadEmissionFactorsInterpolationYearsViewRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment("Deze view retourneert voor alle jaren het begin- en eind-jaar welke gebruikt kunnen worden voor het interpoleren van de wegemissiefactoren.\r\nDe begin- en eind-jaren worden geselecteerd uit de road_category_emission_factors tabel. De begin- en eind-jaren worden voor iedere key uit die tabel opnieuw bepaald en teruggegeven.\r\n\r\n@file source/database/src/main/sql/template/02-emission_factors/04-views/roads.sql"), TableOptions.view("""
        create view "road_emission_factors_interpolation_years_view" as  SELECT all_years.road_category_id,
          all_years.road_speed_profile_id,
          all_years.substance_id,
          all_years.year,
          max((begin_years.year)::smallint) AS begin_year,
          min((end_years.year)::smallint) AS end_year
         FROM ((( SELECT min_years.road_category_id,
                  min_years.road_speed_profile_id,
                  min_years.substance_id,
                  (generate_series(min_years.min_year, max_years.max_year))::year_type AS year
                 FROM (( SELECT road_category_emission_factors.road_category_id,
                          road_category_emission_factors.road_speed_profile_id,
                          road_category_emission_factors.substance_id,
                          (min((road_category_emission_factors.year)::smallint))::integer AS min_year
                         FROM template.road_category_emission_factors
                        GROUP BY road_category_emission_factors.road_category_id, road_category_emission_factors.road_speed_profile_id, road_category_emission_factors.substance_id) min_years
                   JOIN ( SELECT road_category_emission_factors.road_category_id,
                          road_category_emission_factors.road_speed_profile_id,
                          road_category_emission_factors.substance_id,
                          (max((road_category_emission_factors.year)::smallint))::integer AS max_year
                         FROM template.road_category_emission_factors
                        GROUP BY road_category_emission_factors.road_category_id, road_category_emission_factors.road_speed_profile_id, road_category_emission_factors.substance_id) max_years USING (road_category_id, road_speed_profile_id, substance_id))) all_years
           JOIN ( SELECT road_category_emission_factors.road_category_id,
                  road_category_emission_factors.road_speed_profile_id,
                  road_category_emission_factors.substance_id,
                  road_category_emission_factors.year
                 FROM template.road_category_emission_factors) begin_years USING (road_category_id, road_speed_profile_id, substance_id))
           JOIN ( SELECT road_category_emission_factors.road_category_id,
                  road_category_emission_factors.road_speed_profile_id,
                  road_category_emission_factors.substance_id,
                  road_category_emission_factors.year
                 FROM template.road_category_emission_factors) end_years USING (road_category_id, road_speed_profile_id, substance_id))
        WHERE (((begin_years.year)::smallint <= (all_years.year)::smallint) AND ((end_years.year)::smallint >= (all_years.year)::smallint))
        GROUP BY all_years.road_category_id, all_years.road_speed_profile_id, all_years.substance_id, all_years.year
        ORDER BY all_years.road_category_id, all_years.road_speed_profile_id, all_years.substance_id, all_years.year;
        """));
    }

    /**
     * Create an aliased
     * <code>template.road_emission_factors_interpolation_years_view</code>
     * table reference
     */
    public RoadEmissionFactorsInterpolationYearsView(String alias) {
        this(DSL.name(alias), ROAD_EMISSION_FACTORS_INTERPOLATION_YEARS_VIEW);
    }

    /**
     * Create an aliased
     * <code>template.road_emission_factors_interpolation_years_view</code>
     * table reference
     */
    public RoadEmissionFactorsInterpolationYearsView(Name alias) {
        this(alias, ROAD_EMISSION_FACTORS_INTERPOLATION_YEARS_VIEW);
    }

    /**
     * Create a
     * <code>template.road_emission_factors_interpolation_years_view</code>
     * table reference
     */
    public RoadEmissionFactorsInterpolationYearsView() {
        this(DSL.name("road_emission_factors_interpolation_years_view"), null);
    }

    public <O extends Record> RoadEmissionFactorsInterpolationYearsView(Table<O> child, ForeignKey<O, RoadEmissionFactorsInterpolationYearsViewRecord> key) {
        super(child, key, ROAD_EMISSION_FACTORS_INTERPOLATION_YEARS_VIEW);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : Template.TEMPLATE;
    }

    @Override
    public RoadEmissionFactorsInterpolationYearsView as(String alias) {
        return new RoadEmissionFactorsInterpolationYearsView(DSL.name(alias), this);
    }

    @Override
    public RoadEmissionFactorsInterpolationYearsView as(Name alias) {
        return new RoadEmissionFactorsInterpolationYearsView(alias, this);
    }

    @Override
    public RoadEmissionFactorsInterpolationYearsView as(Table<?> alias) {
        return new RoadEmissionFactorsInterpolationYearsView(alias.getQualifiedName(), this);
    }

    /**
     * Rename this table
     */
    @Override
    public RoadEmissionFactorsInterpolationYearsView rename(String name) {
        return new RoadEmissionFactorsInterpolationYearsView(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public RoadEmissionFactorsInterpolationYearsView rename(Name name) {
        return new RoadEmissionFactorsInterpolationYearsView(name, null);
    }

    /**
     * Rename this table
     */
    @Override
    public RoadEmissionFactorsInterpolationYearsView rename(Table<?> name) {
        return new RoadEmissionFactorsInterpolationYearsView(name.getQualifiedName(), null);
    }

    // -------------------------------------------------------------------------
    // Row6 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row6<Integer, Integer, Short, Short, Short, Short> fieldsRow() {
        return (Row6) super.fieldsRow();
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Function)}.
     */
    public <U> SelectField<U> mapping(Function6<? super Integer, ? super Integer, ? super Short, ? super Short, ? super Short, ? super Short, ? extends U> from) {
        return convertFrom(Records.mapping(from));
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Class,
     * Function)}.
     */
    public <U> SelectField<U> mapping(Class<U> toType, Function6<? super Integer, ? super Integer, ? super Short, ? super Short, ? super Short, ? super Short, ? extends U> from) {
        return convertFrom(toType, Records.mapping(from));
    }
}
