package com.jnit.Collections;

import java.util.LinkedHashSet;

public class SetLinkedHs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedHashSet<Integer> one = new LinkedHashSet<>(); //insertion order
		one.add(1);
		one.add(7);
		one.add(9);
		one.add(2);
		one.add(17);

		LinkedHashSet<Float> two = new LinkedHashSet<>(); //insertion order
		two.add(9.1f);
		two.add(2.9f);
		two.add(8.5f);
		two.add(6.3f);

		LinkedHashSet<String> three = new LinkedHashSet<>(); //insertion order
		three.add("sai");
		three.add("sree");
		three.add("rani");
		three.add("sudha");
		three.add(" ");

		LinkedHashSet<Character> four = new LinkedHashSet<>(); //insertion order
		four.add('Z');
		four.add('S');
		four.add('W');
		four.add('X');
		four.add('A');

		LinkedHashSet<Boolean> five = new LinkedHashSet<>(); //insertion order
		five.add(true);
		five.add(false);
		five.add(null);

		System.out.println(one);
		System.out.println(two);
		System.out.println(three);
		System.out.println(four);
		System.out.println(five);

		System.out.println("The hashcode() of object - one is = "+one.hashCode()); //calculated the total values 
		System.out.println("The Size() of object - two is "+two.size());            //size
		System.out.println("The add() of object - Three is "+three.add("sarayu")); //add()
		System.out.println("The addAll() of Object - four is "+four.addAll(four)); //addAll()
		System.out.println(four.add('a'));                              //add()
		System.out.println("The "+one.equals(one));                    //equals()
		System.out.println(two.isEmpty());                             //isEmpty()
		System.out.println(four.clone());                             //clone()
		System.out.println(five.toArray());                           //toArray()
		}
		}




