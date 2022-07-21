package com.jnit.MethodOverloading;
import java.util.Scanner;

class Bank {
	
	 //Method Overloading
	
	void form (String form1, String form2) {
		System.out.println("Collect the Application form "+form1+" or "+form2);
	}
	
	void form () {
			System.out.println("Fill the Form 1.Name 2.Age 3.Address 4. Contact details 5. Guardian details");
		}
	
	//void proof (String id, String address) {
		//System.out.println("Proof submitted are " +id+" and " +address);
	//}
	
	//Method Overloading 
	
		void proof (String id1, String id2) {
			System.out.println("Submitted the Proof  " +id1+" and "+id2);
		}
	
	//Method Overloading 
	
	void proof (String id1, String id2, String id3) {
		System.out.println("submitted the  proof " +id1+","+id2+","+" and "+id3);
	}
	
	//Method Overloading 
	
	void proof (String id1, String id2, String id3, String id4) {
		System.out.println("submitted the proof " +id1+","+id2+","+id3+" and "+id4);
	}
	
	String passbook () {
		return "201923467";
	}
	
	String deposit (int amount1, int amount2) {
		System.out.println("Total amount deposited = " +(amount1+amount2));
		return "reciept";	
	}
	
}
public class Customer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Creating an Object for bank class
		Bank Comerca = new Bank();
		
		Comerca.form("1.Savings Acoount ", "2.Current account ");     
		Comerca.form();
		
				//submit only two proofs 
				//Comerca.proof(" 1.Passport "," 2. Driver's License ");
				//submit all of these three proofs
				//Comerca.proof(" 1.Passport ", " 2.Driver's License ", " 3.SSN ");
				//submit all of these four proofs 
				//Comerca.proof(" 1.Passport ", " 2.Driver's License ", " 3.SSN ", " 4.Utility Bill ");                                                   
				//System.out.println("Bank gave " + Comerca.deposit(2000));                                        

		//create an Object for Scanner 
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the two id proofs to submit = ");
		
		Comerca.proof(sc.next(), sc.next());
		
		System.out.println("Next");
		
		System.out.println("Bank gave passbook and account number is " + Comerca.passbook()); 
		
		System.out.println("Enter the first deposit amount = ");
		
		int Firstdeposit = sc.nextInt();
		
		System.out.println("Enter the second deposit amount = ");
		
		int Seconddeposit = sc.nextInt();
		
		Comerca.deposit(Firstdeposit, Seconddeposit);
		
		sc.close();
		
	    
	}

}
