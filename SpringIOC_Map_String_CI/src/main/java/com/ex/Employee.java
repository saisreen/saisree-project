package com.ex;


import java.util.Map;

public class Employee {
	
	private int id;
	private String name;
	private float salary;
	private Map <Mobile, Laptop> items; //parameterized constructor
	
	public Employee(int id, String name, float salary, Map<Mobile, Laptop> items) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.items = items;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + ", items=" + items + "]";
	}
	
	
	
	
	



	
	

}
