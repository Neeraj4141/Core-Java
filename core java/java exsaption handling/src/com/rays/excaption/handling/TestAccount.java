package com.rays.excaption.handling;

public class TestAccount {
	public static void main(String[] args) throws InsuficientFundException {

		double balance = 1000.0;
		double withdrwal = 2000.0;
		System.out.println("current balance = "+balance);

		if (withdrwal > balance) {
			throw new InsuficientFundException();
		} else {
			balance= balance-withdrwal;
			System.out.println("balance after withdrawal = "+balance);
		}

	}

}
