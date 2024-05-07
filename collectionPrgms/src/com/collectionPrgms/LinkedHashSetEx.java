package com.collectionPrgms;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSetEx {
	private static Iterator<Character> iterator;

	public static void main(String[] args) {
		String input = "apple";
		LinkedHashSet<Character> lhs = new LinkedHashSet<>();
		for(int i=0;i<input.length();i++) {
			char c = input.charAt(i);
			lhs.add(c);
		}
	Iterator<Character> iterator2 = lhs.iterator();
	while(iterator2.hasNext()) {
		System.out.println(iterator2.next());
	}
		}

}
