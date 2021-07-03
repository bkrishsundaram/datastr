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
		
		System.out.println(Color.BLUE.getValue());
		
		
	}

}
