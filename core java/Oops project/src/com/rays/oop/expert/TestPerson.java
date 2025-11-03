package com.rays.oop.expert;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class TestPerson {
	public static void main(String [] args) throws ParseException {
		
		SimpleDateFormat sdf = new SimpleDateFormat ("yyyy-MM-dd");
		
		Person p = new Person();
		p.setName("neeraj singh mewada");
		p.setDob(sdf.parse("2003-12-15")) ;
		p.setAddress("shujalpur");
		
		System.out.println("Name = "+ p.getName());
		System.out.println("Dob = "+ p.getDob());
		System.out.println("Address = "+p.getAddress());
		System.out.println("age = "+p.getAge());
		
		System.out.println("--------------------------");
		
		Person p1 = new Person();
		p1.setName("priyanshu verma");
		p1.setDob(sdf.parse("2001-03-04"));
		p1.setAddress("arandiy/padliya");
		
		System.out.println("Name = "+ p1.getName());
		System.out.println("Dob = "+ p1.getDob());
		System.out.println("Address = "+p1.getAddress());
		System.out.println("age = "+p1.getAge());
	}

}
