package com.rays.constructor.prectise;

public class Triangle extends Shape {
	
	private int height;
	private int base;
	
	public Triangle(int height, int base) {
		this.height = height;
		this.base = base;
	}
	public int getHeight() {
		return height;
	}
	public int getBase() {
		return base;
	}
	public double area() {
		double area = (height*base)/2;
		return area;
	}

}
