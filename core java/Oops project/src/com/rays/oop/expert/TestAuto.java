package com.rays.oop.expert;

public class TestAuto {

	public static void main(String[] args) {
		Auto A = new Auto();
		
		A.setname("Fortuner");
		A.setcolour("Black");
		A.setspeed(120);
		A.setmaking("Sport car");
		

		System.out.println("Name   = "+ A.getName());
		System.out.println("colour = "+ A.getColour());
		System.out.println("speed  = "+ A.getSpeed());
		System.out.println("making = "+ A.getMaking());
		System.out.println("gears  = "+ A.NO_OF_GEAR);
		
		System.out.println("----------sororpio---------");
		
		Auto A2 = new Auto();
		
		A2.setname("Scorpio");
		A2.setcolour("white");
		A2.setspeed(140);
		A2.setmaking("XUV 800");
		
		System.out.println("Name   = "+ A2.getName());
		System.out.println("colour = "+ A2.getColour());
		System.out.println("speed  = "+ A2.getSpeed());
		System.out.println("making = "+ A2.getMaking());
		System.out.println("gears = "+A2.NO_OF_GEAR);
		
		System.out.println("-----------Mahindra thar-------------");
		
		Auto A3 = new Auto();
		A3.setname("MahindraThar");
		A3.setcolour("Red");
		A3.setmaking("4*4");
		A3.setspeed(140);
		
		System.out.println("Name = "+A3.getName());
		System.out.println("color = "+A3.getColour());
		System.out.println("making = "+A3.getMaking());
		System.out.println("speed = "+A3.getSpeed());
		System.out.println("geras = "+A3.NO_OF_GEAR);
	
	}
	
}
