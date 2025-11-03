package com.rays.collection.shorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestMarksheet {
	public static void main(String[] args) {

		List<Marksheet> list = new ArrayList<Marksheet>();

		Marksheet m = new Marksheet("Dishu", "1234572", 54);

		list.add(new Marksheet("Neeraj", "1234570", 82));
		list.add(new Marksheet("Rohit", "1234566", 59));
		list.add(new Marksheet("Ishwar", "1234569", 43));
		list.add(new Marksheet("Rahul", "1234567", 84));
		list.add(new Marksheet("Rishu", "1234568", 23));
		list.add(m);

		System.out.println(list);
		list.forEach(System.out::println);

		System.out.println("==========shorting by roll no ==========");

		Collections.sort(list);

		list.forEach(System.out::println);

	}
}
