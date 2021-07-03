package com.bk.top;

public class Singleton {

	private Singleton() {
		
	}
	
	
	private static class BullSingleton {
		static  Singleton INSTANCE = new Singleton();
	}
	
	
	public static Singleton  getInstance() {
		return BullSingleton.INSTANCE;
	}
	
	 
}
