package com.ashokit;

import java.time.LocalDate;
import java.time.Period;

public class DateAndTimePeriodWithExample {
	public static void main(String[] args) {
		LocalDate now = LocalDate.now();
		LocalDate dob = LocalDate.of(1996, 8, 5);
		Period period = Period.between(dob, now);
		System.out.println(period.getYears());
		System.out.println(period.getMonths());
		System.out.println(period.getDays());
		System.out.println(dob);
	}

}
