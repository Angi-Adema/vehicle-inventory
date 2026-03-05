package com.angiadema.vehicleinventory;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		try {
			// 1. Main class created with try/catch construct
			// 2. Call Automobile class with parameterized constructor to create vehicle object
			Automobile car = new Automobile("Porsche", "Macan GTS", "Miami Blue", 2025, 10000);
			
			System.out.println("Vehicle Listed Details: ");
			
			// Store array of vehicle details
			String[] vehicleInfo = car.listVehicleInfo();
			
			// Loop through the array of car details and print info to screen
			for (int i = 0; i < vehicleInfo.length; i++) {
				System.out.println(vehicleInfo[i]);
			}
			
			// Create empty line between print messages
			System.out.println();
			
			// 3. Call the removeVehicle() method and print confirmation of what system did
			String removeCar = car.removeVehicle();
			System.out.println(removeCar);
			
			// Create empty line between print messages
			System.out.println();
			
			// 4. Add a new vehicle to object and print details of added vehicle
			String addNewCar = car.addNewVehicle("Acura", "MDX A-Spec", "Double Apex Blue Pearl", 2026, 5);
			System.out.println(addNewCar);
			
			// 5. Store array of vehicle information
			String[] newVehicleInfo = car.listVehicleInfo();
			
			// Loop through the array of car details and print info to screen
			for (int i = 0; i < newVehicleInfo.length; i++) {
				System.out.println(newVehicleInfo[i]);
			}
			
			// Create empty line between print messages
			System.out.println();
			
			// Update the vehicle details in the object and print details showing the update
			String updateVehicle = car.updateVehicle("Acura", "MDX Type S", "Black", 2026, 5);
			System.out.println(updateVehicle);
			
			// Store array of vehicle information
			String[] updatedVehicleInfo = car.listVehicleInfo();
			
			// Loop through the array of car details and print info to screen
			for (int i = 0; i < updatedVehicleInfo.length; i++) {
				System.out.println(updatedVehicleInfo[i]);
			}
			
			// Create empty line between print messages
			System.out.println();
			
			// 6. Ask user if they would like to print car info to a file
			Scanner scnr = new Scanner(System.in);
			System.out.println("Would you like to print vehicle info to a file? Enter Y or N");
			
			String input = scnr.next();
			scnr.close();
			
			// Handle user input and instruct program on what to do with entry of Y and N
			if (input.equalsIgnoreCase("Y")) {
				
				// Store car details in an array.
				String[] carInfo = car.listVehicleInfo();
				
				// Declare the FileOutputStream and PrintWriter variables
				FileOutputStream outputStream = null;
				PrintWriter outputFileStream = null;
				
				// Create FileOutputStream and PrintWriter objects and print to file destination
				try {
					outputStream = new FileOutputStream("C:\\Temp\\Autos.txt");
					outputFileStream = new PrintWriter(outputStream);
					
					// Loop through the array of car details and write to file
					for (int i = 0; i < carInfo.length; i++) {
						outputFileStream.println(carInfo[i]);
					}
					
					System.out.println("Vehicle details were successfully written to file.");
				
				// Exception handling specific to files
				} catch (IOException e) {
					
					System.out.println("Could not write vehicle info to file, please try again");
				
				// Ensure resources closed after opened
				} finally {
					if (outputFileStream != null) {
						outputFileStream.close();
					}
				}	
			
			// Handle second option of user input
			} else if (input.equalsIgnoreCase("N")) {
				
				System.out.println("No file written to file.");
			
			// Handle if input does not match if expected
			} else {
				
				System.out.println("Invalid input, please try again.");
			}
		
		// Error handling for full main method
		} catch (Exception e) {
			
			System.out.println("Error printing vehicle information, please try again.");
		}

	}

}
