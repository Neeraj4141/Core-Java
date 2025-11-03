package com.rays.collection.framework;

import java.util.Enumeration;
import java.util.Vector;

public class TestFailSafe {
	public static void main(String[] args) {
		
		Vector v = new Vector();
		
		v.add("shyam");
		v.add('a');
		v.add(23);
		v.add(23.4);
		v.add(false);
		
		System.out.println(v);
		
		Enumeration e = v.elements();
		
		v.add("mewada");
		
		while(e.hasMoreElements()) {
			Object o = e.nextElement();
			System.out.println(o);
		}
	}

}
