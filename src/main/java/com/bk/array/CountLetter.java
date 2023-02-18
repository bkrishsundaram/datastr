package com.bk.array;

public class CountLetter {

	public static void main(String[] args) {
		
		CountLetter c = new CountLetter();
		System.out.println(c.couuntlet("daaaabbbccccbd"));

	}
	
	public String couuntlet(String str) {
		StringBuilder sb = new StringBuilder();
		
		if(str == null || str.isEmpty()) {
			return "";
		}
		
		char charr[] = str.toCharArray();
		int count = 1;
		char pre = charr[0];
		 for(int i=1; i < charr.length; i++) {
			 
			 if( pre == charr[i]) {
				 count++;
				 
			 }else {
				 String ap = count+""+pre;
				 sb.append(ap);
				 count =1;
			 } 
			 
			  pre = charr[i];
			 
			 if(i == charr.length-1 && count != 1) {
				 String ap = count+""+pre;
				 sb.append(ap);
			 }else if(i == charr.length-1){
				 sb.append("1"+pre);
			 }
			 
		 }
		
		return sb.toString();
	}

}
