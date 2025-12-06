package com.ecm;

public class EmployeeInfo {

	public static void main(String[] args) {
		
		Employee e = new Employee();
		
		e.setEmpId(11);
		e.setEmpName("Sundar Pichai");
		e.setSalary(0);
		
		System.out.println("The ID of Employee is "+e.getEmpId());
		System.out.println("The Name of Employee is "+e.getEmpName());
		System.out.println("The Salary of Employee is "+e.getSalary());
		
	}
}
