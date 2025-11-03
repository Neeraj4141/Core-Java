package com.rays.oop.expert.practise;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class TestPerson {
	public static void main(String[] args) throws ParseException {
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
		
		Person p1 = new Person();
		
		p1.setName("neeraj mewada");
		p1.setAddress("shujalpur");
		p1.setDob(sdf.parse("15-12-2003"));
		
		System.out.println("name = "+p1.getName());
		System.out.println("address = "+p1.getAddress());
		System.out.println("dob = "+sdf.format(p1.getDob()));
		
	}

}
