package com.jnit.AbstractClass;

abstract class Animal {
	
	abstract void lifespan();         //abstract method
	
	void breath() {
		System.out.println(" All animals will breathe oxygen and releases carbon dioxide ");            //Concrete method 
	}
}

class dog extends Animal {
	
	void lifespan() {                   //Method Overriding
		System.out.println(" Dogs had an average lifespan of 10-13 years ");
	}
}
class cow extends Animal {
	
	void lifespan() {                   //Method Overriding 
		System.out.println(" Cows had an average lifespan of 20 years ");
	}
}

public class ExampleOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Animal s;         
		s= new dog();      //utilized the upcasting
		s.lifespan();
		s.breath();
		s = new cow();
		s.lifespan();
		s.breath();
	}

}

