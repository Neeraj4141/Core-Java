package com.rays.oop.polimorphism;

public class HDFCBank extends Bank {
	
	private int accountno;
	
	public HDFCBank(int accountno) {
		 this.accountno = accountno;
	}
	public int  getAccountno() {
		return accountno;
	}
	
	@Override
	public double intrestrate() {
		
		return 10.10;
	}
	@Override
	public String name() {
		
		return "HDFC";
	}
	
	
	

}
