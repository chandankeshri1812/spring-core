package com.springcore.constructor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		
//		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/constructor/perconfig.xml");
//		Person p=(Person)context.getBean("person");
//		System.out.println(p);

		
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/constructor/perconfig.xml");
		Addition add=(Addition)context.getBean("add");
		add.doSum();
		System.out.println(add);
	}

}
