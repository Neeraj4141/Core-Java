package com.rays.oop.overriding;

public class Test {
	public static void main(String[] args) {
		
		Shape[]s = new Shape[3];
		s[0] = new Circle ();
		s[1] = new Triangle(16, 18);
		s[2] = new Rectangle();
		
		Circle c = (Circle)s[0];
		c.setRedius(29);
		
		Rectangle r = (Rectangle)s[2];
		r.set(17);
		r.setLength(33);
		
		double totalArea = Testbymethodarrgumenyt.getArea(s);
		System.out.println("sbhi chield class ka area ");
		System.out.println("total area = "+totalArea);
		
	}

}
