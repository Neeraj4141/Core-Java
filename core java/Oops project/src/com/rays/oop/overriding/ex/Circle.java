package com.rays.oop.overriding.ex;

public class Circle extends Shape {

	private int redius;

	public Circle(int redius) {
		this.redius = redius;
	}

	public int getRedius() {
		return this.redius;
	}

	@Override
	public double area() {
		double area = Math.PI * redius * redius;
		return area;
	}
	@Override
	public double perameter() {
		double perameter = (Math.PI*redius)*2; 
		return perameter;
	}

}
