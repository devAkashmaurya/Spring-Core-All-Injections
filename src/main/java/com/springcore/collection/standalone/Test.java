package com.springcore.collection.standalone;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ApplicationContext conn = new ClassPathXmlApplicationContext("com/springcore/collection/standalone/stand_collec_config.xml");
             Person person1 = conn.getBean("person1",Person.class);
             System.out.println(person1);
             System.out.println(person1.getPersons().getClass().getName());
             System.out.println(person1.getFees().getClass().getName());
             System.out.println(person1.getProp().getClass().getName());

             
             
	}

}
