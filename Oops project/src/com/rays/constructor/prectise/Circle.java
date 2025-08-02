package com.rays.constructor.prectise;

public class Circle extends Shape {
	
    protected int redius;
	
	public Circle (int redius) {
		this.redius = redius;
	}
	public int getRedius() {
		return redius;
	}
	public Circle() {
		
	}
	public double area() {
		double area = Math.PI*redius*redius;
		return area;
	}
	

}
