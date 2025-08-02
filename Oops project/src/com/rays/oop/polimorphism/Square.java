package com.rays.oop.polimorphism;

public class Square extends Shape {

	private int side;
	
	public Square (int side) {
	this.side = side;
	}
	public int getSide() {
		return this.side;
	}
	@Override
	public double area() {
		double area = (side*side);
		return area;
	}
	@Override
	public double perameter() {
		double perameter = (side+side)*2;
		return perameter;
	}
	
}
