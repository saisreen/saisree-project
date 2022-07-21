package com.jnit.MethodOveridingExample;

import java.util.Scanner;

class laptop {                //super class
	
	int price;
	int discount;
	
	//Created an object for scanner
	Scanner sc = new Scanner(System.in);
	
	void model() {
		System.out.println("Start looking for the laptop models");
	}
	
	void price() {
		System.out.println("Now, look for the price of the model");
		System.out.println("Enter the approximate price of the laptop = ");
		price = sc.nextInt();
	}
		void offer() {
			System.out.println("The minimum disocunt would be = ");
			discount=sc.nextInt(); 
		}	
			void total() {
				System.out.println("The approximate total cost for the laptop is =  "+(price-discount));
				}
}

class Apple extends laptop {      //sub class
	
	void model() {
		System.out.println("Apple model is : Macbook Air");
	}
	
	void price() {
		System.out.println("Now, looked at the apple price");
		System.out.println("Enter the price of the apple = ");
		price = sc.nextInt();	
		}
	
	void offer() {
		System.out.println("The student disocunt would be = ");
		discount=sc.nextInt(); 
	}
		void total() {
			System.out.println("The approximate total cost for the apple laptop is =  "+(price-discount));
			}
}

class Dell extends laptop {         //sub class
	
	void model() {
		System.out.println("Dell model is : core i5");
	}
	
	void price() {
		System.out.println("Enter the price of dell model =");
		price=sc.nextInt();
	}
	void offer() {
		System.out.println("There is no disocunt so, the amount is zero"); 
}
	void total() {
		System.out.println("The approximate total cost for the dell laptop is =  "+price);
		}
}

public class MethodOverriding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Method Overriding
				//Create an Object for Laptop
				laptop x = new laptop();
				x.model();
				x.price();
				x.offer();
				x.total();
				x=new Apple();
				x.model();
				x.price();
				x.offer();
				x.total();
				x=new Dell();
				x.model();
				x.price();
				x.offer();
				x.total();
			}
}

