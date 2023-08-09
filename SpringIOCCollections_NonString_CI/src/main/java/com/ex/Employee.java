package com.ex;

import java.util.List;

public class Employee {
	
	private int id;
	private String name;
	private float salary;
	private List <Mobile> items; //parameterized constructor 
	
	
	public Employee(int id, String name, float salary, List<Mobile> items) {
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
