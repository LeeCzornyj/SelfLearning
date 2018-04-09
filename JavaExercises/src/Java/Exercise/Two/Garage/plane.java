package Java.Exercise.Two.Garage;

import java.util.ArrayList;

public class plane extends vehicle {
	
	int maxAltitude;

	public void vehicleDetails() {
		ArrayList<Object> vehicleType = new ArrayList<Object>();
		vehicleType.add(id + price + numberOfPassengers + topSpeed + name + maxAltitude);		
	}
}
