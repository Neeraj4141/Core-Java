package com.rays.collection.framework;

import java.util.ArrayList;
import java.util.Collection;

public class TestCollection {
	public static void main(String[] args) {

		Collection c = new ArrayList();

		c.add(true);
		c.add('c');
		c.add("Neeraj");
		c.add(45);
		c.add(45.5);

		System.out.println(c);
		System.out.println("____________________");

		for (Object o : c) {
			System.out.println(o);

		}
	}

}
