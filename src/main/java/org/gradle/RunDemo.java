package org.gradle;

import org.gradle.entities.Game;
import org.gradle.entities.Team;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class RunDemo {
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		Game game = context.getBean("game", Game.class);
//		System.out.println(game.toString());
		

	}
}
