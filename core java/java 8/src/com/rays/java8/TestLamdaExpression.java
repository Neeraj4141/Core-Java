package com.rays.java8;

public class TestLamdaExpression {
	public static void main(String[] args) {
		
		HelloFunctionInt  file = (i, j)->{
			return i + j ;
		};
		int i = 23;
		int j = 24;
		
		System.out.println(file.sum(i, j));
	}
	

}
