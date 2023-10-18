package com.nareum.learnspringframework.example.a1;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Component
class YourBusinessClass{


	Dependency1 dependency1;
	Dependency2 dependency2;
	

//	@Autowired
	public YourBusinessClass(Dependency1 dependency1, Dependency2 dependency2) {
		super();
		System.out.println("Constructor Inj");
		this.dependency1 = dependency1;
		this.dependency2 = dependency2;
	}



	
	// setter
//	@Autowired
//	public void setDependency1(Dependency1 dependency1) {
//		System.out.println("Setter Inj = 1");
//		this.dependency1 = dependency1;
//	}
//
//
//
//	@Autowired
//	public void setDependency2(Dependency2 dependency2) {
//		System.out.println("Setter Inj = 2");
//		this.dependency2 = dependency2;
//	}
//


	public String toString() {
		return "Using "  + "d1 " + "and " +"d2";
	}
	
}

@Component
class Dependency1 {
	
}

@Component
class Dependency2 {
	
}

@Configuration
@ComponentScan
public class DepeninjectionamingSpringBeansAutoJava4 {
	

	public static void main(String[] args) {

		
		try(var context = 
				new AnnotationConfigApplicationContext
				(DepeninjectionamingSpringBeansAutoJava4.class)){

			Arrays.stream(context.getBeanDefinitionNames())
				.forEach(System.out::println);
			
			System.out.println(context.getBean(YourBusinessClass.class));
			
		}
		
		
	}

}
// 의존성 주입의 다양한 방법 
// 생성자기반 setter기반,필드 기반:리플렉션을 이
//  Spring팀은 생성자 기반을 추천한다.
// 모든 초기화가 한 메소드에 다 일어나기 때
// Autowired를 적을 필요도 없다.

//@Component and @Bean
//컴포넌트는 모든 자바 클래스에서 쓸수있지만 빈은 컨피규레이션 클래스의 메소드로 사용된다.
// 컴포넌트를 더 사용하기 쉽다. 빈은 생성하려면 코드를 다 쳐야한다
// 자동 와이어링은 컴포넌트는  생성자 주입, 수정자 주입, 필드 주입으로 컴포넌트로 쓸수있고,
// 빈은 특정 메소드를 호출해서 자동와이어링을 할 수 잇다. 파라미터를 추가해도 좋 
// 무엇이 빈을 생성하는? 컴포넌트는 스프링프레임워크가 컴포넌트를 스캔하여 의존성을 식별하며, 빈이 생성되고 의존성의 자동와이어링이 완료되었는지 확인한다. 
// 빈은 우리가코드를직접 써야한다. 
// 권장 : 대부분 컴포넌트가 권장된다. 애플리케이션을 생성하는 경우 내부에서 컴포넌트 클래스에 대한 코드를 작성하고, 컴포넌트 클래스에 대한 빈을 생성한다면 이러한 상황에서 컴포넌트 추천
// 빈은 빈을 생성하기 전에 여러 사용자 정의 비지니스 로직을 수행해야하는 경우에 대해 보면, 사용자 정의 비지니스 로직을 만들고 그에대한 여러 사항을점검해야한다. 
// 제3자 라이브러리 빈을 인스턴스화, 스프링 시큐리티 코드 같은

//왤케 디펜던시가 많을까?
//		실제 앱은 복잡하다 
// 많은 레이어 클래스가 있고
