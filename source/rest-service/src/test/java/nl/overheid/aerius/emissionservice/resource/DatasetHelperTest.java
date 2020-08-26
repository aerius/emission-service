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
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.lenient;
import static org.mockito.Mockito.when;

import java.util.List;
import java.util.Optional;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.http.HttpStatus;
import org.springframework.web.server.ResponseStatusException;

import nl.overheid.aerius.emissionservice.domain.Dataset;
import nl.overheid.aerius.emissionservice.repository.DatasetRepository;

@ExtendWith(MockitoExtension.class)
class DatasetHelperTest {

  private static final String CURRENT_INTERNAL_DATASET = "somethingWild";
  private static final String OTHER_VALID_DATASET = "ordinaryDataset";

  private DatasetHelper datasetHelper;
  private DatasetRepository datasetRepository;

  @BeforeEach
  void init(@Mock final DatasetRepository datasetRepository) {
    this.datasetRepository = datasetRepository;
    datasetHelper = new DatasetHelper(datasetRepository);
    final Dataset currentInternal = new Dataset(CURRENT_INTERNAL_DATASET, "");
    lenient().when(datasetRepository.getCurrentDataset()).thenReturn(currentInternal);
    lenient().when(datasetRepository.getValidDataset(any(String.class)))
        .thenAnswer(invocation -> toValidDataset(invocation.getArgument(0)));
  }

  private Optional<Dataset> toValidDataset(final String version) {
    return CURRENT_INTERNAL_DATASET.equalsIgnoreCase(version)
        || OTHER_VALID_DATASET.equalsIgnoreCase(version)
            ? Optional.of(new Dataset(version, version))
            : Optional.empty();
  }

  @Test
  void testValidateDatasetCurrentInternal() {
    final Dataset validated = datasetHelper.validateDataset(CURRENT_INTERNAL_DATASET);
    assertEquals(CURRENT_INTERNAL_DATASET, validated.getCode(), "Current internal dataset");
  }

  @Test
  void testValidateDatasetCurrentExternal() {
    final Dataset validated = datasetHelper.validateDataset(DatasetHelper.CURRENT_DATASET);
    assertEquals(CURRENT_INTERNAL_DATASET, validated.getCode(), "Current dataset as defined by helper");
  }

  @Test
  void testValidateDatasetOtherValid() {
    final Dataset validated = datasetHelper.validateDataset(OTHER_VALID_DATASET);
    assertEquals(OTHER_VALID_DATASET, validated.getCode(), "Other dataset");
  }

  @Test
  void testValidateDatasetOtherValidDifferentCase() {
    final Dataset validated = datasetHelper.validateDataset(OTHER_VALID_DATASET.toLowerCase());
    // Just returning supplied dataset now, behavior might change with database implementation.
    assertEquals(OTHER_VALID_DATASET.toLowerCase(), validated.getCode(), "Other dataset lowerecased");
  }

  @Test
  void testValidateDatasetWithUnknownDataset() {
    final ResponseStatusException exception = assertThrows(ResponseStatusException.class, () -> {
      datasetHelper.validateDataset("anUnknownDataset");
    });

    assertEquals(HttpStatus.NOT_FOUND, exception.getStatus(), "Status used when dataset unknown");
    assertEquals("Could not find dataset anUnknownDataset", exception.getReason(), "Message used when dataset unknown");
  }

  @Test
  void testGetDatasetCodes() {
    when(datasetRepository.getDatasets()).thenReturn(
        List.of(new Dataset(CURRENT_INTERNAL_DATASET, "Schema 1"), new Dataset(OTHER_VALID_DATASET, "Schema 2")));
    final List<String> codes = datasetHelper.getDatasetCodes();
    assertEquals(3, codes.size(), "amount of codes");
    assertTrue(codes.contains(CURRENT_INTERNAL_DATASET), "Should contain current dataset");
    assertTrue(codes.contains(OTHER_VALID_DATASET), "Should contain other dataset");
    assertTrue(codes.contains(DatasetHelper.CURRENT_DATASET), "Should contain the identifier used for the current dataset");
  }

}
