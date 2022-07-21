package com.jnit.Variable;

class Doctor {
		
		int     physician_id;                     //Instance variable
	    double   physician_Year_of_experience;    //Instance variable
	    long    physician_contact_number;       //Instance variable
        
	    static String physician_speciality;       //Static variable
	    static String physician_hospital;	       //Static variable
	    static String physician_address;        //Static variable
	    
	}
	
	class Patient {
		
		int    patient_id;                  //Instance variable
		float  patient_height;             //Instance variable
		int    patient_age;                //Instance variable
		int    patient_contact_number;     //Instance variable
		String patient_problem;          //Instance variable
		
		static String inpatient_hospital;              //Static variable
		static String inpatient_workhours;            //static variable
		
	}
	
	public class VariableDemoOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Creating an object of doctor 
		Doctor sreeja = new Doctor();
		
		     sreeja.physician_id = 101;                         //assign a value of instance variable from doctor class       
		     sreeja.physician_Year_of_experience = 9.5;        //assign a value of instance variable from doctor class  
		     sreeja.physician_contact_number = 987654321;    //assign a value of instance variable from doctor class
		     
		     Doctor.physician_speciality = "Dermatology";    //assign a value of static variable from doctor class
		     Doctor.physician_hospital   =  "Medical City";   //assign a value of static variable from doctor class
		     Doctor.physician_address    =  "N Macarthur, Irving,Tx,75067";   //assign a value of static variable from doctor class
		     
		      System.out.println("doctor id = " + sreeja.physician_id );
		      System.out.println("doctor Year of experience = " + sreeja.physician_Year_of_experience );  
		      System.out.println("doctor contact number = " +  sreeja.physician_contact_number);
		      System.out.println("doctor speciality = " +  Doctor.physician_speciality );
		      System.out.println("doctor hospital = " + Doctor.physician_hospital);
		      System.out.println("doctor address  = " + Doctor.physician_address);
		      
		      
		   // Creating an object of patient 
				Patient vani = new Patient();
				      vani.patient_age = 28;   // assign a value of instance variable from patient class
				      Patient.inpatient_hospital = "Manipal Hospital";  // assign a value of static variable from patient class
				
				
				  System.out.println("patient id = " + vani.patient_id );  // default value 
			      System.out.println("patient height  = " + vani.patient_height );  //default value
			      System.out.println("patient age = " + vani.patient_age);  //assign a value 
			      System.out.println("patient contact number = " + vani.patient_contact_number); //default value
			      System.out.println("patient problem  = " + vani.patient_problem); //default value
			      System.out.println("patient hospital  = " + Patient.inpatient_hospital); //assign a value
			      System.out.println("patient workhours  = " + Patient.inpatient_workhours);    // default value
		
		
	}

}