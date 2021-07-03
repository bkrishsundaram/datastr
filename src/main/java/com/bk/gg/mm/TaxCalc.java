package com.bk.gg.mm;

import java.util.Arrays;
import java.util.Comparator;

public class TaxCalc {


	public double calculateTax(double salary, Tax1 tax[]) {
		
		Arrays.sort(tax, new Comparator<Tax1>() {
		 public int compare(Tax1 a, Tax1 b){
			 if(a.base < b.base) {
				 return -1;
			 }else if(a.base == b.base){
				 return 0;
			 }else {
				 return 1;
			 }
 		    }
		  });
		
		double pay=0;
		for(int i=0; i<tax.length; i++) {
			if(i < tax.length-1 && salary > tax[i+1].base) {
				pay = pay + (tax[i+1].base - tax[i].base) * tax[i].rate;
			}else {
				pay = pay +( salary - tax[i].base) * tax[i].rate;
			}
		}
		
		return pay;
	}
	
	public static void main(String[] args) {

		Tax1 tax[] = new Tax1[4];
		tax[0] = new Tax1(30000,0.1);
		tax[1] = new Tax1(50000,0.2);
		tax[2] = new Tax1(70000,0.3);
		tax[3] = new Tax1(90000,0.4);
		
		TaxCalc t = new TaxCalc();
		
		System.out.println(t.calculateTax(120000, tax));
		
	}
}

class Tax1 {
	double rate;
	double base;
	
	Tax1(double salary, double rate) {
		this.rate = rate;
		this.base = salary;
	}
}


