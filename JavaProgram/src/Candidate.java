
class Examiner {
	
	void hallticket() {
	     System.out.println("Verify the Candidate hallticket as 1.Name 2.Hallticket number 3.Course_details ");
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
		
		durga.hallticket();                     //Method call
		durga.takeanexampaper("Maths");
		System.out.println("The exam duration is " +durga.examduration());
		System.out.println("you are " +durga.results(98));
	}

}