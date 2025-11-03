package com.rays.constructor.prectise;

public class Circle extends Shape{
	private int redius;
	
	public Circle(int redius){
		this.redius = redius;
	}
	public int getRedius() {
		return this.redius;
	}
	public double area() {
		double area = Math.PI*redius*redius;
		return area;
	}

}
