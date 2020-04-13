package com.drink.service;

public class Drink { 
	
	public String brand;
	public String name;
	
	public Drink(String brand, String name) {
		super();
		this.brand = brand;
		this.name = name;
	}
	
	public String getBrand() {
		return brand;
	}
	public String getName() {
		return name;
	}
	
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Drink [brand=" + brand + ", name=" + name + "]";
	}
}
