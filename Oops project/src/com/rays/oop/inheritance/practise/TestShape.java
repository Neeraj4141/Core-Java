package com.rays.oop.inheritance.practise;

public class TestShape {
	public static void main(String[] args) {

		Circle c = new Circle();
		c.setColor("narangi");
		c.setRedius(85);
		
		System.out.println("?????????????????????????????????????????");
		System.out.println("color of circle = " + c.getColor());
		System.out.println("redius of circle = " + c.getRedius());
		System.out.println("area of circle = " + c.area());

		Rectangle r = new Rectangle();
		r.setColor("jamuni");
		r.setLength(65);
		r.setWidth(69);
		
		System.out.println("?????????????????????????????????????????");
		System.out.println("color of rectangle = " + r.getColor());
		System.out.println("length of rectangle = " + r.getLength());
		System.out.println("width of rectangle = " + r.getWidth());
		System.out.println("areaof ractangle = " + r.area());

		Triangle t = new Triangle();
		t.setColor("dudhiya");
		t.setBase(76);
		t.setHeight(96);
		
		System.out.println("?????????????????????????????????????????");
		System.out.println("colo of triangle = " + t.getColor());
		System.out.println("height of triangle = " + t.getHeight());
		System.out.println("base of triangle = " + t.getBase());
		System.out.println("areaof triangle = " + t.area());

		Squre s = new Squre();
		s.setColor("laaal");
		s.setSide(76);
		
		System.out.println("?????????????????????????????????????????");
		System.out.println("color of squre = " + s.getColor());
		System.out.println("side of squre = " + s.getSide());
		System.out.println("area of squre = " + s.area());

	}

}
