package com.collectionPrgms;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class PredicateJoinDemo {
	static List<Employee> list = new ArrayList<>();
	public static void main(String[] args) {
		Employee e1 = new Employee("raju","hyd","devops");
		Employee e2 = new Employee("rani","chennai","java");
		Employee e3 = new Employee("raju","bangalore","spring");
		list.add(e1);
		list.add(e2);
		list.add(e3);
		Predicate<Employee> p = (a) -> a.getName()=="raju";
		for(Employee e:list) {
			if(p.test(e)) {
				System.out.println(e);
			}
		}
		
	}

}
