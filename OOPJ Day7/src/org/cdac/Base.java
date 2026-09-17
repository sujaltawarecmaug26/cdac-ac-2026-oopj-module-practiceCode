package org.cdac;

public sealed class Base permits Derived {
	
	public int phoneNo;
	public String str;
	
	
	
	public Base() {
		System.out.println("Base Constructor");

	}
	
	public void show() {
		System.out.println("Base class......");
		
	}
}
