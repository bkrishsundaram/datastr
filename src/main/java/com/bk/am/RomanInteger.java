package com.bk.am;

import java.util.HashMap;
import java.util.Map;

public class RomanInteger {

	  Map<String, Integer> values = new HashMap<>();
	  public RomanInteger() {
		  values.put("M",1000 );
		  values.put("D",500 );
		  values.put("C",100 );
		  values.put("L",50 );
		  values.put("X",10 );
		  values.put("V",5 );
		  values.put("I", 1);
		  
	  }
	  
	  
	  public int romanInt(String s) {
		  int sum = 0;
		  int i = 0;
		  while( i < s.length()) {
			  String currentSymbole =  s.substring(i,i+1);
			  int currentValue = values.get(currentSymbole);
			   int nextValue = 0;
			   if(i+1 < s.length()) {
				   String nextSymbol = s.substring(i+1,i+2);
				   nextValue = values.get(nextSymbol);
			   }
					  
			   if(currentValue < nextValue) {
				   sum = sum + (nextValue - currentValue);
				   i+=2;
			   }else{
				   sum = sum + currentValue;
				   i++;
			   }
		  }
		  return sum;
	  }
	
	public static void main(String[] args) {

	}

}
