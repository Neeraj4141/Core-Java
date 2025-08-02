package com.rays.oop.overriding;

public class Shape {
	
	public double area () {
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
			return new Triangle(14, 16);
		}
		
		return new Shape ();
	}

}
