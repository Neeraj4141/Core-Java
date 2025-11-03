package com.rays.collection.framework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class TestFailFast {
	public static void main(String[] args) {

		ArrayList list = new ArrayList();

		list.add("ram");
		list.add(2);
		list.add('e');
		list.add(23.2);
		list.add(true);

		System.out.println(list);

		Iterator it = list.iterator();

		while (it.hasNext()) {
			Object o = it.next();
			it.remove();
			System.out.println(o);
		}
		System.out.println(list);
	}

}
