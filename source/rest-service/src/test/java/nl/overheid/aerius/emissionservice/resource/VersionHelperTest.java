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
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.lenient;

import javax.ws.rs.NotAcceptableException;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import nl.overheid.aerius.emissionservice.repository.VersionRepository;

@ExtendWith(MockitoExtension.class)
class VersionHelperTest {

  private static final String LATEST_INTERNAL_VERSION = "somethingWild";
  private static final String OTHER_VALID_VERSION = "ordinaryVersion";

  private VersionHelper versionHelper;

  @BeforeEach
  void init(@Mock final VersionRepository versionRepository) {
    versionHelper = new VersionHelper(versionRepository);
    lenient().when(versionRepository.getLatestVersion()).thenReturn(LATEST_INTERNAL_VERSION);
    lenient().when(versionRepository.isValidVersion(any(String.class)))
        .thenAnswer(invocation -> LATEST_INTERNAL_VERSION.equalsIgnoreCase(invocation.getArgument(0))
            || OTHER_VALID_VERSION.equalsIgnoreCase(invocation.getArgument(0)));
  }

  @Test
  void testValidateVersionLatestInternal() {
    final String validated = versionHelper.validateVersion(LATEST_INTERNAL_VERSION);
    assertEquals(LATEST_INTERNAL_VERSION, validated, "Latest internal version");
  }

  @Test
  void testValidateVersionLatestExternal() {
    final String validated = versionHelper.validateVersion(VersionHelper.LATEST_VERSION);
    assertEquals(LATEST_INTERNAL_VERSION, validated, "Latest version as defined by helper");
  }

  @Test
  void testValidateVersionOtherValid() {
    final String validated = versionHelper.validateVersion(OTHER_VALID_VERSION);
    assertEquals(OTHER_VALID_VERSION, validated, "Other version");
  }

  @Test
  void testValidateVersionOtherValidDifferentCase() {
    final String validated = versionHelper.validateVersion(OTHER_VALID_VERSION.toLowerCase());
    // Just returning supplied version now, behavior might change with database implementation.
    assertEquals(OTHER_VALID_VERSION.toLowerCase(), validated, "Other version lowerecased");
  }

  @Test
  void testValidateVersionWithUnknownVersion() {
    assertThrows(NotAcceptableException.class, () -> {
      versionHelper.validateVersion("anUnknownVersion");
    });
  }

}
