package com.springcore.ref;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestRef {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	//	ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/ref/ref-config.xml");
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/ref/ref-config.xml");
		A a= (A) context.getBean("aref");
		Pepsi pepsi=(Pepsi)context.getBean("p1");
		System.out.println(a.getOb().getY());
		System.out.println(pepsi.getPrice());
		
		Mango mango=(Mango)context.getBean("m1");
		
		
		System.out.println(mango.getPrice());
		context.registerShutdownHook();
	}

}
