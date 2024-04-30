package com.springcore.lifecycle;

public class Samay {
	private double price;

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		System.out.println("price set!");
		this.price = price;
	}

//	public Samay(double price) {
//		super();
//		this.price = price;
//	}

	public Samay() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Samay [price=" + price + "]";
	}
	
	public void init() {
		System.out.println("inside init method");
	}
	
	public void destroy() {
		System.out.println("inside destroy method");
	}
	
	
}
