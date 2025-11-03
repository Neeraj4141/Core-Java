package com.rays.oop.inheritance;

public class Circle extends Shape {

	protected int redius;

	public int getRedius() {
		return this.redius;
	}

	public void setRedius(int redius) {
		this.redius = redius;
	}

	public double area() {

		double area = Math.PI * redius * redius;

		return area;

	}

}
