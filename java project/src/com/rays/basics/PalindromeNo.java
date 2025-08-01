package com.rays.basics;

public class PalindromeNo {
	
public static void main(String[] args){
  int n=121;
  int temp=n;
	int r=0;
	int rv =0;
	while (temp>0) {
		r = temp%10;
		rv = (rv*10)+r;
		temp = temp / 10;
		
	}
	
	System.out.println(rv);
	if(n==rv) {
		System.out.println("is prindrome no");
	}else {
		System.out.println("is not prindrome no");
	}
}
}
