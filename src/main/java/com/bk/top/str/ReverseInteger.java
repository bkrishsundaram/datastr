package com.bk.top.str;

public class ReverseInteger {
	
	/* reverse-integer */
	public int reverseInteger(int n) {
		int rev = 0;
		int temp = n;
		
		while(temp > 0) {
		   int pop =  temp % 10;
		   temp = temp / 10;
		   if(rev > Integer.MAX_VALUE /10 || rev == Integer.MAX_VALUE /10 && pop >7 ) {
			   return 0;
		   }
		   if(rev < Integer.MIN_VALUE /10 || rev == Integer.MIN_VALUE/10 && pop < 8) {
			   return 0;
		   }
		   rev = rev * 10 + pop;
		   
		}
		return rev;
		
	}
	

	public static void main(String[] args) {

		ReverseInteger r = new ReverseInteger();
		int num = 12345;
		System.out.println(r.reverseInteger(num));
		
	}

}
