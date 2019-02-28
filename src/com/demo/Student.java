package com.demo;

public class Student extends Person{
	
	private int studId;
	private String address;
	private String grade;
	
	public static int count = 1000;
	
	
	public int getStudId() {
		return studId;
	}
	public void setStudId(int studId) {
		this.studId = studId;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	@Override
	public String toString() {
		return "Student [studId=" + studId + ", address=" + address + "]";
	}
	
	
	
}
