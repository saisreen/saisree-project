package com.jnit.Cursors;

import java.util.ArrayList;
import java.util.Spliterator;

public class IteratorSplit {

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
		
		Spliterator <Integer> k = sai.spliterator();
		System.out.println("Estimate Size =  "+k.estimateSize());
		System.out.println("characteristics = "+ k.characteristics());
		System.out.println("getExactSize = "+k.getExactSizeIfKnown());
		System.out.println("Characteristics = "+k.hasCharacteristics(k.characteristics()));
		
	
	}
}
