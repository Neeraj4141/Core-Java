package com.rays.oop.polimorphism;

public class ICICIBank extends Bank {
	
	private String IFSCcode;
	
	public ICICIBank(String IFSCcode) {
		this.IFSCcode = IFSCcode;
	}
	public String getIFSCcode() {
		return this.IFSCcode;
	}

	@Override
	public double intrestrate() {
		
		return 8.89;
	}
	@Override
	public String name() {
		
		return "ICICI";
	}

}
