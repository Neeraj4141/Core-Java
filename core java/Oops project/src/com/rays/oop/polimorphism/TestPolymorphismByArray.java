package com.rays.oop.polimorphism;

public class TestPolymorphismByArray {
	//ek hi chiz ke kai roop
	public static void main(String[] args) {

		Shape[] s = new Shape[4];

		s[0] = new Circle();
		s[1] = new Rectangle();
		s[2] = new Triangle();
        s[3] = new Square(17);
        
        //type casting
		Circle c = (Circle) s[0];
		c.setRedius(16);
        //type casting
		Rectangle r = (Rectangle) s[1];
		r.setLength(19);
		r.setWidth(11);
        //type casting
		Triangle t = (Triangle) s[2];
		t.setHeight(7);
		t.setBase(9);
		
		

		for(int i = 0; i<s.length; i++) {
		System.out.println("area = "+s[i].area());
		System.out.println("perameter = "+s[i].perameter());
		System.out.println(",,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,");
		
	
	}
	}
}
