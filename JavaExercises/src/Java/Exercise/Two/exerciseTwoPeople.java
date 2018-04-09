package Java.Exercise.Two;

import java.util.ArrayList;

public class exerciseTwoPeople {

	
	ArrayList<String> personArray = new ArrayList<String>();
	
	public String person(String name, int age, String jobTitle) {
		String personDetails = ("name: "+name + ", age: " + age + ", jobTitle: "+jobTitle);
		return personDetails;
	}
	
	public void arraySorting(String person) {
		personArray.add(person);
	}
	
	public void runClass(String name, int age, String jobTitle) {
		String person = person(name,age,jobTitle);
		arraySorting(person);
		
	}
	
	public void findPerson(String lookingfor) {
		for(String search : personArray) {
			if(search.contains(lookingfor)) {
				System.out.println(search);
			}
		}
	}
	
	public void displayDetails() {
		for(String i: personArray) {
			System.out.println(i);
		}
	}
	
	
}
