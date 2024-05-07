package com.ashokit;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class DateandTimeDemo {
	public static void main(String[] args) {
		LocalDate ldate = LocalDate.now();
		System.out.println(ldate);
		LocalTime ltime = LocalTime.now();
		System.out.println(ltime);
		LocalDateTime ldatetime = LocalDateTime.now();	
		System.out.println(ldatetime);
		
		int year = ldate.getYear();
		int month = ldate.getMonthValue();
		int date = ldate.getDayOfMonth();
		int hh = ltime.getHour();
		int mm = ltime.getMinute();
		int ss = ltime.getSecond();
		System.out.println(year+"-"+month+"-"+date+"//"+hh+":"+mm+":"+ss);
	}

}
