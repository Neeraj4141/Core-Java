package com.rays.oop.constructorcalling;

public class Employe {
	
	public Employe() {
		System.out.println("Employe default constuctor ");
	}
	public Employe(String name) {
		this();
		System.out.println("Name = "+name); 
	}
	public Employe (String name, String address ) {
		this(name);
		System.out.println("Address = "+address);
	}
	public Employe(String name, String address, String company) {
		this(name, address);
		System.out.println("Company = "+company);
	}
	public Employe(String name, String address, String company, String village) {
		this(name, address, company);
		System.out.println("village = "+village);
	}

}
