package com.rays.oop.expert.practise;

public class Account {

	private String name;
	private String accountno;
	private double accountbalance;

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAccountno() {
		return this.accountno;
	}

	public void setAccountno(String accountno) {
		this.accountno = accountno;
	}

	public double getAccountbalance() {
		return this.accountbalance;
	}

	public void setAccountbalance(double accountbalance) {
		this.accountbalance = accountbalance;
	}
	public void deposite(double amount) {
		this.accountbalance = this.accountbalance + amount;
		System.out.println("total amount after deposite = "+this.accountbalance);
		
	}
	public void withdrawl(double amount) {
		this.accountbalance = this.accountbalance - amount;
		System.out.println("total amount after withdrwal = "+this.accountbalance);
	}

}
