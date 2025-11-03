package com.rays.stream;

import java.util.ArrayList;
import java.util.List;

public class TestStrem {
	
	public static void main(String[] args) {

		List<Integer> list = new ArrayList<Integer>();
		
		list.add(2);
		list.add(1);
		list.add(3);
		list.add(6);
		list.add(4);
		list.add(7);
		list.add(5);
		list.add(6);
		
		System.out.println(list);
		
		System.out.println("===============even no ===============");
		list.stream().distinct().filter(e->e%2==0).forEach(e->System.out.println(e+"even"));
		System.out.println("===============odd no ================");
		list.stream().distinct().filter(e->e%2!=0).forEach(e->System.out.println(e+"odd"));
		
	}

}
