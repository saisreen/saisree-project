package com.jnit.Cursors;

import java.util.Iterator;
import java.util.TreeSet;

public class SetIterator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TreeSet<String> sree = new TreeSet<>(); //Ascending Order
		System.out.println(sree.isEmpty());      //isEmpty - true 
		
		sree.add("e");
		sree.add("c");
		sree.add("a");
		sree.add("d");
		sree.add("f");
		sree.add("b");
		sree.add(" ");

		//System.out.println(sree);
		Iterator<String> i = sree.iterator();
		System.out.println(i);
		while(i.hasNext()) {
			String s = i.next();
			System.out.println(s);
		}

	}

}
