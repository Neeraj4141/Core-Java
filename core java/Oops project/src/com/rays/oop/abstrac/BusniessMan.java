package com.rays.oop.abstrac;

public class BusniessMan extends Person implements Richman, SocialWorker {

	@Override
	public String getName() {

		return "ram";
	}

	@Override
	public void money() {
		System.out.println("earn money.....");

	}

	@Override
	public void party() {
		System.out.println("enjoy party.........");

	}

	@Override
	public void donation() {
		System.out.println("give donation .............");

	}

	@Override
	public void helptoother() {
		System.out.println("help to other......");

	}

}
