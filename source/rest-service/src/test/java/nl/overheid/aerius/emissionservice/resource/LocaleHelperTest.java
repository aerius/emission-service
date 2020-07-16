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
