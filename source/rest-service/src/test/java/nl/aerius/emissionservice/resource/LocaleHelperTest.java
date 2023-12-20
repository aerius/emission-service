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
package nl.aerius.emissionservice.resource;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Locale;
import java.util.Optional;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import nl.aerius.emissionservice.resource.LocaleHelper;

class LocaleHelperTest {

  private LocaleHelper localeHelper;

  @BeforeEach
  void init() {
    localeHelper = new LocaleHelper();
  }

  @Test
  void testGetResponseLocaleWithoutHeader() {
    final Locale locale = localeHelper.getResponseLocale(Optional.empty());
    assertEquals(LocaleHelper.LOCALE_NL, locale, "Locale when there is no header");
  }

  @Test
  void testGetResponseLocaleExpectedHeader() {
    Locale locale = localeHelper.getResponseLocale(Optional.of("nl"));
    assertEquals(LocaleHelper.LOCALE_NL, locale, "Locale for nl");

    locale = localeHelper.getResponseLocale(Optional.of("en"));
    assertEquals(LocaleHelper.LOCALE_EN, locale, "Locale for en");

    locale = localeHelper.getResponseLocale(Optional.of("en-gb"));
    assertEquals(LocaleHelper.LOCALE_EN, locale, "Locale for en-gb");

    locale = localeHelper.getResponseLocale(Optional.of("en-GB"));
    assertEquals(LocaleHelper.LOCALE_EN, locale, "Locale for en-GB");

    locale = localeHelper.getResponseLocale(Optional.of("fr"));
    assertEquals(LocaleHelper.LOCALE_NL, locale, "Locale for fr");
  }

  @Test
  void testGetResponseLocaleFullHeader() {
    final Locale locale = localeHelper.getResponseLocale(Optional.of("fr-FR;q=1.0,en-GB;q=0.5,nl-NL;q=0.0"));
    assertEquals(LocaleHelper.LOCALE_EN, locale, "Locale with multiple languages");
  }

}
