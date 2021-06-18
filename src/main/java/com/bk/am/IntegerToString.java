package com.bk.am;

public class IntegerToString {
 
	 public String one(int num) {
		 switch(num) {
		 case 1:  return "One";
		 case 2: return "Two";
		 case 3: return "Three";
		 case 4: return "Four";
		 case 5: return "Five";
		 case 6: return "Six";
		 case 7: return "Seven";
		 case 8: return "Eight";
		 case 9: return "Nine";
		 }
		 return "";
	 }
	
	 public String lessthan20(int num) {
		 switch(num) {
		 case 10:  return "Ten";
		 case 11: return "Eleven";
		 case 12: return "Twelve";
		 case 13: return "Thirteen";
		 case 14: return "Fourteen";
		 case 15: return "Fifteen";
		 case 16: return "Sixtten";
		 case 17: return "Seventeen";
		 case 18: return "Eighteen";
		 case 19: return "Nineteen";
		 }
		 return "";
	 }
	 
	 public String ten(int num) {
		 switch(num) {
		 case 10:  return "Ten";
		 case 20: return "Twenty";
		 case 30: return "Thirty";
		 case 40: return "Fourty";
		 case 50: return "Fifty";
		 case 60: return "Sixty";
		 case 70: return "Seventy";
		 case 80: return "Eightey";
		 case 90: return "Ninety";
		 }
		 return "";
	 }
	 
	 public String two(int num) {
		 String res = "";
		 if(num ==0) {
			 return "";
		 }
		 else if( num < 10) {
			 return one(num);
		 }else if(num < 20) {
			 return lessthan20(num);
		 }else {
			 int tenner = num /10;
			 int rest =  num - tenner * 10;
			 if(rest != 0) {
				return ten(tenner) + one(rest);
			 }else {
				 return ten(tenner);
			 }
		 }
	 }
	 
     public String three(int num) {
    	 String res = "";
    	 if(num == 0) {
    		 return "";
    	 }
    	 int hundred = num / 100;
    	 int rest = num - hundred * 100;
    	 if(hundred * rest != 0) {
    		 res = one(hundred) + " Hundred" + two(rest);
    	 }else if(hundred ==0 && rest != 0) {
    		 res = two(rest);
    	 }else if(hundred !=0 && rest ==0) {
    		 res = one(hundred) + " Hundred";
    	 }
    	 return res;
     }
	 
     public String numberToWord(int num) {
    	 String result = "";
    	 if(num == 0) {
    		 return "Zero";
    	 }
    	 
    	 int billion = num / 1000000000;
    	 int million = (num - billion * 1000000000 ) / 1000000;
    	 int thousand = (num - billion * 1000000000 - million * 1000000) / 1000;
    	 int rest = num - billion * 1000000000 - million * 1000000 - thousand * 1000;
    	 
    	 if( billion != 0) {
    		 result = three(billion) + " Billion";
    	 }
    	 if(million != 0) {
    		 result = " "+result + three(million)  + " Million";
    	 }
    	 if(thousand != 0) {
    		 result = "  " +result+ three(thousand) + " Thousand";
    	 }
    	 if(rest != 0) {
    		 result = " " + result + three(rest);
    	 }
    	 return result;
     }
     
	
	public static void main(String[] args) {
		IntegerToString in = new IntegerToString();
		System.out.println(in.numberToWord(23546));
		
	}

}
