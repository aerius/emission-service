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

import static org.jooq.impl.DSL.coalesce;
import static org.jooq.impl.DSL.condition;
import static org.jooq.impl.DSL.field;
import static org.jooq.impl.DSL.select;
import static org.jooq.impl.DSL.table;

import java.util.List;
import java.util.Locale;

import org.jooq.DSLContext;
import org.jooq.Field;
import org.jooq.Record;
import org.jooq.Table;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import nl.overheid.aerius.emissionservice.domain.Sector;

@Repository
public class SectorRepository {

  private static final Field<Integer> SECTOR_ID = field("sector_id", Integer.class);
  private static final Field<String> NAME = field("description", String.class);
  private static final Field<String> DESCRIPTION = field("description", String.class);
  private static final Field<String> I18N_DESCRIPTION = field("i18n_description", String.class);

  private static final Table<Record> SECTORS = table("sectors");
  private static final Table<Record> I18N_SECTORS = table("i18n.sectors");

  private final DSLContext dsl;

  @Autowired
  public SectorRepository(final DSLContext dsl) {
    this.dsl = dsl;
  }

  public List<Sector> getSectors(final Locale locale) {
    return dsl.select(
        SECTOR_ID,
        DESCRIPTION.as(NAME),
        coalesce(I18N_DESCRIPTION, DESCRIPTION))
        .from(SECTORS)
        .leftJoin(
            select(SECTOR_ID, DESCRIPTION.as(I18N_DESCRIPTION))
                .from(I18N_SECTORS)
                .where(condition("language_code = ?::i18n.language_code_type", locale.getLanguage())))
        .using(SECTOR_ID)
        .fetchInto(Sector.class);
  }

}
