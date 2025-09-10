package com.rays.serialization;

import java.io.Serializable;

public class Account implements Serializable {

	public String accountno;
	public transient double accountbalance;

	public Account(String a, double b) {
		this.accountno = a;
		this.accountbalance = b;

	}

	public String toString() {
		return "Accountno = " + accountno + " accountbalance = " + accountbalance;
	}

}
