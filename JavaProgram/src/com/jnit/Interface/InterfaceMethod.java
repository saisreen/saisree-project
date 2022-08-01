package com.jnit.Interface;

interface system {
	
	void task ();
}

abstract class laptop implements system {
	
	void battery() {
		System.out.println(" This laptop can run on battery, AC supply and ain power supply too ");
		
	}
}

abstract class computer implements system {
	
	void powersupply() {
		System.out.println(" This computer runs on main power supply ");
		
	}
}

class dell extends laptop {

	@Override
	public void task() {
		// TODO Auto-generated method stub
		
		System.out.println(" we can carry and use this laptop anywhere in the world");
		
	}
	
class apple extends computer {

	@Override
	public void task() {
		// TODO Auto-generated method stub
		
		System.out.println(" we should use this computer at one place connected with power ");
		
	}
}
}


public class InterfaceMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		system s = new dell();    //downcasting
		dell d = (dell)s;	
		d.battery();
		d.task();
		

	}

}
