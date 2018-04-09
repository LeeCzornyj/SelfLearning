package learning.learning;

abstract public class mathnew {

	public void add(int a, int b) {
		System.out.println("Results: "+ (a+b));
	}
	
	abstract public void subtract(int a, int b);
	abstract public void division(int a,int b);
	
	abstract public void doDraw();
}
