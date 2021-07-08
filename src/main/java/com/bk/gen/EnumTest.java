package com.bk.gen;

public class EnumTest {
	
	
	enum Color {
		RED(1), 
		ORANGE(2),
		BLUE(37);
		
		Color(int val) {
			value = val;
		}
		
		int value;
		
		public int getValue() {
			return value;
		}
		
	}

	public static void main(String[] args) {
		
		//System.out.println(Color.BLUE.getValue());
		
		System.out.println(enumCons.cent.getCount());
		System.out.println(enumCons.cent.getName());
		//System.out.println(  enumCons.values());
		for(enumCons e : enumCons.values()) {
			System.out.println(e.getCount());
		}
	}

}

 enum enumCons {
    dime("dime",5),
    cent("cent",10),
    quarter("quarter",25);
	 
	 private enumCons() {
		 
	 }
	 
	 private String name;
	 private int count; 
	 
	 enumCons(String name, int count) {
	  	 this.name = name;
	  	 this.count = count;
	 }
	 
	 public int getCount() {
		 return count;
	 }
	 
	 public String getName() {
		 return name;
	 }
	
 }

 

