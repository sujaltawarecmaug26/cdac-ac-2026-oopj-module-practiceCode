package org.cdac;
public non-sealed class Derived extends Base {
	public int num;

	
	public Derived() {
		super();
		System.out.println("Derived Constructor");
	}
	
	public void show() {
		System.out.println("Derived Class");
	}
}
