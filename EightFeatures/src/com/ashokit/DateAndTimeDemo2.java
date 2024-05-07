package com.ashokit;

import java.time.LocalDateTime;

public class DateAndTimeDemo2 {
	public static void main(String[] args) {
		LocalDateTime ldateTime = LocalDateTime.now();
		System.out.println(ldateTime);
		System.out.println(ldateTime.plusMonths(10));
		System.out.println(ldateTime.minusMonths(5));
		System.out.println(ldateTime.plusDays(10));
		System.out.println(ldateTime.plusHours(10));
		System.out.println(ldateTime.plusMinutes(10))
	;
		
	}

}
