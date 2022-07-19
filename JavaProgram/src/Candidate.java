
class Examiner {
	
	
	
	//void hallticket() {
	//System.out.println("Examiner will Check the Candidate 1.Name 2.Hallticket number 3.Course_details ");
//}
	
	//Method Overloading
	
	void hallticket(String verify1 ) {
		System.out.println("Examiner will Check the Candidate "+verify1);
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
		System.out.println("Write an exam in " +Course);
	}
	
	String examduration() {
		 return "2 Hours";
	}
	
	String results (int totalmarks) {
		System.out.println("Check your results is = "+totalmarks);
		return "passed";
	}
	
}


public class Candidate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Creating an Object for an Examiner
		Examiner durga = new Examiner();
		    
		
	   
		// Examiner check only the Hallticket number 
		durga.hallticket(" 1.Hallticket number ");  
		
		//Examiner check only the two details to verify
		durga.hallticket(" 1.Hallicket number ", " 2.image Verification");
		
		//Examiner check all three details to verify
		durga.hallticket(" 1.Hallticket number ", " 2.Name ", " 3.image Verification");   
		
		
		durga.takeanexampaper("Maths");
		System.out.println("The exam duration is " +durga.examduration());
		System.out.println("you are " +durga.results(98));
	}

}
