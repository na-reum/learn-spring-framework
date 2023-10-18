package com.nareum.learnspringframework.example.c1;

import java.util.Arrays;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;




@Configuration
@ComponentScan
public class RealWorldSpringContextLauncherApplicaton {
	

	public static void main(String[] args) {

		
		try(var context = 
				new AnnotationConfigApplicationContext
				(RealWorldSpringContextLauncherApplicaton.class)){

			Arrays.stream(context.getBeanDefinitionNames())
				.forEach(System.out::println);
			
			System.out.println(
					context.getBean(BusinessCalculationService.class).findMax());
			
			
		}
		
		
	}

}
// 의존성 주입의 다양한 방
// 생성자기반 setter기반,필드 기반:리플렉션을 이