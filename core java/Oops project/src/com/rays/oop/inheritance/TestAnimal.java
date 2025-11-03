package com.rays.oop.inheritance;

public class TestAnimal {
	public static void main(String[] args){

	Doge d = new Doge();
	
	d.setName("tommy");
	d.setSound("bhoo...bhoo.. odge is barking");
	d.setDoom("thedi");
	
	System.out.println("name = "+d.getName());
	System.out.println("sound of doge = "+d.getSound());
	System.out.println("kutte ki doom = "+d.getDoom());
	
	System.out.println("-------catt-------");
	
	Cat c = new Cat();
	
	c.setName("herry");
	c.setSound("miww...miww....");
	
	System.out.println("name of cat = "+c.getName());
	System.out.println("sound of cat = "+c.getSound());
	
}
}