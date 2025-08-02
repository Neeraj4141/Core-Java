package com.rays.oop.expert;

public class Account {

	private String name;
	private String accountno;
	private String accounttype;
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

	public String getAccounttype() {
		return this.accounttype;
	}

	public void setAccounttype(String accounttype) {
		this.accounttype = accounttype;
	}

	public double getAccountbalnce() {
		return this.accountbalance;
	}

	public void setAccountbalance(double accountbalnce) {
		this.accountbalance = accountbalnce;
	}

	public void deposite(double amount) {
		this.accountbalance = this.accountbalance + amount;
		System.out.println("total amount after deposite =" + getAccountbalnce());
	}

	public void Withdrawal(double amount) {
		if (amount > this.accountbalance) {
			System.out.println("insuficent fund transhfer");
		} else {
			this.accountbalance = this.accountbalance - amount;
			System.out.println("total ammount after whiyhdrawal =" + getAccountbalnce());
		}
	}

}
