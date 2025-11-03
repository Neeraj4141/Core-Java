package com.rays.hostel.project;

public class Array {
	
	public static void main(String[] args) {
	
	int [] a = {1, 4, 30, 49, 26, 40, 356, 632, };
	
	System.out.println("______________simple______________________");
	System.out.println(a[0]+" "+a[7]);
	
	System.out.println("_____________for loop with array__________");
	for(int i = 0;i<a.length;i++) {
	System.out.println( i +" "+ a[i]);
	}
	System.out.println( "______________for each loop______________");
	for(int b : a) {
		
		System.out.println(b);
	}
	
	
	}
}
