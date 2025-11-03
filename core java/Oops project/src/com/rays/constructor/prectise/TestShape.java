package com.rays.constructor.prectise;

public class TestShape {
	public static void main(String[] args) {
		
		Circle c = new Circle(345);
		c.setColor("yellow");
		c.setWidth(8);
		
		System.out.println("Redius of circle = "+c.getRedius());
		System.out.println("area of circle   = "+c.area()); 
		System.out.println("color of circle  = "+c.getColor());
		System.out.println("width of circle  = "+c.getWidth());
		System.out.println("+++++++++++++++Circle+++++++++++++++");
		
		Triangle t = new Triangle(23, 23.3);
		t.setColor("black");
		t.setWidth(3);
		
		System.out.println("height of triangle = "+t.getHeight());
		System.out.println("base of triangle   = "+t.getBase());
		System.out.println("color of triangle  = "+t.getColor());
		System.out.println("area og triangle   = "+t.area());
		System.out.println("++++++++++++++Triangle++++++++++++++");
		
		Rectangle r = new Rectangle(23,54);
		r.setColor("blue");
		r.setWidth(3);
		
		System.out.println("length of rectangle = "+r.getLength());
		System.out.println("brith of rectangle  = "+r.getBrith());
		System.out.println("color of rectangle  = "+r.getColor());
		System.out.println("area of rectangle   = "+r.area());
		System.out.println("++++++++++++Rectangle+++++++++++++++");
		
	}

}
