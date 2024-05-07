package com.collectionPrgms;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;
import java.util.function.Predicate;

public class PredicateStudentDemo {
	static List<Student> list = new ArrayList<>();
	public static void main(String[] args) {
	list.add(new Student(1,"srikanth","hyderabad"));
	list.add(new Student(2,"rajesh","chennai"));
	list.add(new Student(3,"uday","banagalore"));
	Predicate<Student> ps = (s)-> s.getId()>1;
	for(Student s:list) {
		if(ps.test(s)) {
			System.out.println(s);
		}
	}
    TreeSet<String> treeset = new TreeSet<>();
    //treeset.add(null);
    treeset.add("sai");
    treeset.add(null);
    System.out.print(treeset);
	}

}
