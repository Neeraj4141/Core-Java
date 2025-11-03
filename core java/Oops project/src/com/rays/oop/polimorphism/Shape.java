package com.rays.oop.polimorphism;

public class Shape {

	public final double PI = 3.14;	

	public double area() {
		return 0.0;
	}
	public double perameter() {
		return 0.0;
	}
	public static Shape getShape(int i) {
	
		if (i == 1) {
			return new Circle();
		}
		if (i == 2) {
			return new Rectangle();
		}
		if (i == 3) {
			return new Triangle();
		}
		if (i == 4) {
			return new Square(17);
		}
		return new Shape();
		
	}

}
