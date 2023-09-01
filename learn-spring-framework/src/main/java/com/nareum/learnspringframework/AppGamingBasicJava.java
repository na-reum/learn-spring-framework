package com.nareum.learnspringframework;

import com.nareum.learnspringframework.game.GameRunner;
import com.nareum.learnspringframework.game.MarioGame;

public class AppGamingBasicJava {

	public static void main(String[] args) {

		var marioGame = new MarioGame();
		var gameRunner = new GameRunner(marioGame);
		gameRunner.run();
	}

}
