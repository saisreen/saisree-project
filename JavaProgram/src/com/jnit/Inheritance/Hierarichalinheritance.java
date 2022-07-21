package com.jnit.Inheritance;

class flowers {                          //super class

	void input() {
		System.out.println("Flowers");
	}
	
	void types () {
		System.out.println("There are different types of flowers ");
	}
}

class rose extends flowers {        //sub class
	
	void color() {
		System.out.println("red rose color appear in red color");
	}
	
	void garden() {
		System.out.println("rose looks beautiful at garden");
	}
}

class lily extends flowers {         //sub class
	
	void color() {
		System.out.println("yellow rose color appear in black color");
	}
	
	void fragrance() {
		System.out.println("lily gives a good smell");
	}
}
	
public class Hierarichalinheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Create an Object for rose
		rose r = new rose();
		r.color();
		r.garden();
		lily l = new lily();
		l.color();
		l.fragrance();
	}

}
