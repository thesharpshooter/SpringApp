package org.gradle;

import org.gradle.entities.Game;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class RunDemo {
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		Game game = context.getBean("game", Game.class);
		System.out.println("Winner is " + game.playGame());
		System.out.println("There are " + context.getBeanDefinitionCount() + " Beans!!");
		for (String bean : context.getBeanDefinitionNames()) {
			System.out.println("Calling : " + bean);
		}

	}
}
