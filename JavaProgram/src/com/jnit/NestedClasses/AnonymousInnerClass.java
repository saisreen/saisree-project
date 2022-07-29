package com.jnit.NestedClasses;

abstract class Artist {
	
	abstract void fashiondesigner();    //abstract method 
	 
	void Makeup() {                     //concrete method 
		System.out.println(" Create a bueaty on face by using cosmetics");
	}                   
	}

public class AnonymousInnerClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Artist sai = new Artist() {

			//Inner class without a class name 
		@Override
		void fashiondesigner() {
			// TODO Auto-generated method stub
			System.out.println(" Create a new design of variety of materials");
			
		}
	};
	sai.fashiondesigner();
	sai.Makeup();
	}
}

