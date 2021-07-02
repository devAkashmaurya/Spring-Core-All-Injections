package com.springcore.cinjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestCInject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext context=new ClassPathXmlApplicationContext("com/springcore/cinjection/cinject-config.xml");
        Person person1=(Person)context.getBean("person1");
        System.out.println(person1);
	}

}
