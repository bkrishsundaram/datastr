package com.bk.col;

import java.util.Arrays;

public class MyArrGen<E>{
   	 int size = 0;
   	 private E array[];
   	 
   	 
   	@SuppressWarnings("unchecked")
	public MyArrGen() {
   		 array = (E[]) new Object[10];
   		 size = 0;
   	 }
	
	
   	public void add(E obj) {
   		if(array.length - size < 5) {
   			increaseCapacity();
   		}
   		array[size++] = obj;
   	}
   	
   	public void add(int index, E obj) {

   		  add(obj);
   		 
   		 for(int i = size-1; i > index; i--) {
   			 array[i] = array[i-1];
   		 }
        array[index] = obj;   		
   	}
   	
   	public E get(int index) {
   		if(index < size) {
   			return array[index];
   		}else {
   			throw new ArrayIndexOutOfBoundsException();
   		}
   	}
   	
   	public void set(int index, E obj) {
   		if(index < size) {
   			array[index] = obj;
   			
   		}else {
   			throw new IndexOutOfBoundsException();
   		}
   	}
   	
   	public E remove(int index) {
   		E obj ;
   		if(index < size) {
	   		obj = get(index);
	   		for(int i = index; i < size -1; i++) {
	   			array[i] = array[i+1];
	   		}
	   		array[size] = null;
	   		size--;
	     return obj;
   		}else {
   			throw new IndexOutOfBoundsException();
   		}
   	}
   	
   	
   	public int indexOf(E obj) {
   		
   	  if(null != obj) {
   		for(int i=0; i< size; i++) {
   			if(array[i].equals(obj)) {
   				return i;
   			}
   		}
   	  } 
   	  
   	  return -1;
   		
   	}
   	
   	
   	public void increaseCapacity() {
   		array = Arrays.copyOf(array, array.length * 2);
   	}
	
	
	
	public static void main(String[] args) {
	
		MyArrGen<Integer> list = new MyArrGen<>();
		list.add(10);
		list.add(20);
		//System.out.println(list.get(1));
		//list.set(1,30);
		//System.out.println(list.get(1));
		list.add(30);
		//System.out.println(list.get(1));
		//System.out.println(list.get(2));
		System.out.println(list.indexOf(30));
		list.remove(1);
		System.out.println(list.get(1));
		//System.out.println(list.get(2));
		
	}

}
