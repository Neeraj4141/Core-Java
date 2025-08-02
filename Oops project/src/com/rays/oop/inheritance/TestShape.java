package com.rays.oop.inheritance;

public class TestShape {
	public static void main(String[] args) {

		System.out.println("---------circle--------");

		Circle c = new Circle();

		c.setColor("Red");
		c.setBorderwidth(4);
		c.setRedius(2);

		System.out.println("color = " + c.getColor());
		System.out.println("borderwidth = " + c.getBorderwidth());
		System.out.println("redius = " + c.getRedius());
		System.out.println("area of circle = " + c.area());

		System.out.println("------Rectangle------");

		Rectengle r = new Rectengle();

		r.setLength(15);
		r.setWidth(20);
		r.setColor("yellow");

		System.out.println("length of rec = " + r.getLength());
		System.out.println("width of rec = " + r.getWidth());
		System.out.println("colour of rec = " + r.getColor());
		System.out.println("area of rec =" + r.area());

		System.out.println("------treangle-----");

		Triangle t = new Triangle();

		t.setBase(16);
		t.setHeight(10);
		t.setColor("orange");
		t.setBorderwidth(17);

		System.out.println("base of triangle = " + t.getBase());
		System.out.println("height of triangle = " + t.getHight());
		System.out.println("color of triangle = " + t.getColor());
		System.out.println("borderewidth of triangle = " + t.getBorderwidth());
		System.out.println("area of triangle = " + t.area());

		System.out.println("--------square-------");

		Square s = new Square();

		s.setColor("black");
		s.setSide(12);

		System.out.println("color of squre = " + s.getColor());
		System.out.println("side of squre = " + s.getSide());
		System.out.println("area of square = " + s.area());

		System.out.println("--------Semicircle----------");

		SemiCircle s1 = new SemiCircle();

		s1.setRedius(5);
		s1.setColor("orange");

		System.out.println("redius of semicircle = " + s1.getRedius());
		System.out.println("color of semicircle = " + s1.getColor());
		System.out.println("area of semicircle = " + s1.semiCircleArea());

	}
}
