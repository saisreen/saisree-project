package com.jnit.Inheritance;

interface Dog{
	void bark(int age);   //abstract method 
}

public class GermanShepherd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Dog german = (age) -> {  //indicates its an implementation
			System.out.println("German Shepherd barks "+age);
			System.out.println("bruno age "+age);
		};
		german.bark(12);
		
	}
}
		
				
				
				
				
				
		
		//GermanShepherd g = new GermanShepherd();
		//g.bark();

	
	//@Override
	//public void bark() {
		// TODO Auto-generated method stub
		//System.out.println("German Shephard barks");
		
	


