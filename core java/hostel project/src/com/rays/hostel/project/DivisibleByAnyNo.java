package com.rays.hostel.project;

public class DivisibleByAnyNo {
	public static void main(String[] args) {

		int no = 0;
		for (int i = 2; i < 600; i++) {
			if (i % 8 == 0) {
				System.out.println(i);
				no = no + i;
			}
		}
		System.out.println(no);
	}

}
