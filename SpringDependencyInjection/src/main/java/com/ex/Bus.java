package com.ex;

public class Bus implements Vehicle  {
	
	private String fuelType;
	private int speed;
	
	public String getFuelType() {
		return fuelType;
	}
	public void setFuelType(String fuelType) {
		this.fuelType = fuelType;
	}
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	public void move() {
		// TODO Auto-generated method stub
		
		System.out.print("Bus Started ");
		System.out.print("Fuel Type = "+fuelType);
		System.out.println(" Speed is = "+speed);
		
	}

}
