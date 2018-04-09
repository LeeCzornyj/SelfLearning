package learning.learning;

public class SubjectMarks {

	private int subject1,subject2,subject3;
	private int maxSubjectMarks, maxTotalMarks;
	private float total, percentage;
	
	public SubjectMarks(int m1, int m2) {
		maxSubjectMarks = m1;
		maxTotalMarks = m2;
	}
	
	public void firstSubject(int A) {
		if(A>=0 & A<=maxSubjectMarks) {
			subject1 = A;			
		} else {
			System.out.println("Invalid entry");
		}
	}
	
	public void secondSubject(int A) {
		if(A>0 & A<=maxSubjectMarks) {
			subject2 = A;
		} else {
			System.out.println("Invalid entry");
		}
	}
	
	public void thirdSubject(int A) {
		if(A>0 & A<=maxSubjectMarks) {
			subject3 = A;
		} else {
			System.out.println("Invalid entry");
		}
	}
	
	private void doCalculations() {
		total = subject1 + subject2 + subject3;
		percentage = total / maxTotalMarks;
	}
	
}
