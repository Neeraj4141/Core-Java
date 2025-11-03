package com.rays.basics;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class LocalDateFormat {
	public static void main(String[] args) {
		LocalDate now = LocalDate.now();
		System.out.println(now);

		LocalDate dob = LocalDate.of(2003, 12, 15);
		System.out.println(dob);
		System.out.println(dob.getDayOfMonth());
		System.out.println(dob.getDayOfYear());
		System.out.println(dob.getClass());
		System.out.println(dob.getMonthValue());
	}
}