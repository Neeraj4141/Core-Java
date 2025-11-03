package com.rays.java8;

public class TestAnonymousInt {
	public static void main(String[] args) {
		
		HelloFunctionInt f = new HelloFunctionInt() {
			
			@Override
			public int sum(int i, int j) {
				// TODO Auto-generated method stub
				return i + j;
			}
		};
		int i = 10;
		int j = 20;
		System.out.println(f.sum(i, j));
		f.m1();
		HelloFunctionInt.m2();
	}
	

}
