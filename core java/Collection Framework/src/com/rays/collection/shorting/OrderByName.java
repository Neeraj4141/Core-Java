package com.rays.collection.shorting;

import java.util.Comparator;

public class OrderByName implements Comparator<Employee> {

	@Override
	public int compare(Employee o1, Employee o2) {
		if (o1.name == o2.name) {
			return o1.id - o2.id;
		} else {
			return o1.name.compareTo(o2.name);
		}
	}

}
