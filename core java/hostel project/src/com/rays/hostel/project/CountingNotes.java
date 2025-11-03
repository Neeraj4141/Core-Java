package com.rays.hostel.project;

public class CountingNotes {
	public static void main(String[] args) {

		int money = 1888;
		int[] notes = { 1000, 500, 200, 100, 50, 20, 10, 5, 2, 1, };
		int count = 0;

		for (int note : notes) {
			count = money / note;
			System.out.println(count + " = " + note);

			money = money % note;
		}

	}

}
