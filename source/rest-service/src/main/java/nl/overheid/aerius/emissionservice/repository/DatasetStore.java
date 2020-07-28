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

import javax.sql.DataSource;

import org.jooq.DSLContext;
import org.jooq.SQLDialect;
import org.jooq.conf.MappedSchema;
import org.jooq.conf.RenderMapping;
import org.jooq.conf.Settings;
import org.jooq.impl.DSL;

/**
 * Store to keep track of the dataset to use when querying the database.
 *
 * The dataset will replace the template schema within the JOOQ DSLContext obtained through the dsl method.
 */
public class DatasetStore {

  private final DataSource dataSource;
  private String dataset;

  public DatasetStore(final DataSource dataSource) {
    this.dataSource = dataSource;
  }

  public void setDataset(final String dataset) {
    this.dataset = dataset;
  }

  public DSLContext dsl() {
    if (this.dataset == null) {
      throw new IllegalStateException("dataset wasn't set");
    }
    return DSL.using(dataSource, SQLDialect.POSTGRES, settings());
  }

  private Settings settings() {
    return new Settings()
        .withRenderMapping(new RenderMapping()
            .withSchemata(new MappedSchema()
                .withInput("template")
                .withOutput(dataset)));
  }

}
