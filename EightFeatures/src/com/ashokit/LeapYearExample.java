package com.ashokit;

import java.time.Year;

public class LeapYearExample {
	public static void main(String[] args) {
		int year = 2012;
		Year year2 = Year.of(year);
		if(year2.isLeap()) {
			System.out.print(year+"is leap year");
		}else {
			System.out.print(year+"is not leap year");
		}
	}

}
