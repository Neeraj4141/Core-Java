package com.rays.basics;

public class FabonicSerious {
public static void main(String[] args) {
	int a = 0;
	int b = 1;
	int c = 0;
	for (int i=0; i < 10; i++) {
 c= a+ b;
		System.out.println(a + ",");
		a = b;
		b = c;
	}
}
}
