package com.rays.basics;

public class TestString {
public static void main(String[] arg) {
	String name= "Neeraj Singh Mewada";
	System.out.println("name=" +name);
	System.out.println("length="+name.length());
	System.out.println("8th char is"+name.charAt(7));
	System.out.println("index of r is "+name.indexOf('r'));
	System.out.println("last indexof h is"+name.lastIndexOf('h'));
	System.out.println("e replaced with i="+name.replace('e', 'i'));
	System.out.println("chota neeraj="+name.toLowerCase());
	System.out.println("bada neeraj="+name.toUpperCase());
}

}