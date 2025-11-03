package com.rays.collection.queue;

import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.Queue;

public class TestQueue {
	public static void main(String[] args) {
		
		Queue q = new ArrayDeque();
		
		q.offer('e');
		q.add('d');
		q.add('a');
		q.add('b');
		q.add('c');
		
		System.out.println(q);
		System.out.println(q.size());
		System.out.println(q.peek());
		System.out.println(q);
		System.out.println( q.poll());
		System.out.println(q);
		
		System.out.println("_____________use of iterator_____________");
		Iterator it = q.iterator();
		while(it.hasNext()) {
			Object o = it.next();
			System.out.println(o);
			
		}
	}

}
