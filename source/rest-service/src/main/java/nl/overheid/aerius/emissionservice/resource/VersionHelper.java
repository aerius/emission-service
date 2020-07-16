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

import javax.ws.rs.NotAcceptableException;

import org.springframework.stereotype.Component;

import nl.overheid.aerius.emissionservice.repository.VersionRepository;

@Component
public class VersionHelper {

  public static final String LATEST_VERSION = "LATEST";

  private final VersionRepository versionRepository;

  public VersionHelper(final VersionRepository versionRepository) {
    this.versionRepository = versionRepository;
  }

  public String validateVersion(final String version) {
    final String internalVersion;
    if (LATEST_VERSION.equalsIgnoreCase(version)) {
      internalVersion = versionRepository.getLatestVersion();
    } else if (!versionRepository.isValidVersion(version)) {
      throw new NotAcceptableException("Could not find supplied version.");
    } else {
      internalVersion = version;
    }
    return internalVersion;
  }

}
