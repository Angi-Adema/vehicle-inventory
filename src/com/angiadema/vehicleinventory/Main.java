package com.angiadema.vehicleinventory;

public class Main {

	public static void main(String[] args) {
		
		try {
			// 1. Main class created with try/catch construct
			// 2. Call Automobile class with parameterized constructor
			Automobile car = new Automobile("Porsche", "Macan GTS", "Miami Blue", 2025, 10000);
			
			System.out.println("Vehicle Information: ");
			
			// Get the array of car info
			String[] vehicleInfo = car.listVehicleInfo();
			
			// Loop through the array
			for (int i = 0; i < vehicleInfo.length; i++) {
				System.out.println(vehicleInfo[i]);
			}
			
			// Create empty line between print messages
			System.out.println();
			
			// 3. Call the removeVehicle() method
			String removeCar = car.removeVehicle();
			System.out.println(removeCar);
			
		} catch (Exception e) {
			System.out.println("Error printing vehicle information, please try again.");
		}

	}

}
