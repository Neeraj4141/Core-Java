package com.rays.oop.expert.practise;

public class TestByArray {
	public static void main(String[] args) {

	
	int []a =  {1, 3, 7, 20, 38, 63, 73, 36, 22, 76};
	
	System.out.println("_________________by single array___________________");
	System.out.println(a[4]);
	
	System.out.println("_________________by for each loop__________________");
	for ( int b : a) {
		System.out.println(b + " ");
	}
	System.out.println("________________for loop___________________________");
	for(int i = 0;i<a.length;i++) {
    System.out.println( i+" = "+ a[i]);
	}
	}
}
