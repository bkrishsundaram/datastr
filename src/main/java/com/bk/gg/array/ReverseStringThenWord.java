package com.bk.gg.array;

/*
Reverse the Whole String and Then Reverse Each Word
To have this problem in Amazon interview is a good situation, since 
input is a mutable structure and hence one could aim 
mathcal{O}(1)O(1) 
space solution without any technical difficulties.
*/

public class ReverseStringThenWord {

	public void reverse(char[] str, int left, int right) {
		while(left < right){
			char ch = str[left];
			str[left++] = str[right];
			str[right--] = ch;
		}
	}
	
	public void reverseEachWord(char str[]) {
		int start =0;
		int end = 0;
		int n = str.length;
		
		while(start < n) {
			//go to the space for the word
			while(end < n && str[end] != ' ') {
				end++;
			}
			reverse(str, start, end-1);
			start = end+1;
			end++;
		}
		
	}
	
	
	
	public static void main(String[] args) {

		String str = "Cookies we have";
		char ch[] = str.toCharArray();
		ReverseStringThenWord r = new ReverseStringThenWord();
		r.reverse(ch, 0, ch.length-1);
		System.out.println(ch);
		r.reverseEachWord(ch);
		System.out.println(ch);
	}

}
