package com.nareum.learnspringframework.game;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;




@Configuration
@ComponentScan("com.nareum.learnspringframework.game")
public class App03GamingSpringBeansAutoJava3 {
	

	public static void main(String[] args) {

		
		try(var context = 
				new AnnotationConfigApplicationContext
				(App03GamingSpringBeansAutoJava3.class)){
			
			context.getBean(GamingConsole.class).up();
			context.getBean(GameRunner.class).run();
		}
		
		
	}

}
// 의존성 주입의 다양한 방
// 생성자기반 setter기반,필드 기반:리플렉션을 이