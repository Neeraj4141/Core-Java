package com.rays.basics;

public class OddEven {
	public static void main(String[] arg) {
		int[] a = { 2, 3, 4, 5, 6, 7, 8, };
		for (int b : a) {
			if (b % 2 == 0) {
				System.out.println(b + "is even");
			} else {
				System.out.println(b + "is odd");
			}
		}
	}
}
