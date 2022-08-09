package com.jnit.Map;

import java.util.LinkedHashMap;

public class LinkedH {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedHashMap<Integer, String> hm = new LinkedHashMap <> ();  //insertion order
		hm.put(1, "Sai");  //duplicate value
		hm.put(9, "sree");
		hm.put(1, "Sree"); //duplicate key as updated value
		hm.put(5, "Sai");  
		hm.put(6, "Sudha");
		hm.put(3, "SSS");
		hm.put(89, "rani");
		System.out.println(hm);
		
		LinkedHashMap<String, String> h = new LinkedHashMap <> ();  //insertion order
		h.put("Apple 1lb", " 5.24 dollars" ); //duplicate value 
		h.put("Bluebery 2lb", " 4.76 dollars");
		h.put("Lemon 1.5lb", "1.56 dollars");
		h.put("Mango 5lb", " 8.98 dollars");
		h.put("Apple 1lb", "6 dollars"); //duplicate key
		h.put("Orange 4lb", "5.24 dollars");
		System.out.println(h);


	}

}
