package com.bk.am;

/*
 * Have the function MinWindowSubstring(strArr) take the array of strings stored in strArr, which will contain 
 * only two strings, the first parameter being the string N and the second parameter being a string K of some 
 * characters, and your goal is to determine the smallest substring of N that contains all the characters in K. 
 * For example: if strArr is ["aaabaaddae", "aed"] then the smallest substring of N that contains the
 *  characters a, e, and d is "dae" located at the end of the string. So for this example your program 
 *  should return the string dae.
 */
public class MinWinSubString {

	
	 public static String MinWindowSubstring(String[] strArr) {
		 
		 String n = strArr[0];
		 String k = strArr[1];
		 int min = Integer.MAX_VALUE;
		 String result = "";
		 for (int i=0; i < n.length(); i++) {
			 StringBuilder match = new StringBuilder(k);
			 for (int j =i; j < n.length(); j++) {
				 if (match.toString().contains(String.valueOf(n.charAt(j)))) {
					 int index = match.indexOf(String.valueOf(n.charAt(j)));
					 match.replace(index, index+1, "");
					 //System.out.println(match.toString());
				 }
				 if (match.length() == 0) {
		                if (j - i < min) {
		                    min = j - i;
		                    result = n.substring(i, j+1);
		                }
		                break;
		            }
			 }
		 }
		 
		 return result;
	 }
	
	
	public static void main(String[] args) {
	 
		 String arr[] =  {"ahffaksfajeeubsne", "jefaa"};
		 System.out.println(MinWindowSubstring(arr));
		 
	}

}
