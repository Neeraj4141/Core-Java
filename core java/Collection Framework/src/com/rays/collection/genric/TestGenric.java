package com.rays.collection.genric;

import java.util.ArrayList;
import java.util.Iterator;

public class TestGenric {

	public static void main(String[] args) {
		
		ArrayList<Integer> a = new ArrayList<Integer>();
		
		a.add(23);
		a.add(26);
		a.add(34);
		a.add(30);
		
		System.out.println(a);
		
		 Iterator<Integer> it = a.iterator();
		 while(it.hasNext()) {
			 int o = it.next();
			 System.out.println(o);
			 
		 }
	}
}
