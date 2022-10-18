package com.aston.intensive;

public interface MyLinkedList<T> {
	
	void add(Object o);
	
	void add(Object o, int index);
	
	 T get(int index);
	 
	 int size();

}
