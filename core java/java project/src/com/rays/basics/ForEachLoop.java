package com.rays.basics;

public class ForEachLoop {
public static void main(String[] args) {

	int[] a = {5 ,10, 15, 20, 25, 30, };
	System.out.println(a[0]+" "+ a[1] );
	System.out.println("----------");
	for (int b:a) {
		System .out.println(b+" ");
	}
}

}