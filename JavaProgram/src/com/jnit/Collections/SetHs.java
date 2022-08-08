package com.jnit.Collections;

import java.util.HashSet;

public class SetHs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Create an Object of class Hashset and adding wrapper class
		HashSet<Integer> sai = new HashSet<Integer>();  //random order
		sai.add(9);
		sai.add(2);
		sai.add(8);
		sai.add(4);
		sai.add(1);
		sai.add(0);
		sai.add(9);
		
		HashSet<String> sree = new HashSet<>(); //random order
		sree.add("My");
		sree.add("Name");
		sree.add("is");
		sree.add("sai");
		sree.add(" ");
		
		HashSet<Double> d = new HashSet<>();  //random order 
		d.add(1.2);
		d.add(2.5);
		d.add(6.8);
		d.add(9.6);
		
		HashSet<Float> a = new HashSet<>();   //random order
		a.add(1.6f);
		a.add(1.0f);
		a.add(2.6f);
		
		System.out.println(sai);
		System.out.println(sree);
		System.out.println(d);
		System.out.println(a);
		
		System.out.println("The Object sai - contains = "+sai.contains(5));
		System.out.println("Size of the object sree = "+sree.size());
		System.out.println("The Object d is "+d.isEmpty());
		System.out.println("The Object a "+a.add(3.3f));
		System.out.println("The Object sai - removes = "+sai.remove(4));
		System.out.println("The Object of sai - clone  " +sai.clone());
		System.out.println("The Object a will display all together which is included recently also "+a.clone());
	}
}
