package com.springcore.javaconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


@Configuration
public class Javaconfig {
	
	@Bean
	public Samosa getSamosa() {
	Samosa samosa = new Samosa();
	return samosa;
	}
	 
	@Bean
	public Student getStd() {
		
	Student std = new Student(getSamosa(),89);
	std.setId(90);
	std.getSamosa();
	return std;
	
	}

}
