package com.jnit.UncheckedException;

public class ArrayStoreExceptionex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  Number [] a = new Double[2];
		  
	        // Trying to store an integer value
	        // in this Double type array
	        a[0] = new Integer(4);
	    }
	}

