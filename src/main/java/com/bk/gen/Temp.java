package com.bk.gen;


public class Temp {
	
	
	public void reverse(char str[], int left, int right) {
		 
		
		while(left < right) {
			char ch = str[left];
			str[left++] = str[right];
			str[right--] = ch;
		}
		
	}
	
	public void reverseWord(char str[]) {
		int start = 0;
		int end = 0;
		int n = str.length;
		
		while(start < n) {
			
			while(end < n && str[end] !=' ') {
				end++;
			}
			
			reverse(str,start,end-1);
			start = end+1;
			end++;
			
		}
		
		
		
	}
	

	public static void main(String[] args) {
 
		  Temp t = new Temp();
		  char ch[] = "how are you".toCharArray();
		  t.reverse(ch,0,ch.length-1);
		  System.out.println(ch);
		  t.reverseWord(ch);
		  System.out.println(ch);
		
	}

}
