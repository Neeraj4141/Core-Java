package com.rays.basics;

public class FindPositionIntArry {

	public static void main(String[] args) {
		
		int[] arry = { 1, 2, 4, 3, 5, 6, 3, 5, 4, };
		int n = 4;
		int count = -1;
		for (int i = 0; i < arry.length; i++) {
			if (n == arry[i]) {
				count = i;
				System.out.println(count + " = " + arry[i]);
			}
		}
		if (count == -1) {
			System.out.println(count);
		}
	}
}
