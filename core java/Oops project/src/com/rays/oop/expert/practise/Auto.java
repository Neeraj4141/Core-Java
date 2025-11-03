package com.rays.oop.expert.practise;

public class Auto {

	private String name;
	private String color;
	private String model;
	private int speed;
    public static final int NO_OF_GEAR = 6;
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getColor() {
		return this.color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getModel() {
		return this.model;
	}

	public void SetModel(String model) {
		this.model = model;
	}

	public int getSpeed() {
		return this.speed = speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public void Accelater() {
		speed = speed + 10;
		System.out.println("accelater current speed = " + this.speed + "km/h");
	}

	public void breack() {
		speed = speed - 10;
		if (speed < 10) {
			speed = 0;
		}
		System.out.println("breack curret speed = " + this.speed + "km/h");
}
	public void changegear(int gear) {
		if(gear > 0 && gear <= NO_OF_GEAR) {
			System.out.println("gear change to = "+gear);
		}else {
			System.out.println("invailed gear pleasw select gear between 1 and "+NO_OF_GEAR);
		}
	}

}
