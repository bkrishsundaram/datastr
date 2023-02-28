package com.bk.top.str;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Stack;

public class StrAlgorithm {
	
	/*
	 * 1.
	 * Have the function LetterChanges(str) take the str parameter being passed and modify it using the 
	 * following algorithm. Replace every letter in the string with the letter following it in the alphabet
	 *  (ie. c becomes d, z becomes a). Then capitalize every vowel in this new string (a, e, i, o, u) and 
	 *  finally return this modified string.
	 */
	public static void LetterChanges(String str) {
	    
		String result = "";
		for(int i =0; i< str.length(); i++) {
			
			char ch = str.charAt(i);
			
			if(ch >= 'a' && ch < 'z') {
				ch++;
			}
			if(ch =='z') {
				ch = 'a';
			}
			
			if(ch=='a' || ch =='e' || ch =='i' || ch=='o' || ch =='u') {
				ch =  Character.toUpperCase(ch);
			}
			
			result = result + String.valueOf(ch);
			
			
		}
		
		System.out.println(result);
		
	  }
	
	
	/*
	 * 2.
	 * Remove brackets from an algebraic string containing + and – operators */
	public static void simplify(String str) {
		
		Stack<Integer> stack = new Stack<>();
		
		stack.push(10);
		stack.push(14);
		
		System.out.println(stack.pop());
				
		
	}
	
	/*
	 *3.  Have the function NumberStream(str) take the str parameter being passed which will contain the numbers 2 
	 * through 9, and determine if there is a consecutive stream of digits of at least N length where N is the 
	 * actual digit value. If so, return the string true, otherwise return the string false. For example: if 
	 * str is "6539923335" then your program should return the string true because there is a consecutive 
	 * stream of 3's of length 3. The input string will always contain at least one digit.
	 */
	public static String NumberStream(String str) {
		
		Map<Integer,Integer> map = new HashMap<>();
		int preDigit = Character.digit(str.charAt(0), 10);
		map.put(preDigit, 1);
		
		for(int i=1; i < str.length(); i++) {
			
			char ch  = str.charAt(i);
			
			int digit = Character.digit(ch, 10);
			if(digit == preDigit) {
				map.put(digit, map.getOrDefault(digit, 0)+1);
				if(digit ==  map.get(digit)) {
					return "true";
				}
			} else {
				preDigit = digit;
				map.put(digit, 1);
			}
			
		}
		
	    
	    return "false";
	  }
	
	 /*
	  * 4. Have the function PowersofTwo(num) take the num parameter being passed which will be an integer and 
	  * return the string true if it's a power of two. If it's not return the string false. For example if the 
	  * input is 16 then your program should return the string true but if the input is 22 then the output 
	  * should be the string false.
	  */
	 public static String PowersofTwo(int num) {
		   
		   int temp = num;
		   
		   if(num == 0 || num == 1) {
			   return "false";
		   }
		   
		   
		   while(temp > 0) {
			   temp  = temp /2;
			   if(temp == 2) {
				   return "true";
			   } else if(temp == 1) {
				   return "false" ;
			   }
			   
		   }
	       return "false";
	 }
	 
	 //5
	 /*
	  * Nonrepeating Character
      * Have the function NonrepeatingCharacter(str) take the str parameter being passed, which will contain only 
      * alphabetic characters and spaces, and return the first non-repeating character. For example: if str is
      * "agettkgaeee" then your program should return k. The string will always contain at least one character
      * and there will always be at least one non-repeating character.
	  */
	
	 public static String nonrepeatingCharacter(String str) {
		    Map<Character, Integer> map = new LinkedHashMap<>();
		    
		    for(int i=0; i< str.length(); i++) {
		    	char ch = str.charAt(i);
		    	map.put(ch, map.getOrDefault(ch, 0)+1);
		    }
		    
		    System.out.print(map);
		    for (Map.Entry<Character, Integer> entry: map.entrySet()) {
		    	
		    	if(map.get(entry.getKey())==1) {
		    		return String.valueOf(entry.getKey());
		    	}
		    	
		    }
		    
		   
		    
		    return "-1";
		  }
	 
	 /*
	  * 6
	  * Have the function OneDecremented(str) count how many times a digit appears that is exactly 
	  * one less than the previous digit. For example: if str is "5655984" then your program should 
	  * return 2 because 5 appears directly after 6 and 8 appears directly after 9. The input will 
	  * always contain at least 1 digit.
	  */
	 public static String oneDecremented(String str) {
		 
		    char pre = str.charAt(0);
		    int count = 0;
		    for(int i =1; i< str.length(); i++) {
		    	if((char)pre-1 == str.charAt(i)) {
		    		count++;
		    	}
		    	pre = str.charAt(i);
		    }
		 
		    return Integer.toString(count);
      }

	public static void main(String[] args) {
	     //1
		//String str = "fun times!";
		//StrAlgorithm.LetterChanges(str);
		
		//2
	    //String str = "fun times!";
		//StrAlgorithm.simplify(str);
		
		//3 
		//String str = "5788888888882339999";
		//System.out.println(StrAlgorithm.NumberStream(str));
		
		//4 
		//int str = 124;
		//System.out.println(StrAlgorithm.PowersofTwo(str));
		
		//5
		//String str = "hello world hi hey";
		//System.out.println(StrAlgorithm.nonrepeatingCharacter(str));
		
		//6
		String str = "9876541110";
		System.out.println(StrAlgorithm.oneDecremented(str));

	}

}
