package com.rays.basics;

public class ForEachLoop {
public static void main(String[] args) {

	int[] a = {5 ,10, 15, 20, 25, 30, };
	//jaab bhi bhoot sari alag alag value hogi to unhe
	//intzer ka arry ( [] ) bana kar store karte he
	System.out.println(a[0]+" "+ a[1] );
	//is methode se aap haar index ko alag alag print karane ke liye usse karte hee 
	System.out.println("----------");
	for (int b:a) {
		System .out.println(b+" ");
		//aab for each loop laga  kaar haam array ke haar index ko "b" me
		//store karte hee b ki value print karte he
	}
}

}