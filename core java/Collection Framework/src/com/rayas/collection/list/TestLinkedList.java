package com.rayas.collection.list;

import java.util.LinkedList;
import java.util.List;

public class TestLinkedList {

	public static void main(String[] args) {
		
		List list = new LinkedList();
		
		list.add(23);
		list.add('e');
		list.add(29.3);
		list.add("Neeraj");
		list.add(true);
		
		System.out.println(list);
		System.out.println(list.get(2));
		list.remove(3);
		System.out.println( list);
		
		

	}

}
