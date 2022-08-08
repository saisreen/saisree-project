package com.jnit.Variable;

public class Typecasting {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Local Variable
	int a = 10, b=3;
	float c;
	c = a/b;
	c = (float) a/b;   //Convert from int to float   
	System.out.println(" Div = "+c);
	
	double x = 3.5;
	int  z ;
	z= (int) x;     //convert from double to int - Narrowing casting 
	System.out.println("The value of z = "+z);
	
	int num = 10;
	//convert int to String 
	String data = String.valueOf(num);
	System.out.println(" The String is "+data);
	
	
	String s = "10";
	//convert String to int 
	int sree = Integer.parseInt(s);
	System.out.println(" The integer value = "+sree);
	
	//int n ; //no default value
	//System.out.println(" n ");
	}
}

