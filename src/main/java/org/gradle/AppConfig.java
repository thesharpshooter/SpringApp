package org.gradle;

import javax.sql.DataSource;

import org.gradle.entities.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
@ComponentScan(basePackages = "org.gradle")
public class AppConfig {

	@Autowired
	private DataSource datasource;
	@Autowired
	@Qualifier("redSox")
	private Team home;
	@Autowired
	@Qualifier("cubs")
	private Team away;

	@Bean
	@Scope("prototype")
	public Game game() {
		BaseballGame baseballGame = new BaseballGame(home, away);
		baseballGame.setDataSource(datasource);
		return baseballGame;
	}

}
