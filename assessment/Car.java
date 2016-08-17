package com.week3.assessment;

public class Car extends Vehicle {

	protected String color = null;
	protected String make = null;
	protected String model = null;
	protected int numOfCylindars = 0;
	protected boolean isRunning = true;
	
	
	public Car(int numOfWheels, int numOfDoors, boolean isNew, String color, String make, String model,
			int numOfCylindars, boolean isRunning) {
		super(numOfWheels, numOfDoors, isNew);
		this.color = "Red";
		this.make = "Honda";
		this.model = "Accord";
		this.numOfCylindars = 6;
		this.isRunning = true;
		
	}

	public Car() {
	
	}
	
	public void makeACar () {	//I dont' know how to call this method from the parent class!!!

		Car carA = new Car();
		System.out.println("You have chosen a car that has: " +  this.getNumOfDoors() + " doors, " +
							this.getNumOfWheels() + " wheels, " + this.getColor() + " in color, of make " +
							this.getMake() + " and model type " + this.getModel() + ". It has " + this.getNumOfCylindars() + 
							" cylinders and it is " + this.isRunning() + " that it should run.");
		
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getNumOfCylindars() {
		return numOfCylindars;
	}

	public void setNumOfCylindars(int numOfCylindars) {
		this.numOfCylindars = numOfCylindars;
	}

	public boolean isRunning() {
		return isRunning;
	}

	public void setRunning(boolean isRunning) {
		this.isRunning = isRunning;
	}
	


	
	

	
	
	
	
	
	
	
	
	
	
}
