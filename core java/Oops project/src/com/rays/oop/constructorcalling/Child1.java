package com.rays.oop.constructorcalling;

public class Child1 extends Student1 {

	public Child1() {
		super();
		System.out.println("childe1 default constroctor");
	}

	public Child1(String name, String address, String subject) {
		super(name, address, subject);
	}
}
