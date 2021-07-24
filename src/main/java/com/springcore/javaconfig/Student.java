package com.springcore.javaconfig;



public class Student {
	  
	private Samosa samosa;
	
	
	public Student(Samosa samosa, int id) {
		super();
		this.samosa = samosa;
		this.id = id;
	}

	public Samosa getSamosa() {
		return samosa;
	}

	public void setSamosa(Samosa samosa) {
		this.samosa = samosa;
	}

	private int id;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + "]";
	}

}
