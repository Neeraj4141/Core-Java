package com.rays.oop.inheritance.practise;

public class Squre extends Shape {

	private int side;
	
	public int getSide() {
		return side;
	}
	public void setSide(int side) {
		this.side = side;
	}
	@Override
	public double area() {
		double area = side*side;
		return area;
	}
}
