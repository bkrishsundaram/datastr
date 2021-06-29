package com.bk.am;

public class IntegerToRoman {

	static final int[] values = {1000,900,500,400,100,90,50,40,10,9,5,4,1};
	static final String[] symbols = {"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
	public static void main(String[] args) {
		IntegerToRoman ir = new IntegerToRoman();
		
		System.out.println(ir.intToRoman(5000));

	}
	
	 public String intToRoman(int num) {
		 StringBuilder sb = new StringBuilder();
		 for(int i =0; i < values.length && num > 0; i++ ) {
			 while(values[i] < num) {
				 num -= values[i];
				 sb.append(symbols[i]);
			 }
		 }
		 
		 return sb.toString();
	 }

}
