package com.rays.collection.shorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class TestEmployee {
	public static void main(String[] args) {

		List<Employee> list = new ArrayList<Employee>();

		list.add(new Employee("Neeraj", 17000, 101));
		list.add(new Employee("Kamal", 18000, 105));
		list.add(new Employee("Abhishek", 19000, 103));
		list.add(new Employee("Anshul", 16000, 106));
		list.add(new Employee("Rohit", 15000, 104));
		list.add(new Employee("Raju", 14000, 102));

		list.forEach(System.out::println);
		System.out.println("================ByName=======================|");

		OrderByName byname = new OrderByName();
		Collections.sort(list, byname);
		list.forEach(System.out::println);
		System.out.println("================ById=========================|");

		OrderById byid = new OrderById();
		Collections.sort(list, byid);
		list.forEach(System.out::println);
		System.out.println("================BySalary=====================|");

		OrderBySalary bysalary = new OrderBySalary();
		Collections.sort(list, bysalary);
		// list.forEach(System.out::println);
		Iterator it = list.iterator();
		while (it.hasNext()) {
			Object o = it.next();
			System.out.println(o);
			// System.out.println("================ByIterator===================|");

		}
	}

}
