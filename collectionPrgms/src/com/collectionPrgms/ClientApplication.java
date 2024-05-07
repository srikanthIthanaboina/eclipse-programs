package com.collectionPrgms;

import java.util.ArrayList;
import java.util.Collections;

public class ClientApplication {
	public static void main(String[] args) {
		// Created the 5 Employee Objects
		Employee emp1 = new Employee("RAJU", 30000.00);
		Employee emp2 = new Employee("SUNIL", 40000.00);
		Employee emp3 = new Employee("KIRAN", 50000.00);
		Employee emp4 = new Employee("TONY", 70000.00);
		Employee emp5 = new Employee("MAHESH", 80000.00);

		// Store this 5 Employee Objects into the List

		ArrayList<Employee> list = new ArrayList<Employee>();

		if (list.isEmpty()) {
			// store 5 empoyee objects into the list
			list.add(emp1);
			list.add(emp2);
			list.add(emp3);
			list.add(emp4);
			list.add(emp5);
			System.out.println("EID\tENAME\tESALARY");
			System.out.println("----------------------");
			displayAllEmployeeList(list);
		}
		Collections.sort(list);
		System.out.println("After Sorting..");
		displayAllEmployeeList(list);
	}

	public static void displayAllEmployeeList(ArrayList<Employee> list) {
		// Display all the Employee Details
		for (Employee employee : list) {
			System.out.println(employee);
		}

	}

}

