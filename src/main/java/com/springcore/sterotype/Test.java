package com.springcore.sterotype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ApplicationContext con = new ClassPathXmlApplicationContext("com/springcore/sterotype/config.xml");

		Student student = con.getBean("ob", Student.class);
		System.out.println(student);
		System.out.println(student.getAddress());
		Student student2 = con.getBean("ob", Student.class);
		System.out.println(student.hashCode());
		System.out.println(student2.hashCode());
		
		Teacher  t1=con.getBean("teacher",Teacher.class);
System.out.println(t1.hashCode());
	}

}
