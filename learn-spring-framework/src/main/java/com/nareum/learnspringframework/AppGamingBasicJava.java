package com.nareum.learnspringframework;

import com.nareum.learnspringframework.game.GameRunner;
import com.nareum.learnspringframework.game.MarioGame;
import com.nareum.learnspringframework.game.PacmanGame;
import com.nareum.learnspringframework.game.SuperContraGame;

public class AppGamingBasicJava {

	public static void main(String[] args) {

//		var game = new MarioGame();
//		var game = new SuperContraGame();
		var game = new PacmanGame();
		var gameRunner = new GameRunner(game);
		gameRunner.run();
	}

}
