package com.bk.gen;

import java.util.Arrays;

public class ArrIm {

	public static void main(String[] args) {
		ArrIm arr = new ArrIm();
		arr.add(new Integer(5));
		arr.add(new Integer(15));
		arr.add(new Integer(6));
		arr.add(new Integer(5));
		arr.add(new Integer(5));
		arr.add(new Integer(5));
		arr.add(new Integer(5));
		arr.add(new Integer(5));
		arr.add(new Integer(5));
		arr.add(new Integer(5));
		arr.add(new Integer(5));
		arr.add(new Integer(5));
		
		System.out.println(arr.get(1));
		arr.remove(1);
		System.out.println(arr.get(1));
		
	}

	private Object[] myArrayList;
	private int size = 0;
	
	 
	
	public ArrIm() {
		myArrayList = new Object[10];
	}
	
	public void add(Object obj) {
		if (myArrayList.length - size <= 5) {
			increaseSize();
		}
		myArrayList[size++] = obj;
	}
	
	public Object get(int index) {
		if(index < size) {
			return myArrayList[index];
		}else {
			return  new ArrayIndexOutOfBoundsException();
		}
	}
	
	 public Object remove(int index) {
		 if( index < size) {
			 Object obj = myArrayList[index];
			 myArrayList[index] = null;
			 int tmp = index;
			 while (tmp < size) {
				 myArrayList[tmp] = myArrayList[tmp+1];
				 myArrayList[tmp+1] = null;
				 tmp++;
			 }
			 
			 return obj;
			 
		 }else {
			 return new ArrayIndexOutOfBoundsException();
		 }
		 
		 
	 }
	
	 public void increaseSize() {
		 myArrayList = Arrays.copyOf(myArrayList, myArrayList.length * 2);
		 System.out.println("new Size ============"+myArrayList.length);
		 
	 }
	
}
