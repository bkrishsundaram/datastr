package com.bk.str;

public class BinaryConverter {
	
	 public static String binaryConverter(String str) {
	
		 if (null == str || str.length() ==0) {
			 return "-1";
		 }
		 int n = str.length() - 1;
		 int count = 0;
		 int result = 0;
		 
		 for(int i=n; i >= 0; i--) {
			 //char ch = str.charAt(i);
			 //int digit = ch - '0';
			 int digit = Character.digit(str.charAt(i), 10);
			 result = result +  (digit *   (int) Math.pow(2,count));
			 count++;
		 }
		 
		 return String.valueOf(result);
		  }

	public static void main(String[] args) {
		
		String str = "100101";
	 
		System.out.println(BinaryConverter.binaryConverter(str));

	}

}
