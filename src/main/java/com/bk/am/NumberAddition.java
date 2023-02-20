package com.bk.am;

/*
 * Have the function NumberAddition(str) take the str parameter, search for all the numbers in the string, 
 * add them together, then return that final number. For example: if str is "88Hello 3World!" the output 
 * should be 91. You will have to differentiate between single digit numbers and multiple digit numbers 
 * like in the example above. So "55Hello" and "5Hello 5" should return two different answers. Each string 
 * will contain at least one letter or symbol.
 */
public class NumberAddition {
	
	 public static int numberAddition(String str) {
		 
		    int result = 0;
		    String[] strArray = str.split("[^\\d]+");
		    
		    for (String st : strArray) {
		    	int temp = Integer.valueOf(st);
		    	result =  result + temp;
		    }
		    
		      
		    return result;
		  }

	public static void main(String[] args) {
		
		String str = "75Number9";
		 
		System.out.println(NumberAddition.numberAddition(str));

	}

}
