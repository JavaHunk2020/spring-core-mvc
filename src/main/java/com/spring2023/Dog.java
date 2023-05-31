package com.spring2023;

import org.springframework.beans.factory.annotation.Autowired;

public class Dog {
	String name = "tommy";
	String color = "white";
	
	@Autowired
	private Bread bd;
	
	
	public void eat() {
		System.out.println("eating = "+bd);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public String toString() {
		return "Dog [name=" + name + ", color=" + color + "]";
	}

}
