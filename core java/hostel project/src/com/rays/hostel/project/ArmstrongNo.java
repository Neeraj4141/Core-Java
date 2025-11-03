package com.rays.hostel.project;

public class ArmstrongNo {
	public static void main(String[] args) {

		int i = 243;
		int temp = i;
		int r = 0;
		int rv = 0;

		while (temp > 0) {
			r = temp % 10;
			rv = rv + r * r * r;
			temp = temp / 10;
		}
		System.out.println(rv);
		if (i == rv) {
			System.out.println("is Armsstrong No");
		} else {
			System.out.println("is not ArmsstrongNo");
		}
	}

}
