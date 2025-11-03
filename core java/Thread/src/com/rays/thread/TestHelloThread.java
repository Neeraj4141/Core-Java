package com.rays.thread;

public class TestHelloThread {
	public static void main(String[] args) {

		HelloThread t1 = new HelloThread("Neeraj");
		HelloThread t2 = new HelloThread("Rohit");
		HelloThread t3 = new HelloThread("Abhishek");
		
		t1.setPriority(8);
		t2.setPriority(7);
		t3.setPriority(6);
		
		int i = t1.getPriority();
		int n = t2.getPriority();
		
		
		System.out.println(i);
        System.out.println(n);
		t1.start();
		t2.start();
		t3.start();
		
		

	}

}
