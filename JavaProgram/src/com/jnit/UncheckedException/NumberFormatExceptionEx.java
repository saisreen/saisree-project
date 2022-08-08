package com.jnit.UncheckedException;

public class NumberFormatExceptionEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "sai";
		
		System.out.println("This is type casting of converting from String to int");
		try {
		//convert String to int 
		int sree = Integer.parseInt(s);
		System.out.println(" The integer value = "+sree);
	}
		catch(NumberFormatException sai) {
			sai.printStackTrace();
		}
		System.out.println("Printed the other one the end ");

}
}
