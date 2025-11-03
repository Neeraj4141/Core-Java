package com.rays.basics;

public class ForEachLoopS {
	public static void main(String[] arg) {
		int[] a = { 5, 10, 15, 20, 25, 30, 35, 40, 45, 50 };
		System.out.println(a[0] + " " + a[1]);
		System.out.println("---for each loop---");
		for (int b : a) {
			System.out.println(b + " ");
		}
		System.out.println("---for loop---");
		for (int i = 0; i < a.length; i++) {
			System.out.println(i + " = " + a[i]);

		}
	}
}
