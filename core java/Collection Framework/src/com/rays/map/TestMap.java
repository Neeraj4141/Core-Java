package com.rays.map;

import java.util.HashMap;
import java.util.Map;

public class TestMap {

	public static void main(String[] args) {

		Map m = new HashMap();

		m.put(1, "Neeraj");
		m.put(2, "Singh");
		m.put(3, "Mewada");
		m.put(4, "Dehandi");

		System.out.println(m.entrySet());
		System.out.println(m.get(4));
		System.out.println(m.keySet());
		System.out.println(m.values());
		System.out.println(m.containsKey(3));
		System.out.println(m.containsValue("Neeraj"));
		System.out.println(m.size());
		m.remove(3);
		System.out.println(m);
		System.out.println(m.entrySet());
		System.out.println(m.size());
	}

}
