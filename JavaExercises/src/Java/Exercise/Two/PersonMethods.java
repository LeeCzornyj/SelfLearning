package Java.Exercise.Two;

import java.util.ArrayList;

public class PersonMethods  {

	ArrayList<PersonDetails> personArray = new ArrayList<PersonDetails>();
	PersonDetails details = new PersonDetails();
	
	public void addObjectsToList(PersonDetails details) {
		
		personArray.add(details);
	//	System.out.println(personArray);
	}
	
	public PersonDetails passDetailsToObject(String name, int age, String jobdetails) {
		PersonDetails details = new PersonDetails();
		details.setName(name);
		details.setAge(age);
		details.setJobDetails(jobdetails);
		//System.out.println(name + age + jobdetails);
		
		return details;
	}
	
	public void displayDetails(){
		for(Object k: personArray) {
			System.out.println(personArray);
		}
	}
	
	public void runClass(String name, int age, String jobdetails) {
		addObjectsToList(passDetailsToObject(name, age, jobdetails));
		displayDetails();
	}
	
}
