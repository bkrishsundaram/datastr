package com.bk.am;

import java.util.HashMap;
import java.util.Map;

public class RomanToInteger {

	static Map<String, Integer> values = new HashMap<>();
	
	static {
		values.put("M",1000);
		values.put("D",500);
		values.put("C",100);
		values.put("L",50);
		values.put("X",10);
		values.put("V",5);
		values.put("I",1);
	}
	
	public static void main(String[] args) {
		RomanToInteger ri = new RomanToInteger();
		System.out.println(ri.romanToInt("XI"));

	}

	
	public int romanToInt(String str) {
		int sum = 0;
		int i = 0;
		
		while(i < str.length()) {
			String currentSymbol  = str.substring(i, i+1);
			int currentvalue = values.get(currentSymbol);
			int nextvalue = 0;
			if( i +1 < str.length()) {
				String nextSymbol = str.substring(i+1, i+2);
			    nextvalue = values.get(nextSymbol);
			}
			
			if(currentvalue < nextvalue) {
				sum += (nextvalue - currentvalue);
				i += 2;
			}else {
				sum += currentvalue;
				i += 1;
			}
			
		}
		return sum;
	}
	
	
}
