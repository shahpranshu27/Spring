package com.springcore.javaconfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		/*
		 * ApplicationContext context = new
		 * ClassPathXmlApplicationContext("com/springcore/javaconfig/config10.xml");
		 * 
		 * Student s1 = context.getBean("firststudent",Student.class);
		 * System.out.println(s1);
		 */
		
		ApplicationContext context = new AnnotationConfigApplicationContext(JavaConfig.class);
		
//		Student s2 = context.getBean("firststudent", Student.class);
//		Student s2 = context.getBean("getStudent", Student.class);
		Student s2 = context.getBean("temp", Student.class);
		System.out.println(s2);
		s2.study();
	}
}
