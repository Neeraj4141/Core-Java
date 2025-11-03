package com.rays.oop.overriding.ex;

public class TestAniamal {
	public static void main(String[] args) {
	
	Animal a1 = new Dog("yello","ramuu");
	Dog d = (Dog)a1;
	System.out.println("sound of dog = "+a1.sound());
	System.out.println("color of dog = "+d.getColor());
	System.out.println("name of dog  = "+d.getName());
	System.out.println( "-------------------------");
	
	Animal a2 = new Cat("black", "aliya bhatt");
	Cat c = (Cat)a2;
	System.out.println("sound of cat = "+a2.sound());
	System.out.println("color of cat = "+c.getColor());
	System.out.println("name of cat  = "+c.getName());
	System.out.println("--------------------------");
	}
}
