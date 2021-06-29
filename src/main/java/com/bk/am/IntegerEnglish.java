package com.bk.am;

public class IntegerEnglish {

	public String one(int num) {
		switch(num) {
		case 1: return "One";
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
		case 10: return "Ten";
		case 11: return "Eleven";
		case 12: return "Twelve";
		case 13: return "Thirteen";
		case 14: return "fourteen";
		case 15: return "fifteen";
		case 16: return "sixteen";
		case 17: return "seventeen";
		case 18: return "Eighteen";
		case 19: return "Nineteen";
		}
		return "";
	}
	
	public String ten(int num) {
		
		switch(num) {
		case 1: return "Ten";
		case 2: return  "twenty";
		case 3: return "thirty";
		case 4: return "forty";
		case 5: return "fiftry";
		case 6: return "sixty";
		case 7: return "seventy";
		case 8: return "eighty";
		case 9: return "ninty";
		}
		
		return "";
	}
	
	
	public static void main(String[] args) {

	}
	
	public String two(int num) {
		String res = "";
		if(num == 0){
			return "";
		}else if(num < 10) {
			return one(num);
		}else if( num < 20) {
			return lessthan20(num);
		}else {
			int tenner = num /10;
			int rest = num - tenner * 10;
			if(rest != 0) {
				return ten(tenner) +one(rest);
			}else {
				return ten(num);
			}
		}
		
	}
	
	public String three(int num) {
		String res = "";
	   
		int hundred = num /100;
		int rest = num - hundred *100;
		
		if(hundred * rest != 0) {
			res = one(hundred) + " Hundred" + two(rest);
		}else if (hundred ==0 && rest != 0){
			res = two(num);
		}else if (hundred != 0 && rest ==0) {
			return one(hundred) + " Hundred";
		} 
		
			return res;
		
		
	}
	
	
	public String IntegerString(int num) {
		String res = "";
		if(num==0) {
			return "Zero";
		}
		int billion = 1000000000;
		int million = 1000000;
		int thousand = 1000;
		
		int noOfBillion = num / billion;
		int noOfMillion =  (num - noOfBillion * billion ) / million	;
		int noOfThousand = (num - noOfBillion * billion - noOfMillion * million) / thousand;
 
		 int rest = (num - noOfBillion * billion - noOfMillion * million - noOfThousand * thousand);
		
		 if( noOfBillion != 0) {
			 res = three(noOfBillion) + " Billion";
		 }
		 if(noOfMillion != 0) {
			 if(!res.isEmpty()) {
				 res += " ";
			 }
			 res += three(noOfMillion) + " Million";
		 }
		 if(noOfThousand != 0 ) {
			 if(!res.isEmpty()) {
				 res = res + " ";
			 }
			 res += three(noOfThousand) + " Thousand";
		 }
		 if(rest != 0) {
			 if(!res.isEmpty()) {
				 res = res + " ";
			 }
			 res += three(rest);
		 }
		 
		
		return res;
	}
	

}
