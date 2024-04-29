package com.springcore.ci;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		System.out.println("print!@");
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/ci/config3.xml");
		
		Person p1 = (Person) context.getBean("person");
		System.out.println(p1);
		
		Addition add1 = (Addition) context.getBean("add");
		add1.doSum(); // it calls either int, int or double, double depending on which one is above
	}

}
