package com.serialization;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class DeserializationDemo {

	public static void main(String[] args) throws Exception {

		FileInputStream file = new FileInputStream("C:\\Users\\asus\\OneDrive\\Desktop\\Java\\employee.txt");
		ObjectInputStream ois = new ObjectInputStream(file);

		Employee e = (Employee) ois.readObject();

		System.out.println("Employee Name : " + e.name + "   Employee ID : " + e.empId + "   Employee City : " + e.city);

		ois.close();
		file.close();
	}
}
