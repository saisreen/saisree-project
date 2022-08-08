package com.jnit.Collections;

import java.util.Vector;

public class ListVect {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Vector<Integer> sai = new Vector<Integer>();  //insertion order
		sai.add(9);
		sai.add(2);
		sai.add(8);
		sai.add(4);
		sai.add(1);
		sai.add(0);
		sai.add(9);
		
		Vector<String> sree = new Vector<>(); //insertion order
		sree.add("My");
		sree.add("Name");
		sree.add("is");
		sree.add("sai");
		sree.add(" ");
		
		Vector<Double> d = new Vector<>();  //insertion order 
		d.add(1.2);
		d.add(2.5);
		d.add(6.8);
		d.add(9.6);
		
		Vector<Float> a = new Vector<>();   //insertion order
		a.add(1.6f);
		a.add(1.0f);
		a.add(2.6f);
		
		System.out.println(sai);
		System.out.println(sree);
		System.out.println(d);
		System.out.println(a);
		


	}

}
