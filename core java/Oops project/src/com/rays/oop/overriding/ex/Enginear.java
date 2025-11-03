package com.rays.oop.overriding.ex;

public class Enginear extends Person {
	private String field;
	private String collage;

	public String getField() {
		return field;
	}

	public void setField(String field) {
		this.field = field;
	}

	public String getCollage() {
		return collage;
	}

	public void setCollage(String collage) {
		this.collage = collage;
	}

	@Override
	public String name() {

		return "Abhishek Yadav";
	}

	@Override
	public String address() {

		return "Bhind Murena";
	}

}
