package com.praveen.iterator;

public class NameRepository {
	
	private String[] names = {"Adam", "Smith", "lana", "Ana"};
	
	public Iterator getIterator() {
		return new NameIterator(names);
	}

}
