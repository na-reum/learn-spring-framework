package com.nareum.learnspringframework;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

//JDK 16 신기술
// java 클래스를 만들때는 수많은 getter setter 메서드 생성자를 만들게 된다. 
// 스프링 빈을 만들기 위해 편히 나온. 레코드를 사용하면 게터 세터를 만들 필요가 없다.
record Person (String name,int age, Address address) {};
record Address (String firstLine, String city) {};

@Configuration
public class HelloWorldConfiguration {
	// 스프링에서 관리하는것을 스프링 Bean 이라고 함.
	@Bean
	public String name() {
		return "Ranga";
	}
	@Bean
	public int age() {
		return 15;
	}
	
	@Bean
	public Person person() {
		return new Person("Ravi",20,new Address("siba","saba"));
	}

	@Bean
	public Person person2MethodCall() {
		return new Person(name(),age(),address()); //name. age
	}
	
	@Bean
	public Person person3Parameters(String name, int age, Address address3) {
		return new Person(name, age, address3); //name. age
	}
	
	@Bean(name = "address2")
	public Address address() {
		return new Address("siba","saba");
	}
	
	@Bean(name = "address3")
	public Address address3() {
		return new Address("333","333");
	}


}
