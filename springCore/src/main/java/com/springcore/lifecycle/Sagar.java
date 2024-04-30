package com.springcore.lifecycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Sagar implements InitializingBean, DisposableBean{
	private double price;

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public Sagar() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Sagar [price=" + price + "]";
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		// TODO Auto-generated method stub
		// init
		System.out.println("sagar shah!");
		
	}

	@Override
	public void destroy() throws Exception {
		// TODO Auto-generated method stub
//		destroy
		System.out.println("Sagar Vidit Samay!");
		
	}
	
	
}
