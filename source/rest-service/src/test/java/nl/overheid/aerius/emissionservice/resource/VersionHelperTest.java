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
