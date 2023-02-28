package com.bk.top.str;

public class RemoveBrackets {
	
	public  String removeBrackets(String str) {
	    
		int count = 0;
		int mismatch = 0;
		
		for(int i=0; i< str.length(); i++) {
			char ch = str.charAt(i);
			
			if(ch=='(') {
				count++;
			} else {
				if (count > 0) {
					count--;
				}else {
					mismatch++;
				}
			}
			
		}
		
		
	    return String.valueOf(mismatch+count);
	  }
	
	 public String anotherSol(String str) {
		 
		 while(str.contains("()")) {
			 str = str.replace("()", "");
		 }
		 
		 return String.valueOf(str.length());
	 }
	

	public static void main(String[] args) {
		
		RemoveBrackets r = new RemoveBrackets();
	    String str = "(())()(((";
		System.out.println(r.removeBrackets(str));
		System.out.println(r.anotherSol(str));
		
		
		 
	}

}
