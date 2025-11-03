package com.rays.oop.constructor;

public class Square extends Shape {

	private double side;
	
	public Square (double side) {
		this.side = side;
	}
	public double getSide() {
		return this.side;
	}
	public double area() {
		double area = side*side;
		return area;
	}
}
