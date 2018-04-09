package learning.learning;

public class ConstructorLearning {

	public ConstructorLearning() {
		this(2,7,7,3,4);
		System.out.println("1");
	}
	public ConstructorLearning(int... A) {
		//this(7);
		for (int i=0;i< A.length;i++) {
			System.out.println(A[i]);	
		}
	}
//	public ConstructorLearning(int A, int B) {
//		System.out.println("Hello");
//	}	
}
