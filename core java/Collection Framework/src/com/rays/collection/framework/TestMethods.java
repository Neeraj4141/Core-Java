package com.rays.collection.framework;

import java.util.ArrayList;
import java.util.Collection;

public class TestMethods {

	public static void main(String[] args) {

		Collection c = new ArrayList();

		c.add("Neeraj");
		c.add(25);
		c.add('r');
		c.add(1.5);
		c.add(true);
		System.out.println("c = " + c);
		System.out.println(c.contains("Neeraj"));
		c.remove(1.5);
		System.out.println("c = " + c);

		Collection c1 = new ArrayList();

		c1.add("Mewada");
		c1.add(26);
		c1.add('r');
		c1.add(2.6);
		c1.add(false);

		System.out.println("c1 = " + c1);
		System.out.println("c me c1 hee? = " + c.containsAll(c1));
		System.out.println("size of c = " + c.size());
		System.out.println("size of c1 = " + c1.size());
		c.addAll(c1);
		System.out.println("Size of c = " + c.size());
		System.out.println("c = " + c);
		System.out.println("c1 = " + c1);
		c.removeAll(c1);
		System.out.println("c me c1 he ? = " + c.containsAll(c1));
		System.out.println(c.isEmpty());

	}

}
