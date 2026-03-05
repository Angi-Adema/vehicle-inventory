package com.angiadema.vehicleinventory;

public class Main {

	public static void main(String[] args) {
		
		try {
			// 1. Main class created with try/catch construct
			// 2. Call Automobile class with parameterized constructor
			Automobile car = new Automobile("Porsche", "Macan GTS", "Miami Blue", 2025, 10000);
			
			System.out.println("Vehicle Information: ");
			
			// Get all car details
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
			
			// Create empty line between print messages
			System.out.println();
			
			// 4. Add a new vehicle
			String addNewCar = car.addNewVehicle("Acura", "MDX A-Spec", "Double Apex Blue Pearl", 2026, 5);
			System.out.println(addNewCar);
			
			// 5. Get all new car details, print those details, update the car info and print the update
			String[] newVehicleInfo = car.listVehicleInfo();
			
			// Loop through the array
			for (int i = 0; i < newVehicleInfo.length; i++) {
				System.out.println(newVehicleInfo[i]);
			}
			
			// Create empty line between print messages
			System.out.println();
			
			String updateVehicle = car.updateVehicle("Acura", "MDX Type S", "Black", 2026, 5);
			System.out.println(updateVehicle);
			
			String[] updatedVehicleInfo = car.listVehicleInfo();
			
			// Loop through the array
			for (int i = 0; i < updatedVehicleInfo.length; i++) {
				System.out.println(updatedVehicleInfo[i]);
			}
			
			// Create empty line between print messages
			System.out.println();
			
			// 6. Ask user if they would like to print car info to a file
			
			
			
		} catch (Exception e) {
			System.out.println("Error printing vehicle information, please try again.");
		}

	}

}
