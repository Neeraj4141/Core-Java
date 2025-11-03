package com.rays.oop.overriding.ex;

public class Rectangle extends Shape {

	private int length;
	private int bridth;

	public Rectangle(int length, int bridth) {
		this.length = length;
		this.bridth = bridth;
	}

	public int getLength() {
		return this.length;
	}

	public int getBridth() {
		return this.bridth;
	}

	@Override
	public double area() {
		double area = length * bridth;
		return area;
	}
	@Override
	public double perameter() {
		double perameter = (length + bridth)*2;
		return perameter;
	}

}
