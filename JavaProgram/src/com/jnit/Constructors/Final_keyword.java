package com.jnit.Constructors;

class Mydetails {
	
	final String name = "sai";
	final int age =32;
	float height =5.5f;
	float weight = 58;
	
	void display() {
	System.out.println("My name is "+name);
	System.out.println("My age is "+age);
	System.out.println("My height is "+height);
	System.out.println("My weight is "+weight);
	
}
}

public class Final_keyword {
	
	public static void main(String[] args) {
		
		Mydetails sree = new Mydetails();
		sree.display();
	}	
	}

