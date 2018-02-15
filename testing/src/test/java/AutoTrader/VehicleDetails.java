package AutoTrader;
import java.util.HashMap;
import java.util.Map;

public class VehicleDetails {

	
	public static HashMap<String,String> map = new HashMap<String, String>();
	
	public void vehicleDetails() {
		map.put("CarReg", "ky09jyj");
		map.put("CarMileage", "34000");
		map.put("vehLocation", "NN172UU");
		
	}

	
	public Map<String, String> getMap() {
		return map;
	}


	public static void setMap(HashMap<String, String> map) {
		VehicleDetails.map = map;
	}

	
}
