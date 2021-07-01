package com.bk.top.str;


public class ReverseString {

	public void twoPointer(char str[]) {
		int left =0; 
		int right = str.length-1;
		
		while(left < right) {
			char ch = str[left];
			str[left++] = str[right];
			str[right--] = ch;
		}
	 
	}

	public void strRev() {
		String str = "hello";
		int n = str.length()-1;
		String rev = "";
		for(int i = n; i>=0; i--) {
			
			rev = rev +str.charAt(i);
			
		}
		
		System.out.println(rev);
		
		
	}
	
	
	public static void main(String[] args) {

		ReverseString r = new ReverseString();
		char str[] = "deekshit".toCharArray();
	     r.twoPointer(str);
		//System.out.println(Arrays.toString(str));
	     r.strRev();
	}

}
