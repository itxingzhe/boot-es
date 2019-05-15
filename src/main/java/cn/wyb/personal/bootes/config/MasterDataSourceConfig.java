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
import org.springframework.context.annotation.Primary;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@EnableTransactionManagement
@MapperScan(basePackages = MasterDataSourceConfig.PACKAGE, sqlSessionFactoryRef = "masterSqlSessionFactory")
public class MasterDataSourceConfig {

  // 精确到 master 目录，以便跟其他数据源隔离
  static final String PACKAGE = "cn.wyb.personal.bootes.mapper.master";
  static final String MAPPER_LOCATION = "classpath:mapper/master/*.xml";

  @Bean(name = "masterDataSource")
  @Primary
  @ConfigurationProperties(prefix="spring.datasource.master")
  public DataSource masterDataSource() {
    return DataSourceBuilder.create().type(HikariDataSource.class).build();
  }

  @Bean(name = "masterTransactionManager")
  @Primary
  public DataSourceTransactionManager masterTransactionManager() {
    return new DataSourceTransactionManager(masterDataSource());
  }

  @Bean(name = "masterSqlSessionFactory")
  @Primary
  public SqlSessionFactory masterSqlSessionFactory(
      @Qualifier("masterDataSource") DataSource masterDataSource)
      throws Exception {
    final SqlSessionFactoryBean sessionFactory = new SqlSessionFactoryBean();
    sessionFactory.setDataSource(masterDataSource);
    sessionFactory.setMapperLocations(new PathMatchingResourcePatternResolver()
        .getResources(MasterDataSourceConfig.MAPPER_LOCATION));
    org.apache.ibatis.session.Configuration configuration = new org.apache.ibatis.session
        .Configuration();
    configuration.setMapUnderscoreToCamelCase(true);
    sessionFactory.setConfiguration(configuration);
    return sessionFactory.getObject();
  }
}