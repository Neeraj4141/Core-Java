package com.rays.oop.constructor;

public class TestShape {
	public static void main(String[] args) {
		
		System.out.println(" -----------circle-----------");

		Circle c = new Circle(11);
		
		c.setColor("red");
		
		 System.out.println("redius = "+c.getRedius());
		 System.out.println("area = "+c.area());
		 System.out.println("color = "+c.getColor());
		 
		 System.out.println("----------rectangle-----------");
		 
		 Rectangle r = new Rectangle(15, 18);
		 
		 r.setColor("yellow");
		 
		 System.out.println("length = "+r.getLength());
		 System.out.println("width = "+r.getWidth());
		 System.out.println("area = "+r.area());
		 System.out.println("color = "+r.getColor());
		 
		 System.out.println("----------square----------");
		 
		 Square s = new Square(15);
		 s.setColor("green");
		 
		 System.out.println("side of square = "+s.getSide());
		 System.out.println("color of square = "+s.getColor());
		 System.out.println("area of square = "+s.area());
		 
		 
	}

}
