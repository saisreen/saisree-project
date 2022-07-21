package com.jnit;

import java.util.Scanner;

class school {                      //super class
	
	int tutionfees;
	int scholarship;
	int busfees;
	
	//Create an Object for Scanner
	Scanner sc = new Scanner(System.in);
	
	void office() {
		System.out.println("Admitting the school");
	}
	
	void tutionamount() {
		System.out.println("Enter a tutuion fees amount = ");
		tutionfees=sc.nextInt();
	}
	
	void Scholar() {
		System.out.println("Enter a Scholarship amount = ");
		scholarship=sc.nextInt();
	}
	
	void busamount() {
		System.out.println("Enter a bus fees amount = ");
		busfees=sc.nextInt();
	}
}

class amount extends school {        //sub  class
	
	int booksfees;
	
	void bookamount() {
		System.out.println("Enter a books fees = ");
		booksfees=sc.nextInt();
	}
	
	void totalamount() {
		System.out.println("Total amount of School fees = "+(tutionfees-scholarship+busfees+booksfees));
	}
}

public class Exampleone {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Create an Object for fees
		amount student = new amount();
		student.office();
		student.tutionamount();
		student.Scholar();
		student.busamount();
		student.bookamount();
		student.totalamount();
	}
}
