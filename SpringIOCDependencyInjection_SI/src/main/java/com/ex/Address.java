package com.ex;

public class Address {

	private int addId;
	private String city;
	private String state;
	private String Country;
	
	

	public int getAddId() {
		return addId;
	}



	public void setAddId(int addId) {
		this.addId = addId;
	}



	public String getCity() {
		return city;
	}



	public void setCity(String city) {
		this.city = city;
	}



	public String getState() {
		return state;
	}



	public void setState(String state) {
		this.state = state;
	}



	public String getCountry() {
		return Country;
	}



	public void setCountry(String country) {
		Country = country;
	}



	@Override
	public String toString() {
		return "Address [addId=" + addId + ", city=" + city + ", state=" + state + ", Country=" + Country + "]";
	}
	
	
}
