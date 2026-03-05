package com.angiadema.vehicleinventory;

public class Automobile {
	
	// Declare variables
	private String make;
	private String model;
	private String color;
	private int year;
	private int mileage;
	
	// Default constructor, do not have to list out all variables as they automatically 
	// default to the values that would be entered.
	public Automobile() {

	}
	
	// Parameterized constructor
	public Automobile(String make, String model, String color, int year, int mileage) {
		this.make = make;
		this.model = model;
		this.color = color;
		this.year = year;
		this.mileage = mileage;
	}
	
	// addNewVehicle method setting the field values
	public String addNewVehicle(String make, String model, String color, int year, int mileage) {
		try {
			this.make = make;
			this.model = model;
			this.color = color;
			this.year = year;
			this.mileage = mileage;
			return "Vehicle successfully added.";
		} catch (Exception e) {
			return "Error adding vehicle, please try again.";
		}
	}
	
	// List vehicle information by returning a String array
	public String[] listVehicleInfo() {
		try {
			String[] info = new String[5];
			
			info[0] = make;
			info[1] = model;
			info[2] = color;
			info[3] = Integer.toString(year);
			info[4] = Integer.toString(mileage);
			
			return info;
			
		} catch (Exception e) {
			return new String[] { "Obtaining vehicle details failed, please try again."};
		}	
	}
	
	// Remove a vehicle from the inventory
	public String removeVehicle() {
		try {
			this.make = "";
			this.model = "";
			this.color = "";
			this.year = 0;
			this.mileage = 0;
			return "Vehicle successfully removed.";
		} catch (Exception e) {
			return "Unable to remove vehicle, please try again.";
		}
	}
	
	// Update a vehicle in inventory
	public String updateVehicle(String make, String model, String color, int year, int mileage) {
		try {
			this.make = make;
			this.model = model;
			this.color = color;
			this.year = year;
			this.mileage = mileage;
			return "Update to vehicle information was successful.";
		} catch (Exception e) {
			return "Could not update the vehicle information, please try again.";
		}
	}

}
