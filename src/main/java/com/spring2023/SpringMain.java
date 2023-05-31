package com.spring2023;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringMain {
	
	public static void main(String[] args) {
		ApplicationContext ctx = new AnnotationConfigApplicationContext(DogConfig.class);
		//Dog dog=(Dog)ctx.getBean("papa");
		Dog dog=ctx.getBean(Dog.class);
		System.out.println(dog);
		dog=null;
		
		dog=ctx.getBean(Dog.class);
		System.out.println(dog);   
		
		dog.eat();
	}

}
