package com.automobile;

public abstract class Vehicle {
	
    public String getModelName() {   //Concrete method 
    	System.out.println("The Model Name is "+getModelName());
		return "MotorVehicle";
	}
    
    public String getRegistrationNumber() {  //concrete method
    	System.out.println("The Registration Number is"+getRegistrationNumber());
    	return "XYZ123456";
    }
    
    public String getownerName() {  //concrete method
    	System.out.println("The Owner Name is"+getownerName());
    	return "sai";
    }
    

	
}
