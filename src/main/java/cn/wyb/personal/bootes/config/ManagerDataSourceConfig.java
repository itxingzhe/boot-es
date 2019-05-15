package cn.wyb.personal.bootes.config;

import com.zaxxer.hikari.HikariDataSource;
import javax.sql.DataSource;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@EnableTransactionManagement
@MapperScan(basePackages = ManagerDataSourceConfig.PACKAGE, sqlSessionFactoryRef = "managerSqlSessionFactory")
public class ManagerDataSourceConfig {

  // 精确到 cluster 目录，以便跟其他数据源隔离
  static final String PACKAGE = "cn.wyb.personal.bootes.mapper.manager";
  static final String MAPPER_LOCATION = "classpath:mapper/manager/*.xml";

  @Bean(name = "managerDataSource")
  @ConfigurationProperties(prefix="spring.datasource.manager")
  public DataSource managerDataSource() {
    return DataSourceBuilder.create().type(HikariDataSource.class).build();
  }

  @Bean(name = "managerTransactionManager")
  public DataSourceTransactionManager clusterTransactionManager() {
    return new DataSourceTransactionManager(managerDataSource());
  }

  @Bean(name = "managerSqlSessionFactory")
  public SqlSessionFactory managerSqlSessionFactory(
      @Qualifier("managerDataSource") DataSource clusterDataSource)
      throws Exception {
    final SqlSessionFactoryBean sessionFactory = new SqlSessionFactoryBean();
    sessionFactory.setDataSource(clusterDataSource);
    sessionFactory.setMapperLocations(new PathMatchingResourcePatternResolver()
        .getResources(ManagerDataSourceConfig.MAPPER_LOCATION));
    org.apache.ibatis.session.Configuration configuration = new org.apache.ibatis.session
        .Configuration();
    configuration.setMapUnderscoreToCamelCase(true);
    sessionFactory.setConfiguration(configuration);
    return sessionFactory.getObject();
  }

}