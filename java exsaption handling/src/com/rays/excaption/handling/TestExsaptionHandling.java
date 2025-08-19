package com.rays.excaption.handling;

public class TestExsaptionHandling {
	public static void main(String[] args) {
		try {
			int a = 0;
			int b = 15;
			double div = b / a;

			System.out.println("divident = " + div);
		} catch (ArithmeticException e) {
			System.out.println("project finish " + e.getMessage());

		}

	}
}
