package com.jnit.UncheckedException;

public class ArrayIndexOutOfBounds {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] x = {1,2,3};
	
		
		System.out.println(x[1]);
		
		try {
		System.out.println(x[5]);
		
	}
		
		catch (Exception sai) {
			sai.printStackTrace();
		}
		
		System.out.println(x[0]);
		System.out.println(x[-10]); 
		


	}

}
