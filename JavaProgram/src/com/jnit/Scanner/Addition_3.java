package com.jnit.Scanner;
import java.util.Scanner;

 // The number is different in parameter

class Ad {
	
	void sum () {
		System.out.println("The sum of zero integer ");
	}
	
	void sum (int x, int y) {
		System.out.println("The sum of two integer = " +(x+y));
	}
	
	void sum (int x, int y, int z) {
		System.out.println("x= "+x+", "+"y= "+y+", "+" z="+z+" The sum of three integer = " +(x+y+z));
	}
	
	void sum (int x, int y, int z, int a) {
		System.out.println("The sum of four integer = " +(x+y+z+a));
	}
	
}
public class Addition_3 {

	public static void main(String[] args) {
		
		Ad ram = new Ad();
		//ram.sum();               
		//ram.sum(10, 20);           //int x, int y Method calling
		//ram.sum(10,20, 30);        //int x, int y, int z
		//ram.sum(10, 20, 30, 40);   //int x, int y, int z, int a
		
		//Create an Object for Scanner
		Scanner sc = new Scanner(System.in);
		
		//Print two values 
		System.out.println("Enter a value of x = ");
		
		int s = sc.nextInt();
		
		System.out.println("Enter a value of y = ");
		
		int a = sc.nextInt();
		
		ram.sum(s, a);
		
		//Print three values
		System.out.println("Enter a three values of x, y and z : ");
		
		ram.sum(sc.nextInt(), sc.nextInt(), sc.nextInt());
		
		//print four values
		System.out.println("Enter a four values of x, y, z, a: ");
		
		ram.sum(sc.nextInt(), sc.nextInt(), sc.nextInt(), sc.nextInt());
		
        sc.close();
        
	}

}
