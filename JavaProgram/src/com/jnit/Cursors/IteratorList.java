package com.jnit.Cursors;

import java.util.ArrayList;
import java.util.ListIterator;

public class IteratorList {

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
		System.out.println(sai);
		
		ListIterator <Integer> k = sai.listIterator();
		while(k.hasNext()) {
			System.out.println(k.next());
		}
            System.out.println("==============");      
            while(k.hasPrevious()) {
            	System.out.println(k.previous());  //reverse direction
            }
	}
}
