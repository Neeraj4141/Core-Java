package com.rays.oop.overriding.ex;

public class TestPerson {
	public static void main(String[] args) {
		
		Person p = new Student();
		Student s = (Student)p;
		
		s.setSchool("Mahatama Ganadhi");
		s.setSubject("Maths");
		
		System.out.println("Name Of School     = "+s.getSchool());
		System.out.println("Name Of Subject    = "+s.getSubject());
		System.out.println("Name Of Student    = "+p.name());
		System.out.println("Address Of Student = "+p.address());
		System.out.println("__________________________________");
		
		Person p1 = new Enginear();
		Enginear e = (Enginear)p1;
		
		e.setCollage("Molana Ajad Institute Of Tecnology");
		e.setField("Softwear");
		
		System.out.println("Name Of Student    = "+p1.name());
		System.out.println("Address Of Student = "+p1.address());
		System.out.println("Name Of Field      = "+e.getField());
		System.out.println("Name Of Collage    = "+e.getCollage());
		System.out.println("__________________________________");
		
		Person p2 = new Doctor();
		Doctor d = (Doctor)p2;
		
		d.setIdno(12);
		d.setSpecilist("Heart Specilist");
		
		System.out.println("Name Of Doctor      = "+p2.name());
		System.out.println("Address Of doctoe   = "+p2.address());
		System.out.println("ID No Of Doctor     = "+d.getIdno());
		System.out.println("Specilist Of Doctor = "+d.getSpecilist());
		
		
		
		
		
		
		
		
		
	}

}
