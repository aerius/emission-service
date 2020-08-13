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
import java.util.Optional;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;
import org.springframework.web.server.ResponseStatusException;

import nl.overheid.aerius.emissionservice.domain.Dataset;
import nl.overheid.aerius.emissionservice.repository.DatasetRepository;

@Component
public class DatasetHelper {

  public static final String LATEST_DATASET = "LATEST";

  private final DatasetRepository datasetRepository;

  public DatasetHelper(final DatasetRepository datasetRepository) {
    this.datasetRepository = datasetRepository;
  }

  public List<String> getDatasetCodes() {
    final List<Dataset> datasets = datasetRepository.getDatasets();
    final List<String> codes = new ArrayList<>();
    codes.add(LATEST_DATASET);
    datasets.stream().map(Dataset::getCode).forEach(codes::add);
    return codes;
  }

  public Dataset validateDataset(final String dataset) {
    final Optional<Dataset> internalDataset;
    if (LATEST_DATASET.equalsIgnoreCase(dataset)) {
      internalDataset = Optional.of(datasetRepository.getLatestDataset());
    } else {
      internalDataset = datasetRepository.getValidDataset(dataset);
    }
    return internalDataset
        .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Could not find dataset " + dataset));
  }

}
