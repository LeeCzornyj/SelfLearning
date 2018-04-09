package learning.learning;

import java.util.Scanner;

public class ScannerPractice {

	public void scannerTest1() {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("What is your name?: ");
		String name = sc.nextLine();
		if(name.equalsIgnoreCase("Lee")) {
			System.out.println("Hello Lee");
		}
		
	}
	
}
