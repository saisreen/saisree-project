package com.ex;

public class Travel implements Journey{

	Vehicle v;  //It's a reference and you can have it as private also
	
	public void setV(Vehicle v) {
		this.v = v;
	}

	public void startJourney() {
		// TODO Auto-generated method stub
		v.move();
		
	}

	
}
