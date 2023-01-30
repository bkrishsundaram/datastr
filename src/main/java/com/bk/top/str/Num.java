package com.bk.top.str;

import java.util.Random;

public class Num {

	public static void main(String[] args) {
		 
		
		Random random = new Random();
		
		
		for (int i =0; i< 5; i++) {
			
			int num = random.nextInt(70);
			if (num == 0) {
				num = random.nextInt(70);
			}
			System.out.print(num + "   ");
			
		}
		 
		int mp = random.nextInt(25);
		
		System.out.print( "  mega/power:  "+mp);

	}

}
