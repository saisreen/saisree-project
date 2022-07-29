package com.jnit.NestedClasses;

//Outer class
class Airport {
	
	static String noallowance;                        //Static variable
	
	void check() {                                   //Instance Method
		System.out.println(" To enter inside the airport they verify the Identification");
	}
	
	//Inner or Nested class
	class Airline {
		
		//Member of inner class
		String bags;                                  //Instance variable 
		
		void check_in() {
			System.out.println(" Next, check in the flight and collect the boarding pass ");
		}
		
		void laguage(String bags) {          
				System.out.println(" Drop the "+bags);
			}
		
		//Static variable accessed within the instance method in nested class
		 void Restricted(String noallowance) {      
			System.out.println(" Few items are"+noallowance+" on a plane");
		}
		
		void AirportSecurity () {
			System.out.println(" pass the airport security to reach the borading gate ");
		}
	}
}

public class MemberInnerClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//create an object for the outside class
		Airport Vijayawada = new Airport();              
		
		//Create an object for the inner class
		Airport.Airline indigo = Vijayawada.new Airline();
		
		Vijayawada.check();                           //calling method
		indigo.check_in();
		indigo.laguage(" carry on lagguage to them");
		indigo.Restricted(" Prohibited ");
		indigo.AirportSecurity();
		
	}

}
