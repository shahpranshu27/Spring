package com.springcore.javaconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


@Configuration
//@ComponentScan(basePackages = "com.springcore.javaconfig")
public class JavaConfig {
	
	@Bean
	public Abc getAbc() {
		return new Abc();
	}

	@Bean(name = {"student","temp"}) // here, i can give name to bean, and then i can use them in the main file to run the program
	public Student getStudent(){
//		creating a new Student object
		Student stud1 = new Student(getAbc());
		
		return stud1;
	}
}
