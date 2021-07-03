package com.bk.design.parlot;

public class Bus extends Vehicle{
	public Bus() {
		spotNeeded = 5;
		size = VehicleSize.LARGE;
	}
	
	public boolean canFitInSpot(ParkingSpot spot) {
		return false;
	}
	
 
}
