package com.ex;

public class Address {

	private int addId;
	private String city;
	private String state;
	private String Country;
	
	public Address(int addId, String city, String state, String country) {
		super();
		this.addId = addId;
		this.city = city;
		this.state = state;
		Country = country;
	}

	@Override
	public String toString() {
		return "Address [addId=" + addId + ", city=" + city + ", state=" + state + ", Country=" + Country + "]";
	}
	
	
}
