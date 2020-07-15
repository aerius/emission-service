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
package nl.overheid.aerius.emissionservice.domain;

public class Sector {

  private final int sectorId;
  private final String name;
  private final String description;

  public Sector(final int sectorId, final String name, final String description) {
    this.sectorId = sectorId;
    this.name = name;
    this.description = description;
  }

  public int getSectorId() {
    return sectorId;
  }

  public String getName() {
    return name;
  }

  public String getDescription() {
    return description;
  }

}
