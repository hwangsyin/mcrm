package crm.config;

import javax.inject.Inject;

import org.apache.tomcat.jdbc.pool.DataSource;
import org.apache.tomcat.jdbc.pool.PoolProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;

/**
 * 应用程序组件配置
 * @author <a mailto="hwangsyin@gmail.com">King</a>
 *
 */
@Configuration
@ComponentScan({"crm.dao", "crm.service"})
public class ApplicationConfiguration {
	@Inject private javax.sql.DataSource dataSource;
	
	@Bean(name="dataSource", destroyMethod="close")
	public javax.sql.DataSource tomcatJdbcDataSource() {
		PoolProperties pp = new PoolProperties();
		pp.setDriverClassName(crm.util.Configuration.get("db.driverClassName"));
		pp.setUrl(crm.util.Configuration.get("db.url"));
		pp.setUsername(crm.util.Configuration.get("db.username"));
		pp.setPassword(crm.util.Configuration.get("db.password"));
		
		DataSource ds = new DataSource();
		ds.setPoolProperties(pp);
		
		return ds;
	}
	// jdbcTemplate
	@Bean
	public JdbcTemplate jdbcTemplate() {
		return new JdbcTemplate(dataSource, false);
	}
	
	// jdbc transaction manager
	@Bean(name="txManager")
	public DataSourceTransactionManager dataSourceTransactionManager() {
		return new DataSourceTransactionManager(dataSource);
	}
}
