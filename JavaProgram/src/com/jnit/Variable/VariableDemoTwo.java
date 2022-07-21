package com.jnit.Variable;

class Manager {
		
		int     mgr_id;                     //Instance variable
	    String  mgr_dept;                  //Instance variable
	    int   mgr_year_of_experience;    //Instance variable
	    long  mgr_contact_number;        //Instance variable
        
	    static String mgr_company;                         //Static variable
	    static int    mgr_no_of_hiring_employee;	       //Static variable
	    static String mgr_interview;                      //static variable
	    	    
	}
	
	class Employee {
		
		String    employee_first_name;                   //Instance variable
		String  employee_last_name;                     //Instance variable
		int    employee_age;                           //Instance variable
		int    employee_contact_number;               //Instance variable
		String employee_dept;                        //Instance variable
		
		static String employ_company;               //Static variable
		static int    employ_no_of_emp;            //static variable
		
		
	}
	
public class VariableDemoTwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//creating an Object of Manager
		Manager sai = new Manager();
		   sai.mgr_id = 105;                       //assign a value of instance variable from Manager class
		   sai.mgr_dept = "software Engineering"; //assign a value of instance variable from Manager class
		   sai.mgr_year_of_experience = 11;       //assign a value of instance variable from Manager class
		   sai.mgr_contact_number = 987654321;
		   
		   Manager.mgr_company = "JNIT";            //assign a value of static variable from Manager class
		   Manager.mgr_interview = " online";        //assign a value of static variable from Manager class
		   Manager.mgr_no_of_hiring_employee = 12;  //assign a value of static variable from Manager class
		   
		   System.out.println("manager id = " + sai.mgr_id);
		   System.out.println("manager dept = " + sai.mgr_dept);
		   System.out.println("manager year of experience = " + sai.mgr_year_of_experience);
		   System.out.println("manager contact number = " + sai.mgr_contact_number);
		   System.out.println("manager company = " + Manager.mgr_company);
		   System.out.println("manager number of hiring = " + Manager.mgr_no_of_hiring_employee);
		   System.out.println("manager interview phase = " + Manager.mgr_interview);
		   
		   //creating an object of Manager as default value 
		      Manager sarayu = new Manager();
		      
		      System.out.println("manager id = " + sarayu.mgr_id);                                     //default value
			   System.out.println("manager dept = " + sarayu.mgr_dept);                                //default value
			   System.out.println("manager year of experience = " + sarayu.mgr_year_of_experience);     //default value
			   System.out.println("manager contact number = " + sarayu.mgr_contact_number);            //default value
			   System.out.println("manager company = " + Manager.mgr_company);                        //default value
			   System.out.println("manager number of hiring = " + Manager.mgr_no_of_hiring_employee); //default value
			   System.out.println("manager interview phase = " + Manager.mgr_interview);              //default value
			   
			   
		   //creating an object of Employee
		   Employee sree = new Employee();
		     sree.employee_first_name = "sree";         //assign a value of instance variable from Employee class
		     sree.employee_last_name = "Nar";           //assign a value of instance variable from Employee class
		     sree.employee_age = 28;                      //assign a value of instance variable from Employee class
		     sree.employee_contact_number = 987654321;     //assign a value of instance variable from Employee class
		     sree.employee_dept = "Software Engineering";  //assign a value of instance variable from Employee class
		     
		     Employee.employ_company = "JNTU";  //assign a value of static variable from Employee class
		     Employee.employ_no_of_emp = 543;   //assign a value of static variable from Employee class
		     
		       System.out.println("Employee first name = " + sree.employee_first_name);
			   System.out.println("Employee last name = " + sree.employee_last_name);
			   System.out.println("Employee age = " + sree.employee_age);
			   System.out.println("Employee contact number = " + sree.employee_contact_number);
			   System.out.println("Employee dept = " + sree.employee_dept);
			   System.out.println("Employee Company = " + Employee.employ_company);
			   System.out.println("Number of Employee = " + Employee.employ_no_of_emp);
			   
			   //creating an object of Employee
			   Employee saransh = new Employee();
			      
			     saransh.employee_first_name = "saransh";                        //assign a value of instance variable from Employee class
			     saransh.employee_last_name = "bontr";                           //assign a value of instance variable from Employee class
			     saransh.employee_age = 11;                                      //assign a value of instance variable from Employee class
			     saransh.employee_contact_number = 128976453;                   //assign a value of instance variable from Employee class
			     saransh.employee_dept = "Full Stack application developer";   //assign a value of instance variable from Employee class
			       
			     System.out.println("Employee first name = " + sree.employee_first_name);
				   System.out.println("Employee last name = " + sree.employee_last_name);
				   System.out.println("Employee age = " + sree.employee_age);
				   System.out.println("Employee contact number = " + sree.employee_contact_number);
				   System.out.println("Employee dept = " + sree.employee_dept);
				   System.out.println("Employee Company = " + Employee.employ_company);
				   System.out.println("Number of Employee = " + Employee.employ_no_of_emp);
		   
		   
	}

}