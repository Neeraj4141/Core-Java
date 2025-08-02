package com.rays.constructor.prectise;

public class TestShape {
	public static void main(String[] args) {
		
		Circle c = new Circle();
		Circle c1 = new Circle(19);
		c.setColor("blue");
		
		System.out.println("color of circle = "+c.getColor());
		System.out.println("area of circle = "+c1.area());
		
		Triangle t = new Triangle(17, 45);
		t.setColor("red");
		
		System.out.println("color of triangle = "+t.getColor());
		System.out.println("area of triangle = "+t.area());
		
		Circle c2 = new Circle(16);
		c2.setColor("yellow");
		
		System.out.println("color of semi circle = "+c2.getColor());
		System.out.println("area of semicircle = "+c2.area());
		
		
	}

}
