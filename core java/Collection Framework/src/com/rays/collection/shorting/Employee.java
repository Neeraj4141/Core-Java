package com.rays.collection.shorting;

public class Employee {

	public String name;
	public int salary;
	public int id;

	public Employee(String name, int salary, int id) {
		this.name = name;
		this.salary = salary;
		this.id = id;
	}

	public String toString() {
		return "Name = " + name + " salary = " + salary + " id = " + id;
	}

}
