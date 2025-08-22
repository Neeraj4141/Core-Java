package com.rays.excaption.handling;

public class TestChekedException {
	public static void main(String[] args) {
		
		try {
			son();
		}catch(Exception e) {
			System.out.println(e.getLocalizedMessage());
		}
		
		
	}
	public static void son() throws Exception {
		throw new Exception("bach gye bhai ");
	}

}
