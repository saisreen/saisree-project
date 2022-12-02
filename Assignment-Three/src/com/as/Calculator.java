package com.as;

public class Calculator {
	
	static int powerInt(int numi, int num2) {
		return (int) Math.pow(numi, num2);
		
	}
	
	static  double powerDouble (double numi, double num2) {
		return Math.pow(numi, num2);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		 System.out.println(powerInt(12, 3)); 
		 System.out.println(powerDouble(3.8,5)); 
		
		

	}

}
