package com.springcore.spel;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.expression.Expression;
import org.springframework.expression.spel.standard.SpelExpressionParser;

public class Test {

	public static void main(String[] args) throws Exception {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/spel/config.xml");
        Demo d1 = context.getBean("demo",Demo.class);
        System.out.println(d1);
        
        SpelExpressionParser temp = new SpelExpressionParser();
        Expression express = temp.parseExpression("45+78");
        System.out.println(express.getValue());
	}
}