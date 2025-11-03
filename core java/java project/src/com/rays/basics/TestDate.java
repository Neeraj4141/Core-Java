package com.rays.basics;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TestDate {
	public static void main (String[] args) throws ParseException {
	
  Date d = new Date ();
  System.out.println(d);
  System.out.println("-----------");
  SimpleDateFormat sdf = new SimpleDateFormat( "yyyy.MMMMM.dd GGG hh:mm aaa");
  String FormateDate = sdf.format(d);
  System.out.println(FormateDate);
  
  System.out.println("------------");
  
  String dob = "27-06-2000";
  System.out.println("dob before date :"+ dob);
  SimpleDateFormat sdf1 = new SimpleDateFormat("dd-MM-YYYY");
  Date d1 = sdf1.parse(dob);
  System.out.println("dob after date :" + d1);
  
	}
}
