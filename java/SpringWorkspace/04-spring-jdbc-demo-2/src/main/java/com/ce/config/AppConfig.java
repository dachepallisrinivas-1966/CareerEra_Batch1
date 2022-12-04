package com.ce.config;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
@ComponentScan(basePackages = "com.ce")
public class AppConfig {

	@Bean
	public NamedParameterJdbcTemplate getJdbcTemplate() {
		return new NamedParameterJdbcTemplate(getDataSource());
	}
	
	@Bean
	public DataSource getDataSource() {
		String url = "jdbc:mysql://localhost:3306/cedb";
		String userName = "root";
		String password = "root";
		return new DriverManagerDataSource(url, userName, password);
	}

}
