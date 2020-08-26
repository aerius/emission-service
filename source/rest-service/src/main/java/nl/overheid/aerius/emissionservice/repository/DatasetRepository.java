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

import static nl.overheid.aerius.emissionservice.jooq.public_.tables.Datasets.DATASETS;
import static nl.overheid.aerius.emissionservice.jooq.public_.tables.I18nDatasets.I18N_DATASETS;
import static org.jooq.impl.DSL.coalesce;
import static org.jooq.impl.DSL.field;
import static org.jooq.impl.DSL.select;

import java.util.List;
import java.util.Locale;
import java.util.Optional;

import org.jooq.DSLContext;
import org.jooq.Field;
import org.springframework.stereotype.Repository;

import nl.overheid.aerius.emissionservice.domain.Dataset;
import nl.overheid.aerius.emissionservice.model.Category;

@Repository
public class DatasetRepository {

  private static final Field<String> DESCRIPTION = field("description", String.class);
  private static final Field<String> I18N_DESCRIPTION = field("i18n_description", String.class);

  private final DSLContext publicDsl;

  public DatasetRepository(final DSLContext publicDsl) {
    this.publicDsl = publicDsl;
  }

  public List<Category> getDatasets(final Locale locale) {
    return publicDsl.select(
        DATASETS.CODE,
        DATASETS.NAME,
        coalesce(I18N_DESCRIPTION, DATASETS.DESCRIPTION).as(DESCRIPTION))
        .from(DATASETS)
        .leftJoin(
            select(I18N_DATASETS.CODE, I18N_DATASETS.DESCRIPTION.as(I18N_DESCRIPTION))
                .from(I18N_DATASETS)
                .where(I18N_DATASETS.LANGUAGE_CODE.eq(DbUtil.getLanguageCodeType(locale))))
        .using(I18N_DATASETS.CODE)
        .fetchInto(Category.class);
  }

  public Dataset getCurrentDataset() {
    return publicDsl.select(
        DATASETS.CODE,
        DATASETS.SCHEMA_NAME)
        .from(DATASETS)
        .where(DATASETS.CURRENT.eq(true))
        .fetchOneInto(Dataset.class);
  }

  public Optional<Dataset> getValidDataset(final String dataset) {
    return publicDsl.select(
        DATASETS.CODE,
        DATASETS.SCHEMA_NAME)
        .from(DATASETS)
        .where(DATASETS.CODE.equalIgnoreCase(dataset))
        .fetchOptionalInto(Dataset.class);
  }

}
