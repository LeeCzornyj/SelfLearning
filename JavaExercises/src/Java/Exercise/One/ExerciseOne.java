package Java.Exercise.One;

public class ExerciseOne {
	
	public void helloWorld() {
		System.out.println("Hello world!");
		
		String helloWorld = "Hello World no.2";
		System.out.println(helloWorld);
	}
	
	public String returnValues(String argumentOne) {
		System.out.println(argumentOne);
		
		return argumentOne;
	}
	
	public int addition(int a, int b, boolean result) {
		int c =0;
		if(result == true) {
			c = a+b;
		} else if(result == false) {
			c = a-b;
		} else if(a == 0) {
			c = b;
		} else if (b==0) {
			c=a;
		}
		return c;
	}
	
	public void arrayLoops() {
		int[] array = new int[10];
		for(int i=0; i<array.length;i++) {
			array[i] = i+1;
			System.out.println(array[i]);
		}
		for(int i=0;i<array.length;i++) {
			array[i] = array[i]*10;
			System.out.println(array[i]);
		}
	}
}
