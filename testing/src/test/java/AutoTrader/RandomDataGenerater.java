package AutoTrader;

import java.util.Random;

public class RandomDataGenerater {

	public static String letters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	public static String numbers = "0123456789";
	public static String reg = "";
	public static String postcode ="";

	public static void main(String[] args) {
		System.out.println(milageGenerator());
		carRegGenerator();
		postcodeGenerator();
		System.out.println(postcode);
	}

	public static String milageGenerator() {
		Random rand = new Random();
		int number = rand.nextInt(100000);
		String milage = Integer.toString(number);
		return milage;
	}
	
	public static String randomLetter(String randomChar) {
		Random rand = new Random();
		char C = randomChar.charAt(rand.nextInt(randomChar.length()));
		reg+=C;
		return reg;
	}
	public static String carRegGenerator() {

		randomLetter(letters);
		randomLetter(letters);
		randomLetter(numbers);
		randomLetter(numbers);
		randomLetter(letters);
		randomLetter(letters);
		randomLetter(letters);
		System.out.println(reg);
		return reg;

	}
	public static String postcodeGenerator() {
		reg = "";
		randomLetter(letters);
		randomLetter(letters);
		randomLetter(numbers);
		randomLetter(numbers);
		randomLetter(numbers);
		randomLetter(letters);
		randomLetter(letters);
		postcode = reg;
		System.out.println(postcode);
		return postcode;
	}
}
