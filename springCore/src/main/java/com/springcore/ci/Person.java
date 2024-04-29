package com.springcore.ci;

public class Person {
	private String pname;
	private int id;
	private Certi certi;
	
	public Person(String pname, int id, Certi certi) {
		this.pname = pname;
		this.id = id;
		this.certi = certi;
		
	}
	

	
	@Override
	public String toString() {
		return "Person [name= " + this.pname + ", id= " + this.id + ", certi= " + this.certi.toString() + "]";
	}
	
	
}
