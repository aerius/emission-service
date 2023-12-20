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

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Locale;

import org.junit.jupiter.api.Test;

import nl.aerius.emissionservice.db.generated.i18n.enums.LanguageCodeType;

class DbUtilTest {

  @Test
  void testGetLanguageCodeType() {
    assertEquals(LanguageCodeType.nl_, DbUtil.getLanguageCodeType(Locale.forLanguageTag("nl")),
        "When dutch supplied, should be nl");
    assertEquals(LanguageCodeType.en, DbUtil.getLanguageCodeType(Locale.forLanguageTag("en")),
        "When english supplied, should be en");
    assertEquals(LanguageCodeType.nl_, DbUtil.getLanguageCodeType(Locale.forLanguageTag("de")),
        "When something else like german supplied, should go to fallback nl");
  }

}
