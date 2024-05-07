package com.ashokit;

import java.util.ArrayList;

public class TestStream {
	public static void main(String[] args) {
		   //Get the a group of objects
			ArrayList<Integer> 
			list = new ArrayList<Integer>();
			//Store some few integer values
			list.add(2);list.add(1);list.add(3);list.add(4);list.add(5);
			process(list);
		 }

	private static void process(ArrayList<Integer> list) {
		// TODO Auto-generated method stub
		list.stream().filter(num->num%2==0).forEach(num->System.out.println(num));
	}
}
