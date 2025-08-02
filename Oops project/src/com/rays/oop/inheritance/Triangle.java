package com.rays.oop.inheritance;

public class Triangle extends Shape {

	private int base;
	private int height;
	
	public int getBase() {
		return this.base;
	}
	public void setBase(int base) {
		this.base = base;
	}
	public int getHight() {
		return this.height;
	}
	public void setHeight(int height) {
	    this.height = height;
	}
	public double area() {
		
		double area = 0.5*height*base;
		
		return area;
	}
	
}
