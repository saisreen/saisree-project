package com.jnit.Collections;

import java.util.ArrayList;


public class ListArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Integer> sai = new ArrayList<Integer>();  //insertion order
		sai.add(9);
		sai.add(2);
		sai.add(8);
		sai.add(4);
		sai.add(1);
		sai.add(0);
		sai.add(9);
		
		ArrayList<String> sree = new ArrayList<>(); //insertion order
		sree.add("My");
		sree.add("Name");
		sree.add("is");
		sree.add("sai");
		sree.add(" ");
		
		ArrayList<Double> d = new ArrayList<>();  //insertion order 
		d.add(1.2);
		d.add(2.5);
		d.add(6.8);
		d.add(9.6);
		
		ArrayList<Float> a = new ArrayList<>();   //insertion order
		a.add(1.6f);
		a.add(1.0f);
		a.add(2.6f);
		
		System.out.println(sai);
		System.out.println(sree);
		System.out.println(d);
		System.out.println(a);

	}

}
