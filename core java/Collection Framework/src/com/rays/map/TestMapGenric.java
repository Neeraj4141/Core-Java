package com.rays.map;

import java.util.HashMap;
import java.util.Map;

public class TestMapGenric {
	public static void main(String[] args) {
		
		Map<String, Integer> m = new HashMap<String, Integer>();
		
		m.put("Neeraj", 25);
		m.put("Abhishek", 26);
		m.put("lucky", 23);
		
		System.out.println(m);
		
		
	}
}
