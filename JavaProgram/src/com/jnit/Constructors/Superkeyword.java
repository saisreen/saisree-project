package com.jnit.Constructors;

class Dean {
	
	int id = 1234;
	String qualification = "MBA";
	
}

class Teacher extends Dean {
	
	int id = 1111;
	String qualification = "B.E";
	
	void details() {
		System.out.println("Dean id = "+super.id);
		System.out.println("Teacher id = " +id);
		System.out.println("Dean qualification is = "+super.qualification);
		System.out.println("Teacher qualification is = "+qualification);
	}
	
}
public class Superkeyword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Teacher vani = new Teacher();
		vani.details();

	}

}
