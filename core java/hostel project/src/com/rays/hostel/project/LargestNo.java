package com.rays.hostel.project;

public class LargestNo {
	public static void main(String[] args) {
		
		int []a = {23, 34, 37, 46, 96, 58, 58, 38, 94, 73, };
		int n= a[0];
		for(int b : a) {
			if(b > n) {
			n = b;
			
		System.out.println(n);
			}
		}
	}

}
