package nl.overheid.aerius.emissionservice.config;

import javax.sql.DataSource;

import org.springframework.aop.framework.ProxyFactoryBean;
import org.springframework.aop.target.ThreadLocalTargetSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;

import nl.overheid.aerius.emissionservice.repository.DatasetStore;

/**
 * Configuration to ensure the DatasetStore is used in a threadlocal manner.
 * That is, the DatasetStore bean is renewed for each request.
 */
@Configuration
public class DatasetConfig {

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
