package org.gradle;

import javax.sql.DataSource;

import org.gradle.entities.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import(InfrastructureConfig.class)
public class AppConfig {

	@Autowired
	private DataSource datasource;

	@Bean
	public Game game() {
		BaseballGame baseballGame = new BaseballGame(RedSox(), Royals());
		baseballGame.setDataSource(datasource);
		return baseballGame;
	}

	@Bean
	public Team RedSox() {
		return new RedSox();
	}

	@Bean
	public Team Royals() {
		return new Royals();
	}
}
