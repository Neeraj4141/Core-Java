package com.rays.oop.overriding.ex;

public class Student extends Person {
	private String subject;
	private String school;
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public String getSchool() {
		return school;
	}
	public void setSchool(String school) {
		this.school = school;
	}
	@Override
	public String name() {
		
		return "Lucky Morya";
	}
	@Override
	public String address() {
		
		return "Indire";
	}
	
	

}
