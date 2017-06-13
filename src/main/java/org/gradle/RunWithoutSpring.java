package org.gradle;

import org.gradle.entities.*;

public class RunWithoutSpring {
	public static void main(String[] args) {
		Team readSox = new RedSox();
		Team royal = new Royals();
		Game game = new BaseballGame(readSox, royal);
		System.out.println("Winner is " + game.playGame());
	}

}
