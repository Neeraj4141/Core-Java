package com.rays.oop.inheritance;

public class Square extends Shape {
	
	private int side;
	
	public int getSide () {
		return this.side;
	}
	public void setSide(int side) {
		this.side = side;
	}
	
	public double area() {	
	double area = side * side;
	return area;
	}
}
