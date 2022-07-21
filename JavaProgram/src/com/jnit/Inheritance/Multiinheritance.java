package com.jnit.Inheritance;

import java.util.Scanner;

class Electronics {              //super class
	
	void shop () {
		System.out.println("Go to Electronics store ");
	}
	
	void search() {
		System.out.println("search for mobile ");
	}
	
	void select() {
		System.out.println("Selected the Oneplus brand ");
	}
}

class Mobile extends Electronics {  //sub class
	
	void model () {
		System.out.println("look at the model ");
	}
	
	void features () {
		System.out.println("Look the features of mobile ");
	}
}
	
class Oneplus extends Electronics { //sub class
	
	int price;
	int tax;
	
	Scanner sc = new Scanner(System.in);
	void brand () {
		System.out.println("I liked this modela and features of Oneplus brand");
	}
	
	void cost() {
		System.out.println("Enter the cost of Oneplus = " );
		price=sc.nextInt();
	}
	
	void othercost() {
		System.out.println("Enter the tax of Oneplus = ");
		tax=sc.nextInt();
	}
	
	void totalcost() {
		System.out.println("Totalcost for the Oneplus cost included with tax = "+(price+tax));
	}
}
	
public class Multiinheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//create an object for Oneplus
		Oneplus op = new Oneplus();
		op.shop();
		op.search();
		op.select();
		op.brand();
		op.cost();
		op.othercost();
		op.totalcost();
	
	}
}
