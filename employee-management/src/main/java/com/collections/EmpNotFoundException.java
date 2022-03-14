package com.collections;

public class EmpNotFoundException extends Exception {
	public EmpNotFoundException() {
		System.out.println( "Employee is not in database");
		
	}
}
