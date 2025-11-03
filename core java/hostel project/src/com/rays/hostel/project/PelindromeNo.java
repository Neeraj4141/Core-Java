package com.rays.hostel.project;

public class PelindromeNo {
	public static void main(String[] args) {
		
		int i = 121;
		int peli = i;
		int r = 0;
		int rv = 0;
		
		while(peli>0) {
			r = peli%10;
			rv = (rv*10)+r;
			peli = peli/10;
		}
		System.out.println("result = "+rv);
		if (i==rv) {
			System.out.println("is a Pelindrome no = "+rv);
		}else {
			System.out.println("is not Pelindrome no = "+rv);
		}
	}

}
