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

import static nl.overheid.aerius.emissionservice.jooq.template.tables.I18nSectors.I18N_SECTORS;
import static nl.overheid.aerius.emissionservice.jooq.template.tables.Sectors.SECTORS;
import static org.jooq.impl.DSL.coalesce;
import static org.jooq.impl.DSL.field;
import static org.jooq.impl.DSL.select;

import java.util.List;
import java.util.Locale;

import org.jooq.Field;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import nl.overheid.aerius.emissionservice.jooq.i18n.enums.LanguageCodeType;
import nl.overheid.aerius.emissionservice.model.Sector;

@Repository
public class SectorRepository {

  private static final Field<Integer> ID = field("id", Integer.class);
  private static final Field<String> NAME = field("name", String.class);
  private static final Field<String> DESCRIPTION = field("description", String.class);
  private static final Field<String> I18N_DESCRIPTION = field("i18n_description", String.class);

  private final DatasetStore datasetStore;

  @Autowired
  public SectorRepository(final DatasetStore datasetStore) {
    this.datasetStore = datasetStore;
  }

  public List<Sector> getSectors(final Locale locale) {
    return datasetStore.dsl().select(
        SECTORS.SECTOR_ID.as(ID),
        SECTORS.DESCRIPTION.as(NAME),
        coalesce(I18N_DESCRIPTION, SECTORS.DESCRIPTION).as(DESCRIPTION))
        .from(SECTORS)
        .leftJoin(
            select(I18N_SECTORS.SECTOR_ID, I18N_SECTORS.DESCRIPTION.as(I18N_DESCRIPTION))
                .from(I18N_SECTORS)
                .where(I18N_SECTORS.LANGUAGE_CODE.eq(getLanguageCodeType(locale))))
        .using(SECTORS.SECTOR_ID)
        .orderBy(SECTORS.SECTOR_ID)
        .fetchInto(Sector.class);
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
