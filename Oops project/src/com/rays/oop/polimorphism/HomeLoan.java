package com.rays.oop.polimorphism;

public class HomeLoan {
	
	public static void main(String[] args) {
		
		Bank[] banks = new Bank[3];
		
		banks[0] = new HDFCBank(98298709);
		banks[1] = new AxisBank();
		banks[2] = new ICICIBank("ICIsjp3778");
		
		HDFCBank h = (HDFCBank)banks[0];
		ICICIBank I = (ICICIBank)banks[2];
		
		System.out.println(" accountno of hdfc bank = "+h.getAccountno());
		System.out.println("IfSC code of icici bank = "+I.getIFSCcode());
		
		System.out.println("-----------------------override method---------------");
		
		for (int i = 0; i < banks.length; i++) {
			double intrestrate = banks[i].intrestrate();
			String bankName = banks[i].name();
			System.out.println(bankName + " intrestrate = " +intrestrate);
			
		}
		
	}

}
