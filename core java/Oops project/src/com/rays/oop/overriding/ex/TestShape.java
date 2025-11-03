package com.rays.oop.overriding.ex;

public class TestShape {
	public static void main(String[] args) {
		
		Shape s1 = new Circle(7);
		Circle c = (Circle) s1;
		System.out.println("Redius = "+c.getRedius()); 
		System.out.println("arera of circle   = "+s1.area());
		System.out.println("perameter of circle = "+s1.perameter());
		System.out.println("----------------------");
		
		Shape s2 = new Rectangle (12, 13);
		Rectangle r = (Rectangle)s2;
		System.out.println("length = "+r.getLength());
		System.out.println("bridth = "+r.getBridth());
		System.out.println("area of rectangle = "+s2.area());
		System.out.println("perameter of rectangle = "+s2.perameter());
		System.out.println("-----------------------");
		
		Shape s3 = new Triangle(18, 34);
		Triangle t = (Triangle)s3;
		System.out.println("base = "+t.getBase());
		System.out.println("hight = "+t.getHight());
		System.out.println("area of triangle  = "+s3.area());
		System.out.println("----------------------");
		
	}

}
