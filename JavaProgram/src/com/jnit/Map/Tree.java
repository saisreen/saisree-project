package com.jnit.Map;

import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class Tree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TreeMap<Integer, String> hm = new TreeMap <> ();  //Ascending order
		hm.put(1, "Sai");  //duplicate value
		hm.put(9, "sree");
		hm.put(1, "Sree"); //duplicate key as updated value
		hm.put(5, "Sai");  
		hm.put(6, "Sudha");
		hm.put(3, "SSS");
		hm.put(89, "rani");
		System.out.println(hm);
		Set<Entry<Integer, String > > se = hm.entrySet();
		Iterator<Entry<Integer, String>> i = se.iterator();
		while(i.hasNext()) {
			Entry<Integer, String > ee = i.next();
			System.out.println(ee.getKey());
			System.out.println(ee.getValue());
			
		}
		
		
		
		
		
		TreeMap<Character, Double> h = new TreeMap <> ();  //Ascending order
		h.put('A', 1.1); //duplicate value 
		h.put('B', 1.2);
		h.put('C', 1.3);
		h.put('D', 1.3);
		h.put('C', 1.4); //duplicate key
		h.put('X', 1.1);
		//System.out.println(h);


	}

}
;