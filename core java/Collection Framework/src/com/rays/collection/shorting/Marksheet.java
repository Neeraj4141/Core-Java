package com.rays.collection.shorting;

public class Marksheet implements Comparable<Marksheet> {

	public String name;
	public String rollNo;
	public int physics;

	public Marksheet(String name, String rollNo, int physics) {
		this.name = name;
		this.rollNo = rollNo;
		this.physics = physics;
	}

	public String toString() {
		return "Name = " + name + " rollNo = " + rollNo + " physics = " + physics;
	}

	@Override
	public int compareTo(Marksheet o) {
		 return this.rollNo.compareTo(o.rollNo);
		//return this.name.compareTo(o.name);
		// return this.physics - o.physics;
	}

}
