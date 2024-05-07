package com.collectionPrgms;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateDemo {
	String name;
	int age;
	PredicateDemo(String name,int age){
		this.name = name;
		this.age = age;
	}
	public static void main(String[] args) {
		String[] names = {"apple","bannana","orange","aza"};
		Predicate<String> p = name->name.charAt(0)=='a';
		for(String name: names) {
			if(p.test(name)) {
				System.out.print(name);
			}
		}
		PredicateDemo p1 = new PredicateDemo("sai",22);
		PredicateDemo p2 = new PredicateDemo("abc",10);
		Predicate<PredicateDemo> PD = b-> b.age >= 18;
		List<PredicateDemo> person = Arrays.asList(p1,p2);
		for(PredicateDemo person1:person) {
			if(PD.test(person1)) {
				System.out.print(person1.name);
			}
		}

}
}