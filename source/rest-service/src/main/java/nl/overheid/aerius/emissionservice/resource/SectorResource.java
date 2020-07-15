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

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.MediaType;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import nl.overheid.aerius.emissionservice.domain.Sector;
import nl.overheid.aerius.emissionservice.repository.SectorRepository;

@Service
@Path("/sector")
public class SectorResource {

  private final LocaleHelper localeHelper;
  private final SectorRepository sectorRepository;

  @Context
  private HttpHeaders headers;

  @Autowired
  public SectorResource(final LocaleHelper localeHelper, final SectorRepository sectorRepository) {
    this.localeHelper = localeHelper;
    this.sectorRepository = sectorRepository;
  }

  @GET
  @Produces(MediaType.APPLICATION_JSON)
  public List<Sector> getSectors() {
    final Locale locale = localeHelper.getResponseLocale(headers);
    return sectorRepository.getSectors(locale);
  }

}
