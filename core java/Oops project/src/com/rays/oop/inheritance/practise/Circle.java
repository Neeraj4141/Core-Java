package com.rays.oop.inheritance.practise;

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
		double area = Math.PI*redius*redius;
		return area;
	}
	

}
