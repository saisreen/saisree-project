package com.jntu;

class laptop {
	
	void model() {
		System.out.println("Start looking for the laptop models");
	}
	
	void price() {
		System.out.println("Now, look for the price of the model");
	}
}

class Apple extends laptop {
	
	void model() {
		System.out.println("Apple model is : Macbook Air");
	}
	
	void price() {
		System.out.println("Apple price is $800");
	}
}

class Dell extends laptop {
	
	void model() {
		System.out.println("Dell model is : core i5");
	}
	
	void price() {
		System.out.println("Dell laptop price is $500");
	}
}
	
public class MethodOveriding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Method Overriding
		//Create an Object for Laptop
		laptop x = new laptop();
		x.model();
		x.price();
		x=new Apple();
		x.model();
		x.price();
		x=new Dell();
		x.model();
		x.price();		
	}
}