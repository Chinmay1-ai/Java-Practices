package com.ecm;

public class Employee {
 
	private int empId;
	private String empName;
	private int salary;
	
	
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public int getSalary() {
		return salary;
	}
	
	public void setSalary(int salary) {
		
		if(salary > 0) {
		this.salary = salary;
		}else {
			System.err.println("Invalid Salary! Salary must be greater than 0.");
		}
	}
	
	
}
