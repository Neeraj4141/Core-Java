package com.rays.stream;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Test {
	
	public static void main(String[] args) {
		
		List<String> list = new ArrayList<String>();
		
		list.add("Neeraj");
		list.add("Rohit");
		list.add("Abhishek");
		list.add("Rajveer");
		list.add("Jaivardhan");
		list.add("Dishank");
		list.add("Rishi");
		list.add("Neeraj");
		list.add("Lucky");
		
		list.forEach(e->System.out.print(e+", "));
		System.out.println();
		System.out.println("=========== dublicate nikalkar=============");
		list.stream().distinct().forEach(e->System.out.print(e+", "));
		System.out.println();
		System.out.println("======== Sorted  by accendingorder==========");
		list.stream().distinct().sorted().forEach(e->System.out.print(e+", "));
		System.out.println();
		System.out.println("============ sorted to reverse==============");
		list.stream().distinct().sorted(Collections.reverseOrder()).forEach(e->System.out.print(e+", "));
		System.out.println();
		System.out.println("============= to upper case==================");
		list.stream().distinct().map(e->e.toUpperCase()).forEach(e->System.out.print(e+", "));
		System.out.println();
		System.out.println("============= to lowwer case=================");
		list.stream().distinct().map(e->e.toLowerCase()).forEach(e->System.out.print(e+", "));
		System.out.println();
		System.out.println("========find member using starting word=====");
		list.stream().distinct().map(e->e.toLowerCase()).filter(e->e.startsWith("a")).forEach(e->System.out.print(e+", "));
 }

}
