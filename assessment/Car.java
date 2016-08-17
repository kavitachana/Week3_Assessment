package com.week3.assessment;

import java.util.Scanner;

public class Car extends Vehicle {

	static Scanner sc = new Scanner(System.in);
	
	protected String color = null;
	protected String make = null;
	protected String model = null;
	protected int numOfCylindars = 0;
	protected boolean isRunning = true;
	
	public Car(String color, String make, String model, int numOfCylindars, boolean isRunning) {
		this.color = color;
		this.make = make;
		this.model = model;
		this.numOfCylindars = numOfCylindars;
		this.isRunning = isRunning;
	}

	public Car() {
		
	}
	
	
	public static void main(String[] args) {
		
		startShopping();
		
	}
	
	public static void startShopping(){
		
		System.out.println("Hello, would you like to buy a car? Yes or No");
		String userInput = sc.nextLine();
		
		if(userInput.equalsIgnoreCase("yes")) {
			
			System.out.println("Great! Let's start shopping:");
			
		}else 
			
			if (userInput.equalsIgnoreCase("no")) {
				
				System.out.println("Goodbye!");
		
		}else
			
			System.out.println("You've entered an invalid option. The program will now exit.");
			System.exit(0);
	
	}
		
	
	public void makeACar () {	

		Car carA = new Car();
		System.out.println("You have chosen a car that has: " +  this.numOfDoors() + " doors, " +
							this.numOfWheels() + " wheels, " + this.getColor() + " in color, of make " +
							this.getMake() + " and model type " + this.getModel() + ". It has " + this.getNumOfCylindars() + 
							" cylinders and it is " + this.isRunning() + " that it should run.");
		
	}

	
	@Override
	public int numOfWheels() {
		return numOfWheels;
		
	}

	@Override
	public int numOfDoors() {
		return numOfDoors;
		
	}

	@Override
	public boolean isNew() {

		System.out.println("Would you like a new car or a used car? Please enter new or used");
		String userInput = sc.nextLine();
		
		if(userInput.equalsIgnoreCase("new")) {
			
			return true;
			
		}else 
			
			if (userInput.equalsIgnoreCase("used")) {
				
			return false;
		
		}else
			
			System.out.println("You've entered an invalid option. The program will now exit.");
			System.exit(0);
	
		return true;
		
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
