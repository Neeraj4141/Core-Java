package com.rays.oop.expert.practise;

public class TestAuto {
	public static void main(String[] args) {

		Auto a = new Auto();

		a.setName("scorpio");
		a.setColor("black");
		a.SetModel("sports");
		a.setSpeed(120);

		System.out.println("=================scorpio===================");
		System.out.println("name = " + a.getName());
		System.out.println("color = " + a.getColor());
		System.out.println("model = " + a.getModel());
		System.out.println("speed = " + a.getSpeed());
		a.Accelater();
		a.breack();
		a.changegear(4);

		Auto a1 = new Auto();
		a1.setColor("white");
		a1.SetModel("xuv");
		a1.setName("fortuer");
		a1.setSpeed(150);

		System.out.println("===================fortuner==================");
		System.out.println("name = " + a1.getName());
		System.out.println("color = " + a1.getColor());
		System.out.println("model = " + a1.getModel());
		System.out.println("speed = " + a1.getSpeed());
		a1.Accelater();
		a1.breack();
		a1.changegear(9);
		a1.Accelater();
		a1.Accelater();
		a1.breack();
		a1.Accelater();
	}

}
