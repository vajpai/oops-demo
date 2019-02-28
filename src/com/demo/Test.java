package com.demo;

public class Test {

	public static void main(String[] args) {
		Employee employee = new Employee();
		employee.setEmpId(1111);
		
		int empId = employee.getEmpId();
		double salary = employee.getSalary();
		System.out.println("EmpID="+empId + "Salary="+ salary);
		
		
		Student student = new Student();
		student.setName("Scott");
		student.setAddress("Hyd");
		student.setStudId(1000);
		student.count = 200;
		System.out.println("----->"+student);
		
		Student student1 = new Student();
		student1.setName("Raj");
		student1.setAddress("Bangalore");
		student1.setStudId(101);
		System.out.println("Count="+student1.count);
		
		
	}

}
