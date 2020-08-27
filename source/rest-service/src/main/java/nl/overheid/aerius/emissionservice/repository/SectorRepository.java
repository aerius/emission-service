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

import static nl.overheid.aerius.emissionservice.jooq.template.tables.DefaultSourceCharacteristicsView.DEFAULT_SOURCE_CHARACTERISTICS_VIEW;
import static nl.overheid.aerius.emissionservice.jooq.template.tables.I18nEmissionDiurnalVariations.I18N_EMISSION_DIURNAL_VARIATIONS;
import static nl.overheid.aerius.emissionservice.jooq.template.tables.I18nSectors.I18N_SECTORS;
import static nl.overheid.aerius.emissionservice.jooq.template.tables.Sectors.SECTORS;
import static org.jooq.impl.DSL.coalesce;
import static org.jooq.impl.DSL.field;
import static org.jooq.impl.DSL.select;

import java.math.BigDecimal;
import java.util.List;
import java.util.Locale;
import java.util.Optional;

import org.jooq.Field;
import org.jooq.Record;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import nl.overheid.aerius.emissionservice.jooq.i18n.enums.LanguageCodeType;
import nl.overheid.aerius.emissionservice.model.DiurnalVariationSpecification;
import nl.overheid.aerius.emissionservice.model.Sector;
import nl.overheid.aerius.emissionservice.model.SourceCharacteristics;

@Repository
public class SectorRepository {

  private static final Field<Long> ID = field("id", Long.class);
  private static final Field<String> CODE = field("code", String.class);
  private static final Field<String> NAME = field("name", String.class);
  private static final Field<String> I18N_NAME = field("i18n_name", String.class);
  private static final Field<String> DESCRIPTION = field("description", String.class);
  private static final Field<String> I18N_DESCRIPTION = field("i18n_description", String.class);

  private final DatasetStore datasetStore;

  @Autowired
  public SectorRepository(final DatasetStore datasetStore) {
    this.datasetStore = datasetStore;
  }

  public List<Sector> getSectors(final Locale locale) {
    return datasetStore.dsl().select(
        SECTORS.SECTOR_ID.as(CODE),
        SECTORS.DESCRIPTION.as(NAME),
        coalesce(I18N_DESCRIPTION, SECTORS.DESCRIPTION).as(DESCRIPTION),
        SECTORS.SECTOR_ID.as(ID))
        .from(SECTORS)
        .leftJoin(
            select(I18N_SECTORS.SECTOR_ID, I18N_SECTORS.DESCRIPTION.as(I18N_DESCRIPTION))
                .from(I18N_SECTORS)
                .where(I18N_SECTORS.LANGUAGE_CODE.eq(DbUtil.getLanguageCodeType(locale))))
        .using(SECTORS.SECTOR_ID)
        .orderBy(SECTORS.SECTOR_ID)
        .fetchInto(Sector.class);
  }

  public Optional<Sector> getSector(final Locale locale, final String sectorCode) {
    try {
      final int sectorId = Integer.parseInt(sectorCode);
      final LanguageCodeType language = DbUtil.getLanguageCodeType(locale);
      final Optional<Sector> sector = getOptionalSector(language, sectorId);
      sector.ifPresent(sect -> sect.setDefaultSourceCharacteristics(getSectorDefaultCharacteristics(language, sectorId)));
      return sector;
    } catch (final NumberFormatException e) {
      return Optional.empty();
    }
  }

  private Optional<Sector> getOptionalSector(final LanguageCodeType language, final int sectorId) {
    return datasetStore.dsl().select(
        SECTORS.SECTOR_ID.as(CODE),
        SECTORS.DESCRIPTION.as(NAME),
        coalesce(I18N_DESCRIPTION, SECTORS.DESCRIPTION).as(DESCRIPTION),
        SECTORS.SECTOR_ID.as(ID))
        .from(SECTORS)
        .leftJoin(
            select(I18N_SECTORS.SECTOR_ID, I18N_SECTORS.DESCRIPTION.as(I18N_DESCRIPTION))
                .from(I18N_SECTORS)
                .where(I18N_SECTORS.LANGUAGE_CODE.eq(language)))
        .using(SECTORS.SECTOR_ID)
        .where(SECTORS.SECTOR_ID.eq(sectorId))
        .fetchOptionalInto(Sector.class);
  }

  private SourceCharacteristics getSectorDefaultCharacteristics(final LanguageCodeType language, final int sectorId) {
    return datasetStore.dsl().select(
        DEFAULT_SOURCE_CHARACTERISTICS_VIEW.HEAT_CONTENT,
        DEFAULT_SOURCE_CHARACTERISTICS_VIEW.HEIGHT,
        DEFAULT_SOURCE_CHARACTERISTICS_VIEW.SPREAD,
        DEFAULT_SOURCE_CHARACTERISTICS_VIEW.GCN_SECTOR_ID.as(DEFAULT_SOURCE_CHARACTERISTICS_VIEW.PARTICLE_SIZE_DISTRIBUTION),
        DEFAULT_SOURCE_CHARACTERISTICS_VIEW.EMISSION_DIURNAL_VARIATION_ID,
        DEFAULT_SOURCE_CHARACTERISTICS_VIEW.EMISSION_DIURNAL_VARIATION_CODE,
        coalesce(I18N_NAME, DEFAULT_SOURCE_CHARACTERISTICS_VIEW.EMISSION_DIURNAL_VARIATION_CODE).as(NAME),
        I18N_DESCRIPTION)
        .from(DEFAULT_SOURCE_CHARACTERISTICS_VIEW)
        .leftJoin(
            select(I18N_EMISSION_DIURNAL_VARIATIONS.EMISSION_DIURNAL_VARIATION_ID,
                I18N_EMISSION_DIURNAL_VARIATIONS.NAME.as(I18N_NAME),
                I18N_EMISSION_DIURNAL_VARIATIONS.DESCRIPTION.as(I18N_DESCRIPTION))
                    .from(I18N_EMISSION_DIURNAL_VARIATIONS)
                    .where(I18N_EMISSION_DIURNAL_VARIATIONS.LANGUAGE_CODE.eq(language)))
        .using(DEFAULT_SOURCE_CHARACTERISTICS_VIEW.EMISSION_DIURNAL_VARIATION_ID)
        .where(DEFAULT_SOURCE_CHARACTERISTICS_VIEW.SECTOR_ID.eq(sectorId))
        .fetchOne(this::mapCharacteristics);
  }

  private SourceCharacteristics mapCharacteristics(final Record record) {
    final DiurnalVariationSpecification diurnalVariation = new DiurnalVariationSpecification()
        .opsId(record.get(DEFAULT_SOURCE_CHARACTERISTICS_VIEW.EMISSION_DIURNAL_VARIATION_ID))
        .code(record.get(DEFAULT_SOURCE_CHARACTERISTICS_VIEW.EMISSION_DIURNAL_VARIATION_CODE))
        .name(record.get(NAME))
        .description(record.get(I18N_DESCRIPTION));
    return new SourceCharacteristics()
        .heatContent(record.get(DEFAULT_SOURCE_CHARACTERISTICS_VIEW.HEAT_CONTENT, BigDecimal.class))
        .emissionHeight(record.get(DEFAULT_SOURCE_CHARACTERISTICS_VIEW.HEIGHT, BigDecimal.class))
        .spread(record.get(DEFAULT_SOURCE_CHARACTERISTICS_VIEW.SPREAD, BigDecimal.class))
        .particleSizeDistributionId(record.get(DEFAULT_SOURCE_CHARACTERISTICS_VIEW.PARTICLE_SIZE_DISTRIBUTION))
        .diurnalVariation(diurnalVariation);
  }

}
