package com.rays.collection.queue;

import java.util.PriorityQueue;
import java.util.Queue;

//jis type ka element sabse pehele hoga queue usse hi  priority dega 

public class TestPriorityQueue {
	public static void main(String[] args) {
		
		Queue q = new PriorityQueue();
		
		q.add("ram");
		q.add("shyam");
		q.add("ghanshyam");
		
		System.out.println(q);
		System.out.println(q.peek());
	}

}
