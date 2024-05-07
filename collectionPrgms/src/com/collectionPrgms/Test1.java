package com.collectionPrgms;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Test1 {
	public static void main(String[] args) {
		ArrayList<Integer> list=new ArrayList<Integer>();
		list.add(new Integer(2));
		list.add(new Integer(3));
		list.add(new Integer(1));
		list.add(new Integer(5));
		list.add(new Integer(4));
		System.out.println(list);//[2,3,1,5,4]
		//Collections.sort(list);
		//Comparator c=Collections.reverseOrder();
		Comparator<Integer> c=new MyComparator();
		//list.sort(c);
		Collections.sort(list);
		System.out.println(list);
}
}
