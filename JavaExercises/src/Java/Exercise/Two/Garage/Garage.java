package Java.Exercise.Two.Garage;

import java.util.ArrayList;

public class Garage {

	ArrayList<vehicle> wagons = new ArrayList<vehicle>();

	public void iterateThroughVehicles() {

	}

	public void addVehicles(ArrayList<Object> type) {
		//wagons.addAll();
		if(type.contains("numberOfAirbags")) {
			car cars = new car();
			wagons.add(cars);
		}
	}

	public void deleteVehicles() {
		wagons.remove(0);
	}
}
