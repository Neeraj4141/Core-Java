package com.rays.excaption.handling;

public class TestStriingException {
	public static void main(String[] args) {

		try {
			String a = "ram";
			System.out.println("String = " + a.length());
			System.out.println("String = " + a.charAt(3));
		} catch (NullPointerException e) {
			System.out.println("project finish = " + e.getLocalizedMessage());
		} catch (IndexOutOfBoundsException e) {
			System.out.println("project finish = " + e.getLocalizedMessage());

		}
	}

}
