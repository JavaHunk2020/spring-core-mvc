package com.spring2023;

public class HellpSpring {
	
	public static void main(String[] args) {
		Dog dog=new Dog();
		dog.setColor("black");
		dog.setName("Jack");
		System.out.println(dog);
		//Killing 
		dog = null;
		System.out.println(dog);
	}

}
