package com.tm;

import java.io.IOException;

public class Check {
 
	
	public void check(String str) {
		
	
		String result = "";
		int count = 0;
		
		for(int i=0;i<str.length();i++) {
			
            String temp = String.valueOf(str.charAt(i));
            if(count == 4) {
            	count = 0;
            	result = result + "_";
            }
            result = result + temp;
            count++;
			
		}
		
		
		System.out.println(result);
		
		
	}
	

	public static void main(String[] args) throws Exception {
		
		Parent p = new Parent();
		p.sam();
		
	}

}

class Sta {
	static {
		System.out.println("static block..");
	}
	Sta() {
		System.out.println("Constructor..");
	}
	static void method() {
		System.out.println(" Method... ");
	}
}


class Parent {
	
	public void sam() throws IOException {
		System.out.println("  parent");
		throw new IOException("parent");
	}
}


class Child extends Parent {
	public void sam() throws IOException {
		System.out.println("  child");
		throw new IOException("child");
	}
}


 