package com.bk.design.parlot;

public class MotorCycle extends Vehicle {

	public MotorCycle() {
		spotNeeded = 1;
		size = VehicleSize.MOTORCYCLE;
	}
	
	public boolean canFitInSpot(ParkingSpot spot) {
		return false;
	}
	
	
}
