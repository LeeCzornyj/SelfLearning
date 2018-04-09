package Java.Exercise.Two.Garage;

import java.util.ArrayList;

public class car extends vehicle {

	int numberOfAirbags;

	public void vehicleDetails() {
		ArrayList<Object> vehicleType = new ArrayList<Object>();
		vehicleType.add(id + price + numberOfPassengers + topSpeed + name + numberOfAirbags);	
		
		
	}
	
}
