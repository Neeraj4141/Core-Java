package com.rays.hostel.project;

public class StringHandling {
	public static void main(String[] args) {

		String s1 = "Sunrays";
		String s2 = "Sunrays";
		String s3 = new String("Welcome");
		String s4 = new String("Sunrays");

		System.out.println(s1 == s2);
		System.out.println(s3 == s4);
		System.out.println(s1 == s4);
		System.out.println(s1.equals(s4));
		System.out .println(s2.equals(s4));
	}

}
