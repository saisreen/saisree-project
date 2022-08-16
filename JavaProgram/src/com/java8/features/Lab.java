package com.java8.features;

interface Dog {
	void bark();   //abstract method 
	static void eat() {   //common for all classes
		System.out.println("Eating Peddigree");
	}
	default void sleep() {
		System.out.println("Sleep 10 hours daily ");
	}
}
public class Lab implements Dog {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Lab lab = new Lab();
		lab.bark();
		lab.sleep();
		Dog.eat();

	}

	@Override
	public void bark() {
		// TODO Auto-generated method stub
		System.out.println("Lab barks aloud");
		
	}

}
