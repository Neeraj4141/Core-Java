package com.rayas.collection.list;

public class Marksheet {
	
	public String name ;
	public String rollNo;
	public int physics;
	
	public Marksheet(String name, String rollNo, int physics) {
		this.name = name;
		this.rollNo = rollNo;
		this.physics = physics;
	}
	public String toString() {
		return "Name = "+ name + "rollNo = " + rollNo + "physics = " + physics; 
	}

}
