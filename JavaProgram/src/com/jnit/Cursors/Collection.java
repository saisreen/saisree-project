package com.jnit.Cursors;

import java.util.ArrayList;
import java.util.Collections;

public class Collection {

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
		System.out.println(Collections.min(sai));
		System.out.println(Collections.max(sai));
		//System.out.println(Collections.reverseOrder());
		Collections.sort(sai); //Ascending order 
		System.out.println(sai);

	}

}
