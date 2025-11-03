package com.rays.excaption.handling;

public class Testchecked {
	public static void main(String[] args) {
		son();
	}
		
		public static void son() {
			try {
				throw new Exception();
			} catch (Exception e) {
				System.out.println(e.getLocalizedMessage());
			}
			
	}

}
