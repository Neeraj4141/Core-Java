package com.rays.oop.overriding;

public class Triangle extends Shape {
	private int height;
	private int base;
	
	public Triangle (int height,int base) {
		this.height = height;
		this.base = base;
	}
	public int getHeight() {
		return height;
	}
	public int getBase() {
		return base;
	}
	@Override
	public double area() {
		double area = height*base*0.5;
		return area;
	}

}
