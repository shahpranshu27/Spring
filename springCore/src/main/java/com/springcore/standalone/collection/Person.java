package com.springcore.standalone.collection;

import java.util.List;
import java.util.Map;
import java.util.Properties;

public class Person {
	private List<String> friend;
	private Map<String, Integer> feeStructure;
	private Properties props;

	public Properties getProps() {
		return props;
	}


	public void setProps(Properties props) {
		this.props = props;
	}


	public Map<String, Integer> getFeeStructure() {
		return feeStructure;
	}


	public void setFeeStructure(Map<String, Integer> feeStructure) {
		this.feeStructure = feeStructure;
	}


	public List<String> getFriend() {
		return friend;
	}
	

	public void setFriend(List<String> friend) {
		this.friend = friend;
	}


	public Person() {
		super();
	}

	@Override
	public String toString() {
		return "Person [friend=" + friend + ", feeStructure=" + feeStructure + ", props=" + props + "]";
	}

	
}
