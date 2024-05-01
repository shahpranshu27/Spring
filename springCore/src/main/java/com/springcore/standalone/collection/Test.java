package com.springcore.standalone.collection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/standalone/collection/config7.xml");
		
//		Person p1 = (Person) context.getBean("p1");
//		
//		System.out.println(p1);
//		System.out.println(p1.getFriend().getClass().getName());
//		System.out.println(p1.getFeeStructure());
		
		Person p2 = (Person) context.getBean("p2");
		
		System.out.println(p2);
//		System.out.println(p2.getFriend().getClass().getName());
//		System.out.println(p2.getFeeStructure());
		
		
	}
}
