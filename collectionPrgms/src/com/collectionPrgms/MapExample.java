package com.collectionPrgms;

import java.util.HashMap;
import java.util.Map;

public class MapExample {
	public void lengthOfLongestSubString(String s) {
		int n = s.length();
		int maxLength = 0;
		Map<Character,Integer> charMap = new HashMap<>();
		int left = 0;
		for(int right=0;right<n;right++) {
			if(!charMap.containsKey(s.charAt(right))) {
				charMap.put(s.charAt(right), right);
			}else {
				left = charMap.get(s.charAt(right))+1;
				charMap.put(s.charAt(right), right);
			}
		}
		System.out.println(charMap);
	}
	public static void main(String[] args) {
		MapExample me = new MapExample();
		me.lengthOfLongestSubString("abcabcbb");
	}

}
