package com.jnit.Constructors;

class Classroom {
	
	int no_of_students;
	int chair;
	int blackboard;
	int pens;      
	
	//Constructor with no parameter
	Classroom() {
	    no_of_students = 30 ;
		chair = 33;
		blackboard = 1;
	}
	
	void statement() {
		System.out.println("The number of students can sufficient in the classroom = "+no_of_students);
		System.out.println("The number of chairs for students in the classroom = "+chair);
		System.out.println("The number of blackboard in the classroom = "+blackboard);
		System.out.println("The number of pens in the classroom = "+pens);    //Default Constructor
		System.out.println(".........."); 
	}
	
}

public class ArgumentConstructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Create an Object for Maths 
		Classroom Maths = new Classroom();
		Maths.statement();
		
		//Create an Object for Physics 
		Classroom Physics = new Classroom();
		Physics.statement();
		
		//Create an Object for Chemistry
		Classroom Chemistry = new Classroom();
		Chemistry.statement();
		
		//The value is same for all Object this the Zero argument
	}

}
