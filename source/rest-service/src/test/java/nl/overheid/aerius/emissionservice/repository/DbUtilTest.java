package nl.overheid.aerius.emissionservice.repository;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Locale;

import org.junit.jupiter.api.Test;

import nl.overheid.aerius.emissionservice.jooq.i18n.enums.LanguageCodeType;

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
