import java.util.Scanner;

class Examiner {
	
	void hallticket() {
	System.out.println("Examination");
     }
	
	//Method Overloading
	
	void hallticket(String verify1 ) {
		System.out.println("Examiner will Check the Candidate  : "+verify1);
	}
	 
	//Method Overloading
	
	void hallticket(String verify1, String verify2 ) {
		System.out.println("Examiner will Check the Candidate "+verify1+" and "+verify2);
	}
	
	//Method Overloading
	
	void hallticket(String verify1, String verify2, String verify3 ) {
		System.out.println("Examiner will Check the Candidate "+verify1+ "," +verify2+ " and " +verify3);
	}
	
	
	void takeanexampaper(String Course) {
		System.out.println("Take an exam in " +Course);
	}
	
	String examduration() {
		 return "2 Hours";
	}
	
	String results (int totalmarks) {
		System.out.println("Check your Maths result is "+totalmarks+"/"+"100");
		return "passed";
	}
	
}


public class Candidate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Creating an Object for an Examiner
		Examiner durga = new Examiner();
		durga.hallticket();
		   
		// Examiner check only the Hallticket number 
		//durga.hallticket(" 1.Hallticket number ");  
		//Examiner check only the two details to verify
		//durga.hallticket(" 1.Hallicket number ", " 2.image Verification");
		//Examiner check all three details to verify
		//durga.hallticket(" 1.Hallticket number ", " 2.Name ", " 3.image Verification");   
		
	
		
	
	         Scanner sc = new Scanner(System.in);
	         
	         System.out.println("Some Examiner verify one details at exam hall");
	         
	         System.out.println("Enter the Candidate only one verification details: ");
	         
	         //Examiner can check only the hallticket number
	         durga.hallticket(sc.next());
	         
	         System.out.println("Some Examiner verify two details at exam hall");
	         
	         System.out.println("Enter the Candidate two verification details: ");
	         
	         //Examiner can check two verification
	         durga.hallticket(sc.next(),sc.next());
	         
             System.out.println("Some Examiner verify three details at exam hall");
	         
	         System.out.println("Enter the Candidate three verification details: ");
	         
	         //Examiner can check two verification
	         durga.hallticket(sc.next(),sc.next(), sc.next());
	         
	         durga.takeanexampaper("Maths");
	         
	         System.out.println("The exam duration is " +durga.examduration());
	         
	         System.out.println("Congratulation! you are " +durga.results(98));
	         
	         sc.close();
	
	}

}
