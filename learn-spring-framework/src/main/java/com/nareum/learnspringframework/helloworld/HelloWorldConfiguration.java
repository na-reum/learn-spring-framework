package com.nareum.learnspringframework.helloworld;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

//JDK 16 신기술
// java 클래스를 만들때는 수많은 getter setter 메서드 생성자를 만들게 된다. 
// 스프링 빈을 만들기 위해 편히 나온. 레코드를 사용하면 게터 세터를 만들 필요가 없다.
record Person (String name,int age, Address address) {};
record Address (String firstLine, String city) {};
// 스프링 컨테이너는 스프링 빈과 수명 주기를 관리한다.
//POJOs : 여러 자바 클래스
// 설정 파일
// loc 컨테이너가 ready system을 만든다.
// loc는 제어 역전을 의미함.
// 1. bean factory : 기본 스프링 컨테이너
// 2. application context: 엔터프라이즈 전용 기능이 있는 고급 스프링 컨테이
// 애플리케이션 컨텍스트는 웹 애플리케이션, 웹서비스, rest api, 마이크로 서비스에 사용하는것이 좋습니다.

// POJO, JAVA Bean, Spring Bean
// POJO: 오래된 java 객체 plain Old java Object
// JAVA Bean : EJB, 오늘날 쓰는 사람이 많이 없다. 인수 생성자가 없어야한다. public no-arg constructor // getters and setters // serializable
// Spring Bean : Spring 프레임워크가 관리하는 Beans

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
	
	@Bean
	@Primary
	public Person person4Parameters(String name, int age, Address address) {
		return new Person(name, age, address); //name. age
	}
	
	@Bean
	public Person personQualifier(String name, int age,	@Qualifier("address3qualifier") Address address) {
		return new Person(name, age, address); //name. age
	}
	
	@Bean(name = "address2")
	@Primary
	public Address address() {
		return new Address("siba","saba");
	}
	
	@Bean(name = "address3")
	@Qualifier("address3qualifier") // 한정자를 객체 외부에서 사용할 수 있다.
	public Address address3() {
		return new Address("333","333");
	}


}

