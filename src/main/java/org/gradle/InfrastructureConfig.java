package org.gradle;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
public class InfrastructureConfig {
	@Bean
	public DataSource datasource() {
		return (DataSource) new DriverManagerDataSource();
	}

}
