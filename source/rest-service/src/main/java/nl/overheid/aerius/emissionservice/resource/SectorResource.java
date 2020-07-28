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

import java.util.List;
import java.util.Locale;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.context.request.NativeWebRequest;

import nl.overheid.aerius.emissionservice.api.SectorsApiDelegate;
import nl.overheid.aerius.emissionservice.model.Sector;
import nl.overheid.aerius.emissionservice.repository.DatasetStore;
import nl.overheid.aerius.emissionservice.repository.SectorRepository;

@Service
public class SectorResource implements SectorsApiDelegate {

  private final NativeWebRequest nativeWebRequest;
  private final LocaleHelper localeHelper;
  private final VersionHelper versionHelper;
  private final DatasetStore datasetStore;
  private final SectorRepository sectorRepository;

  @Autowired
  public SectorResource(final NativeWebRequest nativeWebRequest, final LocaleHelper localeHelper, final VersionHelper versionHelper,
      final DatasetStore datasetStore, final SectorRepository sectorRepository) {
    this.nativeWebRequest = nativeWebRequest;
    this.localeHelper = localeHelper;
    this.versionHelper = versionHelper;
    this.datasetStore = datasetStore;
    this.sectorRepository = sectorRepository;
  }

  @Override
  public Optional<NativeWebRequest> getRequest() {
    return Optional.ofNullable(nativeWebRequest);
  }

  @Override
  public ResponseEntity<List<Sector>> listSectors(final String version) {
    final String actualVersion = versionHelper.validateVersion(version);
    datasetStore.setDataset(actualVersion);
    final Locale locale = localeHelper.getResponseLocale(getRequest());
    final List<Sector> sectors = sectorRepository.getSectors(locale);
    return ResponseEntity
        .status(HttpStatus.OK)
        .header("data-version", actualVersion)
        .body(sectors);
  }

}
