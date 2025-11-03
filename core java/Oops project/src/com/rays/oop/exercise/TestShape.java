package com.rays.oop.exercise;

public class TestShape {
	public static void main(String[] args) {

		Shape[] s = new Shape[3];

		s[0] = new Circle();
		s[1] = new Rectangle();
		s[2] = new Triangle();

		Circle c = (Circle) s[0];
		c.setRedius(87);

		Rectangle r = (Rectangle) s[1];
		r.setLength(84);
		r.setWidth(67);

		Triangle t = (Triangle) s[2];
		t.setHeight(36);
		t.setBase(43);

		for (int i = 0; i < s.length; i++) {
			System.out.println("area  =  " + s[i].area());

		}
	}

}
