package com.rays.oop.exercise;

public class Person {

	private String firstname;
	private String lastname;

	public Person(String firstname, String lastname) {
		this.firstname = firstname;
		this.lastname = lastname;
	}

	@Override
	public String toString() {
		return firstname + " " + lastname;

	}

}
