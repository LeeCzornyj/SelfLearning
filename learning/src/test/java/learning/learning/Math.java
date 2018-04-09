package learning.learning;

public class Math {

	static Math y;
	
	public int add(int A, int B) {
		return A+B;
	}
	public int sub(int a, int b) {
		return a-b;
	}
	
	private Math() {
	}
	public static Math createObject() {
		if(y==null){
			y = new Math();
		}
		return y;
	}
	
}
