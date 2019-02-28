package com.demo;

/**
 * 
 * Encapsulation describes the ability of an object to hide its data and methods
 * from the rest of the world and is one of the fundamental principles of
 * object-oriented programming
 * 
 * Binding data and methods as single unit.
 * 
 * @author Vajpai
 *
 */
public class Employee {

	private int empId;
	private double salary = 10000;

	// Java Beans --- setter and getter

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public int getEmpId() {
		return empId;
	}
	
	public double getSalary(){
		return this.salary;
	}
}
