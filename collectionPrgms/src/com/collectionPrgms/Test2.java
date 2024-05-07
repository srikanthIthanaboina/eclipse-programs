package com.collectionPrgms;

import java.util.ArrayList;
import java.util.Comparator;

public class Test2 {
	public static void main(String[] args) {
		 ArrayList<String> list=new ArrayList<String>();
		 list.add("cdhh");
		 list.add("ab");
		 list.add("xyz");
		 list.add("def");
		
		  //Collections.sort(list);
		 //System.out.println(list);
		 
		 Comparator<String> c= new MyComparator1();
		 list.sort(c);
		 System.out.println(list);
		 
	}

}
