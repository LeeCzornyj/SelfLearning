package AutoTrader;
import java.util.HashMap;
import java.util.Map;

public class VehicleDetails {

	
	public Map<String,String> map = new HashMap<String, String>();
	
	public void vehicleDetails() {
		map.put("CarReg", "ky09jyj");
		map.put("CarMileage", "34000");
		
	}

	public Map<String, String> getMap() {
		return map;
	}

	public void setMap(Map<String, String> map) {
		this.map = map;
	}
	
}
