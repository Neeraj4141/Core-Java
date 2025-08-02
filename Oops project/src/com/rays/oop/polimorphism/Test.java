package com.rays.oop.polimorphism;

public class Test {
	public static void main(String[] args) {

		Shape[] s = new Shape[4];

		s[0] = new Circle();
		s[1] = new Rectangle();
		s[2] = new Triangle();
		s[3] = new Square(18);

		Circle c = (Circle) s[0];
		c.setRedius(45);

		Rectangle r = (Rectangle) s[1];
		r.setLength(49);
		r.setWidth(41);

		Triangle t = (Triangle) s[2];
		t.setHeight(33);
		t.setBase(23);

		double totalArea = TestShapeMethodByArgument.getArea(s);
		System.out.println("total area = " + totalArea);
	}
}
