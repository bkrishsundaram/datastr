package com.bk.gg.array;

public class MultiplyString {

	public int strToInt(String str) {
		int result = 0;
		int d =0;
		boolean negative = false;
	    if(str.charAt(0)=='-') {
	    	negative = true;
	    	d++;
	    }else if(str.charAt(0)=='+') {
	    	d++;
	    }
	    for(int i=d; i < str.length(); i++) {
	    	char ch = str.charAt(i);
	    	int ascii = ch;
	    	if(ascii >= 48 && ascii <= 57) {
	    		result = result * 10 + Character.digit(ch, 10);
	    	}else{
	    		break;
	    	}
	    }
	    if(negative) {
	    	result = result * -1;
	    }
		
		return result;
	}
	
	public int charInt(char ch) {
		int res = 0;
		 res = (int) ch  - (int) '0';
		 System.out.println(" digit == "+res);
		return res;
	}
	
	
	public static void main(String[] args) {

		String st1 = "16";
		String st2 ="23";
		
		MultiplyString m = new MultiplyString();
		
		int result = m.strToInt(st1) * m.strToInt(st2);
		
		System.out.println("Result ========="+result);
		
		 m.charInt('8');
		 m.charInt('0');
		
	}

}
