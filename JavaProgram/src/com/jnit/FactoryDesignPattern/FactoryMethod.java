package com.jnit.FactoryDesignPattern;

abstract class car {
	
	abstract void cost() ;	
	abstract void milage();
	
	void Start () {
		System.out.println(" Start with key ");
	}
}

class Audi extends car {
	void cost() {
		System.out.println(" Audi cost is 40 Lakhs ");
	}
	void milage() {
		System.out.println(" Audi milage is 15km ");
	}
}

class BMW extends car {
	void cost() {
		System.out.println(" BMW cost is 50 Lakhs ");
	}
	void milage() {
		System.out.println(" BMW milage is 10km ");
	}
}

class Mustang extends car {
	void cost () {
		System.out.println(" Mustang cost is 70 Lakhs");
	}
	void milage() {
		System.out.println(" Mustang milage is 9km ");
	}
}

class CarFactory {   
	car getcar(String CarName) {    //Instance Factory method
		if (CarName.equals("Audi"))
			return new Audi();
	else if (CarName.equals("BMW"))
		return new BMW();
	else if (CarName.equals("Mustang"))
			return new Mustang();
	else 
		return null;
}
}

class carFactorys {
	static car getcar(String carname) {  //Static Factory method
		if(carname.equals("Mustang"))
			return new Mustang();
		else
			return null;
	}
}

public class FactoryMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//create an Object for carfactory
		CarFactory cf = new CarFactory();
		car x = cf.getcar("BMW");
		x.cost();
		x.milage();
		x.Start();	
		
		car s = carFactorys.getcar("Mustang"); //call a static method
		s.cost();
		s.milage();
		s.Start();
	}
}
