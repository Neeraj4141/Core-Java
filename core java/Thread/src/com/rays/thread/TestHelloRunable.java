package com.rays.thread;

public class TestHelloRunable {
	public static void main(String[] args) {

		Thread t1 = new Thread(new HelloRunable("Neeraj"));
		Thread t2 = new Thread(new HelloRunable("Ram"));
		Thread t3 = new Thread(new HelloRunable("Shyam"));

		t1.start();
		t2.start();
		t3.start();

	}

}
