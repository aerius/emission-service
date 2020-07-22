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
package nl.overheid.aerius.emissionservice.resource;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Locale;

import javax.ws.rs.core.HttpHeaders;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.Mockito;

class LocaleHelperTest {

  @Mock
  HttpHeaders mockHeaders = Mockito.mock(HttpHeaders.class);

  private LocaleHelper localeHelper;

  @BeforeEach
  void init() {
    localeHelper = new LocaleHelper();
  }

  @Test
  void testGetResponseLocaleWithoutHeader() {
    final Locale locale = localeHelper.getResponseLocale(mockHeaders);
    assertEquals(LocaleHelper.LOCALE_NL, locale, "Locale when there is no header");
  }

  @Test
  void testGetResponseLocaleExpectedHeader() {
    Mockito.when(mockHeaders.getHeaderString(HttpHeaders.ACCEPT_LANGUAGE)).thenReturn("nl");
    Locale locale = localeHelper.getResponseLocale(mockHeaders);
    assertEquals(LocaleHelper.LOCALE_NL, locale, "Locale for nl");

    Mockito.when(mockHeaders.getHeaderString(HttpHeaders.ACCEPT_LANGUAGE)).thenReturn("en");
    locale = localeHelper.getResponseLocale(mockHeaders);
    assertEquals(LocaleHelper.LOCALE_EN, locale, "Locale for en");

    Mockito.when(mockHeaders.getHeaderString(HttpHeaders.ACCEPT_LANGUAGE)).thenReturn("en-gb");
    locale = localeHelper.getResponseLocale(mockHeaders);
    assertEquals(LocaleHelper.LOCALE_EN, locale, "Locale for en-gb");

    Mockito.when(mockHeaders.getHeaderString(HttpHeaders.ACCEPT_LANGUAGE)).thenReturn("en-GB");
    locale = localeHelper.getResponseLocale(mockHeaders);
    assertEquals(LocaleHelper.LOCALE_EN, locale, "Locale for en-GB");

    Mockito.when(mockHeaders.getHeaderString(HttpHeaders.ACCEPT_LANGUAGE)).thenReturn("fr");
    locale = localeHelper.getResponseLocale(mockHeaders);
    assertEquals(LocaleHelper.LOCALE_NL, locale, "Locale for fr");
  }

  @Test
  void testGetResponseLocaleFullHeader() {
    Mockito.when(mockHeaders.getHeaderString(HttpHeaders.ACCEPT_LANGUAGE)).thenReturn("fr-FR;q=1.0,en-GB;q=0.5,nl-NL;q=0.0");

    final Locale locale = localeHelper.getResponseLocale(mockHeaders);
    assertEquals(LocaleHelper.LOCALE_EN, locale, "Locale with multiple languages");
  }

}