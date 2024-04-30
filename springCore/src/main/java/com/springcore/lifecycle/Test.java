package com.springcore.lifecycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/lifecycle/config4.xml");
		
//		Samay sam1 = (Samay) context.getBean("sama");
//		System.out.println(sam1);
//		
//		context.registerShutdownHook();
		
//		Sagar sa1 = (Sagar) context.getBean("saga");
//		System.out.println(sa1);
		context.registerShutdownHook();
		
		Vidith vi1 = (Vidith) context.getBean("vidi");
		System.out.println(vi1);

	}

}
