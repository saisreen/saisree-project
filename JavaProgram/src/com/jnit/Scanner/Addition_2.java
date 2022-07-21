package com.jnit.Scanner;
import java.util.Scanner;

 // The different order of parameter

class Add {
	
	void sum (int x, float y) {
		System.out.println("The sum of two integers = " + (x+y));
	}
	
	void sum (float x, int y) {
		System.out.println("The sum of two integers = " + (x+y));
	}
	
}

public class Addition_2 {

	public static void main(String[] args) {
		

		Add sree = new Add();
		
		//sree.sum(10, 10.5f);   //int x, float y    Method calling 
		//sree.sum(15.5f, 15);   //float x, int y
		//sree.sum(20.5f, 20);   //float x, int y
		//sree.sum(20, 10.5f);  //int x, float y
		
		//Create an object of Scanner 
		Scanner sc = new Scanner(System.in);
		
		//Print two values of int x and float y 
		System.out.println("Enter a value of x and y : ");
		
		sree.sum(sc.nextInt(), sc.nextFloat());
		
		
		sc.close();
		
		
		
	}

}