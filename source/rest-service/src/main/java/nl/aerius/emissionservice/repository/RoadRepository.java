/*
 * Copyright the State of the Netherlands
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Affero General Public License for more details.
 *
 * You should have received a copy of the GNU Affero General Public License
 * along with this program.  If not, see http://www.gnu.org/licenses/.
 */
package nl.aerius.emissionservice.repository;

import static nl.aerius.emissionservice.db.generated.public_.tables.Substances.SUBSTANCES;
import static nl.aerius.emissionservice.db.generated.template.tables.I18nRoadAreaCategories.I18N_ROAD_AREA_CATEGORIES;
import static nl.aerius.emissionservice.db.generated.template.tables.I18nRoadTypeCategories.I18N_ROAD_TYPE_CATEGORIES;
import static nl.aerius.emissionservice.db.generated.template.tables.I18nRoadVehicleCategories.I18N_ROAD_VEHICLE_CATEGORIES;
import static nl.aerius.emissionservice.db.generated.template.tables.RoadAreaCategories.ROAD_AREA_CATEGORIES;
import static nl.aerius.emissionservice.db.generated.template.tables.RoadCategoriesView.ROAD_CATEGORIES_VIEW;
import static nl.aerius.emissionservice.db.generated.template.tables.RoadTypeCategories.ROAD_TYPE_CATEGORIES;
import static nl.aerius.emissionservice.db.generated.template.tables.RoadVehicleCategories.ROAD_VEHICLE_CATEGORIES;
import static org.jooq.impl.DSL.coalesce;
import static org.jooq.impl.DSL.field;
import static org.jooq.impl.DSL.select;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Optional;

import org.jooq.Field;
import org.springframework.stereotype.Repository;

import nl.aerius.emissionservice.db.generated.i18n.enums.LanguageCodeType;
import nl.aerius.emissionservice.db.generated.public_.enums.SpeedLimitEnforcementType;
import nl.aerius.emissionservice.model.Category;
import nl.aerius.emissionservice.model.RoadEmissionFactor;
import nl.aerius.emissionservice.model.RoadEmissionFactors;

@Repository
public class RoadRepository {

  private record RoadEmissionFactorKey(String area, String roadType, String vehicleType, int year,
      Boolean strictEnforcement, Integer maximumSpeed, Integer gradient) {
  };

  private static final Field<String> DESCRIPTION = field("description", String.class);
  private static final Field<String> I18N_DESCRIPTION = field("i18n_description", String.class);
  private static final Field<String> SUBSTANCE = field("substance", String.class);

  private final DatasetStore datasetStore;

  public RoadRepository(final DatasetStore datasetStore) {
    this.datasetStore = datasetStore;
  }

  public List<Category> getRoadAreas(final Locale locale) {
    final LanguageCodeType language = DbUtil.getLanguageCodeType(locale);
    return datasetStore.dsl().select(
        ROAD_AREA_CATEGORIES.CODE,
        ROAD_AREA_CATEGORIES.NAME,
        coalesce(I18N_DESCRIPTION, ROAD_AREA_CATEGORIES.NAME).as(DESCRIPTION))
        .from(ROAD_AREA_CATEGORIES)
        .leftJoin(
            select(I18N_ROAD_AREA_CATEGORIES.ROAD_AREA_CATEGORY_ID, I18N_ROAD_AREA_CATEGORIES.DESCRIPTION.as(I18N_DESCRIPTION))
                .from(I18N_ROAD_AREA_CATEGORIES)
                .where(I18N_ROAD_AREA_CATEGORIES.LANGUAGE_CODE.eq(language)))
        .using(ROAD_AREA_CATEGORIES.ROAD_AREA_CATEGORY_ID)
        .orderBy(ROAD_AREA_CATEGORIES.CODE)
        .fetchInto(Category.class);
  }

  public List<Category> getRoadTypes(final Locale locale) {
    final LanguageCodeType language = DbUtil.getLanguageCodeType(locale);
    return datasetStore.dsl().select(
        ROAD_TYPE_CATEGORIES.CODE,
        ROAD_TYPE_CATEGORIES.NAME,
        coalesce(I18N_DESCRIPTION, ROAD_TYPE_CATEGORIES.NAME).as(DESCRIPTION))
        .from(ROAD_TYPE_CATEGORIES)
        .leftJoin(
            select(I18N_ROAD_TYPE_CATEGORIES.ROAD_TYPE_CATEGORY_ID, I18N_ROAD_TYPE_CATEGORIES.DESCRIPTION.as(I18N_DESCRIPTION))
                .from(I18N_ROAD_TYPE_CATEGORIES)
                .where(I18N_ROAD_TYPE_CATEGORIES.LANGUAGE_CODE.eq(language)))
        .using(ROAD_TYPE_CATEGORIES.ROAD_TYPE_CATEGORY_ID)
        .orderBy(ROAD_TYPE_CATEGORIES.CODE)
        .fetchInto(Category.class);
  }

  public List<Category> getVehicleTypes(final Locale locale) {
    final LanguageCodeType language = DbUtil.getLanguageCodeType(locale);
    return datasetStore.dsl().select(
        ROAD_VEHICLE_CATEGORIES.CODE,
        ROAD_VEHICLE_CATEGORIES.NAME,
        coalesce(I18N_DESCRIPTION, ROAD_VEHICLE_CATEGORIES.NAME).as(DESCRIPTION))
        .from(ROAD_VEHICLE_CATEGORIES)
        .leftJoin(
            select(I18N_ROAD_VEHICLE_CATEGORIES.ROAD_VEHICLE_CATEGORY_ID, I18N_ROAD_VEHICLE_CATEGORIES.DESCRIPTION.as(I18N_DESCRIPTION))
                .from(I18N_ROAD_VEHICLE_CATEGORIES)
                .where(I18N_ROAD_VEHICLE_CATEGORIES.LANGUAGE_CODE.eq(language)))
        .using(ROAD_VEHICLE_CATEGORIES.ROAD_VEHICLE_CATEGORY_ID)
        .orderBy(ROAD_VEHICLE_CATEGORIES.CODE)
        .fetchInto(Category.class);
  }

  public Optional<List<RoadEmissionFactors>> getEmissionFactors(final String roadArea, final String roadType,
      final String vehicleType, final Integer year) {
    final Map<RoadEmissionFactorKey, RoadEmissionFactors> roadEmissionFactorsMap = new LinkedHashMap<>();
    datasetStore.dsl().select(
        ROAD_CATEGORIES_VIEW.ROAD_AREA_CODE,
        ROAD_CATEGORIES_VIEW.ROAD_TYPE_CODE,
        ROAD_CATEGORIES_VIEW.ROAD_VEHICLE_CODE,
        ROAD_CATEGORIES_VIEW.YEAR,
        ROAD_CATEGORIES_VIEW.SPEED_LIMIT_ENFORCEMENT,
        ROAD_CATEGORIES_VIEW.MAXIMUM_SPEED,
        ROAD_CATEGORIES_VIEW.GRADIENT,
        SUBSTANCES.NAME.as(SUBSTANCE),
        ROAD_CATEGORIES_VIEW.EMISSION_FACTOR,
        ROAD_CATEGORIES_VIEW.STAGNATED_EMISSION_FACTOR)
        .from(ROAD_CATEGORIES_VIEW)
        .join(SUBSTANCES).using(SUBSTANCES.SUBSTANCE_ID)
        .where(ROAD_CATEGORIES_VIEW.ROAD_AREA_CODE.eq(roadArea))
        .and(ROAD_CATEGORIES_VIEW.ROAD_TYPE_CODE.eq(roadType))
        .and(ROAD_CATEGORIES_VIEW.ROAD_VEHICLE_CODE.eq(vehicleType))
        .and(ROAD_CATEGORIES_VIEW.YEAR.eq(year.shortValue()))
        .fetch((row) -> aggregate(row, roadEmissionFactorsMap));
    return roadEmissionFactorsMap.isEmpty() ? Optional.empty() : Optional.of(new ArrayList<>(roadEmissionFactorsMap.values()));
  }

  private static RoadEmissionFactors aggregate(final org.jooq.Record row,
      final Map<RoadEmissionFactorKey, RoadEmissionFactors> roadEmissionFactorsMap) {
    final RoadEmissionFactorKey key = new RoadEmissionFactorKey(
        row.get(ROAD_CATEGORIES_VIEW.ROAD_AREA_CODE),
        row.get(ROAD_CATEGORIES_VIEW.ROAD_TYPE_CODE),
        row.get(ROAD_CATEGORIES_VIEW.ROAD_VEHICLE_CODE),
        row.get(ROAD_CATEGORIES_VIEW.YEAR),
        strictEnforcement(row.get(ROAD_CATEGORIES_VIEW.SPEED_LIMIT_ENFORCEMENT)),
        row.get(ROAD_CATEGORIES_VIEW.MAXIMUM_SPEED),
        row.get(ROAD_CATEGORIES_VIEW.GRADIENT));
    final double stagnatedFactor = row.get(ROAD_CATEGORIES_VIEW.STAGNATED_EMISSION_FACTOR);
    final RoadEmissionFactor factor = new RoadEmissionFactor(row.get(SUBSTANCE), BigDecimal.valueOf(row.get(ROAD_CATEGORIES_VIEW.EMISSION_FACTOR)));
    if (stagnatedFactor > 0) {
      factor.stagnatedFactor(BigDecimal.valueOf(stagnatedFactor));
    }
    final RoadEmissionFactors factors = roadEmissionFactorsMap.computeIfAbsent(key,
        newKey -> new RoadEmissionFactors(newKey.area, newKey.roadType, newKey.vehicleType, newKey.year)
            .strictEnforcement(newKey.strictEnforcement)
            .speed(newKey.maximumSpeed)
            .gradient(newKey.gradient));
    factors.addEmissionFactorsItem(factor);
    return factors;
  }

  private static Boolean strictEnforcement(final SpeedLimitEnforcementType dbType) {
    if (dbType == null) {
      return null;
    }
    return dbType.equals(SpeedLimitEnforcementType.strict);
  }

}
