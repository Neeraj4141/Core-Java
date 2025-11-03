package com.rays.java8;

public class TestFunctionalSecond {
	public static void main(String[] args) {

		FunctionalInt f = new FunctionalInt() {

			@Override
			public void name() {
				System.out.println("Neeraj Singh Mewada");

			}
		};
		f.name();

	}
}
