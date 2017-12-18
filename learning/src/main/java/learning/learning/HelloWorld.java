package learning.learning;

public class HelloWorld {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Hello World!");
		
		String hello = "Hello World!";
		
		System.out.println(hello);
		
		System.out.println(args[0]);
		helloOutput();
		helloReturn("hello");
	}
	
	public static void helloOutput() {
		
		System.out.println("Hello World!");
	}
	public static String helloReturn(String helloWorldReturn) {
		
		return helloWorldReturn;
	}

}
