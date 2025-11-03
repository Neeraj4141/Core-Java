package com.rays.hostel.project;

public class TestString {
	public static void main(String[] args) {

		String name = "Neeraj Singh Mewada";

		System.out.println("Name = " + name);
		System.out.println("Length = " + name.length());
		System.out.println("position of d = " + name.indexOf('d'));
		System.out.println("a repalace by p = " + name.replace('a', 'p'));
		System.out.println("chota neeraj = " + name.toLowerCase());
		System.out.println("bada neeraj = " + name.toUpperCase());
		System.out.println("start with = " + name.startsWith("Nee"));
		System.out.println("end with = " + name.endsWith("ade"));

	}

}
