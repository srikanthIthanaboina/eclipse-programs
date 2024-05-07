package com.youtubeprograms;

public class Employee implements employeedao{
	private int id;	
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

	private String name;
	
	protected void m1() {
		
	}
public void m2() {
		System.out.println("haii");
	}
	
	
	public boolean equals(Object obj) {
		if(this==obj) {
			return true;
		}
		if(obj==null||getClass()!=obj.getClass()) {//Employee,Employee
			return false;
			
		}
		Employee emp =(Employee)obj;
		return id == emp.id && name.equals(emp.name);
	}

}
