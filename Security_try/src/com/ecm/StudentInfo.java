package com.ecm;

public class StudentInfo {

	public static void main(String[] args) {

		Student s = new Student();

		s.setId(12);
		s.setFname("David");
		s.setLname("Hitlor");

		System.out.println("The ID of Student is " + s.getId());
		System.out.println("The Name of Student is " + s.getFname() + " " + s.getLname());
	}
}
