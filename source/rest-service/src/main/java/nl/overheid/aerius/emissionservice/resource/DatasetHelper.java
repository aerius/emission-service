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

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;
import org.springframework.web.server.ResponseStatusException;

import nl.overheid.aerius.emissionservice.repository.DatasetRepository;

@Component
public class DatasetHelper {

  public static final String LATEST_DATASET = "LATEST";

  private final DatasetRepository datasetRepository;

  public DatasetHelper(final DatasetRepository datasetRepository) {
    this.datasetRepository = datasetRepository;
  }

  public String validateDataset(final String dataset) {
    final String internalDataset;
    if (LATEST_DATASET.equalsIgnoreCase(dataset)) {
      internalDataset = datasetRepository.getLatestDataset();
    } else if (!datasetRepository.isValidDataset(dataset)) {
      throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Could not find dataset " + dataset);
    } else {
      internalDataset = dataset;
    }
    return internalDataset;
  }

}
