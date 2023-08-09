package com.ex;

public class Mobile {
	
	private String brand;
	private String cost;
	
	public Mobile(String brand, String cost) {
		super();
		this.brand = brand;
		this.cost = cost;
	}

	@Override
	public String toString() {
		return "Mobile [brand=" + brand + ", cost=" + cost + "]";
	}
	
	
	
	

}
