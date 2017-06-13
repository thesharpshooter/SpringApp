package org.gradle;

import org.gradle.entities.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
	@Bean
	public Game game() {
		return new BaseballGame(RedSox(), Royals());
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
