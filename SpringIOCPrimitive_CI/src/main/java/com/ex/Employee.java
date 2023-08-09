package com.ex;

public class Employee {
	
	private String name;
	private int id;
	private float salary;
	
	
	public Employee(String name, int id, float salary) {
		super();
		this.name = name;
		this.id = id;
		this.salary = salary;
		
	
	}
	
	
	
	public void setName(String name) {
		this.name = name;
	}



	public void setId(int id) {
		this.id = id;
	}



	public void setSalary(float salary) {
		this.salary = salary;
	}



	public String emp() {
		return "Employee(name = "+name+", id = "+id+", salary = "+salary+")"; 
	}
	
	
	
	

}
