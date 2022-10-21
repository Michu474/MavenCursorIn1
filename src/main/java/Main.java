
import java.util.HashMap;
import java.util.Scanner;

import vehicleClasses.Airplane;
import vehicleClasses.Boat;
import vehicleClasses.Helicopter;
import vehicleClasses.Vehicle;
import vehicleClasses.Car;



public class Main {
	public static void main(String[] args) {
		HashMap<String,Vehicle> VehicleMap = new HashMap<>();
		Helicopter helicopter = new Helicopter();
		Boat boat = new Boat();
		Airplane plane = new Airplane();
		Car car = new Car();
		
		System.out.println("Enter vehicle type (like car)");
		Scanner scan = new Scanner(System.in);
		String vehName= scan.nextLine();
		
		VehicleMap.put("car", car);
		VehicleMap.put("boat", boat);
		VehicleMap.put("airplane", plane);
		VehicleMap.put("helicopter", helicopter);

		VehicleFinder veh = new VehicleFinder();
		
		veh.getVehSoundByName(vehName,VehicleMap) ;
		
	}
}