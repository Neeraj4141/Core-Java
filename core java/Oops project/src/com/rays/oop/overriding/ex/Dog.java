package com.rays.oop.overriding.ex;

public class Dog extends Animal {
	
	private String color;
	private String name;
	
	public Dog(String color, String name) {
		this.color = color;
		this.name = name;
	}
	public String getColor() {
		return this.color;
	}
	public String getName() {
		return this.name = name;
	}
	@Override
	public String sound() {
		return "bhoo,,bhoo,";
	}
	
	

}
