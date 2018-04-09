package Java.Exercise.One;

import Java.Exercise.Two.PersonMethods;
import Java.Exercise.Two.exerciseTwoPeople;

public class RunnerClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	/*	int[] array = {0,1,2,3,4,5,6,7,8,9};
		ExerciseOne helloWorld = new ExerciseOne();
		helloWorld.helloWorld();
		helloWorld.returnValues("Hello World");
		System.out.println(helloWorld.returnValues("Hello Matt"));
		for(int i=0; i<10;i++) {
			System.out.print(helloWorld.addition(i,array[i],true)+", ");
		}
		System.out.println("");
		for(int i=0; i<array.length;i++) {
			System.out.print(array[i] + ", ");
		}
		System.out.println("");
		helloWorld.arrayLoops();
		
		exerciseTwoBlackjack exe2 = new exerciseTwoBlackjack();
		exe2.blackjackMain1(12, 22);
	
		exerciseTwoUniqueSum temp = new exerciseTwoUniqueSum();
		temp.correctSum(21,7,10);
		
		exerciseTwoTooHot hot = new exerciseTwoTooHot();
		System.out.println(hot.tooHot(68, true));
		*/
		
		PersonMethods test1 = new PersonMethods();
		test1.runClass("Lee", 30, "Stuntman");
		test1.runClass("Matt", 27, "Unlucky trainer");
	}

}
