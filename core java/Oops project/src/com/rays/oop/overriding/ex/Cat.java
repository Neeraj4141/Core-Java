package com.rays.oop.overriding.ex;

public class Cat extends Animal {
	
	private String color;
	private String name;
	
	public Cat(String color, String name) {
		this.color = color;
		this.name = name;
	}
	public String getColor() {
		return this.color;
	}
	public String getName() {
		return this.name;
	}
	@Override
	public String sound() {
		return "miauu,,miauu";
	}

}
