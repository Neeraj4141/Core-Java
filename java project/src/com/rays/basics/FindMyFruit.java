package com.rays.basics;

public class FindMyFruit {
	public static void main(String[]args){
		String[] fruits = {"apple","mango","pinapple","watermelon","strawberry","banana","orange"};
		String fruit = "strawberry";
		int count = -1;
		for (int i = 0; i<fruits.length;i++) {
			if (fruit ==fruits[i]) {							
				count = i;
				System.out.println(count + " = "+ fruits[i]);
				
			}
		}
		if (count == -1) {
		System.out.println(count);	
		}
		
	}
}