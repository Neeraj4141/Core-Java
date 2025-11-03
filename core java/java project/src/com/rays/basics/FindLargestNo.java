package com.rays.basics;

public class FindLargestNo {
	public static void main(String[] args) {
		int[] array = { 29, 36, 78, 37, 89, 92, 93, 42, 49, 62, 84, 95, };
		int n = array[0];
		for (int a : array) {
			if (a > n) {
				n = a;
			}
		}

		System.out.println("result " + n);
	}
}
