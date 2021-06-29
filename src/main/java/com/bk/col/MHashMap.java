package com.bk.col;

public class MHashMap<K,V> {

	class Entry<K,V> {
		K key;
		V value;
		Entry<K,V> next;
		
		Entry(K key, V value) {
			this.key = key;
			this.value = value;
		}

		public V getValue() {
			return value;
		}

		public void setValue(V value) {
			this.value = value;
		}

		public K getKey() {
			return key;
		}
		
	}
	
	 int size = 5;
	 Entry<K,V> table[];
	 
	@SuppressWarnings("unchecked")
	public MHashMap() {
		table = new Entry[size];
	}
	
	public void put(K key, V value) {
		int hash = hash(key);
		Entry<K,V> entry = new Entry<>(key,value);
		Entry<K,V> e = table[hash];
		if(e == null) {
			table[hash] = entry;
		} else {
			while(e.next != null) {
				if(e.getKey() == key) {
					e.setValue(value);
					return;
				}
                  e = e.next;				
			} //while
			if(e.getKey() == key) {
				e.setValue(value);
				return;
			}
			e.next = entry;
		}
	}
	
	public V get(K key) {
		int hash = hash(key);
		Entry<K,V> e = table[hash];
		if(e == null) {
			return null;
		}
		
		while( e != null) {
			if(e.getKey() == key) {
				return e.getValue();
			}
			e = e.next;
		}
		return null;
	}
	
	
	public Entry<K,V> remove(K key) {
	   int hash = hash(key);
	   Entry<K,V> e = table[hash];
	   if(e == null) {
		   return null;
	   }
	   if(e.getKey()==key) {
		   table[hash] = e.next;
	   }
	   Entry<K,V> pre = e;
       e = e.next;
       while(e != null) {
    	   if(e.getKey() == key) {
    		   pre.next = e.next;
    		   e.next = null;
    		   return e;
    	   }
    	   pre = e;
    	   e = e.next;
       }
       return null;
	}
	
	
	
	public int hash(K key) {
		return key.hashCode() % size;
	}
	
	
	
	public static void main(String[] args) {

	}

}
