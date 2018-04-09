package Java.Exercise.Two;

public class PersonDetails {

	String name;
	int age;
	String jobDetails;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getJobDetails() {
		return jobDetails;
	}
	public void setJobDetails(String jobDetails) {
		this.jobDetails = jobDetails;
	}
	@Override
	public String toString() {
		String details = (getName() + " " + getAge() + " " + getJobDetails());		
		return details;
	}
}
