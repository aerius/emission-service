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
import static nl.overheid.aerius.emissionservice.jooq.template.tables.FarmAdditionalLodgingSystemEmissionFactors.FARM_ADDITIONAL_LODGING_SYSTEM_EMISSION_FACTORS;
import static nl.overheid.aerius.emissionservice.jooq.template.tables.FarmAdditionalLodgingSystems.FARM_ADDITIONAL_LODGING_SYSTEMS;
import static nl.overheid.aerius.emissionservice.jooq.template.tables.FarmAdditionalLodgingSystemsToLodgingSystemDefinitions.FARM_ADDITIONAL_LODGING_SYSTEMS_TO_LODGING_SYSTEM_DEFINITIONS;
import static nl.overheid.aerius.emissionservice.jooq.template.tables.FarmAnimalCategories.FARM_ANIMAL_CATEGORIES;
import static nl.overheid.aerius.emissionservice.jooq.template.tables.FarmLodgingFodderMeasureReductionFactors.FARM_LODGING_FODDER_MEASURE_REDUCTION_FACTORS;
import static nl.overheid.aerius.emissionservice.jooq.template.tables.FarmLodgingFodderMeasures.FARM_LODGING_FODDER_MEASURES;
import static nl.overheid.aerius.emissionservice.jooq.template.tables.FarmLodgingFodderMeasuresAnimalCategory.FARM_LODGING_FODDER_MEASURES_ANIMAL_CATEGORY;
import static nl.overheid.aerius.emissionservice.jooq.template.tables.FarmLodgingSystemDefinitions.FARM_LODGING_SYSTEM_DEFINITIONS;
import static nl.overheid.aerius.emissionservice.jooq.template.tables.FarmLodgingTypeEmissionFactors.FARM_LODGING_TYPE_EMISSION_FACTORS;
import static nl.overheid.aerius.emissionservice.jooq.template.tables.FarmLodgingTypes.FARM_LODGING_TYPES;
import static nl.overheid.aerius.emissionservice.jooq.template.tables.FarmLodgingTypesToAdditionalLodgingSystems.FARM_LODGING_TYPES_TO_ADDITIONAL_LODGING_SYSTEMS;
import static nl.overheid.aerius.emissionservice.jooq.template.tables.FarmLodgingTypesToLodgingSystemDefinitions.FARM_LODGING_TYPES_TO_LODGING_SYSTEM_DEFINITIONS;
import static nl.overheid.aerius.emissionservice.jooq.template.tables.FarmLodgingTypesToReductiveLodgingSystems.FARM_LODGING_TYPES_TO_REDUCTIVE_LODGING_SYSTEMS;
import static nl.overheid.aerius.emissionservice.jooq.template.tables.FarmReductiveLodgingSystemReductionFactors.FARM_REDUCTIVE_LODGING_SYSTEM_REDUCTION_FACTORS;
import static nl.overheid.aerius.emissionservice.jooq.template.tables.FarmReductiveLodgingSystems.FARM_REDUCTIVE_LODGING_SYSTEMS;
import static nl.overheid.aerius.emissionservice.jooq.template.tables.FarmReductiveLodgingSystemsToLodgingSystemDefinitions.FARM_REDUCTIVE_LODGING_SYSTEMS_TO_LODGING_SYSTEM_DEFINITIONS;
import static nl.overheid.aerius.emissionservice.jooq.template.tables.I18nFarmAdditionalLodgingSystems.I18N_FARM_ADDITIONAL_LODGING_SYSTEMS;
import static nl.overheid.aerius.emissionservice.jooq.template.tables.I18nFarmAnimalCategories.I18N_FARM_ANIMAL_CATEGORIES;
import static nl.overheid.aerius.emissionservice.jooq.template.tables.I18nFarmLodgingFodderMeasures.I18N_FARM_LODGING_FODDER_MEASURES;
import static nl.overheid.aerius.emissionservice.jooq.template.tables.I18nFarmLodgingSystemDefinitions.I18N_FARM_LODGING_SYSTEM_DEFINITIONS;
import static nl.overheid.aerius.emissionservice.jooq.template.tables.I18nFarmLodgingTypes.I18N_FARM_LODGING_TYPES;
import static nl.overheid.aerius.emissionservice.jooq.template.tables.I18nFarmReductiveLodgingSystems.I18N_FARM_REDUCTIVE_LODGING_SYSTEMS;
import static org.jooq.impl.DSL.coalesce;
import static org.jooq.impl.DSL.field;
import static org.jooq.impl.DSL.select;
import static org.jooq.impl.DSL.trueCondition;

import java.util.List;
import java.util.Locale;
import java.util.Optional;

import org.jooq.Field;
import org.springframework.stereotype.Repository;

import nl.overheid.aerius.emissionservice.jooq.i18n.enums.LanguageCodeType;
import nl.overheid.aerius.emissionservice.model.Category;
import nl.overheid.aerius.emissionservice.model.EmissionFactor;
import nl.overheid.aerius.emissionservice.model.EmissionReductionFraction;
import nl.overheid.aerius.emissionservice.model.FarmAdditionalLodgingSystemCategory;
import nl.overheid.aerius.emissionservice.model.FarmAnimalEmissionProportion;
import nl.overheid.aerius.emissionservice.model.FarmFodderMeasureCategory;
import nl.overheid.aerius.emissionservice.model.FarmFodderMeasureEmissionFractions;
import nl.overheid.aerius.emissionservice.model.FarmLodgingCategory;
import nl.overheid.aerius.emissionservice.model.FarmReductiveLodgingSystemCategory;

@Repository
public class FarmRepository {

  private static final Field<String> DESCRIPTION = field("description", String.class);
  private static final Field<String> I18N_DESCRIPTION = field("i18n_description", String.class);
  private static final Field<String> SUBSTANCE = field("substance", String.class);
  private static final Field<String> FACTOR = field("factor", String.class);
  private static final Field<String> FRACTION = field("fraction", String.class);
  private static final Field<String> TOTAL_REDUCTION_FRACTION = field("total_reduction_fraction", String.class);
  private static final Field<String> CELLAR_REDUCTION_FRACTION = field("cellar_reduction_fraction", String.class);
  private static final Field<String> FLOOR_REDUCTION_FRACTION = field("floor_reduction_fraction", String.class);
  private static final Field<String> FARM_ANIMAL_CODE = field("farm_animal_code", String.class);
  private static final Field<String> FRACTION_CELLAR = field("fraction_cellar", String.class);
  private static final Field<String> FRACTION_FLOOR = field("fraction_floor", String.class);

  private final DatasetStore datasetStore;

  public FarmRepository(final DatasetStore datasetStore) {
    this.datasetStore = datasetStore;
  }

  public List<Category> getFarmAnimals(final Locale locale) {
    final LanguageCodeType language = DbUtil.getLanguageCodeType(locale);
    return datasetStore.dsl().select(
        FARM_ANIMAL_CATEGORIES.CODE,
        FARM_ANIMAL_CATEGORIES.NAME,
        coalesce(I18N_DESCRIPTION, FARM_ANIMAL_CATEGORIES.DESCRIPTION).as(DESCRIPTION))
        .from(FARM_ANIMAL_CATEGORIES)
        .leftJoin(
            select(I18N_FARM_ANIMAL_CATEGORIES.FARM_ANIMAL_CATEGORY_ID, I18N_FARM_ANIMAL_CATEGORIES.DESCRIPTION.as(I18N_DESCRIPTION))
                .from(I18N_FARM_ANIMAL_CATEGORIES)
                .where(I18N_FARM_ANIMAL_CATEGORIES.LANGUAGE_CODE.eq(language)))
        .using(FARM_ANIMAL_CATEGORIES.FARM_ANIMAL_CATEGORY_ID)
        .orderBy(FARM_ANIMAL_CATEGORIES.CODE)
        .fetchInto(Category.class);
  }

  public List<Category> getFarmLodgings(final Locale locale, final Optional<String> animalCode) {
    final LanguageCodeType language = DbUtil.getLanguageCodeType(locale);
    return datasetStore.dsl().select(
        FARM_LODGING_TYPES.CODE,
        FARM_LODGING_TYPES.NAME,
        coalesce(I18N_DESCRIPTION, FARM_LODGING_TYPES.DESCRIPTION).as(DESCRIPTION))
        .from(FARM_LODGING_TYPES)
        .leftJoin(
            select(I18N_FARM_LODGING_TYPES.FARM_LODGING_TYPE_ID, I18N_FARM_LODGING_TYPES.DESCRIPTION.as(I18N_DESCRIPTION))
                .from(I18N_FARM_LODGING_TYPES)
                .where(I18N_FARM_LODGING_TYPES.LANGUAGE_CODE.eq(language)))
        .using(FARM_LODGING_TYPES.FARM_LODGING_TYPE_ID)
        .where(animalCode.isPresent()
            ? FARM_LODGING_TYPES.FARM_ANIMAL_CATEGORY_ID.in(
                select(FARM_ANIMAL_CATEGORIES.FARM_ANIMAL_CATEGORY_ID)
                    .from(FARM_ANIMAL_CATEGORIES)
                    .where(FARM_ANIMAL_CATEGORIES.CODE.containsIgnoreCase(animalCode.get())))
            : trueCondition())
        .orderBy(FARM_LODGING_TYPES.CODE)
        .fetchInto(Category.class);
  }

  public Optional<FarmLodgingCategory> getFarmLodging(final Locale locale, final String lodgingCode) {
    final LanguageCodeType language = DbUtil.getLanguageCodeType(locale);
    final Optional<FarmLodgingCategory> farmLodging = getOptionalFarmLodging(language, lodgingCode);
    farmLodging.ifPresent(lodging -> {
      lodging.setEmissionFactors(getLodgingEmissionFactors(lodgingCode));
      lodging.setSystemDefinitions(getLodgingSystemDefinitions(language, lodgingCode));
      lodging.setAdditionalLodgingSystems(getLodgingAdditionalSystems(language, lodgingCode));
      lodging.setReductiveLodgingSystems(getLodgingReductiveSystems(language, lodgingCode));
      lodging.setFodderMeasures(getLodgingFodderMeasures(language, lodgingCode));
    });
    return farmLodging;
  }

  private Optional<FarmLodgingCategory> getOptionalFarmLodging(final LanguageCodeType language, final String lodgingCode) {
    return datasetStore.dsl().select(
        FARM_LODGING_TYPES.CODE,
        FARM_LODGING_TYPES.NAME,
        coalesce(I18N_DESCRIPTION, FARM_LODGING_TYPES.DESCRIPTION).as(DESCRIPTION),
        FARM_LODGING_TYPES.SCRUBBER)
        .from(FARM_LODGING_TYPES)
        .leftJoin(
            select(I18N_FARM_LODGING_TYPES.FARM_LODGING_TYPE_ID, I18N_FARM_LODGING_TYPES.DESCRIPTION.as(I18N_DESCRIPTION))
                .from(I18N_FARM_LODGING_TYPES)
                .where(I18N_FARM_LODGING_TYPES.LANGUAGE_CODE.eq(language)))
        .using(FARM_LODGING_TYPES.FARM_LODGING_TYPE_ID)
        .where(FARM_LODGING_TYPES.CODE.eq(lodgingCode))
        .fetchOptionalInto(FarmLodgingCategory.class);
  }

  private List<EmissionFactor> getLodgingEmissionFactors(final String lodgingCode) {
    return datasetStore.dsl().select(
        SUBSTANCES.NAME.as(SUBSTANCE),
        FARM_LODGING_TYPE_EMISSION_FACTORS.EMISSION_FACTOR.as(FACTOR))
        .from(FARM_LODGING_TYPE_EMISSION_FACTORS)
        .join(SUBSTANCES).using(SUBSTANCES.SUBSTANCE_ID)
        .join(FARM_LODGING_TYPES).using(FARM_LODGING_TYPES.FARM_LODGING_TYPE_ID)
        .where(FARM_LODGING_TYPES.CODE.eq(lodgingCode))
        .fetchInto(EmissionFactor.class);
  }

  private List<Category> getLodgingSystemDefinitions(final LanguageCodeType language, final String lodgingCode) {
    return datasetStore.dsl().select(
        FARM_LODGING_SYSTEM_DEFINITIONS.CODE,
        FARM_LODGING_SYSTEM_DEFINITIONS.NAME,
        coalesce(I18N_DESCRIPTION, FARM_LODGING_SYSTEM_DEFINITIONS.DESCRIPTION).as(DESCRIPTION))
        .from(FARM_LODGING_TYPES_TO_LODGING_SYSTEM_DEFINITIONS)
        .join(FARM_LODGING_SYSTEM_DEFINITIONS).using(FARM_LODGING_SYSTEM_DEFINITIONS.FARM_LODGING_SYSTEM_DEFINITION_ID)
        .join(FARM_LODGING_TYPES).using(FARM_LODGING_TYPES.FARM_LODGING_TYPE_ID)
        .leftJoin(
            select(I18N_FARM_LODGING_SYSTEM_DEFINITIONS.FARM_LODGING_SYSTEM_DEFINITION_ID,
                I18N_FARM_LODGING_SYSTEM_DEFINITIONS.DESCRIPTION.as(I18N_DESCRIPTION))
                    .from(I18N_FARM_LODGING_SYSTEM_DEFINITIONS)
                    .where(I18N_FARM_LODGING_SYSTEM_DEFINITIONS.LANGUAGE_CODE.eq(language)))
        .using(FARM_LODGING_SYSTEM_DEFINITIONS.FARM_LODGING_SYSTEM_DEFINITION_ID)
        .where(FARM_LODGING_TYPES.CODE.eq(lodgingCode))
        .orderBy(FARM_LODGING_SYSTEM_DEFINITIONS.CODE)
        .fetchInto(Category.class);
  }

  private List<Category> getLodgingAdditionalSystems(final LanguageCodeType language, final String lodgingCode) {
    return datasetStore.dsl().select(
        FARM_ADDITIONAL_LODGING_SYSTEMS.CODE,
        FARM_ADDITIONAL_LODGING_SYSTEMS.NAME,
        coalesce(I18N_DESCRIPTION, FARM_ADDITIONAL_LODGING_SYSTEMS.DESCRIPTION).as(DESCRIPTION))
        .from(FARM_LODGING_TYPES_TO_ADDITIONAL_LODGING_SYSTEMS)
        .join(FARM_ADDITIONAL_LODGING_SYSTEMS).using(FARM_ADDITIONAL_LODGING_SYSTEMS.FARM_ADDITIONAL_LODGING_SYSTEM_ID)
        .join(FARM_LODGING_TYPES).using(FARM_LODGING_TYPES.FARM_LODGING_TYPE_ID)
        .leftJoin(
            select(I18N_FARM_ADDITIONAL_LODGING_SYSTEMS.FARM_ADDITIONAL_LODGING_SYSTEM_ID,
                I18N_FARM_ADDITIONAL_LODGING_SYSTEMS.DESCRIPTION.as(I18N_DESCRIPTION))
                    .from(I18N_FARM_ADDITIONAL_LODGING_SYSTEMS)
                    .where(I18N_FARM_ADDITIONAL_LODGING_SYSTEMS.LANGUAGE_CODE.eq(language)))
        .using(FARM_ADDITIONAL_LODGING_SYSTEMS.FARM_ADDITIONAL_LODGING_SYSTEM_ID)
        .where(FARM_LODGING_TYPES.CODE.eq(lodgingCode))
        .orderBy(FARM_ADDITIONAL_LODGING_SYSTEMS.CODE)
        .fetchInto(Category.class);
  }

  private List<Category> getLodgingReductiveSystems(final LanguageCodeType language, final String lodgingCode) {
    return datasetStore.dsl().select(
        FARM_REDUCTIVE_LODGING_SYSTEMS.CODE,
        FARM_REDUCTIVE_LODGING_SYSTEMS.NAME,
        coalesce(I18N_DESCRIPTION, FARM_REDUCTIVE_LODGING_SYSTEMS.DESCRIPTION).as(DESCRIPTION))
        .from(FARM_LODGING_TYPES_TO_REDUCTIVE_LODGING_SYSTEMS)
        .join(FARM_REDUCTIVE_LODGING_SYSTEMS).using(FARM_REDUCTIVE_LODGING_SYSTEMS.FARM_REDUCTIVE_LODGING_SYSTEM_ID)
        .join(FARM_LODGING_TYPES).using(FARM_LODGING_TYPES.FARM_LODGING_TYPE_ID)
        .leftJoin(
            select(I18N_FARM_REDUCTIVE_LODGING_SYSTEMS.FARM_REDUCTIVE_LODGING_SYSTEM_ID,
                I18N_FARM_REDUCTIVE_LODGING_SYSTEMS.DESCRIPTION.as(I18N_DESCRIPTION))
                    .from(I18N_FARM_REDUCTIVE_LODGING_SYSTEMS)
                    .where(I18N_FARM_REDUCTIVE_LODGING_SYSTEMS.LANGUAGE_CODE.eq(language)))
        .using(FARM_REDUCTIVE_LODGING_SYSTEMS.FARM_REDUCTIVE_LODGING_SYSTEM_ID)
        .where(FARM_LODGING_TYPES.CODE.eq(lodgingCode))
        .orderBy(FARM_REDUCTIVE_LODGING_SYSTEMS.CODE)
        .fetchInto(Category.class);
  }

  private List<Category> getLodgingFodderMeasures(final LanguageCodeType language, final String lodgingCode) {
    return datasetStore.dsl().select(
        FARM_LODGING_FODDER_MEASURES.CODE,
        FARM_LODGING_FODDER_MEASURES.NAME,
        coalesce(I18N_DESCRIPTION, FARM_LODGING_FODDER_MEASURES.DESCRIPTION).as(DESCRIPTION))
        .from(FARM_LODGING_FODDER_MEASURES_ANIMAL_CATEGORY)
        .join(FARM_LODGING_FODDER_MEASURES).using(FARM_LODGING_FODDER_MEASURES.FARM_LODGING_FODDER_MEASURE_ID)
        .join(FARM_LODGING_TYPES).using(FARM_LODGING_TYPES.FARM_ANIMAL_CATEGORY_ID)
        .leftJoin(
            select(I18N_FARM_LODGING_FODDER_MEASURES.FARM_LODGING_FODDER_MEASURE_ID,
                I18N_FARM_LODGING_FODDER_MEASURES.DESCRIPTION.as(I18N_DESCRIPTION))
                    .from(I18N_FARM_LODGING_FODDER_MEASURES)
                    .where(I18N_FARM_LODGING_FODDER_MEASURES.LANGUAGE_CODE.eq(language)))
        .using(FARM_LODGING_FODDER_MEASURES.FARM_LODGING_FODDER_MEASURE_ID)
        .where(FARM_LODGING_TYPES.CODE.eq(lodgingCode))
        .orderBy(FARM_LODGING_FODDER_MEASURES.CODE)
        .fetchInto(Category.class);
  }

  public List<Category> getFarmAdditionalLodgingSystems(final Locale locale) {
    final LanguageCodeType language = DbUtil.getLanguageCodeType(locale);
    return datasetStore.dsl().select(
        FARM_ADDITIONAL_LODGING_SYSTEMS.CODE,
        FARM_ADDITIONAL_LODGING_SYSTEMS.NAME,
        coalesce(I18N_DESCRIPTION, FARM_ADDITIONAL_LODGING_SYSTEMS.DESCRIPTION).as(DESCRIPTION))
        .from(FARM_ADDITIONAL_LODGING_SYSTEMS)
        .leftJoin(
            select(I18N_FARM_ADDITIONAL_LODGING_SYSTEMS.FARM_ADDITIONAL_LODGING_SYSTEM_ID,
                I18N_FARM_ADDITIONAL_LODGING_SYSTEMS.DESCRIPTION.as(I18N_DESCRIPTION))
                    .from(I18N_FARM_ADDITIONAL_LODGING_SYSTEMS)
                    .where(I18N_FARM_ADDITIONAL_LODGING_SYSTEMS.LANGUAGE_CODE.eq(language)))
        .using(FARM_ADDITIONAL_LODGING_SYSTEMS.FARM_ADDITIONAL_LODGING_SYSTEM_ID)
        .orderBy(FARM_ADDITIONAL_LODGING_SYSTEMS.CODE)
        .fetchInto(Category.class);
  }

  public Optional<FarmAdditionalLodgingSystemCategory> getFarmAdditionalLodgingSystem(final Locale locale, final String systemCode) {
    final LanguageCodeType language = DbUtil.getLanguageCodeType(locale);
    final Optional<FarmAdditionalLodgingSystemCategory> additionalSystem = getOptionalFarmAdditionalLodgingSystem(language, systemCode);
    additionalSystem.ifPresent(system -> {
      system.setEmissionFactors(getAdditionalLodgingSystemEmissionFactors(systemCode));
      system.setSystemDefinitions(getAdditionalSystemDefinitions(language, systemCode));
    });
    return additionalSystem;
  }

  private Optional<FarmAdditionalLodgingSystemCategory> getOptionalFarmAdditionalLodgingSystem(final LanguageCodeType language,
      final String systemCode) {
    return datasetStore.dsl().select(
        FARM_ADDITIONAL_LODGING_SYSTEMS.CODE,
        FARM_ADDITIONAL_LODGING_SYSTEMS.NAME,
        coalesce(I18N_DESCRIPTION, FARM_ADDITIONAL_LODGING_SYSTEMS.DESCRIPTION).as(DESCRIPTION),
        FARM_ADDITIONAL_LODGING_SYSTEMS.SCRUBBER)
        .from(FARM_ADDITIONAL_LODGING_SYSTEMS)
        .leftJoin(
            select(I18N_FARM_ADDITIONAL_LODGING_SYSTEMS.FARM_ADDITIONAL_LODGING_SYSTEM_ID,
                I18N_FARM_ADDITIONAL_LODGING_SYSTEMS.DESCRIPTION.as(I18N_DESCRIPTION))
                    .from(I18N_FARM_ADDITIONAL_LODGING_SYSTEMS)
                    .where(I18N_FARM_ADDITIONAL_LODGING_SYSTEMS.LANGUAGE_CODE.eq(language)))
        .using(FARM_ADDITIONAL_LODGING_SYSTEMS.FARM_ADDITIONAL_LODGING_SYSTEM_ID)
        .where(FARM_ADDITIONAL_LODGING_SYSTEMS.CODE.eq(systemCode))
        .fetchOptionalInto(FarmAdditionalLodgingSystemCategory.class);
  }

  private List<EmissionFactor> getAdditionalLodgingSystemEmissionFactors(final String systemCode) {
    return datasetStore.dsl().select(
        SUBSTANCES.NAME.as(SUBSTANCE),
        FARM_ADDITIONAL_LODGING_SYSTEM_EMISSION_FACTORS.EMISSION_FACTOR.as(FACTOR))
        .from(FARM_ADDITIONAL_LODGING_SYSTEM_EMISSION_FACTORS)
        .join(SUBSTANCES).using(SUBSTANCES.SUBSTANCE_ID)
        .join(FARM_ADDITIONAL_LODGING_SYSTEMS).using(FARM_ADDITIONAL_LODGING_SYSTEMS.FARM_ADDITIONAL_LODGING_SYSTEM_ID)
        .where(FARM_ADDITIONAL_LODGING_SYSTEMS.CODE.eq(systemCode))
        .fetchInto(EmissionFactor.class);
  }

  private List<Category> getAdditionalSystemDefinitions(final LanguageCodeType language, final String systemCode) {
    return datasetStore.dsl().select(
        FARM_LODGING_SYSTEM_DEFINITIONS.CODE,
        FARM_LODGING_SYSTEM_DEFINITIONS.NAME,
        coalesce(I18N_DESCRIPTION, FARM_LODGING_SYSTEM_DEFINITIONS.DESCRIPTION).as(DESCRIPTION))
        .from(FARM_ADDITIONAL_LODGING_SYSTEMS_TO_LODGING_SYSTEM_DEFINITIONS)
        .join(FARM_LODGING_SYSTEM_DEFINITIONS).using(FARM_LODGING_SYSTEM_DEFINITIONS.FARM_LODGING_SYSTEM_DEFINITION_ID)
        .join(FARM_ADDITIONAL_LODGING_SYSTEMS).using(FARM_ADDITIONAL_LODGING_SYSTEMS.FARM_ADDITIONAL_LODGING_SYSTEM_ID)
        .leftJoin(
            select(I18N_FARM_LODGING_SYSTEM_DEFINITIONS.FARM_LODGING_SYSTEM_DEFINITION_ID,
                I18N_FARM_LODGING_SYSTEM_DEFINITIONS.DESCRIPTION.as(I18N_DESCRIPTION))
                    .from(I18N_FARM_LODGING_SYSTEM_DEFINITIONS)
                    .where(I18N_FARM_LODGING_SYSTEM_DEFINITIONS.LANGUAGE_CODE.eq(language)))
        .using(FARM_LODGING_SYSTEM_DEFINITIONS.FARM_LODGING_SYSTEM_DEFINITION_ID)
        .where(FARM_ADDITIONAL_LODGING_SYSTEMS.CODE.eq(systemCode))
        .orderBy(FARM_LODGING_SYSTEM_DEFINITIONS.CODE)
        .fetchInto(Category.class);
  }

  public List<Category> getFarmReductiveLodgingSystems(final Locale locale) {
    final LanguageCodeType language = DbUtil.getLanguageCodeType(locale);
    return datasetStore.dsl().select(
        FARM_REDUCTIVE_LODGING_SYSTEMS.CODE,
        FARM_REDUCTIVE_LODGING_SYSTEMS.NAME,
        coalesce(I18N_DESCRIPTION, FARM_REDUCTIVE_LODGING_SYSTEMS.DESCRIPTION).as(DESCRIPTION))
        .from(FARM_REDUCTIVE_LODGING_SYSTEMS)
        .leftJoin(
            select(I18N_FARM_REDUCTIVE_LODGING_SYSTEMS.FARM_REDUCTIVE_LODGING_SYSTEM_ID,
                I18N_FARM_REDUCTIVE_LODGING_SYSTEMS.DESCRIPTION.as(I18N_DESCRIPTION))
                    .from(I18N_FARM_REDUCTIVE_LODGING_SYSTEMS)
                    .where(I18N_FARM_REDUCTIVE_LODGING_SYSTEMS.LANGUAGE_CODE.eq(language)))
        .using(FARM_REDUCTIVE_LODGING_SYSTEMS.FARM_REDUCTIVE_LODGING_SYSTEM_ID)
        .orderBy(FARM_REDUCTIVE_LODGING_SYSTEMS.CODE)
        .fetchInto(Category.class);
  }

  public Optional<FarmReductiveLodgingSystemCategory> getFarmReductiveLodgingSystem(final Locale locale, final String systemCode) {
    final LanguageCodeType language = DbUtil.getLanguageCodeType(locale);
    final Optional<FarmReductiveLodgingSystemCategory> reductiveSystem = getOptionalFarmReductiveLodgingSystem(language, systemCode);
    reductiveSystem.ifPresent(system -> {
      system.setReductionFractions(getReductiveLodgingSystemEmissionFractions(systemCode));
      system.setSystemDefinitions(getReductiveSystemDefinitions(language, systemCode));
    });
    return reductiveSystem;
  }

  private Optional<FarmReductiveLodgingSystemCategory> getOptionalFarmReductiveLodgingSystem(final LanguageCodeType language,
      final String systemCode) {
    return datasetStore.dsl().select(
        FARM_REDUCTIVE_LODGING_SYSTEMS.CODE,
        FARM_REDUCTIVE_LODGING_SYSTEMS.NAME,
        coalesce(I18N_DESCRIPTION, FARM_REDUCTIVE_LODGING_SYSTEMS.DESCRIPTION).as(DESCRIPTION),
        FARM_REDUCTIVE_LODGING_SYSTEMS.SCRUBBER)
        .from(FARM_REDUCTIVE_LODGING_SYSTEMS)
        .leftJoin(
            select(I18N_FARM_REDUCTIVE_LODGING_SYSTEMS.FARM_REDUCTIVE_LODGING_SYSTEM_ID,
                I18N_FARM_REDUCTIVE_LODGING_SYSTEMS.DESCRIPTION.as(I18N_DESCRIPTION))
                    .from(I18N_FARM_REDUCTIVE_LODGING_SYSTEMS)
                    .where(I18N_FARM_REDUCTIVE_LODGING_SYSTEMS.LANGUAGE_CODE.eq(language)))
        .using(FARM_REDUCTIVE_LODGING_SYSTEMS.FARM_REDUCTIVE_LODGING_SYSTEM_ID)
        .where(FARM_REDUCTIVE_LODGING_SYSTEMS.CODE.eq(systemCode))
        .fetchOptionalInto(FarmReductiveLodgingSystemCategory.class);
  }

  private List<EmissionReductionFraction> getReductiveLodgingSystemEmissionFractions(final String systemCode) {
    return datasetStore.dsl().select(
        SUBSTANCES.NAME.as(SUBSTANCE),
        FARM_REDUCTIVE_LODGING_SYSTEM_REDUCTION_FACTORS.REDUCTION_FACTOR.as(FRACTION))
        .from(FARM_REDUCTIVE_LODGING_SYSTEM_REDUCTION_FACTORS)
        .join(SUBSTANCES).using(SUBSTANCES.SUBSTANCE_ID)
        .join(FARM_REDUCTIVE_LODGING_SYSTEMS).using(FARM_REDUCTIVE_LODGING_SYSTEMS.FARM_REDUCTIVE_LODGING_SYSTEM_ID)
        .where(FARM_REDUCTIVE_LODGING_SYSTEMS.CODE.eq(systemCode))
        .fetchInto(EmissionReductionFraction.class);
  }

  private List<Category> getReductiveSystemDefinitions(final LanguageCodeType language, final String systemCode) {
    return datasetStore.dsl().select(
        FARM_LODGING_SYSTEM_DEFINITIONS.CODE,
        FARM_LODGING_SYSTEM_DEFINITIONS.NAME,
        coalesce(I18N_DESCRIPTION, FARM_LODGING_SYSTEM_DEFINITIONS.DESCRIPTION).as(DESCRIPTION))
        .from(FARM_REDUCTIVE_LODGING_SYSTEMS_TO_LODGING_SYSTEM_DEFINITIONS)
        .join(FARM_LODGING_SYSTEM_DEFINITIONS).using(FARM_LODGING_SYSTEM_DEFINITIONS.FARM_LODGING_SYSTEM_DEFINITION_ID)
        .join(FARM_REDUCTIVE_LODGING_SYSTEMS).using(FARM_REDUCTIVE_LODGING_SYSTEMS.FARM_REDUCTIVE_LODGING_SYSTEM_ID)
        .leftJoin(
            select(I18N_FARM_LODGING_SYSTEM_DEFINITIONS.FARM_LODGING_SYSTEM_DEFINITION_ID,
                I18N_FARM_LODGING_SYSTEM_DEFINITIONS.DESCRIPTION.as(I18N_DESCRIPTION))
                    .from(I18N_FARM_LODGING_SYSTEM_DEFINITIONS)
                    .where(I18N_FARM_LODGING_SYSTEM_DEFINITIONS.LANGUAGE_CODE.eq(language)))
        .using(FARM_LODGING_SYSTEM_DEFINITIONS.FARM_LODGING_SYSTEM_DEFINITION_ID)
        .where(FARM_REDUCTIVE_LODGING_SYSTEMS.CODE.eq(systemCode))
        .orderBy(FARM_LODGING_SYSTEM_DEFINITIONS.CODE)
        .fetchInto(Category.class);
  }

  public List<Category> getFarmFodderMeasures(final Locale locale) {
    final LanguageCodeType language = DbUtil.getLanguageCodeType(locale);
    return datasetStore.dsl().select(
        FARM_LODGING_FODDER_MEASURES.CODE,
        FARM_LODGING_FODDER_MEASURES.NAME,
        coalesce(I18N_DESCRIPTION, FARM_LODGING_FODDER_MEASURES.DESCRIPTION).as(DESCRIPTION))
        .from(FARM_LODGING_FODDER_MEASURES)
        .leftJoin(
            select(I18N_FARM_LODGING_FODDER_MEASURES.FARM_LODGING_FODDER_MEASURE_ID,
                I18N_FARM_LODGING_FODDER_MEASURES.DESCRIPTION.as(I18N_DESCRIPTION))
                    .from(I18N_FARM_LODGING_FODDER_MEASURES)
                    .where(I18N_FARM_LODGING_FODDER_MEASURES.LANGUAGE_CODE.eq(language)))
        .using(FARM_LODGING_FODDER_MEASURES.FARM_LODGING_FODDER_MEASURE_ID)
        .orderBy(FARM_LODGING_FODDER_MEASURES.CODE)
        .fetchInto(Category.class);
  }

  public Optional<FarmFodderMeasureCategory> getFarmFodderMeasure(final Locale locale, final String measureCode) {
    final LanguageCodeType language = DbUtil.getLanguageCodeType(locale);
    final Optional<FarmFodderMeasureCategory> fodderMeasure = getOptionalFarmFodderMeasure(language, measureCode);
    fodderMeasure.ifPresent(measure -> {
      measure.setReductionFractions(getFodderMeasureEmissionFractions(measureCode));
      measure.setProportionsForAnimals(getFodderMeasureFarmAnimalProportions(measureCode));
    });
    return fodderMeasure;
  }

  private Optional<FarmFodderMeasureCategory> getOptionalFarmFodderMeasure(final LanguageCodeType language,
      final String measureCode) {
    return datasetStore.dsl().select(
        FARM_LODGING_FODDER_MEASURES.CODE,
        FARM_LODGING_FODDER_MEASURES.NAME,
        coalesce(I18N_DESCRIPTION, FARM_LODGING_FODDER_MEASURES.DESCRIPTION).as(DESCRIPTION))
        .from(FARM_LODGING_FODDER_MEASURES)
        .leftJoin(
            select(I18N_FARM_LODGING_FODDER_MEASURES.FARM_LODGING_FODDER_MEASURE_ID,
                I18N_FARM_LODGING_FODDER_MEASURES.DESCRIPTION.as(I18N_DESCRIPTION))
                    .from(I18N_FARM_LODGING_FODDER_MEASURES)
                    .where(I18N_FARM_LODGING_FODDER_MEASURES.LANGUAGE_CODE.eq(language)))
        .using(FARM_LODGING_FODDER_MEASURES.FARM_LODGING_FODDER_MEASURE_ID)
        .where(FARM_LODGING_FODDER_MEASURES.CODE.eq(measureCode))
        .fetchOptionalInto(FarmFodderMeasureCategory.class);
  }

  private List<FarmFodderMeasureEmissionFractions> getFodderMeasureEmissionFractions(final String measureCode) {
    return datasetStore.dsl().select(
        SUBSTANCES.NAME.as(SUBSTANCE),
        FARM_LODGING_FODDER_MEASURE_REDUCTION_FACTORS.REDUCTION_FACTOR_TOTAL.as(TOTAL_REDUCTION_FRACTION),
        FARM_LODGING_FODDER_MEASURE_REDUCTION_FACTORS.REDUCTION_FACTOR_CELLAR.as(CELLAR_REDUCTION_FRACTION),
        FARM_LODGING_FODDER_MEASURE_REDUCTION_FACTORS.REDUCTION_FACTOR_FLOOR.as(FLOOR_REDUCTION_FRACTION))
        .from(FARM_LODGING_FODDER_MEASURE_REDUCTION_FACTORS)
        .join(SUBSTANCES).using(SUBSTANCES.SUBSTANCE_ID)
        .join(FARM_LODGING_FODDER_MEASURES).using(FARM_LODGING_FODDER_MEASURES.FARM_LODGING_FODDER_MEASURE_ID)
        .where(FARM_LODGING_FODDER_MEASURES.CODE.eq(measureCode))
        .fetchInto(FarmFodderMeasureEmissionFractions.class);
  }

  private List<FarmAnimalEmissionProportion> getFodderMeasureFarmAnimalProportions(final String measureCode) {
    return datasetStore.dsl().select(
        FARM_ANIMAL_CATEGORIES.CODE.as(FARM_ANIMAL_CODE),
        FARM_LODGING_FODDER_MEASURES_ANIMAL_CATEGORY.PROPORTION_CELLAR.as(FRACTION_CELLAR),
        FARM_LODGING_FODDER_MEASURES_ANIMAL_CATEGORY.PROPORTION_FLOOR.as(FRACTION_FLOOR))
        .from(FARM_LODGING_FODDER_MEASURES_ANIMAL_CATEGORY)
        .join(FARM_ANIMAL_CATEGORIES).using(FARM_ANIMAL_CATEGORIES.FARM_ANIMAL_CATEGORY_ID)
        .join(FARM_LODGING_FODDER_MEASURES).using(FARM_LODGING_FODDER_MEASURES.FARM_LODGING_FODDER_MEASURE_ID)
        .where(FARM_LODGING_FODDER_MEASURES.CODE.eq(measureCode))
        .fetchInto(FarmAnimalEmissionProportion.class);
  }

}
