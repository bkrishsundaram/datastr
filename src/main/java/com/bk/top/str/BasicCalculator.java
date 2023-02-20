package com.bk.top.str;

public class BasicCalculator {
	
	
	public int calc(String s) {
		
	   if(s == null || s.isEmpty()) {
		   return 0;
	   }
	   
	   int length = s.length();
	   int currentNumber = 0;
	   int lastNumber = 0;
	   int result = 0;
	   char operation = '+';
	   
	   for(int i=0; i < length; i++) {
		   char currentChar = s.charAt(i);
		   if(Character.isDigit(currentChar)) {
			   currentNumber = (currentNumber * 10) + (currentChar - '0');
		   }
		   
		   if(!Character.isDigit(currentChar) && !Character.isWhitespace(currentChar)
				         || i == s.length() -1) {
			   if(operation == '+' || operation =='-') {
				   result +=  lastNumber;
				   lastNumber =(operation == '+') ? currentNumber : -currentNumber;
			   }else if(operation == '*') {
				   lastNumber = lastNumber * currentNumber;
			   }else if(operation == '/') {
				   lastNumber = lastNumber / currentNumber;
			   }
			   operation = currentChar;
			   currentNumber = 0;
		   }
		   
		   
	   }
		
	   result += lastNumber;
	   return result;
		
	}
	

	public static void main(String[] args) {
		 
		BasicCalculator b = new BasicCalculator();
		System.out.println(b.calc("2+4*8*2+2"));

	}

}
