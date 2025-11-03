package com.rays.oop.overriding.ex;

public class Doctor extends Person {
	
	private String Specilist;
	private int idno;
	public String getSpecilist() {
		return Specilist;
	}
	public void setSpecilist(String specilist) {
		Specilist = specilist;
	}
	public int getIdno() {
		return idno;
	}
	public void setIdno(int idno) {
		this.idno = idno;
	}
	@Override
	public String name() {
		return "Neeraj Meawada";
	}
	@Override
	public String address() {
		return "Shujalpur";
	}
	
	

}
