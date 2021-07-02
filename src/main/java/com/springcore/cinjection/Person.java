package com.springcore.cinjection;

public class Person {

	private int id;
	private String name;
	private Cert cert;

	public Person(int id, String name, Cert cert) {
		super();
		this.id = id;
		this.name = name;
		this.cert=cert;

	}

	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", cert=" + this.cert.cname + "]";
	}

	

}
