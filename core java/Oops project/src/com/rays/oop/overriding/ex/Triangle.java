package com.rays.oop.overriding.ex;

public class Triangle extends Shape {

	private int hight;
	private int base;

	public Triangle(int base, int hight) {
		this.base = base;
		this.hight = hight;
	}

	public int getBase() {
		return this.base;
	}

	public int getHight() {
		return this.hight;
	}

	@Override
	public double area() {
		double area = (hight * base) / 2.0;
		return area;
	}

}
