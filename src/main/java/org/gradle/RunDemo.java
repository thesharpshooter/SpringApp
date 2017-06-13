package org.gradle;

import org.gradle.entities.Game;
import org.gradle.entities.Team;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class RunDemo {
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		Game game1 = context.getBean("game", Game.class);
		Game game2 = context.getBean("game",Game.class);
		Team Royals = context.getBean("royals",Team.class);
		System.out.println(game1.toString());
		game2.setAwayTeam(Royals);
		System.out.println(game1.toString());
		System.out.println(game2.toString());
		

	}
}
