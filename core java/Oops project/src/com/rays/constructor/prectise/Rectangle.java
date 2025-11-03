package com.rays.constructor.prectise;

public class Rectangle extends Shape {

	private int brith;
	private int length;

	public Rectangle(int brith, int length) {
		this.brith = brith;
		this.length = length;
	}

	public int getBrith() {
		return brith;
	}

	public int getLength() {
		return length;
	}

	public double area() {
		double area = length * brith;
		return area;
	}

}
