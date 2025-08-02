package com.rays.oop.polimorphism;

public class Circle extends Shape {

	private int redius;

	public int getRedius() {
		return redius;
	}

	public void setRedius(int redius) {
		this.redius = redius;
	}

	@Override
	public double area() {
		double area = PI * redius * redius;
		return area;
	}
	@Override
	public double perameter() {
		double perameter = PI*redius*2;
		return perameter;
	}

}
