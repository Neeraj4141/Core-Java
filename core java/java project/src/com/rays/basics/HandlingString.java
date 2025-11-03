package com.rays.basics;

public class HandlingString {
public static void main(String[] args) {
	String s1 = "SUNRAYS";
	String s2 = "SUNRAYS";
	String s3 = new String  ("welcome");
	String s4 = new String  ("SUNRAYS");
	System.out.println(s1==s4);
	System.out.println(s2.contentEquals(s4));
	System.out.println(s3.contentEquals(s4));
}
}
