package com.bk.ll;

import java.util.Arrays;

public class MyArrayList<T> {
	private T myArray[];
	private int size;
	
	@SuppressWarnings("unchecked")
	public MyArrayList(int capacity) {
		myArray = (T[]) new Object[capacity];
		size = 0;
	}
	
	public MyArrayList() {
		this(10);
	}
	
	public boolean add(T object) {
		boolean addFlag = false;
		if(myArray.length - size < 5) {
			increaseCapacity();
		}
		myArray[size++] = object;
		addFlag= true;
		return addFlag;
	}
	
	public T get(int index) {
		if(index >= size) {
			throw new ArrayIndexOutOfBoundsException();
		}
		return myArray[index];
	}
	
	public T set(int index, T object) {
		if(index >= size) {
			throw new ArrayIndexOutOfBoundsException();
		}
		T old = get(index);
		myArray[index] = object;
		return old;
	}
	
	public T remove(int index) {
		T object = get(index);
		int temp = index;
		for(int i=temp; i< size;i++) {
			myArray[temp] = myArray[temp+1];
			myArray[temp+1] = null;
			temp++;
		}
		 size--;
		return object;
	}
	
	
	public void increaseCapacity() {
		myArray = Arrays.copyOf(myArray, myArray.length *2);
	}
	
	
	public String display() {
		StringBuilder sb = new StringBuilder();
		
		sb.append("[");
		for(int i=0; i < size; i++) {
			sb.append(myArray[i].toString());
			if(i ==  (size-1)) {
				sb.append("]");
			}else {
				sb.append(",");
		    }
		}
		
		return sb.toString();
	}
	

	public static void main(String[] args) {

		MyArrayList<Integer> ml = new MyArrayList<>();
		ml.add(new Integer(10));
		ml.add(new Integer(20));
		ml.add(new Integer(30));
		ml.set(1,new Integer(25));
		ml.add(new Integer(40));
		ml.add(new Integer(50));
		ml.add(new Integer(60));
		System.out.println(ml.display());
		System.out.println(ml.get(2));
		ml.remove(3);
		System.out.println("after remove");
		System.out.println(ml.display());
	}

}
