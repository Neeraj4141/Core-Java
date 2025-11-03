 package com.rays.collection.framework;

import java.util.ArrayList;
import java.util.Collection;

public class TestRetainAll {
	public static void main(String[] args) {
		
		Collection c1 = new ArrayList();
		
		c1.add(5);
		c1.add(true);
		c1.add("Neeraj");
		c1.add('i');
		c1.add(3.3);
		
		System.out.println("c1 = "+c1);
		
		Collection c2 = new ArrayList();
		
		c2.add(6);
		c2.add(false);
		c2.add("Mewada");
		c2.add('i');
		c2.add(3.3);
		
		System.out.println("c2 = "+c2);
		
		c1.retainAll(c2);
		
		System.out.println("c1 = "+c1);
	}

}
