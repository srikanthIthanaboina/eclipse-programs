package com.collectionPrgms;

public class Employee implements Comparable<Employee>{
	private int id;
	private String name;
	public String location;
	public String dept;
	private double salary;
	private static String companyName = "AshokIT";
	private static int idGenerator = 1000;
	
	public Employee(String name,String location,String dept ) {
		this.name = name;
		this.location = location;
		this.dept = dept;
	}

	// Constructor
	public Employee(String name, double salary) {
		this.id = idGenerator++;
		this.name = name;
		this.salary = salary;
	}
	// provide setters and getters method

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	// provide toString method
	@Override
	public String toString() {
		return "" + this.id + "\t" + this.name + "\t" + this.salary + "\t" + this.location
				+ "\t" +this.dept;
	}

	@Override
	public int compareTo(Employee o) {
		 if(this.id>o.getId())
			 return 1;
		 else if(this.id<o.getId())
			 return -1;
		 else
		return 0;
	}
}

