package com.rays.oop.abstrac;

public class TestShape {
	public static void main(String[] args) {

		Shape s = new Circle();
		Shape s1 = new Rectangle();
		Shape s2 = new Triangle();

		Circle c = (Circle) s;
		c.setRedius(17);
		
		Rectangle r = (Rectangle)s1;
		r.setLength(19);
		r.setWidth(39);
		
		Triangle t = (Triangle)s2;
		t.setHeight(76);
		t.setBase(23);
		
		System.out.println("area of circle = "+c.area());
		System.out.println("area of rectangle = "+r.area());
		System.out.println("area of triangle = "+t.area());
		

	}
}
