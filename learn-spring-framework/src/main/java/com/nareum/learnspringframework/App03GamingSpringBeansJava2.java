package com.nareum.learnspringframework;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.nareum.learnspringframework.game.GameRunner;
import com.nareum.learnspringframework.game.MarioGame;
import com.nareum.learnspringframework.game.PacmanGame;
import com.nareum.learnspringframework.game.SuperContraGame;
import com.nareum.learnspringframework.game.GamingConsole;

public class App03GamingSpringBeansJava2 {

	public static void main(String[] args) {

//		var game = new MarioGame();
//		var game = new SuperContraGame();
//		
//		var game = new PacmanGame(); 
//		
//		var gameRunner = new GameRunner(game);
//		
//		gameRunner.run();
		
		try(var context = 
				new AnnotationConfigApplicationContext
				(GamingConfiguration.class)){
			
			context.getBean(GamingConsole.class).up();
			context.getBean(GameRunner.class).run();
		}
		
		
	}

}
