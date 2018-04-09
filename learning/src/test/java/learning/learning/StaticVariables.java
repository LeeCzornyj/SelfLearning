package learning.learning;

public class StaticVariables {

	static int dollar;
	int ammount;
	
//	public StaticVariables() {
//		dollar = 2;
//	}
//	
	static {
		dollar = 2;
	}
	
	public void setDollar(int A) {
		dollar = A;
	}
	public void showAmount(int B) {
		System.out.println(dollar*B);
		
	}
}
