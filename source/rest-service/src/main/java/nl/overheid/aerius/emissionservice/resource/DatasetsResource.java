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
import org.springframework.web.server.ResponseStatusException;

import nl.overheid.aerius.emissionservice.api.DatasetsApiDelegate;
import nl.overheid.aerius.emissionservice.domain.Dataset;
import nl.overheid.aerius.emissionservice.model.Category;
import nl.overheid.aerius.emissionservice.model.FarmAdditionalLodgingSystemCategory;
import nl.overheid.aerius.emissionservice.model.FarmFodderMeasureCategory;
import nl.overheid.aerius.emissionservice.model.FarmLodgingCategory;
import nl.overheid.aerius.emissionservice.model.FarmReductiveLodgingSystemCategory;
import nl.overheid.aerius.emissionservice.model.Sector;
import nl.overheid.aerius.emissionservice.repository.DatasetStore;
import nl.overheid.aerius.emissionservice.repository.FarmRepository;
import nl.overheid.aerius.emissionservice.repository.SectorRepository;

@Service
public class DatasetsResource implements DatasetsApiDelegate {

  private static final String DATASET_HEADER = "dataset";

  private final NativeWebRequest nativeWebRequest;
  private final LocaleHelper localeHelper;
  private final DatasetHelper datasetHelper;
  private final DatasetStore datasetStore;
  private final SectorRepository sectorRepository;
  private final FarmRepository farmRepository;

  @Autowired
  public DatasetsResource(final NativeWebRequest nativeWebRequest, final LocaleHelper localeHelper, final DatasetHelper datasetHelper,
      final DatasetStore datasetStore, final SectorRepository sectorRepository, final FarmRepository farmRepository) {
    this.nativeWebRequest = nativeWebRequest;
    this.localeHelper = localeHelper;
    this.datasetHelper = datasetHelper;
    this.datasetStore = datasetStore;
    this.sectorRepository = sectorRepository;
    this.farmRepository = farmRepository;
  }

  @Override
  public Optional<NativeWebRequest> getRequest() {
    return Optional.ofNullable(nativeWebRequest);
  }

  @Override
  public ResponseEntity<List<Category>> listDatasets(final Optional<String> acceptLanguage) {
    final Locale locale = localeHelper.getResponseLocale(acceptLanguage);
    final List<Category> datasetCodes = datasetHelper.getDatasets(locale);
    return ResponseEntity
        .status(HttpStatus.OK)
        .body(datasetCodes);
  }

  @Override
  public ResponseEntity<List<Sector>> listSectors(final String dataset, final Optional<String> acceptLanguage) {
    final String actualDataset = handleDataset(dataset);
    final Locale locale = localeHelper.getResponseLocale(acceptLanguage);
    final List<Sector> sectors = sectorRepository.getSectors(locale);
    return ResponseEntity
        .status(HttpStatus.OK)
        .header(DATASET_HEADER, actualDataset)
        .body(sectors);
  }

  @Override
  public ResponseEntity<List<Category>> listFarmAnimals(final String dataset, final Optional<String> acceptLanguage) {
    final String actualDataset = handleDataset(dataset);
    final Locale locale = localeHelper.getResponseLocale(acceptLanguage);
    final List<Category> categories = farmRepository.getFarmAnimals(locale);
    return ResponseEntity
        .status(HttpStatus.OK)
        .header(DATASET_HEADER, actualDataset)
        .body(categories);
  }

  @Override
  public ResponseEntity<List<Category>> listFarmLodgings(final String dataset, final Optional<String> acceptLanguage,
      final Optional<String> animalcode) {
    final String actualDataset = handleDataset(dataset);
    final Locale locale = localeHelper.getResponseLocale(acceptLanguage);
    final List<Category> categories = farmRepository.getFarmLodgings(locale, animalcode);
    return ResponseEntity
        .status(HttpStatus.OK)
        .header(DATASET_HEADER, actualDataset)
        .body(categories);
  }

  @Override
  public ResponseEntity<FarmLodgingCategory> getFarmLodging(final String dataset, final String code, final Optional<String> acceptLanguage) {
    final String actualDataset = handleDataset(dataset);
    final Locale locale = localeHelper.getResponseLocale(acceptLanguage);
    final FarmLodgingCategory lodging = farmRepository.getFarmLodging(locale, code).orElseThrow(
        () -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Could not find lodging with code " + code));
    return ResponseEntity
        .status(HttpStatus.OK)
        .header(DATASET_HEADER, actualDataset)
        .body(lodging);
  }

  @Override
  public ResponseEntity<List<Category>> listFarmAdditionalLodgingSystems(final String dataset, final Optional<String> acceptLanguage) {
    final String actualDataset = handleDataset(dataset);
    final Locale locale = localeHelper.getResponseLocale(acceptLanguage);
    final List<Category> categories = farmRepository.getFarmAdditionalLodgingSystems(locale);
    return ResponseEntity
        .status(HttpStatus.OK)
        .header(DATASET_HEADER, actualDataset)
        .body(categories);
  }

  @Override
  public ResponseEntity<FarmAdditionalLodgingSystemCategory> getFarmAdditionalLodgingSystem(final String dataset, final String code,
      final Optional<String> acceptLanguage) {
    final String actualDataset = handleDataset(dataset);
    final Locale locale = localeHelper.getResponseLocale(acceptLanguage);
    final FarmAdditionalLodgingSystemCategory additionalSystem = farmRepository.getFarmAdditionalLodgingSystem(locale, code).orElseThrow(
        () -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Could not find additional system with code " + code));
    return ResponseEntity
        .status(HttpStatus.OK)
        .header(DATASET_HEADER, actualDataset)
        .body(additionalSystem);
  }

  @Override
  public ResponseEntity<List<Category>> listFarmReductiveLodgingSystems(final String dataset, final Optional<String> acceptLanguage) {
    final String actualDataset = handleDataset(dataset);
    final Locale locale = localeHelper.getResponseLocale(acceptLanguage);
    final List<Category> categories = farmRepository.getFarmReductiveLodgingSystems(locale);
    return ResponseEntity
        .status(HttpStatus.OK)
        .header(DATASET_HEADER, actualDataset)
        .body(categories);
  }

  @Override
  public ResponseEntity<FarmReductiveLodgingSystemCategory> getFarmReductiveLodgingSystem(final String dataset, final String code,
      final Optional<String> acceptLanguage) {
    final String actualDataset = handleDataset(dataset);
    final Locale locale = localeHelper.getResponseLocale(acceptLanguage);
    final FarmReductiveLodgingSystemCategory reductiveSystem = farmRepository.getFarmReductiveLodgingSystem(locale, code).orElseThrow(
        () -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Could not find reductive system with code " + code));
    return ResponseEntity
        .status(HttpStatus.OK)
        .header(DATASET_HEADER, actualDataset)
        .body(reductiveSystem);
  }

  @Override
  public ResponseEntity<List<Category>> listFarmLodgingFodderMeasures(final String dataset, final Optional<String> acceptLanguage) {
    final String actualDataset = handleDataset(dataset);
    final Locale locale = localeHelper.getResponseLocale(acceptLanguage);
    final List<Category> categories = farmRepository.getFarmFodderMeasures(locale);
    return ResponseEntity
        .status(HttpStatus.OK)
        .header(DATASET_HEADER, actualDataset)
        .body(categories);
  }

  @Override
  public ResponseEntity<FarmFodderMeasureCategory> getFarmLodgingFodderMeasure(final String dataset, final String code,
      final Optional<String> acceptLanguage) {
    final String actualDataset = handleDataset(dataset);
    final Locale locale = localeHelper.getResponseLocale(acceptLanguage);
    final FarmFodderMeasureCategory reductiveSystem = farmRepository.getFarmFodderMeasure(locale, code).orElseThrow(
        () -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Could not find fodder measure with code " + code));
    return ResponseEntity
        .status(HttpStatus.OK)
        .header(DATASET_HEADER, actualDataset)
        .body(reductiveSystem);
  }

  private String handleDataset(final String dataset) {
    final Dataset actualDataset = datasetHelper.validateDataset(dataset);
    datasetStore.setDataset(actualDataset.getSchemaName());
    return actualDataset.getCode();
  }

}
