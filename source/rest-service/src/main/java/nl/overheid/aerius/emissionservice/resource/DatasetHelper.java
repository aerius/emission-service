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

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Optional;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;
import org.springframework.web.server.ResponseStatusException;

import nl.overheid.aerius.emissionservice.domain.DatabaseDataset;
import nl.overheid.aerius.emissionservice.model.Category;
import nl.overheid.aerius.emissionservice.model.Dataset;
import nl.overheid.aerius.emissionservice.repository.DatasetRepository;

@Component
public class DatasetHelper {

  public static final String CURRENT_DATASET = "CURRENT";
  public static final Category CURRENT_CATEGORY = new Category()
      .code(CURRENT_DATASET)
      .name(CURRENT_DATASET)
      .description(CURRENT_DATASET);

  private final DatasetRepository datasetRepository;

  public DatasetHelper(final DatasetRepository datasetRepository) {
    this.datasetRepository = datasetRepository;
  }

  public List<Category> getDatasets(final Locale locale) {
    final List<Category> databaseSets = datasetRepository.getDatasets(locale);
    final List<Category> allSets = new ArrayList<>();
    allSets.add(CURRENT_CATEGORY);
    allSets.addAll(databaseSets);
    return allSets;
  }

  public DatabaseDataset validateDataset(final String dataset) {
    final Optional<DatabaseDataset> internalDataset;
    if (CURRENT_DATASET.equalsIgnoreCase(dataset)) {
      internalDataset = Optional.of(datasetRepository.getCurrentDataset());
    } else {
      internalDataset = datasetRepository.getValidDataset(dataset);
    }
    return internalDataset
        .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Could not find dataset " + dataset));
  }

  public Dataset getDataset(final Locale locale, final String dataset) {
    final DatabaseDataset databaseDataset = validateDataset(dataset);
    return datasetRepository.getDataset(locale, databaseDataset.getCode());
  }

}
