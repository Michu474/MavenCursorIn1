import java.util.HashMap;

import vehicleClasses.*;


public class VehicleFinder  {
	
	Vehicle veh = new Vehicle();
	
	public void getVehSoundByName(String name,HashMap<String,Vehicle> map) {
		name = name.toLowerCase();
		if(map.containsKey(name)) {
			
			veh=map.get(name);
			veh.getMovementType();
			
		}
	}
	
}


