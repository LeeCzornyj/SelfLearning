package Java.Exercise.Two.Garage;

import java.util.ArrayList;

public class vehicle {

	int id;
	float price;
	int numberOfPassengers;
	int topSpeed;
	String name;

	public void vehicleDetails() {
		ArrayList<Object> vehicleType = new ArrayList<Object>();
		vehicleType.add(id + price + numberOfPassengers + topSpeed + name);	
	}
	
}
