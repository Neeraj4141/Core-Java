package com.rays.excaption.handling;

public class TestUnchecked {
	public static void main(String[] args) {
		son();
	}
		
		public static void son() {
			try {
				throw new RuntimeException ("make a mistake");
			}catch(RuntimeException e ) {
				System.out.println(e.getLocalizedMessage());
			}
			
		
	}

}
