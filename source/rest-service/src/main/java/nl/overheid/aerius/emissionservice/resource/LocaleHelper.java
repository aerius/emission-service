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

import java.util.Collection;
import java.util.List;
import java.util.Locale;
import java.util.Optional;

import org.springframework.http.HttpHeaders;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.NativeWebRequest;

@Component
public class LocaleHelper {

  public static Locale LOCALE_NL = Locale.forLanguageTag("nl");
  public static Locale LOCALE_EN = Locale.forLanguageTag("en");
  public Collection<Locale> ACCEPTED_LOCALES = List.of(LOCALE_NL, LOCALE_EN);

  public Locale getResponseLocale(final Optional<NativeWebRequest> request) {
    final Optional<Locale> result;
    final Optional<String> languageHeader = request.map(r -> r.getHeader(HttpHeaders.ACCEPT_LANGUAGE));
    if (languageHeader.isPresent()) {
      final List<Locale.LanguageRange> languageRanges = Locale.LanguageRange.parse(languageHeader.get());

      result = Optional.ofNullable(Locale.lookup(languageRanges, ACCEPTED_LOCALES));
    } else {
      result = Optional.empty();
    }

    return result.orElse(LOCALE_NL);
  }
}
