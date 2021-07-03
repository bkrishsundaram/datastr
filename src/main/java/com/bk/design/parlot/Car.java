package com.bk.design.parlot;

public class Car extends Vehicle {
	
	public Car() {
	   spotNeeded = 1;
	   size = VehicleSize.COMAPCT;
	}
	
	public boolean canFitInSpot(ParkingSpot spot) {
		return false;
	}
	

}
