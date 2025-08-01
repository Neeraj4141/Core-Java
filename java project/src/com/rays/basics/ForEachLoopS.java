package com.rays.basics;

public class ForEachLoopS {
public static void main(String[] arg) {
	int[] a= {5, 10, 15, 20, 25, 30, 35, 40, 45, 50};
	System.out.println(a[0]+" "+a[1]);
    System.out.println("---for each loop---");
for (int b:a) {
	System.out.println(b+" ");
}
System.out.println("---for loop---");
for (int i=0; i<a.length; i++) {
	System.out.println(a[i]);
	//for loop me i ki value 0 rakh di or i ko less then a likh kar a ke
	//array ko jaab tak print karega jitni uski length he or i++ hota rahega
	//jaise abhi i ki value 0 he  or a ke array ke index 0 par 5 hee vo 5 ko print karega
	//or fir for loop chalega or jaab taak chalega jab array ki akhri value nahi aa jati 
	// uske bad loop ruk jaiga 
}
}
}
