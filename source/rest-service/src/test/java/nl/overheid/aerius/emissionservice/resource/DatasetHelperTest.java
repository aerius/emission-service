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

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.http.HttpStatus;
import org.springframework.web.server.ResponseStatusException;

import nl.overheid.aerius.emissionservice.repository.DatasetRepository;

@ExtendWith(MockitoExtension.class)
class DatasetHelperTest {

  private static final String LATEST_INTERNAL_DATASET = "somethingWild";
  private static final String OTHER_VALID_DATASET = "ordinaryDataset";

  private DatasetHelper datasetHelper;

  @BeforeEach
  void init(@Mock final DatasetRepository datasetRepository) {
    datasetHelper = new DatasetHelper(datasetRepository);
    lenient().when(datasetRepository.getLatestDataset()).thenReturn(LATEST_INTERNAL_DATASET);
    lenient().when(datasetRepository.isValidDataset(any(String.class)))
        .thenAnswer(invocation -> LATEST_INTERNAL_DATASET.equalsIgnoreCase(invocation.getArgument(0))
            || OTHER_VALID_DATASET.equalsIgnoreCase(invocation.getArgument(0)));
  }

  @Test
  void testValidateDatasetLatestInternal() {
    final String validated = datasetHelper.validateDataset(LATEST_INTERNAL_DATASET);
    assertEquals(LATEST_INTERNAL_DATASET, validated, "Latest internal dataset");
  }

  @Test
  void testValidateDatasetLatestExternal() {
    final String validated = datasetHelper.validateDataset(DatasetHelper.LATEST_DATASET);
    assertEquals(LATEST_INTERNAL_DATASET, validated, "Latest dataset as defined by helper");
  }

  @Test
  void testValidateDatasetOtherValid() {
    final String validated = datasetHelper.validateDataset(OTHER_VALID_DATASET);
    assertEquals(OTHER_VALID_DATASET, validated, "Other dataset");
  }

  @Test
  void testValidateDatasetOtherValidDifferentCase() {
    final String validated = datasetHelper.validateDataset(OTHER_VALID_DATASET.toLowerCase());
    // Just returning supplied dataset now, behavior might change with database implementation.
    assertEquals(OTHER_VALID_DATASET.toLowerCase(), validated, "Other dataset lowerecased");
  }

  @Test
  void testValidateDatasetWithUnknownDataset() {
    final ResponseStatusException exception = assertThrows(ResponseStatusException.class, () -> {
      datasetHelper.validateDataset("anUnknownDataset");
    });

    assertEquals(HttpStatus.NOT_FOUND, exception.getStatus(), "Status used when dataset unknown");
    assertEquals("Could not find dataset anUnknownDataset", exception.getReason(), "Message used when dataset unknown");
  }

}
