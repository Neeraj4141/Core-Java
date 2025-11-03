package com.rays.constructor.prectise;

public class Triangle extends Shape {
	
	private int base;
	private double height;
	
	public Triangle(int base,double height) {
		this.base = base;
		this.height = height;
	}
	public int getBase() {
		return base;
	}
	public double getHeight() {
		return height;
	}
	public double area () {
		double area = (base*height)/2;
		return area;
	}
}
