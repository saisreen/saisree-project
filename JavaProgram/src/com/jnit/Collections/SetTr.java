package com.jnit.Collections;

import java.util.TreeSet;

public class SetTr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TreeSet<Integer> sai = new TreeSet<Integer>();   //Ascending Order
		
		sai.add(9);
		sai.add(2);
		sai.add(8);
		sai.add(4);
		sai.add(1);
		sai.add(0);
		sai.add(9);
		
		TreeSet<String> sree = new TreeSet<>(); //Ascending Order
		System.out.println(sree.isEmpty());      //isEmpty - true 
		
		sree.add("e");
		sree.add("c");
		sree.add("a");
		sree.add("d");
		sree.add("f");
		sree.add("b");
		sree.add(" ");
		
		System.out.println(sai);
		System.out.println(sree);
		
		System.out.println(sree.contains("i"));  //Contains false
		System.out.println(sree.contains("a"));  //contains true 
		System.out.println(sree.isEmpty());      //isEmpty - false
		//System.out.println(sree.first());     //first
		System.out.println(sree.floor("i")); //floor - returns the greatest element
		System.out.println(sree.lower("d"));    //lower - returns the next lowest than exist 
		System.out.println(sree.higher("c"));  //higher - retunrs next higher than exist
		System.out.println(sree.last());  //last - last letter
		System.out.println(sree.size());    //size
		System.out.println(sree.headSet("d")); //headset
		System.out.println(sree.subSet("d", "f")); //Subset
		System.out.println(sree.tailSet("d"));   //tailset	
		System.out.println(sree.pollFirst());  //pollFirst
		System.out.println(sree.pollLast());   //pollLast
		System.out.println(sree.remove("a"));  //remove
		System.out.println(sree.removeAll(sree)); //removeall
	}
}
