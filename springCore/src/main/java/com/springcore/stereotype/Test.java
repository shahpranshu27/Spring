package com.springcore.stereotype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/stereotype/config8.xml");
		
//		the name i give below, should be the same name i give in the Component("") {if any given}
		Student s1 =  context.getBean("student",Student.class);
		System.out.println(s1);
	}
}
