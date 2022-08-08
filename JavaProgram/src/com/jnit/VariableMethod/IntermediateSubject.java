package com.jnit.VariableMethod;

class MajorSubjects  {

    static String College_name;      //Primitive type                 //static variable
    static int no_of_subjects;                      //Static vairable 
	String subject1_name;                     //Instance variable
	String Subject2_name;                     //Instance Variable
	String Subject3_name;                     //Instance Variable
	
	            //Instance method
		void details(String College_name) {  //Method Declaration 
			System.out.println("   //  Yes, we can use a Static variable inside the instance methods   //");
			System.out.println("The name of the Junior college is " +College_name);
		}
	
	          //Instance method
	void info_sub(int no_of_subjects) {
		System.out.println("The number of major Subjects in MPC section is " +no_of_subjects);
	}
	
	            //Static method 
	static void subject1_name() {
		System.out.println("   //  Yes, we can use a instance variable inside the static methods   //");
		System.out.println("The first subject is maths");
	}
	
	           //Static method 
	static void subject2_name() {
		System.out.println("The second subject is physics");
	}
	            //Static method 
		static void subject3_name(String subject3_name) {
			System.out.println("The Third subject is "+subject3_name);
		}
}
public class IntermediateSubject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//created an object 
				MajorSubjects sai = new MajorSubjects();
				sai.details("NRI");            //Non - primitive type 
				sai.info_sub(3);              // calling an instance method  
				
				//access the static method by using class name and without creating an Object. 
				MajorSubjects.subject1_name(); 
				MajorSubjects.subject2_name();
				MajorSubjects.subject3_name("chemistry");
	}
}
