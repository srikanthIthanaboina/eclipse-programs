package com.youtubeprograms;
public class MainClass extends Employee{
	
	public static void main(String[] args) {
		Employee e1= new Employee();
		e1.setId(1);
		e1.setName("john");
		Employee e2= new Employee();
		e2.setId(1);
		e2.setName("john");
		System.out.println(e1==e2);
		System.out.println(e2==e1);
		System.out.println(e1.equals(e2));
		
		
	}
}