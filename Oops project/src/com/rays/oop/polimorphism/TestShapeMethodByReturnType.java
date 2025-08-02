package com.rays.oop.polimorphism;

public class TestShapeMethodByReturnType {

	public static void main(String[] args) {

		Shape[] s = new Shape[4];
		
		s[0] = Shape.getShape(1);// new circle
		s[1] = Shape.getShape(2);// new rectangle
		s[2] = Shape.getShape(3);// new triangle
		s[3] = Shape.getShape(4);// new Square
		
		Circle c = (Circle) s[0];
		c.setRedius(17);

		Rectangle r = (Rectangle) s[1];
		r.setLength(19);
		r.setWidth(11);

		Triangle t = (Triangle) s[2];
		t.setBase(19);
		t.setHeight(23);

		for (int i = 0; i < s.length; i++) {

			System.out.println(" area = " + s[i].area());
			System.out.println("perameter = "+s[i].perameter());
            System.out.println("----------------------------------------------");
		}

	}
}
