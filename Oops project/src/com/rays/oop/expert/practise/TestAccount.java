package com.rays.oop.expert.practise;

public class TestAccount {
	public static void main(String[] args) {
		
		Account a1 = new Account();
		
		a1.setAccountbalance(5245.00);
		a1.setAccountno("6242729");
		a1.setName("neeraj mewada");
		
		System.out.println("name = "+a1.getName());
		System.out.println("accountno = "+a1.getAccountno());
	    System.out.println("accountbalance = "+a1.getAccountbalance());
	    a1.deposite(900.0);
	    a1.withdrawl(2245.0);
	    a1.deposite(762.90);
	    a1.withdrawl(1662.89);
	    
	}

}
