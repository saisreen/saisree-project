package com.jnit.UncheckedException;

class Employer {
	String employer_name = "sai";
}

class Employee extends Employer {
	String employee_name = " sree";
	
	void details() {
	System.out.println(" Print the employer details "+super.employer_name);
	System.out.println(" Print the employee details "+employee_name);
	
}
}
public class ClassCastExceptionex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
		Employer sai = new Employer();
		Employee sri = (Employee)sai;
	}
		catch(Exception e ) {
			e.printStackTrace();
		}
}
}
