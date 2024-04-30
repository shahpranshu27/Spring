package com.springcore.lifecycle;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

public class Vidith {
	private String subject;

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	@Override
	public String toString() {
		return "Vidith [subject=" + subject + "]";
	}

	public Vidith() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	@PostConstruct
	public void start() {
		System.out.println("starting!@");
	}
	
	@PreDestroy
	public void end() {
		System.out.println("ending method!@");
	}
}
