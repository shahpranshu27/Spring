package com.springcore.stereotype;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

//@Component
@Component("ob")
@Scope("prototype") // by default, it's singleton. so it would give same HashCode in that case, but in case of prototype, it would make different objects for different reference variable, thus giving different HashCode for all
public class Student {
	
//	values can be explicitly given using @Value("") annotation
	@Value("abc")
	private String studentName;
	
	@Value("Delhi")
	private String city;
	
	
//	here, in the curly braces {}, write the name of id which is written in the config.xml file
	@Value("#{temp}")
	private List<String> address;
	
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	
	
	
	public List<String> getAddress() {
		return address;
	}
	public void setAddress(List<String> address) {
		this.address = address;
	}
	
	@Override
	public String toString() {
		return "Student [studentName=" + studentName + ", city=" + city + ", address=" + address + "]";
	}
	
	
}
