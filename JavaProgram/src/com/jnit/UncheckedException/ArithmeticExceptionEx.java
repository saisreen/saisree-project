package com.jnit.UncheckedException;

public class ArithmeticExceptionEx {
	
	public static void main (String[] args) {
		// TODO Auto-generated method stub
		
		int a =7;
				int b = 0; 
		 try{  
		     System.out.println(" Print the div = "+(a/b));   
		   }
		 catch(ArithmeticException sai)
		 {
         sai.printStackTrace();
			   
			   }  
		    
		 
		  }  
		}  

