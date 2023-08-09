package com.ex;

public class Employee {
	
	private String name;
	private int id;
	private int value;
	
	
	public void setName(String name) {
		this.name = name;
	}
	public void setId(int id) {
		this.id = id;
	}
	public void setValue(int value) {
		this.value = value;
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", id=" + id + ", value=" + value + "]";
	}
	
	
	
	
	
	

}
