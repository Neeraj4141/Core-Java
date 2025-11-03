package com.rays.basics;

public class ArmstrongNo {
	public static void main(String[] args) {

		int i = 153;
		int temp = i;
		int r = 0;
		int arms = 0;
		while (temp > 0) {
			r = temp % 10;
			arms = arms + r * r * r;
			temp = temp / 10;
		}
		System.out.println(arms);
		if (i == arms) {
			System.out.println("armstrong no");
		} else {
			System.out.println("not armstrong no");
		}

	}
}
