package com.rays.stream;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class TestContestant {

	public static void main(String[] args) {

		List<Contestant> list = new ArrayList<Contestant>();

		list.add(new Contestant("Neeraj", "8906379868"));
		list.add(new Contestant("Rohit", "7370379868"));
		list.add(new Contestant("Ram", "8906373472"));
		list.add(new Contestant("Ajay", "6724539276"));
		list.add(new Contestant("Shyam", "8906379868"));
		list.add(new Contestant("Mohan", "9437285538"));
		list.add(new Contestant("Yashraj", "6824382885"));
		list.add(new Contestant("Rajendra", "7538973555"));

		System.out.println("========== get me phone no===========");
		list.stream().map(e -> e.phone).forEach(e -> System.out.println(e));
		System.out.println("========== get vaiid phone no=======");
		list.stream().map(e -> e.phone).filter(e -> e.length() == 10).forEach(e -> System.out.println(e));
		System.out.println("=========== remove dublicate phone number=======");
		list.stream().map(e -> e.phone).filter(e -> e.length() == 10).distinct().forEach(e -> System.out.println(e));
		System.out.println("======== suffel the phone no ========");

		list.stream().map(e -> e.phone).filter(e -> e.length() == 10).distinct()
				.collect(Collectors.collectingAndThen(Collectors.toList(), e -> {
					Collections.shuffle(e);
					return e.stream();
				})).forEach(e -> System.out.println(e));

		System.out.println("=========limited three winner==========");
		list.stream().map(e -> e.phone).filter(e -> e.length() == 10).distinct()
				.collect((Collectors.collectingAndThen(Collectors.toList(), e -> {
					Collections.shuffle(e);
					return e.stream();
				}))).limit(3).forEach(e -> System.out.println(e));

	}

}
