package com.rays.collection.set;

import java.util.HashSet;
import java.util.Set;

//1.set contain only unique value
//2.set contain only one null value
//3.order of set is shorting order in asc

public class TestSet {
	public static void main(String[] args) {
		
		Set s = new HashSet();
		
		s.add('d');
		s.add('a');
		s.add('c');
		s.add('g');
		s.add('f');
		s.add('b');
		s.add('e');
		
		System.out.println(s);
		System.out.println("__________foe each loop_________");
		
		for(Object o : s) {
			System.out.println(o);
			
		}
		
	}

}
