package com.rays.collection.itretor;

import java.util.Enumeration;
import java.util.Vector;

public class TestEnumeration {
	
	public static void main(String[] args) {
		
		Vector v = new Vector();
		
		v.add("Rohit");
		v.add(25);
		v.add(20.3);
		v.add('d');
		v.add(false);
		
		System.out.println(v);
		
		Enumeration e =  v.elements();
		while(e.hasMoreElements()) {
			Object o = e.nextElement();
			System.out.println(o);
			
		}
		
	}

}
