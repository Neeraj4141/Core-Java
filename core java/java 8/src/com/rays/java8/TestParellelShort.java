package com.rays.java8;

import java.util.Arrays;

public class TestParellelShort {
	public static void main(String[] args) {

		int[] array = { 5, 6, 4, 7, 3, 8, 2, 9, 1, 0, };

		Arrays.parallelSort(array);

		for (int a : array) {
			System.out.println(a);

		}

	}
}
