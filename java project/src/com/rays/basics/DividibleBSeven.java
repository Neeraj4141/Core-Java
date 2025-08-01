package com.rays.basics;

public class DividibleBSeven {
public static void main(String[]args) {
	int sum=0;
	for (int i=53; i < 150; i++) {
		if (i%7==0) {
			System.out.println(i);
			sum=sum+i;
		}
	}
	System.out.println(sum);
}
}
