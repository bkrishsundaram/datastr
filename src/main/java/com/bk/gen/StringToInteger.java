package com.bk.gen;

public class StringToInteger {
	
	public int StringToInt(String str) {
		int result = 0;
		str = str.trim();
		int n = str.length();
		boolean negative = false;
		int d = 0;
		
		if(str.charAt(0)=='-') {
			negative = true;
			d++;
		}
		if(str.charAt(0)=='+') {
			d++;
		}
		
		for(int i=d; i<n ; i++) {
		    char ch = str.charAt(i);
		    int ascii = ch;
		    if(ascii >= 48 && ascii <= 57) {
		    	result = result * 10 + Character.digit(ch, 10);
		    } else {
		    	break;
		    }
		}
		 
		if(negative) {
		    result = result * -1;
		  }
		
		return result;
	}
	
	 

	public static void main(String[] args) {
		
		StringToInteger si = new StringToInteger();
		
		System.out.println(si.StringToInt("-2345"));
		System.out.println(si.StringToInt("234534gjhksgdf"));

	}

}
