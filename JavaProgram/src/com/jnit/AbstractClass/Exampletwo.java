package com.jnit.AbstractClass;

abstract class Manager {
	
	public static Object x;
	static void businesshours () {               //static method 
		System.out.println(" Employees bussinesshours is from 8 am to 5 pm ");
	}
	
	abstract void salary ();                     //abstract method
	abstract void benefit();
}

class Fulltimeemp  extends Manager {
	
	static void businesshours () {               //static method 
		System.out.println("Employees .full time");
	}
	
	void salary () {                             //Method Overriding 
		System.out.println(" For fulltime employee salary is 50000");
	}
	
	void benefit () {                            
		System.out.println(" Offered a few benefits for full time employee ");
	}
}

class Parttimeemp extends Manager {
	
	void salary () {                            //Method Overriding       
		System.out.println(" For Parttime employee salary is 20000");
	}
	
	void benefit() {
		System.out.println( " Part time employee doesn't have any benefits");
	}
}

public class Exampletwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Manager.businesshours();     //calling the static method 
		
		Manager x;                   
		x = new Fulltimeemp();
		x.salary();
		x.benefit();
		x = new Parttimeemp();
		x.salary();
		x.benefit();
	}
}
