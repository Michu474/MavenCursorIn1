import java.util.HashMap;

import vehicleClasses.*;


public class VehicleFinder  {
	
	Vehicle veh = new Vehicle();
	
	public void getVehSoundByName(String name,HashMap<String,Vehicle> map) {
		
		if(map.containsKey(name.toLowerCase())) {
			
			veh=map.get(name);
			veh.getMovementType();
			
		}
	}
	
}


