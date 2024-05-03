package com.springcore.javaconfig;

import org.springframework.beans.factory.annotation.Value;
//import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

//@Component("firststudent")
public class Student {
	
	private Abc abc;

	public Student(Abc abc) {
		super();
		this.abc = abc;
		// TODO Auto-generated constructor stub
	}

	public Abc getAbc() {
		return abc;
	}

	public void setAbc(Abc abc) {
		this.abc = abc;
	}

	public void study() {
		this.abc.display();
		System.out.println("Student is reading book!");
	}
	
	@Value("2")
	private int x;

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	@Override
	public String toString() {
		return "Student [x=" + x + "]";
	}
	
}
