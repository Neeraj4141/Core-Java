package com.rays.oop.expert;

public class TestAccount {
	public static void main(String[] args) {
		
		Account A = new Account();
		
		A.setName("Neeraj singh mewada");
		A.setAccountno("26111213");
		A.setAccounttype("Curret");
		A.setAccountbalance(1332.00);
		
		System.out.println("Name = "+ A.getName());
		System.out.println("no   = "+ A.getAccountno());
		System.out.println("type = "+ A.getAccounttype());
		System.out.println("bala = "+ A.getAccountbalnce());
		
		A.deposite(1500);
		A.Withdrawal(1400);
		A.deposite(600);
		A.Withdrawal(700);
		
		
		System.out.println("-----------------------------------");
		
		Account A2 = new Account();
		
		A2.setName("priyanshu verma");
		A2.setAccountno("123456789");
		A2.setAccounttype("saving");
		A2.setAccountbalance(343456.38);

		
		
		System.out.println("Name = "+ A2.getName());
		System.out.println("no   = "+ A2.getAccountno());
		System.out.println("type = "+ A2.getAccounttype());
		System.out.println("bala = "+ A2.getAccountbalnce());
		
		A2.deposite(1500);
		A2.Withdrawal(43456.38);
		A2.Withdrawal(1500);
	}

}
