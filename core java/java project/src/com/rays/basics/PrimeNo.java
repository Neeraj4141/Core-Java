package com.rays.basics;

public class PrimeNo {
public static void main(String[] arg) {
	int a=4253;
	int count=0;
	for(int i=2; i< a; i++) {
		if (a%i==0) {
			count++;
		}
	}
	System.out.println(count);
	if (count==0) {
		System.out.println(a+" is prime");
		}else {
			System.out.println(a+"is not prime");
		}
	
}
}
