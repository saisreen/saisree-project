
class Bank {
	
	void form () {
		System.out.println("Fill the Form 1.Name 2.Age 3.Address 4. Contact details 5. Guardian details");
	}
	
	void proof (String id, String address) {
		System.out.println("Proof submitted are " +id+" and " +address);
	}
	
	String passbook () {
		return "201923467";
	}
	
	String deposit (double amount) {
		System.out.println("Amount deposited = " +amount);
		return "reciept";	
	}
	
}


public class Customer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Creating an Object for bank class
		Bank sai = new Bank();
		
		sai.form();                                                                             //Method call
		sai.proof("passport", "current_bill");                                                  
		System.out.println("Bank gave passbook and account number is " + sai.passbook());            
		System.out.println("Bank gave " + sai.deposit(2000));                                        
		
		

	}

}