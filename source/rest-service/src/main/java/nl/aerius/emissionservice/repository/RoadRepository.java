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
package nl.overheid.aerius.emissionservice.repository;

import static nl.overheid.aerius.emissionservice.jooq.public_.tables.Substances.SUBSTANCES;
import static nl.overheid.aerius.emissionservice.jooq.template.tables.RoadCategories.ROAD_CATEGORIES;
import static nl.overheid.aerius.emissionservice.jooq.template.tables.RoadCategoriesView.ROAD_CATEGORIES_VIEW;
import static nl.overheid.aerius.emissionservice.jooq.template.tables.RoadSpeedProfiles.ROAD_SPEED_PROFILES;
import static org.jooq.impl.DSL.boolOr;
import static org.jooq.impl.DSL.field;
import static org.jooq.impl.DSL.trueCondition;

import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.jooq.Field;
import org.jooq.Record;
import org.jooq.Result;
import org.springframework.stereotype.Repository;

import nl.overheid.aerius.emissionservice.jooq.public_.enums.RoadType;
import nl.overheid.aerius.emissionservice.jooq.public_.enums.SpeedLimitEnforcementType;
import nl.overheid.aerius.emissionservice.jooq.public_.enums.VehicleType;
import nl.overheid.aerius.emissionservice.model.RoadEmissionFactor;
import nl.overheid.aerius.emissionservice.model.RoadSpeedProfileCategory;
import nl.overheid.aerius.emissionservice.model.RoadSpeedProfileCategory.SpeedLimitEnforcementEnum;

@Repository
public class RoadRepository {

  private static final Field<Boolean> HAS_SRM_DISTINCTION = field("has_srm_distinction", Boolean.class);

  private static final Field<String> SUBSTANCE = field("substance", String.class);
  private static final Field<Double> FACTOR = field("factor", Double.class);
  private static final Field<Double> STAGNATED_FACTOR = field("stagnated_factor", Double.class);

  private final DatasetStore datasetStore;

  public RoadRepository(final DatasetStore datasetStore) {
    this.datasetStore = datasetStore;
  }

  public List<String> getVehicleTypes() {
    return datasetStore.dsl().selectDistinct(
        ROAD_CATEGORIES.VEHICLE_TYPE)
        .from(ROAD_CATEGORIES)
        .orderBy(ROAD_CATEGORIES.VEHICLE_TYPE)
        .fetchInto(String.class);
  }

  public List<String> getRoadTypes() {
    return datasetStore.dsl().selectDistinct(
        ROAD_SPEED_PROFILES.ROAD_TYPE)
        .from(ROAD_SPEED_PROFILES)
        .orderBy(ROAD_SPEED_PROFILES.ROAD_TYPE)
        .fetchInto(String.class);
  }

  public List<RoadSpeedProfileCategory> getRoadSpeedProfiles(final Locale locale, final Optional<String> roadType,
      final Optional<String> speedLimitEnforcement, final Optional<Boolean> srm2, final Optional<Boolean> srm1,
      final Optional<Integer> maximumSpeed) {
    // Separate select to determine which road types have a distinction for SRM1 and SRM2 in profiles.
    final Map<RoadType, Boolean> srmDistinction = getSRMDistinctionPerRoadType();

    Stream<RoadSpeedProfileCategory> categoriesStream = getRoadSpeedProfileCategories(srmDistinction, roadType, speedLimitEnforcement);
    if (srm2.isPresent()) {
      categoriesStream = categoriesStream.filter(category -> category.getUsableForSrm2() == srm2.get());
    }
    if (srm1.isPresent()) {
      categoriesStream = categoriesStream.filter(category -> category.getUsableForSrm1() == srm1.get());
    }
    List<RoadSpeedProfileCategory> results = categoriesStream.collect(Collectors.toList());
    if (maximumSpeed.isPresent()) {
      results = determineCategoriesForSpeed(maximumSpeed.get(), results);
    }
    return results;
  }

  public List<RoadEmissionFactor> getEmissionFactors(final Locale locale, final String speedProfile, final String vehicleType,
      final Integer year) {
    final int speedProfileId;
    final VehicleType dbVehicleType;
    try {
      speedProfileId = Integer.parseInt(speedProfile);
      dbVehicleType = VehicleType.valueOf(vehicleType.toLowerCase(locale));
    } catch (final IllegalArgumentException e) {
      return Collections.emptyList();
    }
    return datasetStore.dsl()
        .select(
            SUBSTANCES.NAME.as(SUBSTANCE),
            ROAD_CATEGORIES_VIEW.EMISSION_FACTOR.as(FACTOR),
            ROAD_CATEGORIES_VIEW.STAGNATED_EMISSION_FACTOR.as(STAGNATED_FACTOR))
        .from(ROAD_CATEGORIES_VIEW)
        .innerJoin(SUBSTANCES).using(ROAD_CATEGORIES_VIEW.SUBSTANCE_ID)
        .where(ROAD_CATEGORIES_VIEW.ROAD_SPEED_PROFILE_ID.eq(speedProfileId))
        .and(ROAD_CATEGORIES_VIEW.VEHICLE_TYPE.eq(dbVehicleType))
        .and(ROAD_CATEGORIES_VIEW.YEAR.eq((short) year.intValue()))
        .fetchInto(RoadEmissionFactor.class);
  }

  private Map<RoadType, Boolean> getSRMDistinctionPerRoadType() {
    return datasetStore.dsl().select(
        ROAD_SPEED_PROFILES.ROAD_TYPE,
        field(trueCondition()
            .and(boolOr(ROAD_SPEED_PROFILES.SPEED_LIMIT_ENFORCEMENT.equal(SpeedLimitEnforcementType.irrelevant)))
            .and(boolOr(ROAD_SPEED_PROFILES.SPEED_LIMIT_ENFORCEMENT.notEqual(SpeedLimitEnforcementType.irrelevant)))).as(HAS_SRM_DISTINCTION))
        .from(ROAD_SPEED_PROFILES)
        .groupBy(ROAD_SPEED_PROFILES.ROAD_TYPE)
        .fetch()
        .intoMap(ROAD_SPEED_PROFILES.ROAD_TYPE, HAS_SRM_DISTINCTION);
  }

  private Stream<RoadSpeedProfileCategory> getRoadSpeedProfileCategories(final Map<RoadType, Boolean> srmDistinction,
      final Optional<String> roadType, final Optional<String> speedLimitEnforcement) {
    final Result<Record> results = datasetStore.dsl()
        .select()
        .from(ROAD_SPEED_PROFILES)
        .where(roadType.isPresent()
            ? ROAD_SPEED_PROFILES.ROAD_TYPE.cast(String.class).eq(roadType.get().toLowerCase())
            : trueCondition())
        .and(speedLimitEnforcement.isPresent()
            ? ROAD_SPEED_PROFILES.SPEED_LIMIT_ENFORCEMENT.cast(String.class).eq(speedLimitEnforcement.get().toLowerCase())
            : trueCondition())
        .fetch();
    return results.stream().map(record -> {
      final RoadType categoryRoadType = record.get(ROAD_SPEED_PROFILES.ROAD_TYPE);
      final boolean usableForSrm1 = !srmDistinction.get(categoryRoadType)
          || record.get(ROAD_SPEED_PROFILES.SPEED_LIMIT_ENFORCEMENT) == SpeedLimitEnforcementType.irrelevant;
      final boolean usableForSrm2 = !srmDistinction.get(categoryRoadType)
          || record.get(ROAD_SPEED_PROFILES.SPEED_LIMIT_ENFORCEMENT) != SpeedLimitEnforcementType.irrelevant;
      return new RoadSpeedProfileCategory().code(record.get(ROAD_SPEED_PROFILES.ROAD_SPEED_PROFILE_ID).toString())
          .name(record.get(ROAD_SPEED_PROFILES.NAME))
          .description(categoryRoadType.name() + ", " + record.get(ROAD_SPEED_PROFILES.NAME))
          .roadType(categoryRoadType.name())
          .speedLimitEnforcement(SpeedLimitEnforcementEnum.fromValue(record.get(ROAD_SPEED_PROFILES.SPEED_LIMIT_ENFORCEMENT).name()))
          .usableForSrm1(usableForSrm1)
          .usableForSrm2(usableForSrm2)
          .maximumSpeed(record.get(ROAD_SPEED_PROFILES.MAXIMUM_SPEED));
    });
  }

  private List<RoadSpeedProfileCategory> determineCategoriesForSpeed(final int targetMaxSpeed,
      final List<RoadSpeedProfileCategory> originalCategories) {
    final List<RoadSpeedProfileCategory> categoriesWithMaxSpeed = originalCategories.stream()
        .filter(category -> category.getMaximumSpeed() != null)
        .collect(Collectors.toList());
    //if there are no categories with a maximum speed, just return those.
    if (categoriesWithMaxSpeed.isEmpty()) {
      return originalCategories;
    } else {
      final int maxSpeedFound = categoriesWithMaxSpeed.stream()
          .mapToInt(category -> category.getMaximumSpeed().intValue())
          // Find all speeds that are equal to or above our target speed
          .filter(speed -> targetMaxSpeed <= speed)
          // Get the minimum of those speeds as the speed that we want to retrieve categories for
          .min()
          // If none match the criteria (all speeds are below our target speed), use the highest of the speeds
          .orElseGet(() -> categoriesWithMaxSpeed.stream()
              .mapToInt(category -> category.getMaximumSpeed().intValue())
              .max()
              .getAsInt());
      //Now return all the categories with that maximum speed.
      return categoriesWithMaxSpeed.stream()
          .filter(category -> category.getMaximumSpeed().intValue() == maxSpeedFound)
          .collect(Collectors.toList());
    }
  }
}
