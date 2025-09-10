package com.rays.oi;

public class CharcterandAsciValue {
	public static void main(String[] args) {

		for (char c = 'a'; c <= 'z'; c++) {
         System.out.println(c + " = "+ (int)c);	
		}
		System.out.println("=======================");
		for(char c = 'A'; c <= 'Z'; c++ ) {
			System.out.println(c + " = "+ (int)c);	
		}
	}

}
