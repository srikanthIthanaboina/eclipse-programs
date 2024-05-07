package com.collectionPrgms;

import java.util.ArrayList;
import java.util.Iterator;
public class Test {
		public static void main(String[] args) {
			ArrayList list = new ArrayList();
            list.add(new Product(1,"mobile",10000));
            list.add(new Product(2,"tv",23000));
			list.add(new Product(3,"laptop",30000));
			  Test.display(list);
		}
		public static void display(ArrayList<Product> list) {
			  System.out.println("PID    PNAME    PRICE");
		        for (Product product : list)
		            System.out.println(product);
		}	
		}
