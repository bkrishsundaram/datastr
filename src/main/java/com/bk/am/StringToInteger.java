package com.bk.am;

public class StringToInteger {
	
	 public int strToInt(String str) {
		 str = str.trim();
		 boolean negative = false;
		 int result = 0;
		 int d =0;
		 
		 if(str.charAt(0) == '-') {
			 negative = true;
	         d++;		 
		 }else if(str.charAt(0) == '+') {
			 d++;
		 }
		 
		 for(int i=d; i<str.length(); i++) {
			 char ch = str.charAt(i);
			 int ascii = ch;
			 if(ascii >=48 && ascii <= 57) {
				 result = result * 10 + Character.digit(ch, 10);
			 }else {
				 break;
			 }
		 }
		 if(negative) {
			 result = result * -1;
		 }
		 return result;
	 }
	
	
	public static void main(String args[]) {
		StringToInteger s =  new StringToInteger();
		System.out.println(s.strToInt("-234234"));
		System.out.println(s.strToInt("234234sfsd"));
		
	}

}
