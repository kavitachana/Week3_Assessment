package com.week3.assessment;

import java.util.Scanner;

public abstract class Vehicle {

	protected int numOfWheels = 4;
	protected int numOfDoors = 4;
	protected boolean isNew = true;	
	
	
	public abstract int numOfWheels();
	public abstract int numOfDoors();
	public abstract boolean isNew();
	
	
		
} //class
