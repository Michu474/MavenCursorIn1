
import java.util.HashMap;
import java.util.Scanner;
import vehicleClasses.*;



public class Main {
	public static void main(String[] args) {
		HashMap<String,Vehicle> VehicleMap = new HashMap<String,Vehicle>();
		Helicopter helicopter = new Helicopter();
		Boat boat = new Boat();
		Airlane plane = new Airlane();
		Car car = new Car();
		
		Scanner scan = new Scanner(System.in);
		String vehName= scan.nextLine();
		
		VehicleMap.put("car", car);
		VehicleMap.put("boat", boat);
		VehicleMap.put("airplane", plane);
		VehicleMap.put("helicopter", helicopter);
		
		
//		String name = "Car";
//		System.out.println(VehicleMap.get("boat"));
//		if(VehicleMap.containsKey(name.toLowerCase())) {
//			System.out.println(VehicleMap.get("car"));
//			System.out.println(name.toLowerCase());
//		}
		VehicleFinder veh = new VehicleFinder();
		
		veh.getVehSoundByName(vehName,VehicleMap) ;
		
	}
}