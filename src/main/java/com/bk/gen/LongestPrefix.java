package com.bk.gen;

public class LongestPrefix {

	public static void main(String[] args) {

		String [] strs = {"flower","flow","flight"};
		LongestPrefix pre = new LongestPrefix();
		String str = pre.longPrefix(strs);
		System.out.println(" Longest prefix ===="+str);
	}

	
	public String longPrefix(String [] strs) {
		
		if(strs == null || strs.length ==0) {
			return "";
		}
		String prefix = strs[0];
		for(int i =1; i < strs.length ; i++) {
			
			while(strs[i].indexOf(prefix) != 0) {
				prefix = prefix.substring(0,prefix.length()-1);
				if(prefix.isEmpty()) {
					return "";
				}
			}
		}
		
		
		return prefix;
	}
	
}
