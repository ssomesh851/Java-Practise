package com.example.prgms;

@SuppressWarnings("unchecked")
public class DynamicArray<T> implements Iterable<T> {
	
	private T[] arr;
	private int len = 0;
	private int capacity = 0;
	
	public DynamicArray() {
		this(16);
	}
	
	public DynamicArray(int capacity) {
		if(capacity < 0) throw new IllegalArgumentException("Illegal Capacity: " +  capacity);
		this.capacity = capacity;
		arr = (T[]) new Object[capacity];
		
	}
	
	public int size() {
		
	return len;	
		
	}
	public boolean isEmpty() {
		return size() == 0;

	}
	
	public T get(int index) {
		T elem = null;
		return arr[index] = elem;
	}
	
	public void clear() {
		for(int i = 0; i < len; i++) arr[i] = null;
		
		len = 0;
		
	}
	
	
	public void add(T elem) {
		if(len + 1 >= capacity) {
			if(capacity == 0) capacity = 1;
			else capacity = 2;
			T[] arr = (T[]) new Object[capacity];
			T[] new_arr = null;
			for(int i = 0; i < len; i++) 
				new_arr[i] = arr[i];
			arr = new_arr;
		}
		
		arr[len++] = elem;
	}
 public boolean remove(Object obj) {
	 int index = indexOf(obj);
	 if(index == -1) return false;
	 remove(index);
	 return true;
 }
 
 public int indexOf(Object obj) {
	    for (int i = 0; i < len; i++) {
	      if (obj == null) {
	        if (arr[i] == null) return i;
	      } else {
	        if (obj.equals(arr[i])) return i;
	      }
	    }
	    return -1;
	  }

	  public boolean contains(Object obj) {
	    return indexOf(obj) != -1;
	  }

	  // Iterator is still fast but not as fast as iterative for loop
	  @Override
	  public java.util.Iterator<T> iterator() {
	    return new java.util.Iterator<T>() {
	      int index = 0;

	      @Override
	      public boolean hasNext() {
	        return index < len;
	      }

	      @Override
	      public T next() {
	        return arr[index++];
	      }

	      @Override
	      public void remove() {
	        throw new UnsupportedOperationException();
	      }
	    };
	  }

	  @Override
	  public String toString() {
	    if (len == 0) return "[]";
	    else {
	      StringBuilder sb = new StringBuilder(len).append("[");
	      for (int i = 0; i < len - 1; i++) sb.append(arr[i] + ", ");
	      return sb.append(arr[len - 1] + "]").toString();
	    }
	  }
	}

