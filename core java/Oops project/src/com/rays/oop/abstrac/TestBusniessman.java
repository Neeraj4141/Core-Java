package com.rays.oop.abstrac;

public class TestBusniessman {
	public static void main(String[] args) {
		
		Person p = new BusniessMan();
		System.out.println("name of person = "+p.getName());
		
		
		Richman rm = new BusniessMan();
		rm.donation();
		rm.money();
		rm.party();
		
		SocialWorker sw = new BusniessMan();
		sw.helptoother();
		
		
	}
	
	

}
