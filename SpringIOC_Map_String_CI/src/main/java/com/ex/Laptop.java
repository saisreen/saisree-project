package com.ex;

public class Laptop {
	
	private String brand;
	private String cost;
	
	public Laptop(String brand, String cost) {
		super();
		this.brand = brand;
		this.cost = cost;
	}

	@Override
	public String toString() {
		return "Laptop [brand=" + brand + ", cost=" + cost + "]";
	}
	
	
	

}
