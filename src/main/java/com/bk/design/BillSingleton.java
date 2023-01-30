package com.bk.design;

public class BillSingleton {
	
	 
	
	private BillSingleton() {
		
	}
	
	private static class SingletonHelper {
		private static final BillSingleton instance = new BillSingleton();
	}
	
	
	public static BillSingleton getIntance() {
		return SingletonHelper.instance;
	}

}
