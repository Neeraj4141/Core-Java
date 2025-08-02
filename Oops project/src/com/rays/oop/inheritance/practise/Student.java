package com.rays.oop.inheritance.practise;

public class Student extends Person {

	private String school;
	private String subject;
	private int rollno;

	public String getSchool() {
		return this.school;
	}

	public void setSchool(String school) {
		this.school = school;
	}

	public String getSubject() {
		return this.subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public int getRollno() {
		return this.rollno;
	}

	public void setRollno(int rollno) {
		this.rollno = rollno;
	}

}
