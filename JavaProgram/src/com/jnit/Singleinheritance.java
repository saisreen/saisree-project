package com.jnit;

import java.util.Scanner;

class parent {           //super class
	
	String Name;
	
	//Created an Object for Scanner
	Scanner sc = new Scanner(System.in);
	
	void family () {
		System.out.println(" Family details ");
	}
	
	void mothername () {
		System.out.println("Enter a mother name : ");
		Name = sc.next();	
	}
	
	void fathername() {
		System.out.println("Enter a father name: ");
		Name = sc.next();
	}
	
}

class child extends parent {       //sub class
	
	int age;
	
	void childname () {
		System.out.println(" Enter a name of the child : " );
		Name=sc.next();	
	}
	
	void childage () {
		System.out.println(" Enter the age of the child : ");
		age=sc.nextInt();	
	}
		
		void familyend() {
			System.out.println(" Happy family ");   
			sc.close();
	}
	
}

public class Singleinheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Object created for sub class
		child sree = new child();
		sree.family();
		sree.mothername();
		sree.fathername();
		sree.childname();
		sree.childage();
		sree.familyend();
		}
	}

