package Java.Exercise.Two.Garage;

import java.util.ArrayList;

public class boat extends vehicle {

	boolean sailOrEngine;

	public void vehicleDetails() {
		ArrayList<Object> vehicleType = new ArrayList<Object>();
		vehicleType.add(id + price + numberOfPassengers + topSpeed + name + sailOrEngine);	
		
		
	}
}
