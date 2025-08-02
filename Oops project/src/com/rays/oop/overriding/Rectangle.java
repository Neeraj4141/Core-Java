package com.rays.oop.overriding;

public class Rectangle extends Shape {
	
	private int length;
	private int width;
	
	public int getLength() {
		return length;
	}
	public void setLength(int length) {
		this.length = length;
	}
	public int getWidth() {
		return width;
	}
	public void set(int width) {
		this.width = width;
	}
	@Override
	public double area() {
		double area = length*width;
		return area;
	}
	@Override
	public double perameter() {
		double perameter = 2*(length+width);
		return perameter;
	}
	
	

}
