package com.jnit.FactoryDesignPattern;

abstract class educationloan {
	
	abstract void rate_of_interest();
	
	void insurance () {
		System.out.println("Insurance is required while taking an educationloan");
	}
}

class sbi extends educationloan {
	void rate_of_interest() {
		System.out.println(" Sbi interest rate is 12%");
	}
}

class hdfc extends educationloan {
	void rate_of_interest() {
		System.out.println(" hdfc interest rate is 14%");
	}
}
class axis extends educationloan {
	void rate_of_interest() {
		System.out.println(" axis interest rate is 15%");
	}
}

class BankFactory {
	educationloan geteducationloan(String bankname) { //instance factory method
		if(bankname.equals("sbi"))
		return new sbi();
	else if(bankname.equals("hdfc"))
		return new hdfc();
	else return null;	
	}
}
class BankFactorys {
	static educationloan geteducationloan(String bankname) {  //Static Factory method
		if(bankname.equals("axis"))
			return new axis();
		else
			return null;
	}
}

public class FactoryMethodExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BankFactory bf = new BankFactory();
		educationloan l = bf.geteducationloan("hdfc");
		l.insurance();
		l.rate_of_interest();
		
		
		educationloan e = BankFactorys.geteducationloan("axis");
		e.rate_of_interest();
		
	}

}
