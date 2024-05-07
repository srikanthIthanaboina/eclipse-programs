package com.collectionPrgms;

import java.util.HashSet;
import java.util.Iterator;

public class StoreFruits {
	
	//Write a java code to store a group of fruits names and display on console.
	public static void main(String[] args) {
		HashSet<String> hs = new HashSet<>();
		hs.add(null);
		hs.add("apple");
		hs.add("mango");
		hs.add("bannana");
		hs.add("orange");
		hs.add(null);
		System.out.println(hs);
		Iterator<String> iterator = hs.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
	}
}
