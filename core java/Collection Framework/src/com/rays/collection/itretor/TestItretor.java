package com.rays.collection.itretor;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TestItretor {
	public static void main(String[] args) {

		List list = new ArrayList();

		list.add("Neeraj");
		list.add(5);
		list.add('a');
		list.add(2.1);
		list.add("Mewada");

		System.out.println(list);
		System.out.println("__________itreator______________");

		Iterator it = list.iterator();
		while (it.hasNext()) {
			Object o = it.next();
			System.out.println(o);
		}
		System.out.println("___________for each loop____________");
		for (Object o : list) {
			System.out.println(o);
		}

	}

}
