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

import static nl.overheid.aerius.emissionservice.jooq.template.tables.FarmlandCategories.FARMLAND_CATEGORIES;
import static nl.overheid.aerius.emissionservice.jooq.template.tables.I18nFarmlandCategories.I18N_FARMLAND_CATEGORIES;
import static org.jooq.impl.DSL.coalesce;
import static org.jooq.impl.DSL.field;
import static org.jooq.impl.DSL.select;

import java.util.List;
import java.util.Locale;

import org.jooq.Field;
import org.springframework.stereotype.Repository;

import nl.overheid.aerius.emissionservice.jooq.i18n.enums.LanguageCodeType;
import nl.overheid.aerius.emissionservice.model.Category;

@Repository
public class FarmlandRepository {

  private static final Field<String> DESCRIPTION = field("description", String.class);
  private static final Field<String> I18N_DESCRIPTION = field("i18n_description", String.class);

  private final DatasetStore datasetStore;

  public FarmlandRepository(final DatasetStore datasetStore) {
    this.datasetStore = datasetStore;
  }

  public List<Category> getFarmlands(final Locale locale) {
    final LanguageCodeType language = DbUtil.getLanguageCodeType(locale);
    return datasetStore.dsl().select(
        FARMLAND_CATEGORIES.CODE,
        FARMLAND_CATEGORIES.NAME,
        coalesce(I18N_DESCRIPTION, FARMLAND_CATEGORIES.DESCRIPTION).as(DESCRIPTION))
        .from(FARMLAND_CATEGORIES)
        .leftJoin(
            select(I18N_FARMLAND_CATEGORIES.FARMLAND_CATEGORY_ID, I18N_FARMLAND_CATEGORIES.DESCRIPTION.as(I18N_DESCRIPTION))
                .from(I18N_FARMLAND_CATEGORIES)
                .where(I18N_FARMLAND_CATEGORIES.LANGUAGE_CODE.eq(language)))
        .using(FARMLAND_CATEGORIES.FARMLAND_CATEGORY_ID)
        .orderBy(FARMLAND_CATEGORIES.CODE)
        .fetchInto(Category.class);
  }

}
