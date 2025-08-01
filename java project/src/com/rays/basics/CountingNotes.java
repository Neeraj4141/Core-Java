package com.rays.basics;

public class CountingNotes {
public static void main(String[] args) {
	int money = 13688;
	int count = 0;
    int []notes = {1000, 500, 100, 50,  20, 10, 5, 2, 1};
    
    for (int note:notes) {
    	count = money/note;
    	System.out.println(note + "=" + count);
    	money = money%note;
    }
    
}
}
