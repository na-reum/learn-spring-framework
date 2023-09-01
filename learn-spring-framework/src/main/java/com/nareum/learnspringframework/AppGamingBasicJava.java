package com.nareum.learnspringframework;

import com.nareum.learnspringframework.game.GameRunner;
import com.nareum.learnspringframework.game.MarioGame;
import com.nareum.learnspringframework.game.SuperContraGame;

public class AppGamingBasicJava {

	public static void main(String[] args) {

//		var marioGame = new MarioGame();
		var superContraGame = new SuperContraGame();
		var gameRunner = new GameRunner(superContraGame);
		gameRunner.run();
	}

}
