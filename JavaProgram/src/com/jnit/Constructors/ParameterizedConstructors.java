package com.jnit.Constructors;

class Elections {
	
	int no_of_voter;
	int no_of_voted;
	int partyabc;
	int partyxyz;
	String elected;
	
	//Constructor with parameter
	Elections ( int no_of_voter, int no_of_voted, int partyabc, int partyxyz, String elected) {
		this.no_of_voter = no_of_voter;
		this.no_of_voted  = no_of_voted;
		this.partyabc = partyabc;
		this.partyxyz = partyxyz;
		this.elected = elected;
	}
	
	void results() {
		System.out.println(" The number of voters are = " +no_of_voter);
		System.out.println(" The total number of voted for the elections are = "+no_of_voted);
		System.out.println(" The number of people voted to partyabc = "+partyabc);
		System.out.println(" The number of people voted to partyxyz = "+partyxyz);
		System.out.println(" The elected party is = "+elected);
		System.out.println("...........");
	}
	 
	
}
public class ParameterizedConstructors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Cretaed an Object for Elections
		Elections AP = new Elections(5000, 4800, 2700, 2100, "partyabc");
		AP.results();
		
		Elections TN = new Elections(1000, 800, 378, 422, "partyxyz");
		TN.results();
		
		Elections TS = new Elections(8000,6500, 4921, 1579, "partyabc");
		TS.results();
		
	}

}
