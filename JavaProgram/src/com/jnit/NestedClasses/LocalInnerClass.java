package com.jnit.NestedClasses;

class House {
	
	int housetotal_sqft;
	String cost;
	int no_of_bedroom = 4;
	
	//assign values using this Constructor
	House(int housetotal_sqft, String cost) {
		this.housetotal_sqft = housetotal_sqft;
		this.cost = cost;
	}
	
	void display() {
		System.out.println(" The total square feet of this house is "+housetotal_sqft);
		System.out.println(" The cost of this house is $"+cost);
		
		//local inner class
		class Room {
			
			//Members of Nested class
			int no_of_bathrooms = 3;
			
			void Bedroom () {
				System.out.println(" Number of bedrooms are "+no_of_bedroom+" and Number of bathrooms are "+no_of_bathrooms);
			}
			
			void otherrooms() {
				System.out.println(" The other rooms are 1. Hall Room, 2. Kitchen Room, 3. Dinning Room, 4.Mini Hall ");
			}
		}
		           //Object created for Room inner class
		               Room villa = new Room();
	                      villa.Bedroom();	
	                      villa.otherrooms();
	}
}
public class LocalInnerClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Object created for House 
		House Rani = new House(1500, "100k");
		Rani.display();
		
		//Object created for House
		House sai = new House(1750, "200k");
		sai.display();
	}
}
