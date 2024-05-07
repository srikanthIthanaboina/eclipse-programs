package com.collectionPrgms;

import java.util.ArrayList;
import java.util.Comparator;

public class TestSalaryAsgnmt {
	public static void main(String[] args) {
		 ArrayList<Double> list=new ArrayList<Double>();
		 list.add(19332.333);
		 list.add(11232.44);
		 list.add(20003.4);
		 list.add(123.44);
		  //Collections.sort(list);
		 //System.out.println(list);
		 Comparator<Double> c = new salaryAsgnmt();
		 list.sort(c);
		 System.out.println(list);
		 
	}

}
