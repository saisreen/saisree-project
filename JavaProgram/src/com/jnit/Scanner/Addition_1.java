package com.jnit.Scanner;
import java.util.Scanner;

// The different types of parameter

class Adds {
	
	void sum(int x, int y) {
		System.out.println("The sum of integer = " + (x+y));
	}
	
	void sum(float x, float y) {
		System.out.println("The sum of decimal = " + (x+y));
		
	}
	
}
public class Addition_1 {

	public static void main(String[] args) {
		

	       Adds sai = new Adds();
	       
	//	sai.sum(1, 2);         // int x, int y  Method calling
	//	sai.sum(10, 20);       // int x, int y 
	//	sai.sum(1.5f, 2.5f);   // float x, float y
	//	sai.sum(10.5f, 20.5f);  //float x,  float y
		
		//Create an Object for Scanner 
		Scanner sc = new Scanner(System.in) ;
		
		//Print a value of X
		 System.out.println("Enter a value of x =");
		 
		 int a = sc.nextInt();
		 
		 //Print the value of y
		 System.out.println("Enter a value of y = ");
		 
		 int b = sc.nextInt();
		 
		 sai.sum(a,b);
		 
		 sc.close();
		 	 
		
	}
}
