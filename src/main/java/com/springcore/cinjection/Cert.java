package com.springcore.cinjection;

public class Cert {
	
	String cname;

	public Cert(String cname) {
		super();
		this.cname = cname;
	}

	@Override
	public String toString() {
		return this.cname;
	}



}
