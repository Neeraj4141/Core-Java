package com.rays.oop.overriding;

public class Testbyreturntypemethod {
	public static void main(String[] args) {
		
		Shape [] s = new Shape[3];
		
	    s[0] = Shape.getShape(1);
	    s[1] = Shape.getShape(2);
	    s[2] = Shape.getShape(3);
	    
	    Circle c = (Circle)s[0] ;
	    c.setRedius(19);
	    
	    Rectangle r = (Rectangle)s[1];
	    r.set(11);
	    r.setLength(19);
	   
	    for (int i = 0; i < s.length; i++) {
	    System.out.println("area  = "+s[i].area());
	}
	}
}
