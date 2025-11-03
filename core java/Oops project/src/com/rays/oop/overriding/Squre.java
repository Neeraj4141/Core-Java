package com.rays.oop.overriding;

public class Squre extends Shape{
	
	private int side;
	//constructor method
	public Squre (int side) {
		this.side = side;
	}
	public int getSide() {
		return side;
	}
	@Override
	public double area() {
		double area = side*side;
		return area;
	}
	@Override
	public double perameter() {
		double perameter = side+side*2;
		return perameter;
	}

}
