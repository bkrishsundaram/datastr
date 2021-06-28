package com.bk.col;

public class MyHashMap<K,V> {
	
	  static class Entry<K,V> {
		K key;
		V value;
		Entry<K,V> next;
		
		public Entry() {
			key = null;
			value = null;
			next = null;
			
		}
		
		public Entry(K key, V value , Entry<K,V> next) {
			this.key = key;
			this.value = value;
			this.next = next;
		}
		
		
	}
	
	  private Entry<K,V> table[];
	  int capacity = 4;
 
	
	  @SuppressWarnings("unchecked")
	public MyHashMap(int capacity) {
		  table = new Entry[capacity];
		  System.out.println("size ===== "+table.length);
	}
	public MyHashMap() {
		this(4);
	}

	  public void put(K newkey, V data) {
		  if(newkey==null) {
			  return ;
		  }
		  int hash = hash(newkey);
		  Entry<K,V> entry  = new Entry<>(newkey,data,null);
		  //given hashcode no values
		  if(table[hash] == null) {
			  table[hash] = entry;
		  }else {
			  Entry<K,V> previous = null;
			  Entry<K,V> current = table[hash];
			  
			  while(current != null) {
				  if(current.key.equals(newkey)) {
					  if(previous == null) {
						  entry.next = current.next;
						  table[hash] = entry;
						  return;
					  }else {
						  entry.next = current.next;
						  previous.next = entry;
						  return;
					  }
				  }
				  previous = current;
				  current = current.next;
			  } //while
			  previous.next = entry;
		  }//else 
	  }
	  
	  
	  public V get(K key) {
		  int hash = hash(key);
		  if(table[hash] == null) {
			  return null;
		  }else {
			  Entry<K,V> temp = table[hash];
			  while(temp != null) {
				  if(temp.key.equals(key)) {
					  return temp.value;
				  }
				  temp = temp.next;
			  }
		  }
		  return null;
	  }
	  
	  
	  public boolean remove(K key) {
		  int hash = hash(key);
		  if(table[hash] == null) {
			  return false;
		  }else {
			  Entry<K,V> previous = null;
			  Entry<K,V> current = table[hash];
			  
			  while(current != null) {
				  if(current.key.equals(key)) {
					  if(previous == null) {
						  table[hash] = table[hash].next;
						  return true;
					  }else {
						  previous.next = current.next;
						  return true;
					  }
				  }
				  previous = current;
				  current = current.next;
			  }
			  
		  }
		  return false;
	  }
	  
	  public void display() {
		  for(int i=0; i< capacity; i++) {
			  if(table[i] != null) {
				  Entry<K,V> entry = table[i];
				  while(entry != null) {
					  System.out.println("{"+entry.key+","+entry.value+"}");
					  entry = entry.next;
				  }
			  }
		  }
	  }
	  
	  
	  private int hash(K key) {
		  return Math.abs(key.hashCode()) % capacity;
	  }
	  
	  
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyHashMap<Integer, String> map = new MyHashMap<>();
		map.put(10, "ten");
		map.put(20, "twenty");
		map.put(10, "new ten");
		map.put(30, "three");
		map.put(40, "four");
        map.put(50, "five");
        map.put(50, "six");
        map.put(70, "five");
        map.put(90, "five");
        
		map.display();
		System.out.println();
		
	 	 String data  = map.get(20);
	 	 System.out.println("calue ===" +data);
	 	 
	 	 map.remove(50);
	 	 System.out.println("after remove");
	 	 map.display();
		
	}

}
