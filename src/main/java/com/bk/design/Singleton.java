package com.bk.design;

public class Singleton {
	
	private static Singleton instance;
	
	static {
		if(instance == null) {
		 instance = new Singleton();
		}
	}
	
	
	private Singleton() {
		
	}

	
	public static Singleton getInstance() {
		return instance;
		
	}
	
}
