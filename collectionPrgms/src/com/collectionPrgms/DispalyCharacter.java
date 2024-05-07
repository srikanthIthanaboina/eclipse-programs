package com.collectionPrgms;

import java.util.LinkedHashMap;

public class DispalyCharacter {
	public static void main(String[] args) {
		String s ="apple";
		char[] c =s.toCharArray();
		int i=0;
		int count = 0;
		for(i=0;i<c.length;i++) {
			for(int j=i;j<c.length;j++) {
				if(c[i]==c[j]) {
					++count;
					int k=0;
					char[] c1 = new char[c.length];
					c1[k++] = c[i];
					System.out.println(count+"--"+c[i]);
					if(count>=2) {
					System.out.println(count+"--"+c[i]);
					}
			}		
		}
			count = 0;
		}		
		LinkedHashMap<Integer,Character> lhm = new LinkedHashMap<>();
		lhm.put(1, 'a');
		lhm.put(2, 'p');
		lhm.put(3, 'p');
		lhm.put(4, 'l');
		lhm.put(5, 'e');
		System.out.println(lhm);
	}
}
