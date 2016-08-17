package com.week3.assessment;

import java.util.Scanner;

public class Vehicle {

	static Scanner sc = new Scanner(System.in);
	
	protected int numOfWheels = 0;
	protected int numOfDoors = 0;
	protected boolean isNew = true;	
	
	
	public Vehicle(int numOfWheels, int numOfDoors, boolean isNew) {
		this.numOfWheels = numOfWheels;
		this.numOfDoors = numOfDoors;
		this.isNew = isNew;
	}

	
	public Vehicle() {

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
		
	
	public static boolean wantANewCar(boolean isNew){
	
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
	
	public static void main(String[] args) {
		
		startShopping();
	
	}


	public int getNumOfWheels() {
		return numOfWheels;
	}


	public void setNumOfWheels(int numOfWheels) {
		this.numOfWheels = numOfWheels;
	}


	public int getNumOfDoors() {
		return numOfDoors;
	}


	public void setNumOfDoors(int numOfDoors) {
		this.numOfDoors = numOfDoors;
	}


	public boolean isNew() {
		return isNew;
	}


	public void setNew(boolean isNew) {
		this.isNew = isNew;
	}

	

} //class
