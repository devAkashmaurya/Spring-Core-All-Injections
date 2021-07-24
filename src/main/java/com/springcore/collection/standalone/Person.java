package com.springcore.collection.standalone;

import java.util.List;
import java.util.Map;
import java.util.Properties;

public class Person {

	private List<String> persons;
	private Map<String, Integer> fees;
	private Properties prop;

	public Properties getProp() {
		return prop;
	}

	public void setProp(Properties prop) {
		this.prop = prop;
	}

	public Map<String, Integer> getFees() {
		return fees;
	}

	public void setFees(Map<String, Integer> fees) {
		this.fees = fees;
	}

	public List<String> getPersons() {
		return persons;
	}

	public void setPersons(List<String> persons) {
		this.persons = persons;
	}

	@Override
	public String toString() {
		return "Person [persons=" + persons + ", fees=" + fees + ", prop=" + prop + "]";
	}

	

	
	
	
}
