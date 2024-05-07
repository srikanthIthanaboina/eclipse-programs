package com.ashokit;

import java.time.ZoneId;
import java.util.Set;

public class ZoneIdExample {
	public static void main(String[] args) {
		ZoneId systemDefault = ZoneId.systemDefault();
		System.out.println(systemDefault);
		Set<String> availableZoneIds = ZoneId.getAvailableZoneIds();
		int count=0;
		for(String zone:availableZoneIds) {
			System.out.println(zone);
			count++;
		}
		System.out.println(count);
		
	}

}
