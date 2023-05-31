package com.spring2023;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration //means spring will read this file
@ComponentScan("com.spring2023")
public class DogConfig {
	
	@Bean("papa") //means object manage by spring 
	public Dog getDog() {
		Dog dog=new Dog();
		dog.setColor("black");
		dog.setName("Jack");
		return dog;
	}

}
