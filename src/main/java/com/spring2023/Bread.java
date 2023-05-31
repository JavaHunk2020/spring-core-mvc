package com.spring2023;

import org.springframework.stereotype.Service;

@Service
public class Bread {
	String color = "white";
	int price = 100;

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Bread [color=" + color + ", price=" + price + "]";
	}

}
