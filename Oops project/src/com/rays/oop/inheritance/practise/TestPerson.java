package com.rays.oop.inheritance.practise;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class TestPerson {
	public static void main(String[] args) throws ParseException {
		
		Student s = new Student();
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		s.setName("Neeraj Singh Mewada");
		s.setDob(sdf.parse("15/12/2003"));
		s.setAddress("Shujalpur");
		s.setSchool("Ahilya bai holkar");
		s.setRollno(2366);
		s.setSubject("computer science");
		
		System.out.println("/////////////////////////////////////");
		
		System.out.println("Name          = "+s.getName());
		System.out.println("address       = "+s.getAddress());
		System.out.println("date of birth = "+s.getDob());
		System.out.println("school        = "+s.getSchool());
		System.out.println("subject       = "+s.getSubject());
		System.out.println("rollno        = "+s.getRollno());
		
		BusniessMen b = new BusniessMen();
		
		b.setName("Abhishek kirar");
		b.setDob(sdf.parse( "12/02/1999"));
		b.setAddress("Indore");
	    b.setCompany( "Microsoft");
	    b.setIncome(200);
	    
	    System.out.println("//////////////////////////////////////");
	    
	    System.out.println("Name          = "+b.getName());
	    System.out.println("date of birth = "+b.getDob());
		System.out.println("address       = "+b.getAddress());
		System.out.println("company       = "+b.getCompany());
		System.out.println("income in cr  = "+b.getIncome());
		
		Doctor d = new Doctor();
		
		d.setName("Neeraj singh mewada");
		d.setAddress("Shujalpur");
		d.setDob(sdf.parse("12/12/1983"));
		d.setHospital("Vishesh jupiter");
		d.setSpecilist("heart specilist");
		
		System.out.println("//////////////////////////////////////");
		
		System.out.println("name = "+d.getName());
		System.out.println("address = "+d.getAddress());
		System.out.println("date of birth = "+d.getDob());
		System.out.println("hospital = "+d.getHospital());
		System.out.println("soecilist = "+d.getHospital());
	}

}
