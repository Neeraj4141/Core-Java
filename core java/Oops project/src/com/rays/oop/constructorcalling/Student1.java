package com.rays.oop.constructorcalling;

public class Student1 {
		
		public Student1 () {
			System.out.println("perent default constructor");
  		}
		public Student1 (String name) {
			this();
			System.out.println( "name = "+ name);
		}
		public Student1(String name, String address) {
			this(name);
			System.out.println("Address = "+address);
		}
		public Student1 (String name, String address, String subject) {
			this(name, address);
			System.out.println("Subject = "+subject);
		}
	}
