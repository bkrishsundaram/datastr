package com.bk.top.str;

public class UniChar {
	
	
	public int uniChar(String s) {
		int n = s.length();
		int i =0;
		while ( i < n) {
			char ch = s.charAt(i);
			if(s.indexOf(ch) == s.lastIndexOf(ch)) {
				return i;
			}
			i++;
		}
		
	   return -1;	
		
	}
	
    public void checkUniChar(String s) {
    	if(s.length() > 128) {
    		return;
    	}
    	
    	boolean charset[] = new boolean[128]; 
    	for(int i=0; i<s.length(); i++) {
    		int val = s.charAt(i);
    		if(charset[val]) {
    			System.out.println(" Not a Unichar");
    		    return;
    		}
    		charset[val] = true;
    	}
    	
    	System.out.println(" Unique char===");
    }
	
    
    public boolean chechTwoString(String s1, String s2) {
    	if(s1.length() != s2.length()) {
    		return false;
    	}
    	
    	int letters[] = new int[128];
    	
    	char ch[] = s1.toCharArray();
    	
    	for(char c : ch ) {
    		letters[c]++;
    	}
    	for(int i=0; i<s2.length(); i++) {
    		int c = s2.charAt(i);
    		letters[c]--;
    		if(letters[c] < 0) {
    			return false;
    		}
    	}
    	
    	return true;
    }
    

	public static void main(String[] args) {
		UniChar u = new UniChar();
		//System.out.println(u.uniChar("balab"));
		//u.checkUniChar("bla");
		
		System.out.println(u.chechTwoString("abc", "cba"));

	}

}
