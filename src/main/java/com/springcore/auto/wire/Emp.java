package com.springcore.auto.wire;

public class Emp {
	private Address adr;

	public Address getAdr() {
		return adr;
	}

	public void setAdr(Address adr) {
		this.adr = adr;
	}

	public Emp() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Emp(Address adr) {
		super();
		this.adr = adr;
	}

	@Override
	public String toString() {
		return "Emp [adr=" + adr + "]";
	}
	
	
}
