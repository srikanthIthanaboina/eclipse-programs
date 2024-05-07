package com.collectionPrgms;
import java.util.HashSet;
import java.util.Set;
public class linkedhsEx {
	public int lengthOfLongestSubString(String s) {
		int n = s.length();
		int maxLength = 0;
		Set<Character> charset = new HashSet<>();
		int left = 0;
		for(int right=0;right<n;right++) {
			if(!charset.contains(s.charAt(right))) {
				charset.add(s.charAt(right));
			}else {
				while(charset.contains(s.charAt(right))) {
				charset.remove(s.charAt(left));
				left++;
			}
			charset.add(s.charAt(right));
		}}
		System.out.println(charset);
		return maxLength;
	}
	public static void main(String[] args) {
		linkedhsEx lhex = new linkedhsEx();
		lhex.lengthOfLongestSubString("abcabcbb");
	}
}
