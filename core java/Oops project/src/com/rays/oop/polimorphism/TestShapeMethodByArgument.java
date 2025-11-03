package com.rays.oop.polimorphism;

public class TestShapeMethodByArgument {
	
	public static double getArea(Shape[] s) {
		
		double totalArea= 0.0;
	
		for (int i = 0; i < s.length; i++) {
			System.out.println( "area = "+s[i].area());
			totalArea = totalArea + s[i].area();
			
		}
		return totalArea;
	}

}
