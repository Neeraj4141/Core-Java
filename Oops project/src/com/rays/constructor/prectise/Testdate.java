package com.rays.constructor.prectise;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
public class Testdate {
	public static void main(String[] args) throws ParseException {

		Date d = new Date();
		System.out.println("before formate = " + d);
		SimpleDateFormat sdf = new SimpleDateFormat("MM/yyyy/dd");
		String d1 = sdf.format(d);
		System.out.println("after formate = " + d1);
		System.out.println("______________________________________");
		
		String dob = ("15/12/2003");
		System.out.println("dob before formate = "+dob);
		SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");
		Date d2 = sdf1.parse(dob);
		System.out.println("dob after formate = "+d2);
		

	}

}
