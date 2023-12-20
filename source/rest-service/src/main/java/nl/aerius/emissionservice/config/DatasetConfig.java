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
package nl.aerius.emissionservice.config;

import javax.sql.DataSource;

import org.jooq.DSLContext;
import org.jooq.SQLDialect;
import org.jooq.impl.DSL;
import org.springframework.aop.framework.ProxyFactoryBean;
import org.springframework.aop.target.ThreadLocalTargetSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;

import nl.aerius.emissionservice.repository.DatasetStore;

/**
 * Configuration to ensure the DatasetStore is used in a threadlocal manner.
 * That is, the DatasetStore bean is renewed for each request.
 */
@Configuration
public class DatasetConfig {

  @Bean
  public DSLContext publicDsl(final DataSource dataSource) {
    return DSL.using(dataSource, SQLDialect.POSTGRES);
  }

  @Bean(destroyMethod = "destroy")
  public ThreadLocalTargetSource threadLocalDataSetStore() {
    final ThreadLocalTargetSource result = new ThreadLocalTargetSource();
    result.setTargetBeanName("datasetStore");
    return result;
  }

  @Primary
  @Bean(name = "proxiedThreadLocalTargetSource")
  public ProxyFactoryBean proxiedThreadLocalTargetSource(final ThreadLocalTargetSource threadLocalTargetSource) {
    final ProxyFactoryBean result = new ProxyFactoryBean();
    result.setTargetSource(threadLocalTargetSource);
    return result;
  }

  @Bean(name = "datasetStore")
  @Scope(scopeName = "prototype")
  public DatasetStore datasetStore(final DataSource dataSource) {
    return new DatasetStore(dataSource);
  }

}
