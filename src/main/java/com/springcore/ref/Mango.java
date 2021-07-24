package com.springcore.ref;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Mango {
	private int price;

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Mango [price=" + price + "]";
	}

	public Mango() {
		super();
		// TODO Auto-generated constructor stub
	}

	@PostConstruct
	public void start() {
System.out.println("initialize Mango");
	}

	@PreDestroy
	public void end() {
System.out.println("Destroy Mango");
	}
}
