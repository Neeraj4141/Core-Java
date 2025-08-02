package com.rays.oop.inheritance;

public class Doctor extends Person{
	
	private String speclist;
	private String surgery;
	
	public String getSpeclist() {
		return this.speclist;
	}
	public void setSpeclist(String speclist) {
		this.speclist = speclist;
	}
	public String getSurgery() {
		return this.surgery;
	}
	public void setSurgery(String surgery) {
		this.surgery = surgery;
	}

}
