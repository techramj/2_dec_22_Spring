package com.easylearning.main;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@ComponentScan(basePackages = {"com.easylearning"})
@Configuration
@EnableTransactionManagement
public class Demo1Coniguration {

	@Bean
	public DataSource dataSource() {
		DriverManagerDataSource ds = new DriverManagerDataSource();
		ds.setDriverClassName("oracle.jdbc.driver.OracleDriver");
		// ds.setUrl("jdbc:oracle:thin:@localhost:1521/ORCLPDB");
		ds.setUrl("jdbc:oracle:thin:@localhost:1522:xe");
		ds.setUsername("hr");
		ds.setPassword("hr");
		return ds;
	}

	@Bean
	public JdbcTemplate jdbcTemplate() {
		JdbcTemplate template = new JdbcTemplate();
		template.setDataSource(dataSource());
		return template;
	}
	
	@Bean
	public DataSourceTransactionManager transactionManager() {
		DataSourceTransactionManager tx = new DataSourceTransactionManager();
		tx.setDataSource(dataSource());
		return tx;
	}
}
