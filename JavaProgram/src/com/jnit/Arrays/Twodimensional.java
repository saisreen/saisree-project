package com.jnit.Arrays;

import java.util.Scanner;

public class Twodimensional {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[][] = new int[3][4];
		int sum =0;
		Scanner sc = new Scanner(System.in);
		for(int i=0; i<a.length; i++) {
			for (int j=0; j<a.length; j++) {
				System.out.println("Enter the array values ");
				a[i][j] = sc.nextInt();
			}
		}
		sc.close();
		for(int i=0; i<a.length; i++) {
			for (int j=0; j<a.length; j++) {
		       sum = sum +a[i][j];
			}
		}
				System.out.println("sum ="+sum);
	}
}


		
	
		
