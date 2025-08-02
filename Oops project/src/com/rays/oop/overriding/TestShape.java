package com.rays.oop.overriding;

public class TestShape {

	public static void main(String[] args) {
		
		//overriding
		Shape s1 = new Circle();
		// type casting;
		Circle c = (Circle) s1;
		c.setRedius(6);
		System.out.println("redius of circle = " + c.getRedius());
		System.out.println("area of circle = " + s1.area());
		System.out.println("perameter of circle = "+s1.perameter());

		System.out.println("------------rectangle------------");
		
        //overriding
		Shape s2 = new Rectangle();
		// type casting;
		Rectangle r = (Rectangle) s2;
		r.setLength(17);
		r.set(19);
		System.out.println("length of rectangle = " + r.getLength());
		System.out.println("width of rectangle = " + r.getWidth());
		System.out.println("area of rectangle = " + s2.area());
		System.out.println("perameter of rectangle = "+s2.perameter());

		System.out.println("------------triangle------------");

		Shape s3 = new Triangle(12, 15);
		//type casting
		Triangle t = (Triangle) s3;
        //using constructor
		System.out.println("height of triangle = " + t.getHeight());
		System.out.println("base of triangle = " + t.getBase());
		System.out.println("area of triangle = " + s3.area());
		
		System.out.println("------------squre------------");
		
		Shape s4 = new Squre(89);
		//type casting
		Squre sh = (Squre)s4;
		//using constructor
		
		System.out.println("side of squre = "+sh.getSide());
		System.out.println("area of circle = "+s4.area());
		System.out.println("perameter of square = "+s4.perameter());
		}
}