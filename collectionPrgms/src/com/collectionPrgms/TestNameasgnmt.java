package com.collectionPrgms;

import java.util.ArrayList;
import java.util.Comparator;

public class TestNameasgnmt {
	public static void main(String[] args) {
		 ArrayList<String> list=new ArrayList<String>();
		 list.add("raju");
		 list.add("rani");
		 list.add("john");
		 list.add("tony");
		
		  //Collections.sort(list);
		 //System.out.println(list);
		 
		 Comparator<String> c= new NameAsgnmt();
		 list.sort(c);
		 System.out.println(list);
		 
	}
	

}
