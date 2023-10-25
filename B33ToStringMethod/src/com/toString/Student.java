package com.toString;

public class Student {
			
	int id;
	String name;
	String address;
	
	//to overcome hash-code generated in DEMO Class, we do Method overriding...
	
	//type tostr then hit space+enter to override below.
   
	@Override
	public String toString() {
		return id+" "+name+" "+address;
	}
}
