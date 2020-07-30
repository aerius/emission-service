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
package nl.overheid.aerius.emissionservice.repository;

import org.springframework.stereotype.Repository;

@Repository
public class DatasetRepository {

  public static final String LATEST_DATASET = "dev";

  public String getLatestDataset() {
    return LATEST_DATASET;
  }

  public boolean isValidDataset(final String dataset) {
    // For now only accept one dataset, but this should be determined from database.
    if (LATEST_DATASET.equalsIgnoreCase(dataset)) {
      return true;
    } else {
      return false;
    }
  }

}
