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
import static nl.overheid.aerius.emissionservice.jooq.template.tables.FarmAnimalCategories.FARM_ANIMAL_CATEGORIES;
import static nl.overheid.aerius.emissionservice.jooq.template.tables.FarmLodgingTypeEmissionFactorsView.FARM_LODGING_TYPE_EMISSION_FACTORS_VIEW;
import static nl.overheid.aerius.emissionservice.jooq.template.tables.FarmLodgingTypes.FARM_LODGING_TYPES;
import static nl.overheid.aerius.emissionservice.jooq.template.tables.I18nFarmAnimalCategories.I18N_FARM_ANIMAL_CATEGORIES;
import static nl.overheid.aerius.emissionservice.jooq.template.tables.I18nFarmLodgingTypes.I18N_FARM_LODGING_TYPES;
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
import nl.overheid.aerius.emissionservice.model.FarmLodgingCategory;

@Repository
public class FarmRepository {

  private static final Field<String> DESCRIPTION = field("description", String.class);
  private static final Field<String> I18N_DESCRIPTION = field("i18n_description", String.class);
  private static final Field<String> SUBSTANCE = field("substance", String.class);
  private static final Field<String> FACTOR = field("factor", String.class);

  private final DatasetStore datasetStore;

  public FarmRepository(final DatasetStore datasetStore) {
    this.datasetStore = datasetStore;
  }

  public List<Category> getFarmAnimals(final Locale locale) {
    return datasetStore.dsl().select(
        FARM_ANIMAL_CATEGORIES.CODE,
        FARM_ANIMAL_CATEGORIES.NAME,
        coalesce(I18N_DESCRIPTION, FARM_ANIMAL_CATEGORIES.DESCRIPTION).as(DESCRIPTION))
        .from(FARM_ANIMAL_CATEGORIES)
        .leftJoin(
            select(I18N_FARM_ANIMAL_CATEGORIES.FARM_ANIMAL_CATEGORY_ID, I18N_FARM_ANIMAL_CATEGORIES.DESCRIPTION.as(I18N_DESCRIPTION))
                .from(I18N_FARM_ANIMAL_CATEGORIES)
                .where(I18N_FARM_ANIMAL_CATEGORIES.LANGUAGE_CODE.eq(getLanguageCodeType(locale))))
        .using(FARM_ANIMAL_CATEGORIES.FARM_ANIMAL_CATEGORY_ID)
        .orderBy(FARM_ANIMAL_CATEGORIES.CODE)
        .fetchInto(Category.class);
  }

  public List<Category> getFarmLodgings(final Locale locale, final Optional<String> animalCode) {
    return datasetStore.dsl().select(
        FARM_LODGING_TYPES.CODE,
        FARM_LODGING_TYPES.NAME,
        coalesce(I18N_DESCRIPTION, FARM_LODGING_TYPES.DESCRIPTION).as(DESCRIPTION))
        .from(FARM_LODGING_TYPES)
        .leftJoin(
            select(I18N_FARM_LODGING_TYPES.FARM_LODGING_TYPE_ID, I18N_FARM_LODGING_TYPES.DESCRIPTION.as(I18N_DESCRIPTION))
                .from(I18N_FARM_LODGING_TYPES)
                .where(I18N_FARM_LODGING_TYPES.LANGUAGE_CODE.eq(getLanguageCodeType(locale))))
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
    final Optional<FarmLodgingCategory> farmLodging = getOptionalFarmLodging(locale, lodgingCode);
    farmLodging.ifPresent(lodging -> lodging.setEmissionFactors(getLodgingEmissionFactors(lodgingCode)));
    return farmLodging;
  }

  private Optional<FarmLodgingCategory> getOptionalFarmLodging(final Locale locale, final String lodgingCode) {
    return datasetStore.dsl().select(
        FARM_LODGING_TYPES.CODE,
        FARM_LODGING_TYPES.NAME,
        coalesce(I18N_DESCRIPTION, FARM_LODGING_TYPES.DESCRIPTION).as(DESCRIPTION))
        .from(FARM_LODGING_TYPES)
        .leftJoin(
            select(I18N_FARM_LODGING_TYPES.FARM_LODGING_TYPE_ID, I18N_FARM_LODGING_TYPES.DESCRIPTION.as(I18N_DESCRIPTION))
                .from(I18N_FARM_LODGING_TYPES)
                .where(I18N_FARM_LODGING_TYPES.LANGUAGE_CODE.eq(getLanguageCodeType(locale))))
        .using(FARM_LODGING_TYPES.FARM_LODGING_TYPE_ID)
        .where(FARM_LODGING_TYPES.CODE.eq(lodgingCode))
        .fetchOptionalInto(FarmLodgingCategory.class);
  }

  private List<EmissionFactor> getLodgingEmissionFactors(final String lodgingCode) {
    return datasetStore.dsl().select(
        SUBSTANCES.NAME.as(SUBSTANCE),
        FARM_LODGING_TYPE_EMISSION_FACTORS_VIEW.EMISSION_FACTOR.as(FACTOR))
        .from(FARM_LODGING_TYPE_EMISSION_FACTORS_VIEW)
        .join(SUBSTANCES).using(SUBSTANCES.SUBSTANCE_ID)
        .where(FARM_LODGING_TYPE_EMISSION_FACTORS_VIEW.CODE.eq(lodgingCode))
        .fetchInto(EmissionFactor.class);
  }

  private LanguageCodeType getLanguageCodeType(final Locale locale) {
    LanguageCodeType codeType = LanguageCodeType.nl_;
    for (final LanguageCodeType value : LanguageCodeType.values()) {
      if (value.getLiteral().equalsIgnoreCase(locale.getLanguage())) {
        codeType = value;
      }
    }
    return codeType;
  }

}
